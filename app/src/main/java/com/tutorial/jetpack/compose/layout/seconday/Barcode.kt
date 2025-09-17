package com.tutorial.jetpack.compose.layout.seconday

import android.graphics.Bitmap
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.common.BitMatrix
import kotlin.random.Random
import androidx.core.graphics.set
import androidx.core.graphics.createBitmap

fun generateRandomEmployeeCode(): String {
    return List(10) { Random.nextInt(0, 10) }.joinToString("") // 10자리 숫자
}

fun generateBarcodeBitmap(
    contents: String,
    width: Int = 600,
    height: Int = 200
): Bitmap {
    val bitMatrix: BitMatrix = MultiFormatWriter().encode(
        contents,
        BarcodeFormat.CODE_128, // 사원증에 많이 쓰이는 바코드 규격
        width,
        height
    )

    val bmp = createBitmap(width, height, Bitmap.Config.RGB_565)
    for (x in 0 until width) {
        for (y in 0 until height) {
            bmp[x, y] =
                if (bitMatrix[x, y]) android.graphics.Color.BLACK else android.graphics.Color.WHITE
        }
    }
    return bmp
}