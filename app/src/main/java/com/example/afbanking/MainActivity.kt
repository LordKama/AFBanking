package com.example.afbanking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.afbanking.domain.model.User
import com.example.afbanking.presentation.ui.screens.MainScreen
import com.example.afbanking.presentation.ui.theme.AFBankingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AFBankingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val me = User("Lord Kama", "123", "456", 600.00)
                    MainScreen(me)
                }
            }
        }
    }
}
