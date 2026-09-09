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
import com.conduceya.app.ui.TestScreen
import com.conduceya.app.ui.TopicsScreen

private enum class AppScreen {
    HOME,
    TOPICS,
    TEST
}

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            MaterialTheme {

                var currentScreen by remember {
                    mutableStateOf(AppScreen.HOME)
                }

                var selectedTopic by remember {
                    mutableStateOf<String?>(null)
                }

                when (currentScreen) {

                    AppScreen.HOME -> HomeScreen(
                        onStartTest = {
                            selectedTopic = null
                            currentScreen = AppScreen.TEST
                        },
                        onOpenTopics = {
                            currentScreen = AppScreen.TOPICS
                        }
                    )

                    AppScreen.TOPICS -> TopicsScreen(
                        onBack = {
                            currentScreen = AppScreen.HOME
                        },
                        onSelectTopic = { topic ->
                            selectedTopic = topic
                            currentScreen = AppScreen.TEST
                        }
                    )

                    AppScreen.TEST -> TestScreen(
                        topic = selectedTopic,
                        onBack = {
                            currentScreen =
                                if (selectedTopic == null) {
                                    AppScreen.HOME
                                } else {
                                    AppScreen.TOPICS
                                }
                        }
                    )
                }
            }
        }
    }
}
