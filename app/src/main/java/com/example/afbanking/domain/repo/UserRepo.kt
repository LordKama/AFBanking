package com.example.afbanking.domain.repo

import com.example.afbanking.data.network.dto.UserDto

interface UserRepo {

    suspend fun getUserByRNum(routingNum: String): UserDto

    suspend fun depositById(accountNum: String, amount: Double): Double

    suspend fun withdrawById(accountNum: String, amount: Double): Double
}