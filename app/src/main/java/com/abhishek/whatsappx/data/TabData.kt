package com.abhishek.whatsappx.data

data class TabData(
    val title:String,
    val unreadCount:Int?
)

val tabs= listOf<TabData>(
    TabData(Tabs.CHATS.title,4),
    TabData(Tabs.STATUS.title,null),
    TabData(Tabs.CALLS.title,2)
)

enum class Tabs(val title: String){
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}
