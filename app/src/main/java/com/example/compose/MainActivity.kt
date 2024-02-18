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
import com.example.compose.ui.theme.Purple700

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
//                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//                    Text(text = stringResource(id = R.string.jieun).plus(" ").repeat(30),
//                    maxLines = 3,
//                    overflow = TextOverflow.Ellipsis)
//                }

//                Text(
//                    text = "Hello World",
//                    color = Color.Magenta,
//                    fontSize = 32.sp,
//                    textDecoration = TextDecoration.Underline,
//                    textAlign = TextAlign.Start,
//                    modifier = Modifier.fillMaxWidth()
//                )

                Box(modifier = Modifier.fillMaxSize().background(Color.Black), contentAlignment = Alignment.Center) {
                    val annotatedString = buildAnnotatedString {
                        blueGradientText("NEW")
                        append("\n\n")
                        pinkBlueGradientText("Gradient")
                        append("\n\n")
                        blueGradientText("text")
                    }

                    Text(text = annotatedString)
                }
            }

        }
    }

    @OptIn(ExperimentalTextApi::class)
    private fun AnnotatedString.Builder.blueGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF2788C7),
                        Color(0xFF00BBD4)
                    )
                ),
                fontSize = 42.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(text)
        }
    }

    @OptIn(ExperimentalTextApi::class)
    private fun AnnotatedString.Builder.pinkBlueGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFF3885),
                        Color(0xFF00BBD4)
                    )
                ),
                fontSize = 48.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(text)
        }
    }
}