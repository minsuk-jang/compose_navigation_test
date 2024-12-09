package com.example.navigationtest.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun HomeGroup(
    modifier: Modifier = Modifier
) {
    val vm: HomeGroupViewModel = viewModel()
    val navController = rememberNavController()

    val state by vm.uiEvent.collectAsStateWithLifecycle()

    LaunchedEffect(key1 = state) {
        Log.e(
            "jms8732",
            "stack: ${navController.currentBackStack.value.map { it.destination.route }}"
        )
        when (state) {
            "second" -> {
                navController.navigate("second") {
                    launchSingleTop = true
                }
            }

            "first" -> {
                navController.navigate("first") {
                    launchSingleTop = true
                }
            }

            else -> Unit
        }
    }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "first"
    ) {
        composable(
            route = "first"
        ) {
            Log.e("jms8732", "First Screen")
            FirstScreen(
                onClick = {
                    vm.setStatus(status = "second")
                }
            )
        }


        composable(
            route = "second"
        ) {
            Log.e("jms8732", "Second Screen")
            SecondScreen(
                onClick = {
                    Log.e("jms8732", "Second Screen pop")
                    navController.popBackStack()
                    vm.setStatus(status = "")
                }
            )
        }
    }
}