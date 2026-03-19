package create.develop.planetsdemo.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import create.develop.planetsdemo.data.PlanetsInfo

@Composable
fun PlanetsScreenContent(
    modifier: Modifier = Modifier,
    listOfPlanets: PlanetsInfo
) {
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        items(listOfPlanets.size) { count ->
            PlanetsCard(
                // new instance of Modifier gives relative abstraction
                modifier = Modifier,
                listOfPlanets = listOfPlanets,
                planetCount = count
            )
        }
    }
}
