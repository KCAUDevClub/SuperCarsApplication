package com.carsapp.supercarsapplication.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.carsapp.supercarsapplication.R


@Preview
@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//            Banner Title
        Text(
            text = "Super Cars",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 32.sp,

            )
        Spacer(modifier = Modifier.height(50.dp))

//            Sub Title
        Text(
            text = "Home of Best Cars: Modern Design & Excellence",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(20.dp)

        )
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.welcome_img),
            contentDescription = "car background",
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
//                    Get started button
        Spacer(modifier = Modifier.height(100.dp))
        Button(
            onClick = { /*TODO*/ }
        ) {
            Row() {
                Text(
                    text = "Get Started"
                )
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Arrow"
                )
            }
        }
    }
}