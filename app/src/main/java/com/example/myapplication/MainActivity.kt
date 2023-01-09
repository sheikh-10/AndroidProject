package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                BirthdayGreeting()
            }
        }
    }
}

@Composable
private fun BirthdayGreeting(modifier: Modifier = Modifier) {
    Column {
        Text(text = "Happy Birthday, Sam!")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun BirthdayGreetingPreview() {
    BirthdayGreeting()
}