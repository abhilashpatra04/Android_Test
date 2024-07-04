package com.example.android_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_test.ui.theme.Android_TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            Android_TestTheme {
                val gradientColors=listOf(Red,Cyan,Yellow,Green)

                Text(
                    text = buildAnnotatedString {
                        append("I am Doing\n")
                        withStyle(
                            SpanStyle(
                                brush = Brush.linearGradient(
                                    colors = gradientColors
                                ), alpha = 0.5f

                            )
                        )
                        {
                            append("Android Development\t")
                        }
                        withStyle(
                            SpanStyle(
                                brush=Brush.linearGradient(
                                    colors=gradientColors
                                ), alpha= 1f
                            )
                        ) {
                            append("using Jetpack Compose")
                        }
                    }
                )
            }
        }
    }
}
