package com.tutorial.jetpack.compose.layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.tutorial.jetpack.compose.R
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class ImageLayout {
    @Composable
    fun ImageWidget() {
        Row {
            Image(
                painter = painterResource(R.drawable.oz),
                contentDescription = "Asiana New Logo",
                modifier = Modifier.width(50.dp).height(50.dp)
            )
            AsyncImage(
                model = "https://brandlogos.net/wp-content/uploads/2025/06/asiana_airlines_2024-logo_brandlogos.net_uu2ns.png",
                contentDescription = "Asiana New Logo Full",
                modifier = Modifier.fillMaxWidth().height(50.dp)
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
                this.ImageWidget()
            }
        }
    }
}