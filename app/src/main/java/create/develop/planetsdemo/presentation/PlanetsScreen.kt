package create.develop.planetsdemo.presentation


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import create.develop.planetsdemo.data.Planet

@Composable
fun PlanetsScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = MainViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    PlanetsScreenContent(
        modifier,
        listOfPlanets = state.listOfPlanets,
    )
}

@Composable
fun PlanetsScreenContent(
    modifier: Modifier = Modifier,
    listOfPlanets: List<Planet>
) {
    LazyColumn() {
        items(listOfPlanets.size) { p ->
            PlanetsCard(modifier, listOfPlanets, p)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlanetsScreenContentPreview() {
    PlanetsScreen()
}