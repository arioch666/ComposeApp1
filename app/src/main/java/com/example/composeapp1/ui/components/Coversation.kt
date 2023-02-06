package com.example.composeapp1.ui.components

import androidx.compose.runtime.Composable
import com.example.composeapp1.data.DemoMessage

// Create a composable function that takes a list of messages and creates a list of MessageCard
@Composable
fun MessageCardList(messages: List<DemoMessage>) {
    // Loop through the list of messages and create a MessageCard for each message
    for (message in messages) {
        MessageCardComposable(message = message)
    }
}