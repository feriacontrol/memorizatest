package com.memorizatest.app.ads

import com.memorizatest.app.billing.BillingManager

import android.app.Activity
import android.content.Context
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

object InterstitialAdManager {

    private const val TEST_AD_UNIT_ID =
        "ca-app-pub-3940256099942544/1033173712"

    private var interstitialAd: InterstitialAd? = null
    private var loading = false

    fun load(context: Context) {
        if (BillingManager.isPremium()) return
        if (loading || interstitialAd != null) return

        loading = true

        InterstitialAd.load(
            context,
            TEST_AD_UNIT_ID,
            AdRequest.Builder().build(),
            object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(ad: InterstitialAd) {
                    loading = false
                    interstitialAd = ad
                }

                override fun onAdFailedToLoad(error: LoadAdError) {
                    loading = false
                    interstitialAd = null
                }
            }
        )
    }

    fun show(
        activity: Activity,
        onFinished: () -> Unit
    ) {
        if (BillingManager.isPremium()) {
            onFinished()
            return
        }

        val ad = interstitialAd

        if (ad == null) {
            onFinished()
            load(activity)
            return
        }

        interstitialAd = null

        ad.fullScreenContentCallback =
            object : FullScreenContentCallback() {

                override fun onAdDismissedFullScreenContent() {
                    load(activity)
                    onFinished()
                }

                override fun onAdFailedToShowFullScreenContent(
                    adError: com.google.android.gms.ads.AdError
                ) {
                    load(activity)
                    onFinished()
                }
            }

        ad.show(activity)
    }
}
