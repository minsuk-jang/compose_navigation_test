package com.example.navigationtest.ui

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel


class FirstScreenViewModel(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {


    init {
        Log.e("jms8732", "in ViewModel: ${savedStateHandle.hashCode()}", )
    }

}