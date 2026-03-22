package create.develop.planetsinformative.presentation.screen.loading

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import create.develop.planetsinformative.presentation.MainViewModel
import create.develop.planetsinformative.presentation.PlanetsScreenContent
import create.develop.planetsinformative.presentation.screen.EmptyScreen
import create.develop.planetsinformative.presentation.screen.ErrorScreen
import create.develop.planetsinformative.presentation.screen.SpinnerScreen

@Composable
fun LoadPlanetsScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = MainViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    when(state.isLoading) {
        true -> {
            SpinnerScreen(modifier)
        }
        false -> {}
    }

    when(state.isEmpty) {
        true -> {
            EmptyScreen()
        }
        false -> Unit
    }

    when(state.isError) {
        true -> {
            ErrorScreen()
        }
        false -> Unit
    }
    PlanetsScreenContent(
        modifier,
        planets = state.planets,
    )

}

@Preview(showBackground = true)
@Composable
fun LoadPlanetsScreenPreview() {
    LoadPlanetsScreen(modifier = Modifier)
}