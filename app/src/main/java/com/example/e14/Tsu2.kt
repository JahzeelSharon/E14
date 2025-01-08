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

class Tsu2 : ComponentActivity() {
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

                    Text(
                        text = "Tips to save your life from Tsunami",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue,
                    )
                    Text(
                        text = "Evacuate\n" +
                                "If you can, evacuate on foot. Follow evacuation route signage, which often indicate a wave with an arrow pointing to higher ground. If you can't get high or far enough, go as high or far as you can.",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue,
                    )
                    Text(
                        text = "Move inland\n" +
                                "If you can't evacuate, move inland to high ground, at least 100 feet (30 meters) above sea level or 1 mile (1.6 km) inland. If you're in a harbor, go inland. ",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue,
                    )
                    Text(
                        text = "Get to high ground\n" +
                                "If you're trapped in a building, climb to the top. If you're in a boat, face the direction of the waves and head out to sea.",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue,
                    )
                    Text(
                        text = "Grab something floating\n" +
                                "If you're in the water, grab something that floats, such as a raft or tree trunk.",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue,
                    )
                    Button(onClick = {
                        val navigate = Intent(this@Tsu2, MainActivity::class.java)
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