package com.example.e14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.e14.ui.theme.E14Theme

class torn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            E14Theme {
                Image(
                    painter = painterResource(id = R.drawable.tornado24),
                    contentDescription = "Image",
                    modifier = Modifier
                        .background(color = Color.White)
                        .fillMaxSize()
                        .fillMaxHeight()
                        .fillMaxWidth()
                )
                Column {

                    Text(
                        text = "Find shelter: If you're at home, go to the basement or a small interior room on the lowest floor without windows. This could be a bathroom, closet, or hallway. If there's no basement, get under a heavy table or workbench and use your arms to protect your head and neck.\n" +
                                "Avoid windows: Stay away from windows, outside walls, and doors.\n" +
                                "Be away from trees and cars: If you're outside, lie flat and face down on low ground, protecting your back of your head with your arms. Get as far away from trees and cars as you can.\n" +
                                "Stay calm: In a shopping mall or large store, do not panic. \n",
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}
