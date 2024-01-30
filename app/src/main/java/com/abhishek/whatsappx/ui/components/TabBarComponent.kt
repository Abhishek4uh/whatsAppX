package com.abhishek.whatsappx.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhishek.whatsappx.data.TabData
import com.abhishek.whatsappx.data.tabs


@Composable
fun TabBarComponent(){
    var selectedIndex by remember { mutableStateOf(0) }

    TabRow(
        selectedTabIndex =selectedIndex,

        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = {tabPos->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPos[selectedIndex]),
                color = MaterialTheme.colorScheme.tertiary,
                height = 4.dp)
        }){
        tabs.forEachIndexed { index,tabData ->
            Tab(selected = index== selectedIndex,
                onClick = {selectedIndex=index},
                text = {
                    tabContent(tabData)
                }
            )
        }
    }
}

@Composable
fun tabContent(tabData: TabData) {
    if (tabData.unreadCount!=null)
        TabTitleWithUnreadCount(tabData)
    else{
        TabTitle(tabData.title)
    }
}

@Composable
fun TabTitle(title: String) {
    Text(text = title, style = TextStyle(fontSize = 16.sp))
}



@Composable
fun TabTitleWithUnreadCount(tabData: TabData) {
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
        TabTitle(tabData.title)
        tabData.unreadCount?.also { unreadCount->
            Text(text = unreadCount.toString(),
                modifier = Modifier.padding(8.dp).size(16.dp).clip(CircleShape).background(MaterialTheme.colorScheme.background),
                style = TextStyle(
                    color =MaterialTheme.colorScheme.primary,
                    textAlign = TextAlign.Center,
                    fontSize = 12.sp
                )
            )
        }
    }
}


@Preview
@Composable
fun TabBarComponentPreview(){
    TabBarComponent()
}