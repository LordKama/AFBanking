package com.example.afbanking.data.network

import com.example.afbanking.data.network.dto.UserDto
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface AFBankApi {

    @GET("/bankUser/{userId}")
    suspend fun getUserByRoutNum(@Path("userId") userId: String): UserDto

    @PUT("/bankUser/{userId}")
    suspend fun updateBalance(@Path("userId") userId: String){
    }
}