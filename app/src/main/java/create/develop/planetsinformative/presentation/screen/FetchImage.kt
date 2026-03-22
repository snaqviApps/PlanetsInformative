package create.develop.planetsinformative.presentation.screen

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import create.develop.planetsinformative.R

@Composable
fun FetchImage(image: String, imageId: Int = R.drawable.solar) {
    AsyncImage(
        model = image,
        contentDescription = stringResource(R.string.planetImage),
        placeholder = painterResource(imageId),
        modifier = Modifier
            .size(70.dp, 75.dp),
    )
}
