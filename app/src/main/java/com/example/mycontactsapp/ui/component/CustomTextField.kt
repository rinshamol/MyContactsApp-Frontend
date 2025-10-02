package com.example.mycontactsapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextField(
    value : String,
    onValueChange : (String) -> Unit,
    placeholder: String
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholder,
                style = TextStyle(color = Color.Gray, fontSize = 16.sp)
            )
        },
        modifier = Modifier.fillMaxWidth().background(Color.White, RoundedCornerShape(5.dp)),
        shape = RoundedCornerShape(5.dp),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color(0xFFDEC698),
            unfocusedIndicatorColor = Color(0xFFDEC698),
            disabledIndicatorColor = Color.Black,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            disabledContainerColor = Color.White,
            cursorColor = Color.Black,
            focusedTextColor = Color.Black
        )
    )
}