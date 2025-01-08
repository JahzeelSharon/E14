package com.example.e14

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e14.ui.theme.E14Theme

class trau2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            E14Theme {
                Image(
                    painter = painterResource(id = R.drawable.tsunami),
                    contentDescription = "Image",
                    modifier = Modifier
                        .background(color = Color.White)
                        .fillMaxSize()
                        .fillMaxHeight()
                        .fillMaxWidth()
                )
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = AbsoluteAlignment.Left,
                    modifier = Modifier.padding(16.dp)
                )
                {
                    Text(text = "Tips to help a person come out of trauma")

                    Text(
                        text = "Listen\n" +
                                "Be a good listener and allow the person to talk about what happened, even if they become upset.\n" +
                                "Learn triggers\n" +
                                "Try to understand what distress the person is experiencing so you can understand what to expect.\n" +
                                "Avoid judgment\n" +
                                "Don't feel it's your job to take their pain away or \"cure\" them.\n" +
                                "Offer support\n" +
                                "Provide practical support, help them set boundaries, and respect their privacy and boundaries.\n" +
                                "Relax\n" +
                                "Try relaxation techniques like yoga, breathing, or meditation, or do things you enjoy, such as listening to music or gardening.\n" +
                                "Express feelings\n" +
                                "Talk to someone about your feelings or write them down. When the trauma brings up memories or feelings, try to confront them.",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue,
                    )
                    Button(onClick = {
                        val navigate = Intent(this@trau2, MainActivity::class.java)
                        startActivity(navigate)
                    }) {
                        Text(
                            modifier = Modifier,
                            color = Color.Black,
                            text = "HOME",
                            fontSize = 25.sp
                        )
                    }
                }
            }
        }
    }
}