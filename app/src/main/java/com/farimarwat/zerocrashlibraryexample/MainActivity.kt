package com.farimarwat.zerocrashlibraryexample

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.runtime.rememberCoroutineScope

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.farimarwat.zerocrash.ZeroCrash
import com.farimarwat.zerocrashlibraryexample.ui.theme.ZeroCrashLibraryExampleTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    lateinit var mContext:Context
    override fun onCreate(savedInstanceState: Bundle?) {
        mContext = this
        super.onCreate(savedInstanceState)
        ZeroCrash.Builder(this)
            .setTitle("Title")
            .setMessage("Your message goes here")
            .start()
        setContent {
            ZeroCrashLibraryExampleTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppScreen()
                }
            }
        }
    }
}

@Composable
fun AppScreen(){
    val scope = rememberCoroutineScope()
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            val result = 32/0
        }) {
            Text(text = "MainThread")
        }

        Button(onClick = {
            scope.launch(Dispatchers.IO) { val result = 32/0 }
        }) {
            Text(text = "BackgroundThread")
        }
    }

}