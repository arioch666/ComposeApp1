package com.example.composeapp1.ui.components

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp1.R
import com.example.composeapp1.data.Message
import com.example.composeapp1.data.fake.MessageFake


/**
 * Composable function that will create the message card with the data passed in.
 *
 * Uses the name for the top text and the message for the bottom text.
 *
 * There is an image that is currently being used, eventually this should be downloaded from the
 * internet.
 */
@Composable
fun MessageCardComposable(message: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.test_image),
            contentDescription = "Contact profile Image",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        var isExpanded by remember { mutableStateOf(false) }
        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(
                text = message.author, color = MaterialTheme.colorScheme.onSurfaceVariant,
                style = MaterialTheme.typography.labelMedium
            )
            Spacer(modifier = Modifier.height(4.dp))


            Surface(shape = MaterialTheme.shapes.medium, color = animateColorAsState(
                targetValue = (if (isExpanded) MaterialTheme.colorScheme.primary
                                else MaterialTheme.colorScheme.surface)).value,
                shadowElevation = 1.dp,
                modifier = Modifier.animateContentSize().padding(1.dp)) {
                Text(
                    message.message,
                    modifier = Modifier.padding(all = 4.dp),
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}


/**
 * Composable Preview function. Generates the preview in android studio.
 */
@Preview(name = "Light Mode", device = "id:pixel_6_pro")
@Preview(
    name = "Dark Mode", showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    device = "id:pixel_6_pro"
)
@Composable
fun PreviewMessageCard() {
    MessageCardComposable(MessageFake.message)
}

