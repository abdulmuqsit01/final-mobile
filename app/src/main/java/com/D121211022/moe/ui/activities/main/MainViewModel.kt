package com.D121211022.moe.ui.activities.main

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.D121211022.moe.MyApplication
import com.D121211022.moe.data.model.Data
import com.D121211022.moe.data.repository.MoeRepository
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface MainUiState {
    data class Success(val data: List<Data>) : MainUiState
    object Error : MainUiState
    object Loading : MainUiState
}

class MainViewModel(private val moeRepository: MoeRepository): ViewModel() {

    var mainUiState: MainUiState by mutableStateOf(MainUiState.Loading)
        private set

    fun getMoe() = viewModelScope.launch {
        mainUiState = MainUiState.Loading
        try {
            val result = moeRepository.getMoe()
            Log.d("MainViewModel", "getMoe: ${result.data?.size}")
            mainUiState = MainUiState.Success(result.data.orEmpty())
        } catch (e: IOException) {
            Log.d("MainViewMode", "getMoe error: ${e.message}")
            mainUiState = MainUiState.Error
        }
    }

    init {
        getMoe()
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MyApplication)
                val moeRepository = application.container.moeRepository
                MainViewModel(moeRepository)
            }
        }
    }

}