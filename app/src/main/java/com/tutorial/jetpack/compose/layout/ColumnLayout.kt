package com.tutorial.jetpack.compose.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class ColumnLayout {
    @Composable
    fun ColumnWidget() {
        Column (
            modifier = Modifier.padding(20.dp)
        ) {
            Text("Ladies Man And a Gentleman This is Captain Park Speaking")
            Spacer(modifier = Modifier.padding(10.dp))
            HorizontalDivider(thickness = 3.dp, color = Color.Red)
            Spacer(modifier = Modifier.padding(10.dp))
            Text("Thank You for choosing Asiana Airlines")
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
                this.ColumnWidget()
            }
        }
    }
}