package com.example.afbanking.presentation.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.afbanking.presentation.ui.theme.TealPurp
import com.example.afbanking.R.drawable
import com.example.afbanking.domain.model.User

@Composable
fun HomeScreen(user: User){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = CenterHorizontally,
            modifier = Modifier
                //.border(1.dp, androidx.compose.ui.graphics.Color.Red, RectangleShape)
                .fillMaxSize()
                .padding(
                    bottom = 100.dp
                ),
            verticalArrangement = Arrangement.Center
        ){
//            Row(
//                modifier = Modifier
//                    .height(100.dp)
//                    .fillMaxWidth()
//                    .padding(
//                        start = 8.dp,
//                        end = 8.dp,
//                        top = 8.dp
//                    )
//                    .border(1.dp, androidx.compose.ui.graphics.Color.Red, RectangleShape),
//                horizontalArrangement = Arrangement.Start,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Image(
//                    painter = painterResource(id = drawable.ic_baseline_person_pin_24),
//                    contentDescription = "Profile pic" ,
//                    contentScale = ContentScale.Fit,
//                    modifier = Modifier.size(80.dp)
//                )
//
//                Text(
//                    text = user.name,
//                    modifier = Modifier
//                        .padding(top = 8.dp),
//                    color = MaterialTheme.colors.onSecondary,
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Thin,
//                )
//
//            }

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = 8.dp,
                        end = 8.dp,
                        bottom = 63.dp
                    ),
                elevation = 20.dp, backgroundColor = TealPurp,

            ){
                Column(
                    horizontalAlignment = CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "$${user.accountBalance}",
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .align(CenterHorizontally),
                        color = MaterialTheme.colors.onSecondary,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Thin,
                    )
                    Text(
                        text = "Account Balance",
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .align(CenterHorizontally),
                        color = MaterialTheme.colors.onSecondary,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Thin,
                    )
                }

            }
        }
    }
}