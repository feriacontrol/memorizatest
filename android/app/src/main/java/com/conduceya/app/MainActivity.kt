package com.conduceya.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.conduceya.app.ui.HomeScreen
import com.conduceya.app.ui.MistakesScreen
import com.conduceya.app.ui.StatisticsScreen
import com.conduceya.app.ui.TestScreen
import com.conduceya.app.ui.TopicsScreen
import com.conduceya.app.ads.ConsentManager
import com.conduceya.app.ads.InterstitialAdManager
import com.conduceya.app.billing.BillingManager
import com.google.android.gms.ads.MobileAds

private enum class AppScreen {
    HOME,
    TOPICS,
    MISTAKES,
    STATISTICS,
    TEST
}

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        BillingManager.start(this)

        ConsentManager.requestConsent(this) {
            MobileAds.initialize(this) {
                InterstitialAdManager.load(this)
            }
        }

        setContent {
            MaterialTheme {

                var currentScreen by remember {
                    mutableStateOf(AppScreen.HOME)
                }

                var selectedTopic by remember {
                    mutableStateOf<String?>(null)
                }

                var selectedQuestionIds by remember {
                    mutableStateOf<Set<Int>?>(null)
                }

                when (currentScreen) {

                    AppScreen.HOME -> HomeScreen(
                        onStartTest = {
                            selectedTopic = null
                            selectedQuestionIds = null
                            currentScreen = AppScreen.TEST
                        },
                        onOpenTopics = {
                            currentScreen = AppScreen.TOPICS
                        },
                        onOpenMistakes = {
                            currentScreen = AppScreen.MISTAKES
                        },
                        onOpenStatistics = {
                            currentScreen = AppScreen.STATISTICS
                        },
                        onRemoveAds = {
                            BillingManager.purchase(this@MainActivity)
                        }
                    )

                    AppScreen.TOPICS -> TopicsScreen(
                        onBack = {
                            currentScreen = AppScreen.HOME
                        },
                        onSelectTopic = { topic ->
                            selectedTopic = topic
                            selectedQuestionIds = null
                            currentScreen = AppScreen.TEST
                        }
                    )

                    AppScreen.MISTAKES -> MistakesScreen(
                        onBack = {
                            currentScreen = AppScreen.HOME
                        },
                        onPracticeMistakes = { ids ->
                            selectedTopic = null
                            selectedQuestionIds = ids
                            currentScreen = AppScreen.TEST
                        }
                    )

                    AppScreen.STATISTICS -> StatisticsScreen(
                        onBack = {
                            currentScreen = AppScreen.HOME
                        }
                    )

                    AppScreen.TEST -> TestScreen(
                        topic = selectedTopic,
                        questionIds = selectedQuestionIds,
                        onBack = {
                            currentScreen = when {
                                selectedQuestionIds != null ->
                                    AppScreen.MISTAKES

                                selectedTopic != null ->
                                    AppScreen.TOPICS

                                else ->
                                    AppScreen.HOME
                            }
                        }
                    )
                }
            }
        }
    }
}
