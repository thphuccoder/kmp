package tech.bumbii.multilanguages

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import multilanguages.composeapp.generated.resources.Res
import multilanguages.composeapp.generated.resources.dark
import multilanguages.composeapp.generated.resources.light
import multilanguages.composeapp.generated.resources.switch_theme
import multilanguages.composeapp.generated.resources.theme
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val isSystemDarkTheme = isSystemInDarkTheme()
    var isDarkTheme by remember { mutableStateOf(isSystemDarkTheme) }
    MaterialTheme {
        val dark = stringResource(Res.string.dark)
        val light = stringResource(Res.string.light)
        val theme by remember {
            derivedStateOf {
                if (isDarkTheme) dark else light
            }
        }

        Column(
            Modifier.fillMaxSize().background(
                color = MaterialTheme.colorScheme.background
            ), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Button(onClick = {
                isDarkTheme = !isDarkTheme
            }) {
                Text(
                    stringResource(Res.string.switch_theme),
                    fontSize = MaterialTheme.typography.headlineLarge.fontSize
                )
            }

            Text(
                stringResource(Res.string.theme, theme),
                color = MaterialTheme.colorScheme.secondary,
                fontSize = MaterialTheme.typography.headlineLarge.fontSize
            )
        }
    }
}