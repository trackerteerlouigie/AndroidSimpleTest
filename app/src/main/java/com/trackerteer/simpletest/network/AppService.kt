package com.trackerteer.simpletest.network

import com.trackerteer.simpletest.network.response.ResponseNetwork
import retrofit2.http.*

interface AppService {
    @GET("pokemon")
    suspend fun getAllPokemon(
        @Query("limit") limit: Long,
        @Query("offset") offset: Long = 0,
    ): ResponseNetwork
}