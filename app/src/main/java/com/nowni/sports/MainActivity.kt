package com.nowni.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nowni.sports.ui.SportsApp
import com.nowni.sports.ui.theme.SportsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportsTheme {
                Surface {
                    SportsApp()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SportsAppPreview() {
    SportsTheme {
        Surface {
            SportsApp()
        }
    }
}