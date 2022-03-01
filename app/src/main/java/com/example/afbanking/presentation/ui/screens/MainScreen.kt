package com.example.afbanking.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.sharp.AddCircle
import androidx.compose.material.icons.sharp.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.afbanking.R
import com.example.afbanking.domain.model.User
import com.example.afbanking.presentation.ui.navigation.BankNavGraph
import com.example.afbanking.presentation.ui.navigation.Routes

@Composable
fun MainScreen(user: User){
    val nav = rememberNavController()
    Scaffold(
        topBar = {
                 TopBar(user)
        },
        bottomBar = {
            BottomBar(nav = nav)
        }
    ){
        BankNavGraph(nav, user)
    }
}



@Composable
fun TopBar(user: User){
    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .padding(
                start = 8.dp,
                end = 8.dp,
                top = 8.dp
            )
            .border(1.dp, Color.Red, RectangleShape),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_person_pin_24),
            contentDescription = "Profile pic" ,
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(80.dp)
        )

        Text(
            text = user.name,
            modifier = Modifier
                .padding(top = 8.dp),
            color = MaterialTheme.colors.onSecondary,
            fontSize = 20.sp,
            fontWeight = FontWeight.Thin,
        )

    }
}
@Composable
fun BottomBar(
    nav: NavHostController
) {

    val backButton = nav.currentBackStackEntryAsState()
    val currentDestination = backButton.value?.destination

    BottomNavigation(
        elevation = 16.dp
    ){
        BottomNavigationItem(
            selected = currentDestination?.route == Routes.Home.route,
            onClick = {
                nav.navigate(Routes.Home.route){
                    popUpTo(Routes.Home.route)
                }
            },
            icon = {
                Icon(Icons.Default.Home, "home icon")
            },
            label = {
                Text("Home")
            }
        )

        BottomNavigationItem(
            selected = currentDestination?.route == Routes.Withdraw.route,
            onClick = {
                nav.navigate(Routes.Withdraw.route){
                    popUpTo(Routes.Withdraw.route)
                }
            },
            icon = {
                Icon(Icons.Sharp.ShoppingCart, "withdraw icon")
            },
            label = {
                Text("Withdraw")
            }
        )

        BottomNavigationItem(
            selected = currentDestination?.route == Routes.Deposit.route,
            onClick = {
                nav.navigate(Routes.Deposit.route){
                    popUpTo(Routes.Deposit.route)
                }
            },
            icon = {
                Icon(Icons.Sharp.AddCircle, "deposit icon")
            },
            label = {
                Text("Deposit")
            }
        )

    }
}