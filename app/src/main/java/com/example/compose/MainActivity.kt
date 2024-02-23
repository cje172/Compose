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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ElevatedButton
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import com.example.compose.ui.theme.ComposeTheme
import com.example.compose.ui.theme.MyCustomCard
import com.example.compose.ui.theme.Publisher

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        modifier = Modifier
                            .height(50.dp)
                            .width(140.dp),
                        shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
                        enabled = true,
                        elevation = ButtonDefaults.elevation(
                            defaultElevation = 30.dp
                        ),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color(0xFF2D4356),
                            contentColor = Color.Green,
                            disabledBackgroundColor = Color.LightGray,
                            disabledContentColor = Color.White
                        ),
                        onClick = { }
                    ) {
                        Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
                        Text(text = "Click")
                    }

//                    TextButton(onClick = { /*TODO*/ }) {
//                        Text(text = "Click Me")
//                    }
//
//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(painter = painterResource(id =R.drawable.ic_launcher_foreground), contentDescription = null)
//                    }
//
//                    ElevatedButton(onClick = { /*TODO*/ }) {
//
//                    }

                }

            }
        }
    }
}