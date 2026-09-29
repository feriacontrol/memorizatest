package com.conduceya.app.ads

import android.app.Activity
import com.google.android.ump.ConsentRequestParameters
import com.google.android.ump.UserMessagingPlatform

object ConsentManager {

    fun requestConsent(
        activity: Activity,
        onReadyForAds: () -> Unit
    ) {
        val consentInformation =
            UserMessagingPlatform.getConsentInformation(activity)

        val params =
            ConsentRequestParameters.Builder()
                .build()

        consentInformation.requestConsentInfoUpdate(
            activity,
            params,
            {
                UserMessagingPlatform.loadAndShowConsentFormIfRequired(
                    activity
                ) {
                    if (consentInformation.canRequestAds()) {
                        onReadyForAds()
                    }
                }
            },
            {
                if (consentInformation.canRequestAds()) {
                    onReadyForAds()
                }
            }
        )
    }
}
