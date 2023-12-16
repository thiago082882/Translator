package com.thiago.tradutor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.thiago.tradutor.language.LanguagesView
import com.thiago.tradutor.translator.TranslateView
import com.thiago.tradutor.translator.TranslateViewModel
import com.thiago.tradutor.ui.theme.TradutorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val vm : TranslateViewModel by viewModels()
        setContent {
            TradutorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    MyView()
                   // LanguagesView()
                    TranslateView(vm)
                }
            }
        }
    }
}

@Composable
fun MyView() {
   Column(
        modifier = Modifier.fillMaxSize(),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally
    ){
       Text(text = stringResource(id = R.string.title), fontWeight = FontWeight.Bold)
       Text(text = stringResource(id = R.string.subtitle))

   }
}

