package com.tutorial.jetpack.compose.layout.firstday

import android.util.Log
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.tutorial.jetpack.compose.R
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class ImageLayout {
    @Composable
    fun ImageWidget() {
        Row {
            Image(
                painter = painterResource(R.drawable.oz),
                contentDescription = "Asiana New Logo",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
            )

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://brandlogos.net/wp-content/uploads/2025/06/asiana_airlines_2024-logo_brandlogos.net_uu2ns.png")
                    .crossfade(true)
                    .build(),
                contentDescription = "Asiana New Logo Full",
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp),
                contentScale = ContentScale.Fit,
                onError = { state ->
                    // 실패 원인 로그 확인용
                    Log.e("Coil", "AsyncImage error", state.result.throwable)
                }
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