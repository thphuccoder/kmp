package tech.bumbii.hellokmp

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun TextFieldDemo() {
    var name by remember { mutableStateOf("") }

    TextField(
        value = name,
        onValueChange = { name = it },
        label = { Text("Name")}
    )
}