package com.abhishek.whatsappx.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek.whatsappx.R

@Composable
fun AppbarComponent(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(MaterialTheme.colorScheme.primary)
        .padding(16.dp), verticalAlignment = Alignment.CenterVertically){

        Text(text = stringResource(id = R.string.app_bar_title), style = TextStyle(
            fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = MaterialTheme.colorScheme.tertiary
        ))

        Spacer(modifier = Modifier.weight(1f))
        IConComponent(R.drawable.ic_camera,"Camera")
        Spacer(modifier = Modifier.size(20.dp))
        IConComponent(R.drawable.ic_search,"Search")
        Spacer(modifier = Modifier.size(20.dp))
        IConComponent(R.drawable.ic_menu,"Menu")
    }
}

@Composable
fun IConComponent(drawbleId: Int, desc: String) {
    Icon(painter = painterResource(id =drawbleId), contentDescription = desc, tint = MaterialTheme.colorScheme.tertiary)


}

@Preview
@Composable
fun AppbarComponentPreview(){
    AppbarComponent()
}