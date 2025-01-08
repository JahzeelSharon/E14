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

class Trauma : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            E14Theme {
                Image(
                    painter = painterResource(id = R.drawable.trauma24),
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
                        text = "Trauma",
                        fontSize = 50.sp,
                        color = Color.Blue
                    )
                    Text(
                        text = "Meaning",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue
                    )
                    Text(
                        text = "Psychological trauma (also known as mental trauma, psychiatric trauma, or psychotrauma) is an emotional response caused by severe distressing events that are outside the normal range of human experiences, with extreme examples being violence, rape, or a terrorist attack.According to SPH, the rate of post-traumatic stress disorder (PTSD) after a disaster can be as high as 40%. Most people's symptoms fade over time, but nearly a quarter of cases can be chronic and severe. Some people recover from PTSD within 6 months, while others have symptoms that last for 1 year or longer. People with PTSD often have co-occurring conditions, such as depression, substance use, or one or more anxiety disorders. ",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Blue
                    )
                    Button(onClick = {
                        val navigate = Intent(this@Trauma, trau2::class.java)
                        startActivity(navigate)
                    }) {
                        Text(
                            modifier = Modifier,
                            color = Color.Red,
                            text = "Read More for tips to bring out a person from trauma",
                            fontSize = 16.sp
                        )

                    }
                }
            }
        }
    }
}