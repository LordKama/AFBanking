package com.example.afbanking.presentation.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.afbanking.domain.model.User
import com.example.afbanking.presentation.ui.screens.deposit.DepositScreen
import com.example.afbanking.presentation.ui.screens.home.HomeScreen
import com.example.afbanking.presentation.ui.screens.withdraw.WithdrawScreen

@Composable
fun BankNavGraph(
    nav: NavHostController = rememberNavController(),
    user: User
) {
    NavHost(
        navController = nav,
        startDestination = Routes.Home.route
    ){
        composable(Routes.Home.route){
            HomeScreen(user)
        }
        composable(Routes.Withdraw.route){
            WithdrawScreen()
        }
        composable(Routes.Deposit.route){
            DepositScreen()
        }
    }
}