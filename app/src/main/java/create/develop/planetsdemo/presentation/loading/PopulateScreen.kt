package create.develop.planetsdemo.presentation.loading

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import create.develop.planetsdemo.presentation.MainViewModel
import create.develop.planetsdemo.presentation.PlanetsScreenContent

@Composable
fun PopulateScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = MainViewModel(LocalContext.current)
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
fun PopulateScreenPreview() {
    PopulateScreen()
}