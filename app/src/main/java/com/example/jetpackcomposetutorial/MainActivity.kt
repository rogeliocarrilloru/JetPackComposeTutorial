package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetutorial.ui.theme.JetPackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTutorialTheme {

                    MyComponet()

            }
        }
    }
}

/*@Composable
fun MyTextP(name: String, modifier: Modifier = Modifier) {
   Column {
       Text(
           text = "Hello $name!",
           modifier = modifier
       )
       Text(text = "Aprendiendo")
   }
}*/
@Composable
fun MyText(text: String) {
    Text(text = text)
}

@Composable
fun MyTexts(modifier: Modifier = Modifier.padding(start = 8.dp)) {
    Column {
        MyText(text = "hola")
        Spacer(modifier = Modifier.height(16.dp))
        MyText(text = "Rogelio")
    }

}

@Composable
fun MyComponet(modifier: Modifier = Modifier.padding(8.dp)) {
    Row {
        MyImagen()
        MyTexts()
    }
}

@Composable
fun MyImagen() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "mi imagen de prueva",
        modifier = Modifier
            .clip(CircleShape)
            .background(Color.Gray)
            .size(64.dp)
            )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeTutorialTheme {
        MyComponet()
    }
}