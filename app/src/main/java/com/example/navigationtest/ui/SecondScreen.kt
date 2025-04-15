package com.example.navigationtest.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSavedStateRegistryOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SecondScreen() {
    val owner = checkNotNull(LocalViewModelStoreOwner.current)
    val savedStateOwner = LocalSavedStateRegistryOwner.current

    val viewModel: SecondScreenViewModel = viewModel(
        factory = SecondScreenViewModelFactory(savedStateOwner),
        viewModelStoreOwner = owner
    )


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Second Screen")
    }
}