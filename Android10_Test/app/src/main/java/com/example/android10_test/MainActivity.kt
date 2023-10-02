@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.android10_test

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.android10_test.ui.theme.Android10_TestTheme
import com.google.android.gms.wallet.button.ButtonConstants


import java.util.concurrent.TimeUnit;

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android10_TestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column {
                       // Greeting("Android")
                       // ToggleButtonTest()
                        GreetingPreview()
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Composable
fun ToggleButtonTest(){
    var myValue by remember { mutableStateOf(false) }   // update
    val mainButtonColor = ButtonDefaults.buttonColors(
        containerColor = androidx.compose.ui.graphics.Color(0x70FF00FF),
        contentColor = MaterialTheme.colorScheme.surface
    )


    Log.d("Recomposition", "MyComposable")
    Button( onClick = { myValue = !myValue } ,
            colors = mainButtonColor)
    {
        Text(text = "$myValue", color = Color( red = 20, green = 100, blue = 150))
    }
    Log.d("Recomposition", "Button Content Lambda")
}




@Composable
fun AppbarTitle(){

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Android10_TestTheme {
        Column {
            Greeting("Android")
            ToggleButtonTest()
        }


    }
}