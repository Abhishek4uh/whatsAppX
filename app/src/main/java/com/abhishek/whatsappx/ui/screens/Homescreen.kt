package com.abhishek.whatsappx.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.abhishek.whatsappx.ui.components.AppbarComponent
import com.abhishek.whatsappx.ui.components.TabBarComponent


@Composable
fun HomeScreen(){
    Column{
        AppbarComponent()
        TabBarComponent()
    }
}



@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}