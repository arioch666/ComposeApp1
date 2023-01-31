package com.example.composeapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp1.data.fake.DemoMessageFake
import com.example.composeapp1.ui.components.MessageCard
import com.example.composeapp1.ui.theme.ComposeApp1Theme

class MainActivity : ComponentActivity() {
    // Lifecycle method
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            buildDemoCard()
        }
    }


    @Composable
    private fun buildDemoCard() {
        ComposeApp1Theme {
            Surface(modifier = Modifier.fillMaxSize()) {
                MessageCard().messageCardComposable(DemoMessageFake.demoMessage)
            }
        }
    }


    @Preview
    @Composable
    fun preview() {
        buildDemoCard()
    }
}




//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//            text = "Hello $name!",
//            modifier = modifier
//    )
//}
//
//@Preview(showBackground = true, device = "id:pixel_6_pro")
//@Composable
//fun GreetingPreview() {
//    ComposeApp1Theme {
//        Greeting("Android")
//    }
//}