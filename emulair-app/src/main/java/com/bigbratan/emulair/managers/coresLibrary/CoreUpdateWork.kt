package com.bigbratan.emulair.managers.coresLibrary

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.ForegroundInfo
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters
import com.bigbratan.emulair.managers.notifications.NotificationsManager
import com.bigbratan.emulair.common.managers.coresLibrary.CoreUpdater
import com.bigbratan.emulair.common.managers.coresLibrary.CoresSelection
import com.bigbratan.emulair.common.managers.injection.AndroidWorkerInjection
import com.bigbratan.emulair.common.managers.injection.WorkerKey
import com.bigbratan.emulair.common.metadata.retrograde.GameSystem
import com.bigbratan.emulair.common.metadata.retrograde.db.RetrogradeDatabase
import dagger.Binds
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import javax.inject.Inject
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import timber.log.Timber

class CoreUpdateWork(context: Context, workerParams: WorkerParameters) :
    CoroutineWorker(context, workerParams) {

    @Inject
    lateinit var retrogradeDatabase: RetrogradeDatabase
    @Inject
    lateinit var coreUpdater: CoreUpdater
    @Inject
    lateinit var coresSelection: CoresSelection

    override suspend fun doWork(): Result {
        AndroidWorkerInjection.inject(this)

        Timber.i("Starting core update/install work")

        val notificationsManager = NotificationsManager(applicationContext)

        val foregroundInfo = ForegroundInfo(
            NotificationsManager.CORE_INSTALL_NOTIFICATION_ID,
            notificationsManager.installingCoresNotification()
        )

        setForegroundAsync(foregroundInfo)

        try {
            val cores = retrogradeDatabase.gameDao().selectSystems()
                .asFlow()
                .map { GameSystem.findById(it) }
                .map { coresSelection.getCoreConfigForSystem(it) }
                .map { it.coreID }
                .toList()

            coreUpdater.downloadCores(applicationContext, cores)
        } catch (e: Throwable) {
            Timber.e(e, "Core update work failed with exception: ${e.message}")
        }

        return Result.success()
    }

    @dagger.Module(subcomponents = [Subcomponent::class])
    abstract class Module {
        @Binds
        @IntoMap
        @WorkerKey(CoreUpdateWork::class)
        abstract fun bindMyWorkerFactory(builder: Subcomponent.Builder): AndroidInjector.Factory<out ListenableWorker>
    }

    @dagger.Subcomponent
    interface Subcomponent : AndroidInjector<CoreUpdateWork> {
        @dagger.Subcomponent.Builder
        abstract class Builder : AndroidInjector.Builder<CoreUpdateWork>()
    }
}
