package com.example.e14

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e14.ui.theme.E14Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.Black)
            ) {
                Button(modifier = Modifier
                    .padding(16.dp),
                    onClick = {
                        val navigate = Intent(this@MainActivity, tornado::class.java)
                        startActivity(navigate)
                    }) {
                    Text(
                        modifier = Modifier,
                        color = Color.White,
                        text = "Tornado",
                        fontSize = 30.sp
                    )
                }
                Column {


                    Button(modifier = Modifier
                        .padding(16.dp),
                        onClick = {
                            val navigate = Intent(this@MainActivity, earthquake::class.java)
                            startActivity(navigate)
                        }) {
                        Text(
                            modifier = Modifier,
                            color = Color.White,
                            text = "Earthquake",
                            fontSize = 30.sp
                        )
                    }

                }
                Column {
                    Button(modifier = Modifier
                        .padding(16.dp),
                        onClick = {
                            val navigate = Intent(this@MainActivity, flood::class.java)
                            startActivity(navigate)
                        }) {
                        Text(
                            modifier = Modifier,
                            color = Color.White,
                            text = "Flood",
                            fontSize = 30.sp
                        )
                    }
                    Column {
                        Button(modifier = Modifier
                            .padding(16.dp),
                            onClick = {
                                val navigate = Intent(this@MainActivity, Droght::class.java)
                                startActivity(navigate)
                            }) {
                            Text(
                                modifier = Modifier,
                                color = Color.White,
                                text = "Drought",
                                fontSize = 30.sp
                            )
                        }
                        Column {
                            Button(modifier = Modifier
                                .padding(16.dp),
                                onClick = {
                                    val navigate = Intent(this@MainActivity, wildfire::class.java)
                                    startActivity(navigate)
                                }) {
                                Text(
                                    modifier = Modifier,
                                    color = Color.White,
                                    text = "Wild Fire",
                                    fontSize = 30.sp
                                )
                            }
                            Column {

                                Button(modifier = Modifier
                                    .padding(16.dp),
                                    onClick = {
                                        val navigate =
                                            Intent(this@MainActivity, Tsunami::class.java)
                                        startActivity(navigate)
                                    }) {
                                    Text(
                                        modifier = Modifier,
                                        color = Color.White,
                                        text = "Tsunami",
                                        fontSize = 30.sp
                                    )
                                }
                                Column {

                                    Button(modifier = Modifier
                                        .padding(16.dp),
                                        onClick = {
                                            val navigate =
                                                Intent(this@MainActivity, war::class.java)
                                            startActivity(navigate)
                                        }) {
                                        Text(
                                            modifier = Modifier,
                                            color = Color.White,
                                            text = "War",
                                            fontSize = 30.sp
                                        )
                                    }
                                    Button(modifier = Modifier
                                        .padding(16.dp),
                                        onClick = {
                                            val navigate =
                                                Intent(this@MainActivity, Trauma::class.java)
                                            startActivity(navigate)
                                        }) {
                                        Text(
                                            modifier = Modifier,
                                            color = Color.White,
                                            text = "Trauma",
                                            fontSize = 30.sp
                                        )

                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}




