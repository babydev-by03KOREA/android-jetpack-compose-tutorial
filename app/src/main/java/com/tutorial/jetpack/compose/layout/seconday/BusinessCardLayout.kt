package com.tutorial.jetpack.compose.layout.seconday

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tutorial.jetpack.compose.R
import com.tutorial.jetpack.compose.ui.theme.AndroidJetpackComposeTutorialAppTheme

class BusinessCardLayout {
    @Composable
    fun AsianaBusinessCardWidget() {

        val code = remember { generateRandomEmployeeCode() }
        val bmp = remember { generateBarcodeBitmap(code) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .background(Color.White)
        ) {
            Image(
                painter = painterResource(R.drawable.asianaold),
                contentDescription = "Asiana Old Logo",
                modifier = Modifier.fillMaxWidth(),
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .background(Color.LightGray)
                    .padding(
                        top = 20.dp,
                        bottom = 30.dp,
                        start = 50.dp,
                        end = 50.dp
                    )
                    .border(
                        width = 3.dp,
                        color = Color.Black
                    )
            ) {
                Box(
                    modifier = Modifier
                        .background(Color.White)
                        .padding(15.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.saekdong),
                        contentDescription = "Saekdong Crew Profile",
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    )
                }
            }

            Spacer(Modifier.height(5.dp))

            Column (
                modifier = Modifier
                    .background(Color(0xffA5A294))
                    .padding(10.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "박 형 주",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                )
                Text(
                    text = "PARK/HYEONGJU",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                )
            }

            Box(Modifier.align(Alignment.End)) {
                Image(
                    painter = painterResource(R.drawable.staralliance),
                    contentDescription = "A Star Alliance Member",
                    modifier = Modifier.height(30.dp),
                    contentScale = ContentScale.FillHeight
                )
            }

            Spacer(Modifier.height(24.dp))

            Image(
                bitmap = bmp.asImageBitmap(),
                contentDescription = "Employee Barcode",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
            )

            Spacer(Modifier.height(8.dp))

            Box(Modifier.align(Alignment.CenterHorizontally)) {
                Text(code, color = Color.Black)
            }
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