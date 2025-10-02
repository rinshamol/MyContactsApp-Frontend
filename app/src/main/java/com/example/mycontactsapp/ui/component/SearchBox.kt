package com.example.mycontactsapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mycontactsapp.R

@Composable
fun SearchBox(){
    var query by remember { mutableStateOf("") }
    Surface(
        shape = RoundedCornerShape(30.dp),
        tonalElevation = 6.dp, // background tint + elevation
        shadowElevation = 6.dp,
        color = Color(0xFFF4E9D3),
        modifier = Modifier.height(53.dp)
            .padding(horizontal = 16.dp)
    ) {
        TextField(
            value = query,
            onValueChange = { query = it },
            placeholder = {
                Text(
                    text = "Search here...",
                    color = Color.Gray
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.search_icon),
                    contentDescription = "Search Icon",
                    tint = Color.Gray
                )
            },
            singleLine = true,
            modifier = Modifier.fillMaxWidth().height(53.dp)
                .padding(horizontal = 16.dp)
                .background(Color(0xFFF4E9D3), RoundedCornerShape(30.dp)),
            shape = RoundedCornerShape(30.dp),

            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFFF4E9D3),
                focusedContainerColor = Color(0xFFF4E9D3),
                disabledContainerColor = Color(0xFFF4E9D3),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                cursorColor = Color.Gray
            ),

            )
    }
}