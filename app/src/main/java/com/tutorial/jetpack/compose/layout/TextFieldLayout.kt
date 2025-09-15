package com.tutorial.jetpack.compose.layout

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class TextFieldLayout {
    @Composable
    fun TextFieldWidget() {
        var textState by remember { mutableStateOf("Cabin Crew Prepare for TakeOff") }

        TextField(
            value = textState,
            onValueChange = {
                textState = it
            },
            label = {
                Text(text = "V1 -> VR -> V2 -> Rotate -> Gear Up!")
            }
        )
    }

    @Composable
    fun TextFieldWidgetOutlined() {
        var textState by remember { mutableStateOf("Cabin Crew Prepare for TakeOff") }

        OutlinedTextField(
            value = textState,
            onValueChange = {
                textState = it
            },
            label = {
                Text(text = "V1 -> VR -> V2 -> Rotate -> Gear Up!")
            }
        )
    }

    @Composable
    fun TextFieldWidgetWithValue() {
        var textState by remember { mutableStateOf("") }
        var enteredState by remember { mutableStateOf("") }
        val context = LocalContext.current

        Column {
            OutlinedTextField(
                value = textState,
                onValueChange = {
                    textState = it
                },
                label = {
                    Text(text = "ex) MU275")
                },
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = {
                    enteredState = textState
                    Toast.makeText(context, "Ready For TakeOff $enteredState", Toast.LENGTH_LONG).show()
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Input Flight Code")
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
                this.TextFieldWidget()
            }
        }
    }
}