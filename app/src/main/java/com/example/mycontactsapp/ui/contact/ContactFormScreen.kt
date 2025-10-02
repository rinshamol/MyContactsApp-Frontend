package com.example.mycontactsapp.ui.contact
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mycontactsapp.ui.component.AppBar
import com.example.mycontactsapp.ui.component.CustomButton
import com.example.mycontactsapp.ui.component.CustomTextField
import com.example.mycontactsapp.ui.component.UserAvatar
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.mycontactsapp.R


@Composable
fun ContactFormScreen(navController: NavHostController,action : String) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var isEdit : String
    if(action == "Edit"){
        isEdit = "Edit Contact"
        name = "Alice"
        email = "alice@gmail.com"
        phone = "9496086413"
    } else{
        isEdit = "Create Contact"
    }
    Box(
        modifier = Modifier.fillMaxSize(),
    ){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppBar("Rinsha", "")
        Spacer(modifier = Modifier.height(80.dp))
        Column(modifier = Modifier.fillMaxWidth().padding(32.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally

            ) {

            Text(
                isEdit,
                fontFamily = FontFamily(Font(R.font.niconne_regular)),
                fontSize = 48.sp,
                color = Color.Black,
            )

            UserAvatar("", name, 108.dp)
            Spacer(modifier = Modifier.height(12.dp))
            CustomTextField(name, { name = it }, "Name ")
            CustomTextField(email, { email = it }, "Email")
            CustomTextField(phone, { phone = it }, "Phone Number")
            Box(modifier = Modifier.fillMaxWidth()) {
                CustomButton("Save",{},
                    modifier = Modifier.width(179.dp).height(56.dp).align(
                    Alignment.Center))
            }
            }
        }
    }
}