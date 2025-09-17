package com.tutorial.jetpack.compose.layout.thirdday

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class LazyLayout {
    @Composable
    fun LazyWidget() {
        val textList = ('A'..'Z').map(Char::toString)

        LazyColumn(Modifier.fillMaxSize()) {
            // 먼저 세로 항목들
            items(textList) { item ->
                Text(text = item, fontSize = 50.sp)
            }

            // 그 다음에 가로 스크롤 섹션
            item {
                LazyRow {
                    items(textList) { item ->
                        Text(text = item, fontSize = 50.sp)
                    }
                }
            }
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
                this.LazyWidget()
            }
        }
    }
}