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

class w2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            E14Theme {
                Image(
                    painter = painterResource(id = R.drawable.wildfire25),
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
                        text = "Tips to avoid Wild fire",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )
                    Text(
                        text = "Avoid dry conditions\n" +
                                "Avoid activities that involve fire or sparks in dry, windy conditions. Don't burn household wastes when regulations prohibit it.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Use fire-resistant landscaping\n" +
                                "Remove dead plants, grass, weeds, dry leaves, pine needles, and fallen leaves from your lawn, roof, and rain gutters. Trim trees regularly to keep branches at least 10 feet away from other trees. Clear away any dead trees, brush, and vegetation within 100 feet of all structures.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Use fire safely\n" +
                                "Use fire and flames in a wide-open area far away from flammable vegetation. Use a can or fire pit, and extinguish fire pits and campfires when done. Don't throw explosives and combustibles into the fire.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "Use caution with flammable liquids\n" +
                                "Use caution when using flammable liquids. Gas-powered tools such as chain saws, cut-off saws, grinders, and concrete saws should all have functional spark arrestors in place.",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    Button(onClick = {
                        val navigate = Intent(this@w2, MainActivity::class.java)
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
    }}
                    