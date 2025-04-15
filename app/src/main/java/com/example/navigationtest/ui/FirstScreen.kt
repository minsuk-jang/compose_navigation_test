package com.example.navigationtest.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSavedStateRegistryOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun FirstScreen(
    onNext: () -> Unit = {}
) {
    val owner = checkNotNull(LocalViewModelStoreOwner.current)
    val savedStateOwner = LocalSavedStateRegistryOwner.current

    val viewModel: FirstScreenViewModel = viewModel(
        factory = FirstScreenViewModelFactory(savedStateOwner),
        viewModelStoreOwner = owner
    )


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { onNext() }) {
            Text(text = "First Screen")
        }
    }
}

