package com.abhishek.whatsappx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.abhishek.whatsappx.ui.screens.HomeScreen
import com.abhishek.whatsappx.ui.theme.WhatsAppXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppXTheme {
                //A surface container using the 'background' color from the theme
                HomeScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WhatsAppXTheme {
        HomeScreen()
    }
}