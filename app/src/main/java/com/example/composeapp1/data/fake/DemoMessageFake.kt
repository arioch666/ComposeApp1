package com.example.composeapp1.data.fake

import com.example.composeapp1.data.DemoMessage

class DemoMessageFake {
    companion object {
        val demoMessage = DemoMessage(author = "Android", message = "Hello, World!")
    }
}