package com.example.afbanking.data.network.dto

import com.example.afbanking.domain.model.User
import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("account_balance")
    val accountBalance: Double,
    @SerializedName("account_number")
    val accountNumber: String,
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    val id: String,
    @SerializedName("last_name")
    val lastName: String,
    val password: String,
    val sex: String,
    @SerializedName("user_name")
    val userName: String
)


fun UserDto.toUser(): User {
    return User(
        userId = id,
        firstName = firstName,
        lastName = lastName,
        accountBalance = accountBalance
    )
}