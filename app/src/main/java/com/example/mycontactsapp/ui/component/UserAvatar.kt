package com.example.mycontactsapp.ui.component
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.mycontactsapp.R
import java.net.URL

@Composable
fun UserAvatar(userImageUrl: String?, userName : String, size: Dp){
    var font = 18.sp
    if(size != 40.dp) { font = 40.sp }

    if (!userImageUrl.isNullOrEmpty()){
        Image(
            painter = rememberAsyncImagePainter(
                model = userImageUrl,
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                error = painterResource(R.drawable.ic_launcher_background)
            ),
            contentDescription = "User Image",
            modifier = Modifier
                .size(size)
                .clip(CircleShape)

        )
    } else {
     Box(
         modifier = Modifier
         .size(size)
         .clip(CircleShape)
         .background(Color.Gray),
         contentAlignment = Alignment.Center
     ) {
         if( userName == ""){
             Icon(
                 imageVector = Icons.Default.AccountCircle,
                 contentDescription = "contact_icon",
                 Modifier.size(size ),
                 tint = Color.Gray

             )
         }else{
             Text(
                 text = userName.first().uppercase() ,
                 color = Color.White,
                 fontSize = font,
             )
         }

     }
    }
}