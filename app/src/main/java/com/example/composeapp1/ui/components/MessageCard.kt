package com.example.composeapp1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp1.R
import com.example.composeapp1.data.DemoMessage
import com.example.composeapp1.data.fake.DemoMessageFake

class MessageCard {
    @Composable
    fun messageCardComposable(message: DemoMessage) {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(painter = painterResource(id = R.drawable.test_image),
            contentDescription = "Contact profile Image",
            modifier = Modifier.size(40.dp).clip(CircleShape))
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(message.author)
                Spacer(modifier = Modifier.height(4.dp))
                Text(message.message)
            }
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_6_pro")
@Composable
fun previewMessageCard() {
    val messageCard = MessageCard()
    messageCard.messageCardComposable(DemoMessageFake.demoMessage)
}
