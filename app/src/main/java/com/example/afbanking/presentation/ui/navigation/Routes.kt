package com.example.afbanking.presentation.ui.navigation

sealed class Routes(val route: String){
    object Home: Routes(route = "home")
    object Withdraw: Routes(route = "withdraw")
    object Deposit: Routes(route = "deposit")
}
