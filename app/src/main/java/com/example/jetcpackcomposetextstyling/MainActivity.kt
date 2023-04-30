package com.example.jetcpackcomposetextstyling

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetcpackcomposetextstyling.ui.theme.JetcpackComposeTextStylingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.brunoacesc_regular, FontWeight.Normal)
        )
        setContent {
            JetcpackComposeTextStylingTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray)
                ) {
//                    Greeting("Android")
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Red,
                                    fontSize = 50.sp
                                )
                            ){
                                append("J")
                            }
                            append("etpack ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Red,
                                    fontSize = 50.sp
                                )
                            ){
                                append("C")
                            }
                            append("ompose")
                        },
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetcpackComposeTextStylingTheme {
        Greeting("Android")
    }
}