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

class e2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            E14Theme {
                Image(
                    painter = painterResource(id = R.drawable.earthquacke),
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
                        text = "Tips to save your life from Earthquake ",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                    Text(
                        text = "Drop, cover, and hold on\n" +
                                "If you're indoors, drop to the ground, cover your head and neck with your arms, and hold onto a sturdy piece of furniture. If there's no table or desk nearby, crouch in an inside corner of the building and cover your face and head with your arms. Stay away from windows, fireplaces, heavy furniture or appliances, and get out of the kitchen.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Move to an open area\n" +
                                "If you're outdoors, move to an open area away from buildings, powerlines, and trees. If you're in a car, pull over and stop, set your parking brake, and stay inside the car. If you're in bed, turn face down and cover your head and neck with a pillow.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Prepare for an earthquake\n" +
                                "Plan an escape route, identify alternate shelter, and put together an earthquake preparedness kit. Train your family on earthquake safety, involve everyone in practice drills, and develop a communication plan. \n",
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
                        val navigate = Intent(this@e2, MainActivity::class.java)
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