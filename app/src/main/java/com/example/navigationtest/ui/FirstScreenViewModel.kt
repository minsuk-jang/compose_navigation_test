package com.example.navigationtest.ui

import android.util.Log
import androidx.lifecycle.ViewModel


class FirstScreenViewModel : ViewModel() {


    override fun onCleared() {
        super.onCleared()
        Log.e("jms8732", "first screen viewmodel onCleared")
    }
}