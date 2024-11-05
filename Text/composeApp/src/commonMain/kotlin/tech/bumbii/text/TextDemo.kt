package tech.bumbii.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.stringResource
import text.composeapp.generated.resources.Res
import text.composeapp.generated.resources.app_name
import text.composeapp.generated.resources.blue
import text.composeapp.generated.resources.green
import text.composeapp.generated.resources.red

@Composable
fun TextDemo() {
    // Read the string from commonMain/values/strings.xml
    Text(
        text = stringResource(Res.string.app_name),
        modifier = Modifier
            .background(MaterialTheme.colors.primary)
            .padding(16.dp),
        color = Color.White,
        fontSize = MaterialTheme.typography.h3.fontSize
    )
}

@Composable
fun TextDemoWithAnnotatedString() {
    // Read the string from commonMain/values/strings.xml
    Text(
        buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color.Red,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    shadow = Shadow(
                        color = Color.Gray,
                        offset = Offset(5f, 5f)
                    )
                )
            ) {
                append(stringResource(Res.string.red))
            }

            withStyle(
                style = SpanStyle(
                    color = Color.Green,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.LineThrough,
                )
            ) {
                append(stringResource(Res.string.green))
            }

            withStyle(
                style = SpanStyle(
                    color = Color.Blue,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.combine(
                        listOf(
                            TextDecoration.Underline,
                            TextDecoration.LineThrough
                        )
                    ),
                )
            ) {
                append(stringResource(Res.string.blue))
            }
        },
        modifier = Modifier
            .padding(16.dp),
        color = Color.White,
        fontSize = MaterialTheme.typography.h3.fontSize
    )
}