package com.tutorial.jetpack.compose.layout.firstday

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class ButtonAndToastLayout {
    @Composable
    fun ButtonWidget() {
        val context = LocalContext.current

        Button(
            onClick = {
                Log.d("Tower", "Standby 35R")
                Toast.makeText(context, "Ready For TakeOff", Toast.LENGTH_LONG).show()
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
            )
        ) {
            Text(
                text = "TakeOff For 35R",
                lineHeight = 20.sp,
                fontSize = 20.sp,
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
                this.ButtonWidget()
            }
        }
    }
}