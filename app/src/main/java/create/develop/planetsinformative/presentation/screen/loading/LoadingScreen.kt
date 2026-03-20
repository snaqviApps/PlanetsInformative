package create.develop.planetsinformative.presentation.screen.loading

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import create.develop.planetsinformative.presentation.screen.PlanetsScreen

@Composable
fun LoadingScreen(
    modifier: Modifier = Modifier,
) {
    PlanetsScreen(modifier)
}

@Preview(showBackground = true)
@Composable
fun LoadingScreenPreview() {
    LoadingScreen(modifier = Modifier)
}

