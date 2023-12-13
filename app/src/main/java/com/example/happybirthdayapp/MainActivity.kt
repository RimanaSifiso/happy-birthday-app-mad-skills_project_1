package com.example.happybirthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdayapp.ui.theme.HappyBirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message = "Happy Birthday Erca", from = "From Fidencia")
                }
            }
        }
    }
}

@Composable
private fun BirthdayCard() {
    HappyBirthdayAppTheme {

    }
}

@Composable
private fun GreetingText( message: String, from: String, modifier: Modifier = Modifier) {

    Column (
        modifier = modifier, // pass the modifier along with the attributes in the parent composable
        verticalArrangement = Arrangement.Center
    ) {
        Text(

            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
//            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp).align(Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BirthdayCardPreview() {
    GreetingText("Happy Birthday Sifiso!", from="Fidencia")
}