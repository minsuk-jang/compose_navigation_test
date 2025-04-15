package com.example.navigationtest.ui

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class SecondScreenViewModel(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    init {
        Log.e("jms8732", "in ViewModel: ${savedStateHandle.hashCode()}")
    }

}