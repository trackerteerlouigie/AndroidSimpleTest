package com.trackerteer.simpletest.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.trackerteer.simpletest.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) :
    ViewModel() {

    val response = mainRepository.response

    init {
        getAllData()
    }

    private fun getAllData() {
        viewModelScope.launch {
            mainRepository.getAllData()
        }
    }
}