package com.example.afbanking.data.repo

import com.example.afbanking.data.network.AFBankApi
import com.example.afbanking.data.network.dto.UserDto
import com.example.afbanking.data.network.dto.toUser
import com.example.afbanking.domain.repo.UserRepo
import javax.inject.Inject

class UserRepoImplementation @Inject constructor(
    private val apiCall: AFBankApi
): UserRepo{

    /*
    * Remember to call all these methods in a coroutine
    * */


    //Returns a user dto whose accountBalance property is used for deposit/withdraw and display on home screen
    override suspend fun getUserByRNum(routingNum: String): UserDto {
        return apiCall.getUserByRoutNum(routingNum)
    }

    //Takes in an amount and adds to the current amount
    override suspend fun depositById(routingNum: String, amount: Double): Double {
        val bu = getUserByRNum(routingNum = routingNum).toUser()

        return bu.accountBalance + amount
    }

    //Takes in an amount and subtracts from the current amount
    override suspend fun withdrawById(routingNum: String, amount: Double): Double {
        val bu = getUserByRNum(routingNum = routingNum).toUser()

        return bu.accountBalance - amount
    }
}