package com.example.navigationtest

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationtest.ui.FirstScreen
import com.example.navigationtest.ui.SecondScreen
import com.example.navigationtest.ui.theme.NavigationTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NavigationTestTheme(darkTheme = false) {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "first"
                    ) {
                        composable(
                            route = "first"
                        ) {

                            LaunchedEffect(key1 = Unit) {
                                Log.e(
                                    "jms8732",
                                    "in LaunchedEffected: ${it.savedStateHandle.hashCode()}"
                                )
                            }

                            FirstScreen {
                                navController.navigate("second")
                            }
                        }

                        composable(
                            route = "second"
                        ){
                            LaunchedEffect(key1 = Unit) {
                                Log.e("jms8732", "in composable: ${it.savedStateHandle.hashCode()} ")
                            }

                            SecondScreen()
                        }
                    }

                }
            }
        }
    }
}
