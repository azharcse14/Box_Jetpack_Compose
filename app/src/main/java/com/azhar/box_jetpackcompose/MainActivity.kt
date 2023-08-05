package com.azhar.box_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.azhar.box_jetpackcompose.ui.theme.BoxJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BuildBox()
                }
            }
        }
    }
}

@Composable
fun BuildBox() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ){
        Box(modifier = Modifier
            .background(Color.Red)
//            .width(100.dp)
//            .height(100.dp)
//            .verticalScroll(rememberScrollState()
//            )
            ,
        ) {
            Box(modifier = Modifier
                .background(Color.Blue)
            .width(50.dp)
            .height(50.dp)
            )
            Text(
                text = "I Love Compose",
                fontSize = 40.sp
            )
//            Box(modifier = Modifier
//                .background(Color.Green)
//                .width(50.dp)
//                .height(50.dp)
//            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BoxJetpackComposeTheme {
        BuildBox()
    }
}