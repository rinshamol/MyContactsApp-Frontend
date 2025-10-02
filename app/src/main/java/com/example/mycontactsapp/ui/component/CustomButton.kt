package com.example.mycontactsapp.ui.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycontactsapp.R

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFFDEC698),
    leadingIcon: (@Composable (() -> Unit))? = null,

){
    Button (
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 6.dp,
            pressedElevation = 10.dp
        )

    ) {
        if(leadingIcon != null){
            leadingIcon()
            Spacer(modifier = Modifier.width(8.dp))
        }

        Text(
            text,
            fontFamily = FontFamily(Font(R.font.niconne_regular)),
            fontSize = 30.sp,
        )
    }
}