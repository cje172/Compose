package com.example.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme
import com.example.compose.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
//                Box(
//                    modifier = Modifier
//                        .padding(horizontal = 10.dp, vertical = 10.dp)
//                        .fillMaxWidth()
//                        .fillMaxHeight(0.5f)
//                        .background(
//                            color = Color.Red, shape = RectangleShape
//                        )
//                )

//                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//                    Box(
//                        modifier = Modifier
//                            .size(100.dp)
//                            .clip(CircleShape)
////                            .clip(RoundedCornerShape(10.dp))
//                            .border(width = 3.dp, color = Color.Red, shape = CircleShape)
//                            .border(width = 6.dp, color = Color.Black, shape = CircleShape)
//                            .background(Color.Green)
//                    )
//                }

//                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//                    Box(modifier = Modifier
//                        .width(150.dp)
//                        .height(100.dp)
//                        .clip(RoundedCornerShape(15.dp))
//                        .background(color = Purple700)
//                        .clickable {
//                            Log.d("test", "Click")
//                        },
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Text(text = "Button", color = Color.White)
//                    }
//                }

                Row(modifier = Modifier.fillMaxWidth()) {
                    Box(modifier = Modifier
                        .background(Color.Red)
                        .height(100.dp)
                        .weight(2f))
                    
                    Spacer(modifier = Modifier.width(5.dp))

                    Box(modifier = Modifier
                        .background(Color.Red)
                        .height(100.dp)
                        .weight(1f))
                }
            }

        }
    }
}