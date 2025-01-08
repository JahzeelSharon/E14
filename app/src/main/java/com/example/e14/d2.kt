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

class d2 : ComponentActivity() {
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
                        text = " \"Tips to avoid Drought",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                    Text(
                        text = "Conserve water: Reduce the amount of water you use each day. For example, you can turn off the faucet while brushing your teeth, water your garden early in the morning, and install low-flow plumbing fixtures. You can also avoid flushing the toilet unnecessarily, take short showers instead of baths, and avoid letting the water run while brushing your teeth, washing your face, or shaving.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Use rainwater: Rainwater harvesting provides an efficient option to store rainwater and then reuse it in times of drought. You can install rooftop rainwater harvesting systems in buildings to boost local groundwater levels and mitigate drought impacts.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Plant trees: Plant trees, especially species that need little water, and mulch around them. You can also plant native and/or drought-tolerant grasses, ground covers, shrubs, and trees.",
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
                        val navigate = Intent(this@d2, MainActivity::class.java)
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
