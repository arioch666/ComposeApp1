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
    /**
     * Lifecycle method, method that sets up activity content.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuildDemoCard()
        }
    }

    /**
     * Composable function that builds the demo card for the activity.
     */
    @Composable
    private fun BuildDemoCard() {
        ComposeApp1Theme {
            Surface(modifier = Modifier.fillMaxSize()) {
                MessageCard().MessageCardComposable(DemoMessageFake.demoMessage)
            }
        }
    }

    /**
     * Composable Preview function. Generates the preview in android studio.
     */
    @Preview
    @Composable
    fun Preview() {
        BuildDemoCard()
    }
}
