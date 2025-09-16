package com.tutorial.jetpack.compose.layout.firstday

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class RememberLayout {
    @Composable
    fun RememberWidget() {
        var count by remember { mutableIntStateOf(0) }

        Button(onClick = { count++ }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Passenger : $count",
                fontSize = 30.sp
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        AndroidJetpackComposeTutorialAppTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                this.RememberWidget()
            }
        }
    }
}