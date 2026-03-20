package create.develop.planetsinformative.presentation.loading

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoadingScreen(
    modifier: Modifier = Modifier,
) {
    PopulateScreen(modifier)
}

@Preview(showBackground = true)
@Composable
fun LoadingScreenPreview() {
    LoadingScreen(modifier = Modifier)
}

