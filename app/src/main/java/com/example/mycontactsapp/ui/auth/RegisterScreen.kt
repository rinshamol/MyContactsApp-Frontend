package com.example.mycontactsapp.ui.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycontactsapp.R
import com.example.mycontactsapp.ui.component.CustomButton
import com.example.mycontactsapp.ui.component.CustomTextField

@Composable
fun RegisterScreen(navController: NavHostController){
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(modifier = Modifier.fillMaxWidth().padding(32.dp),
            // horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Create Account",
                fontFamily = FontFamily(Font(R.font.niconne_regular)),
                fontSize = 48.sp,
                color = Color.Black,
                textAlign = TextAlign.Start
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Already have an account? ",
                    fontFamily = FontFamily(Font(R.font.neuton_regular)),
                    fontSize = 20.sp,
                    color = Color.Black
                )
                TextButton({navController.navigate("login")}) {
                    Text(
                        text = "sign in",
                        fontFamily = FontFamily(Font(R.font.neuton_regular)),
                        fontSize = 20.sp,
                        color = colorResource(id = R.color.custom_blue))

                }
            }
            CustomTextField(
                value = name,
                onValueChange = {name = it},
                placeholder = "Enter your Email ID"
            )
            CustomTextField(
                value = email,
                onValueChange = {email = it},
                placeholder = "Enter your Email ID"
            )
            CustomTextField(
                value = password,
                onValueChange = {password = it},
                placeholder = "Enter your Password"
            )
            Box(modifier = Modifier.fillMaxWidth()) {
                CustomButton("sign up",
                    { navController.navigate("login") },
                    modifier = Modifier.width(179.dp).height(56.dp).align(Alignment.Center)
                )
            }
        }
    }
}