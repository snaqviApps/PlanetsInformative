package create.develop.planetsinformative.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import create.develop.planetsinformative.presentation.screen.loading.LoadPlanetsScreen

@Composable
fun PlanetsScreen(
    modifier: Modifier = Modifier,
) {
    LoadPlanetsScreen(modifier)
}

@Preview(showBackground = true)
@Composable
fun PlanetsScreenPreview() {
    LoadPlanetsScreen(modifier = Modifier)
}

