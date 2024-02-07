package com.trackerteer.simpletest.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.trackerteer.simpletest.domains.ResponseModel
import com.trackerteer.simpletest.network.AppService
import com.trackerteer.simpletest.network.response.asDomainModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainRepository @Inject constructor(private val appService: AppService) {

    private val _response = MutableLiveData<ResponseModel>()
    val response: LiveData<ResponseModel> get() = _response

    suspend fun getAllData() {
        withContext(Dispatchers.IO) {
            val response = appService.getAllPokemon(100)
            _response.postValue(response.asDomainModel())
        }
    }
}