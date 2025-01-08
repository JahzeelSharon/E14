package com.example.e14

import android.content.Intent
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.text.Highlights
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
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e14.ui.theme.E14Theme

class tornado : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            E14Theme {
                Image(
                    painter = painterResource(id =R.drawable.tornado24),
                    contentDescription = "Image",
                    modifier = Modifier
                        .background(color = Color.White)
                        .fillMaxSize()
                        .fillMaxHeight()
                        .fillMaxWidth()
                )
                Column(verticalArrangement = Arrangement.Top,
                    horizontalAlignment = AbsoluteAlignment.Left,
                    modifier = Modifier.padding(16.dp))
                {

                    Text(text = "Tornado",
                    fontSize = 50.sp,
                        color = Color.Black
                    )
                    Text(text = "Meaning",
                        fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(text = "A tornado is a violently rotating column of air that extends from a" +
                            " thunderstorm to the ground. Tornadoes are nature's most violent storms " +
                            "and can cause fatalities and devastate a neighborhood in seconds.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black)
                    Text(text = "Damage Caused",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black)
                    Text(text= "According to the National Oceanic Atmospheric Administration (NOAA), the average number of tornadoes-related deaths in the United States is 71 per year. However, in 2023, a preliminary count by NOAA's Storm Prediction Center reported 83 deaths due to 1,423 tornadoes, which is a spike despite an average season Tornadoes in the United States cause about \$400 million in damage each year  on average. In 2022, tornadoes caused approximately \$708 million in damage across the United States, which is more than 200% higher than the previous year. \n",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black )
                   Button(onClick = { val navigate = Intent(this@tornado, t2::class.java)
                       startActivity(navigate)}) {
                       Text( modifier = Modifier,
                           color = Color.Red ,
                           text = "Read More for tips to save your life from Tornado",
                           fontSize = 16.sp
                       )

                   }
                    }
                    }

                }
            }
        }
