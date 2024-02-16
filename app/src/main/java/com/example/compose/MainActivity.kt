package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Jieun")
//            Button(onClick = { println("Click") }, content = {
//                Text(text = "Button")
//            })
//            Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null, tint = Color.Black)
//            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
//            TextField(value = "", onValueChange = {}, label = {
//                Text(text = "Label")
//            })
//            FloatingActionButton(onClick = { /*TODO*/ }) {
//                Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
//            }
//            ExtendedFloatingActionButton(
//                text = {
//                    Text(text = "Add")
//                },
//                onClick = { /*TODO*/ },
//                icon = {
//                    Icon(
//                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                        contentDescription = null
//                    )
//                },
//                backgroundColor = Color.White
//            )
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Welcome $name", color = Color.Blue, fontSize = 22.sp, fontWeight = FontWeight.Bold)
}
