package com.example.navigationtest.ui

import android.util.Log
import androidx.lifecycle.ViewModel


class SecondScreenViewModel : ViewModel() {
    override fun onCleared() {
        super.onCleared()

        Log.e("jms8732", "second screen viewmodel onCleared")
    }
}