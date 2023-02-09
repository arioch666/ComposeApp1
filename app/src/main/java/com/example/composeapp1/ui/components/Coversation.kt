package com.example.composeapp1.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp1.data.Message
import com.example.composeapp1.data.fake.SampleMessage


// Create a composable function that takes a list of messages and creates a list of MessageCard
@Composable
fun MessageCardList(messages: List<Message>) {
    // Loop through the list of messages and create a MessageCard for each message
    LazyColumn {
        items(messages.size) { index ->
            MessageCardComposable(messages[index])
        }
    }
}

@Preview(name = "Light Mode", device = "id:pixel_6_pro")
@Composable
fun PreviewMessageCardList() {
    MessageCardList(messages = SampleMessage.conversationSample)
}