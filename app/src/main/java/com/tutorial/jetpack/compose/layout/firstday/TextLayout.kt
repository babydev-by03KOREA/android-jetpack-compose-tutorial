package com.tutorial.jetpack.compose.layout.firstday

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class TextLayout {
    @Composable
    fun TextWidget() {
        Text(
            text = "Welcome Aboard Asiana Airlines a Member Of Star Alliance",
            fontSize = 30.sp,
            color = Color.Gray,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(background = Color.White)
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        AndroidJetpackComposeTutorialAppTheme {
            Surface (
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                TextLayout().TextWidget()
            }
        }
    }
}

