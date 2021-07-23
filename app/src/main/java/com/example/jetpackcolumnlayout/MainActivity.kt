package com.example.jetpackcolumnlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                MainContent()
        }
    }

    @Composable
    fun MainContent() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFEFEFA))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Original Image",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                ))

            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.texture),
                contentDescription = "Localized description")
            Text(text = "blendMode - Screen",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
            )
            Image(
                bitmap = ImageBitmap.imageResource(id = R.drawable.texture),
                contentDescription = "Localized description",
                colorFilter = ColorFilter.tint(
                    color = Color(0xFF6495EA),
                    blendMode = BlendMode.Screen
                )
            )
            Text(text = "blendMode - ColorBurn",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                ))
            Image(bitmap = ImageBitmap.imageResource(id = R.drawable.texture),
                contentDescription = "Localized Image",
                colorFilter = ColorFilter.tint(
                    color = Color.Yellow,
                    blendMode = BlendMode.ColorBurn
                ))
        }
    }

    @Preview
    @Composable fun ComposablePreview(){
        MainContent()
    }
}

