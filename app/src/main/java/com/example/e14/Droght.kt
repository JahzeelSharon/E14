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

class Droght : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            E14Theme {
                Image(
                    painter = painterResource(id = R.drawable.drought_24),
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

                    Text(
                        text = "Drought",
                        fontSize = 50.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Meaning",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "A drought is a prolonged period of dry weather that occurs when there is not enough rain. It can occur anywhere in the world and is a slow-onset disaster. \n",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Damage Caused",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "The increase in the frequency, intensity, and duration of droughts will increase risks to food security, according to the Sixth Assessment Report of the Intergovernmental Panel on Climate Change (IPCC). Between 1970 and 2019 drought caused approximately 650,000 deaths.. Between 1998 and 2017, droughts caused global economic losses of roughly USD 124 billion.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Button(onClick = {
                        val navigate = Intent(this@Droght, d2::class.java)
                        startActivity(navigate)
                    }) {
                        Text(
                            modifier = Modifier,
                            color = Color.Red,
                            text = "Read More for tips to avoid drought",
                            fontSize = 16.sp
                        )
                    }
                }
            }
        }
    }
}