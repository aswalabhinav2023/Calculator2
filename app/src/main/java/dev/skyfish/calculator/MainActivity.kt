package dev.skyfish.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.skyfish.calculator.presentation.CalculatorScreen
import dev.skyfish.calculator.presentation.CalculatorState
import dev.skyfish.calculator.ui.theme.CalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                val state = CalculatorState()
                CalculatorScreen(
                    state = state,
                    onButtonPress = {}
                )

            }
        }
    }
}

