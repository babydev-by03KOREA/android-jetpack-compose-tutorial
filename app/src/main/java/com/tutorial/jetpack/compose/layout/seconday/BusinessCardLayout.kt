package com.tutorial.jetpack.compose.layout.seconday

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class BusinessCardLayout {
    @Composable
    fun AsianaBusinessCardWidget() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .background(Color.White)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://blog.kakaocdn.net/dna/WkvA6/btqy8huJT99/AAAAAAAAAAAAAAAAAAAAANHHYzBOMIo2-IS5Fiyk9RbBIYamCiH19A8VFhv4F-Wd/img.jpg?credential=yqXZFxpELC7KVnFOS48ylbz2pIh7yKj8&expires=1759244399&allow_ip=&allow_referer=&signature=Ws718%2F4UhVyE0VBPQEE4WegHqnE%3D")
                    .crossfade(true)
                    .build(),
                contentDescription = "Asiana Old Logo Full",
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp),
                contentScale = ContentScale.Fit,
                onError = { state ->
                    Log.e("Coil", "AsyncImage error", state.result.throwable)
                }
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
                this.AsianaBusinessCardWidget()
            }
        }
    }
}