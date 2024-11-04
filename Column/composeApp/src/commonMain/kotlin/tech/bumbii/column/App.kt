package tech.bumbii.column

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
//        ColumnArrangementDemo()
        ColumnWeightDemo()
    }
}

@Composable
fun ColumnWeightDemo() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = MaterialTheme.colors.primary
        ) { }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f),
            color = MaterialTheme.colors.secondary
        ) { }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            color = MaterialTheme.colors.error
        ) { }
    }
}

@Composable
fun ColumnArrangementDemo() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.primary
        ) { }
        Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.secondary
        ) { }
        Surface(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            color = MaterialTheme.colors.error
        ) { }
    }
}