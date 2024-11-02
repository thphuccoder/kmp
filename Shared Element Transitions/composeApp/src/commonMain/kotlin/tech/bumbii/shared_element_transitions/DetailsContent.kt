package tech.bumbii.shared_element_transitions

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import sharedelementtransitions.composeapp.generated.resources.Res
import sharedelementtransitions.composeapp.generated.resources.compose_multiplatform

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun DetailsContent(
    onBack: () -> Unit,
    animatedVisibilityScope: AnimatedVisibilityScope,
    sharedTransitionScope: SharedTransitionScope
) {
    Column(
        // [START_EXCLUDE]
        modifier = Modifier
            .padding(top = 200.dp, start = 16.dp, end = 16.dp)
            .border(1.dp, Color.Gray.copy(alpha = 0.5f), RoundedCornerShape(8.dp))
            .background(Color.Gray, RoundedCornerShape(8.dp))
            .clickable {
                onBack()
            }
            .padding(8.dp)
        // [END_EXCLUDE]
    ) {
        with(sharedTransitionScope) {
            Image(
                painter = painterResource(resource = Res.drawable.compose_multiplatform),
                contentDescription = "Compose",
                modifier = Modifier
                    .sharedElement(
                        rememberSharedContentState(key = "image"),
                        animatedVisibilityScope = animatedVisibilityScope
                    )
                    .size(200.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            // [START_EXCLUDE]
            Text(
                "Compose", fontSize = 28.sp,
                modifier = Modifier.sharedBounds(
                    rememberSharedContentState(key = "title"),
                    animatedVisibilityScope = animatedVisibilityScope
                )
            )
            Text(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur sit amet lobortis velit. " +
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                        " Curabitur sagittis, lectus posuere imperdiet facilisis, nibh massa " +
                        "molestie est, quis dapibus orci ligula non magna. Pellentesque rhoncus " +
                        "hendrerit massa quis ultricies. Curabitur congue ullamcorper leo, at maximus"
            )
            // [END_EXCLUDE]
        }
    }
}