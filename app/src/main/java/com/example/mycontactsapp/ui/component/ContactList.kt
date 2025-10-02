package com.example.mycontactsapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mycontactsapp.R
import com.example.mycontactsapp.model.Contact

@Composable
fun ContactList(navController: NavHostController){
    val contacts = listOf(
        Contact("Alice Johnson", "+1234567890", "alice@example.com", null),
        Contact("Bob Smith", "+1987654321", "bob@example.com", null),
        Contact("Charlie Williams", "+1122334455", "charlie@example.com", null)
    )
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(contacts) {contact->
            ContactRow( navController )

        }
    }
}

//data class Contact(val name: String, val imageUrl: String? = null)
@Composable
fun ContactRow( navController: NavHostController){
val name = "Alice Johnson"
    Row(
        modifier = Modifier.fillMaxWidth().height(70.dp)
            .border(
                width = 1.dp,
                color = Color(0xFFDEC698),
                shape = RoundedCornerShape(12.dp)
            )
            .background(
                Color.White,RoundedCornerShape(12.dp)
            )
            .clickable{
                navController.navigate("contactDetail")
            }
            .padding(
                horizontal = 12.dp,
                vertical = 8.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = name.first().toString(),
                color = Color.White,
                fontSize = 18.sp,
            )
        }
        Text(
            text = name,
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 16.dp),
            fontFamily = FontFamily(Font(R.font.niconne_regular)),
            )
    }

}