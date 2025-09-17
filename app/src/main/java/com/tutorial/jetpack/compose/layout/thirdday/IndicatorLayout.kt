package com.tutorial.jetpack.compose.layout.thirdday

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class IndicatorLayout {
    @Composable
    fun IndicatorWidget() {
        var progress by remember { mutableFloatStateOf(0.0f) }

        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                progress = if (progress < 1.0f) progress + 0.1f else progress
            }) {
                Text(text = "Gas Gauge")
            }

            Spacer(modifier = Modifier.size(10.dp))

            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier.height(10.dp),
                color = Color.Red,
                trackColor = Color.Gray
            )

            Spacer(modifier = Modifier.size(10.dp))

            CircularProgressIndicator(
                progress = progress,
                color = Color.Red
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        AndroidJetpackComposeTutorialAppTheme {
            Surface (
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                this.IndicatorWidget()
            }
        }
    }
}