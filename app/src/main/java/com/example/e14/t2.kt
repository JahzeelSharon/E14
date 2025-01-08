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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e14.ui.theme.E14Theme

class t2 : ComponentActivity() {
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
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = AbsoluteAlignment.Left,
                    modifier = Modifier.padding(16.dp)
                )
                {

                    Text(
                        text = "Tips to save your life from tornado",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                    Text(
                        text = "Be Prepared: Ensure you have fresh batteries and a battery-operated device for weather updates. Develop a tornado emergency plan for your family, including pets, and assemble an emergency kit with essentials. Keep important information accessible, like telephone numbers.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Stay Aware of Weather Conditions: Stay tuned to local radio, TV stations, or NOAA weather radio for updates. Watch for signs such as dark skies, low clouds, hail, or loud roars, indicating an approaching tornado. Take immediate shelter if you notice any of these signs.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Know Where to Shelter: Seek refuge in a basement or interior room without windows on the lowest floor. Avoid rooms with windows and get under something sturdy for added protection. Do not remain in a mobile home; seek a nearby sturdy building. If outdoors or in a car, find shelter in a sturdy building rather than attempting to outrun the tornado.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Emergency Number :112",
                        modifier = Modifier,
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                    Button(onClick = {
                        val navigate = Intent(this@t2, MainActivity::class.java)
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