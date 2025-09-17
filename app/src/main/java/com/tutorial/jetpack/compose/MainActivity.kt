package com.tutorial.jetpack.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tutorial.jetpack.compose.layout.firstday.ButtonAndToastLayout
import com.tutorial.jetpack.compose.layout.firstday.ColumnLayout
import com.tutorial.jetpack.compose.layout.firstday.ImageLayout
import com.tutorial.jetpack.compose.layout.firstday.RememberLayout
import com.tutorial.jetpack.compose.layout.firstday.TextFieldLayout
import com.tutorial.jetpack.compose.layout.firstday.TextLayout
import com.tutorial.jetpack.compose.layout.seconday.BusinessCardLayout
import com.tutorial.jetpack.compose.layout.thirdday.IndicatorLayout
import com.tutorial.jetpack.compose.layout.thirdday.LazyLayout
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidJetpackComposeTutorialAppTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        TutorialScreen()
    }
}

@Composable
fun TutorialScreen() {
    val scrollState = rememberScrollableState { delta ->
        delta
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .scrollable(scrollState, Orientation.Vertical)
        ) {
            item {
                TextLayout().TextWidget()
                Box(modifier = Modifier.height(20.dp))
                ButtonAndToastLayout().ButtonWidget()
                Box(modifier = Modifier.height(20.dp))
                RememberLayout().RememberWidget()
                Box(modifier = Modifier.height(20.dp))
                ColumnLayout().ColumnWidget()
                Box(modifier = Modifier.height(20.dp))
                TextFieldLayout().TextFieldWidgetWithValue()
                Box(modifier = Modifier.height(20.dp))
                ImageLayout().ImageWidget()
                Box(modifier = Modifier.height(20.dp))
                BusinessCardLayout().AsianaBusinessCardWidget()
                Box(modifier = Modifier.height(20.dp))
                IndicatorLayout().IndicatorWidget()
                Box(modifier = Modifier.height(20.dp))
            }
        }
    }
}
