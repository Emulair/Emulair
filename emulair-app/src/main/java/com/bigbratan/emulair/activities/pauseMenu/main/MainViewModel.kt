package com.bigbratan.emulair.activities.pauseMenu.main

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bigbratan.emulair.managers.coresLibrary.PendingOperationsMonitor

class MainViewModel(appContext: Context) : ViewModel() {

    class Factory(private val appContext: Context) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MainViewModel(appContext) as T
        }
    }

    val displayProgress = PendingOperationsMonitor(appContext).anyOperationInProgress()
}
