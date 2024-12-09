package com.example.navigationtest.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


class HomeGroupViewModel : ViewModel() {

    init {
        //load()
    }

    private val _uiEvent: MutableStateFlow<String> = MutableStateFlow("")
    val uiEvent: StateFlow<String> = _uiEvent.asStateFlow()

    private fun load() {
        viewModelScope.launch {
            delay(3000L)

            _uiEvent.update {
                "second"
            }
        }
    }

    fun setStatus(status: String) {
        viewModelScope.launch {
            _uiEvent.update {
                status
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("jms8732", "home group viewmodel onCleared")
    }
}