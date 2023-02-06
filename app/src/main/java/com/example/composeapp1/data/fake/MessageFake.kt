package com.example.composeapp1.data.fake

import com.example.composeapp1.data.Message

class MessageFake {
    companion object {
        val message = Message(author = "Android", message = "Hello, World!")
    }
}