package com.conduceya.app.billing

import android.app.Activity
import android.content.Context
import com.android.billingclient.api.*

object BillingManager : PurchasesUpdatedListener {

    const val PRODUCT_ID = "remove_ads_yearly"

    private var billingClient: BillingClient? = null
    private var productDetails: ProductDetails? = null

    private var premium = false

    fun isPremium(): Boolean = premium

    fun start(
        context: Context,
        onStateChanged: (() -> Unit)? = null
    ) {
        if (billingClient != null) return

        billingClient =
            BillingClient.newBuilder(context)
                .setListener(this)
                .enablePendingPurchases(
                    PendingPurchasesParams.newBuilder()
                        .enableOneTimeProducts()
                        .build()
                )
                .enableAutoServiceReconnection()
                .build()

        billingClient?.startConnection(
            object : BillingClientStateListener {

                override fun onBillingSetupFinished(
                    result: BillingResult
                ) {
                    if (
                        result.responseCode ==
                        BillingClient.BillingResponseCode.OK
                    ) {
                        queryPurchases(onStateChanged)
                        queryProduct()
                    }
                }

                override fun onBillingServiceDisconnected() = Unit
            }
        )
    }

    private fun queryProduct() {
        val product =
            QueryProductDetailsParams.Product.newBuilder()
                .setProductId(PRODUCT_ID)
                .setProductType(BillingClient.ProductType.SUBS)
                .build()

        val params =
            QueryProductDetailsParams.newBuilder()
                .setProductList(listOf(product))
                .build()

        billingClient?.queryProductDetailsAsync(params) { result, response ->

            if (
                result.responseCode ==
                BillingClient.BillingResponseCode.OK
            ) {
                productDetails =
                    response.productDetailsList.firstOrNull()
            }
        }
    }

    private fun queryPurchases(
        onStateChanged: (() -> Unit)? = null
    ) {
        val params =
            QueryPurchasesParams.newBuilder()
                .setProductType(BillingClient.ProductType.SUBS)
                .build()

        billingClient?.queryPurchasesAsync(params) { result, purchases ->

            if (
                result.responseCode ==
                BillingClient.BillingResponseCode.OK
            ) {
                premium = purchases.any { purchase ->
                    PRODUCT_ID in purchase.products &&
                    purchase.purchaseState ==
                    Purchase.PurchaseState.PURCHASED
                }

                purchases
                    .filter {
                        PRODUCT_ID in it.products &&
                        it.purchaseState ==
                        Purchase.PurchaseState.PURCHASED &&
                        !it.isAcknowledged
                    }
                    .forEach {
                        acknowledge(it)
                    }

                onStateChanged?.invoke()
            }
        }
    }

    fun purchase(
        activity: Activity
    ) {
        val details = productDetails ?: return

        val offer =
            details.subscriptionOfferDetails
                ?.firstOrNull()
                ?: return

        val productParams =
            BillingFlowParams.ProductDetailsParams
                .newBuilder()
                .setProductDetails(details)
                .setOfferToken(offer.offerToken)
                .build()

        val params =
            BillingFlowParams.newBuilder()
                .setProductDetailsParamsList(
                    listOf(productParams)
                )
                .build()

        billingClient?.launchBillingFlow(
            activity,
            params
        )
    }

    override fun onPurchasesUpdated(
        result: BillingResult,
        purchases: MutableList<Purchase>?
    ) {
        if (
            result.responseCode ==
            BillingClient.BillingResponseCode.OK &&
            purchases != null
        ) {
            purchases.forEach { purchase ->

                if (
                    PRODUCT_ID in purchase.products &&
                    purchase.purchaseState ==
                    Purchase.PurchaseState.PURCHASED
                ) {
                    premium = true

                    if (!purchase.isAcknowledged) {
                        acknowledge(purchase)
                    }
                }
            }
        }
    }

    private fun acknowledge(
        purchase: Purchase
    ) {
        val params =
            AcknowledgePurchaseParams.newBuilder()
                .setPurchaseToken(purchase.purchaseToken)
                .build()

        billingClient?.acknowledgePurchase(params) { }
    }
}
