package com.omk.disneycodechallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.omk.disneycodechallenge.presentation.SelectGuestScreen
import com.omk.disneycodechallenge.ui.theme.DisneyCodeChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisneyCodeChallengeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GuestsList()
                }
            }
        }
    }

    @Composable
    fun GuestsList(){
        val navController = rememberNavController()

        SelectGuestScreen(navController=navController)

    }
    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        DisneyCodeChallengeTheme {
            Greeting("Android")
        }
    }
}