package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                    Text(text = "Hello", modifier = Modifier.align(Alignment.TopStart))
                    Text(text = "Hello", modifier = Modifier.align(Alignment.TopCenter))
                    Text(text = "Hello", modifier = Modifier.align(Alignment.TopEnd))
                    Text(text = "Hello", modifier = Modifier.align(Alignment.CenterStart))
                    Text(text = "Hello", modifier = Modifier.align(Alignment.Center))
                    Text(text = "Hello", modifier = Modifier.align(Alignment.CenterEnd))
                    Text(text = "Hello", modifier = Modifier.align(Alignment.BottomStart))
                    Text(text = "Hello", modifier = Modifier.align(Alignment.BottomCenter))
                    Text(text = "Hello", modifier = Modifier.align(Alignment.BottomEnd))
                }

//                Column(
//                    modifier = Modifier.fillMaxSize(),
//                    verticalArrangement = Arrangement.spacedBy(10.dp),
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "Hello")
//                    Text(text = "World")
//                    Text(text = "I'm")
//                    Text(text = "jieun")
//                }

//                Row(
//                    modifier = Modifier.fillMaxSize(),
//                    horizontalArrangement = Arrangement.SpaceEvenly,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Text(text = "Hello")
//                    Text(text = "World")
//                    Text(text = "I'm")
//                    Text(text = "jieun")
//                }
            }

        }
    }
}