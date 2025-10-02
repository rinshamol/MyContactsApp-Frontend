package com.example.mycontactsapp.ui.contact

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycontactsapp.R
import com.example.mycontactsapp.ui.component.AppBar
import com.example.mycontactsapp.ui.component.CustomButton
import com.example.mycontactsapp.ui.component.UserAvatar

@Composable
fun ContactDetailScreen(navController: NavHostController){

    Box( modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AppBar(userName = "Rinsha", userUrl = "")
            Spacer(modifier = Modifier.height(180.dp))
            UserAvatar("","Alice", size = 108.dp)
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                "Alice Johnson",
                fontFamily = FontFamily(Font(R.font.niconne_regular)),
                fontSize = 32.sp
            )
            Text(
                text =  "9496086413",
                fontSize = 24.sp,
                color = Color.Gray,
                fontFamily = FontFamily(Font(R.font.neuton_regular)),
            )
            Text(
                text = "alice@gmail.com",
                fontSize = 24.sp,
                color = Color.Gray,
                fontFamily = FontFamily(Font(R.font.neuton_regular)),
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                CustomButton(
                    "Edit",
                    onClick = { navController.navigate("contactForm/Edit")},
                    modifier = Modifier.width(179.dp).height(56.dp),
                    leadingIcon = {
                        Icon(
                        painter = painterResource(id = R.drawable.edit_icon),
                        contentDescription = "Edit",
                        Modifier.size(30.dp),
                        )
                      }
                    )
                CustomButton(
                    "Delete",
                    onClick = { /* Delete action */ },
                    modifier = Modifier.width(179.dp).height(56.dp),
                    backgroundColor = Color.Red,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.delete_icon),
                            contentDescription = "Delete",
                            Modifier.size(30.dp),
                        )
                    }
                    )
            }
        }
    }
}