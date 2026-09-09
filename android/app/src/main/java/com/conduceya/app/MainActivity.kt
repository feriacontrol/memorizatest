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

private enum class AppScreen {
    HOME,
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

                when (currentScreen) {
                    AppScreen.HOME -> HomeScreen(
                        onStartTest = {
                            currentScreen = AppScreen.TEST
                        }
                    )

                    AppScreen.TEST -> TestScreen(
                        onBack = {
                            currentScreen = AppScreen.HOME
                        }
                    )
                }
            }
        }
    }
}
