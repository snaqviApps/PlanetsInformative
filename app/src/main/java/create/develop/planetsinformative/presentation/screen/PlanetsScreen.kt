package create.develop.planetsinformative.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import create.develop.planetsinformative.presentation.MainViewModel
import create.develop.planetsinformative.presentation.PlanetsScreenContent

@Composable
fun PlanetsScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = MainViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    when (state.isLoading) {
        true -> {
            SpinnerScreen(modifier)
        }
        false -> {
            PlanetsScreenContent(
                modifier,
                planets = state.planets,
            )
            // empty
            // null is error, new composable
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlanetsScreenPreview() {
    PlanetsScreen()
}