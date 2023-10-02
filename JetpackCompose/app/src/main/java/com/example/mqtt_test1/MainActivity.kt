package com.example.mqtt_test1

import android.R
import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.mqtt_test1.ui.theme.MQTT_TEST1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            MQTT_TEST1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")

                }

            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Greeting(name: String) {
    Scaffold {
        Text(text = "Hello")
        TopAppBar(title = { Text(text = "Bye")})
    }
    Text(text = "Hello1")
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MQTT_TEST1Theme {
        Greeting("Android")
    }
}

