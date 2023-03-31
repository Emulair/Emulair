package com.bigbratan.emulair.ext.managerReview

import android.app.Activity
import android.content.Context
import com.google.android.play.core.review.ReviewInfo
import com.google.android.play.core.review.ReviewManager
import com.google.android.play.core.review.ReviewManagerFactory
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.tasks.await

class ReviewManager {
    private var reviewManager: ReviewManager? = null
    private var reviewInfo: ReviewInfo? = null

    suspend fun initialize(context: Context) {
        reviewManager = ReviewManagerFactory.create(context)

        runCatching {
            reviewInfo = reviewManager?.requestReviewFlow()?.await()
        }
    }

    suspend fun launchReviewFlow(activity: Activity, sessionTimeMillis: Long) {
        // Only sessions which lasted more than 10 minutes are considered good sessions
        if (sessionTimeMillis < MIN_GAME_SESSION_LENGTH) {
            return
        }

        reviewInfo?.let {
            reviewManager?.launchReviewFlow(activity, it)?.await()
        }
    }

    companion object {
        private val MIN_GAME_SESSION_LENGTH = TimeUnit.MINUTES.toMillis(5)
    }
}
