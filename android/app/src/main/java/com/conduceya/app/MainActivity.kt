package com.conduceya.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.conduceya.app.ui.HomeScreen
import com.conduceya.app.ui.theme.ConduceyaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ConduceyaTheme {
                HomeScreen()
            }
        }
    }
}
