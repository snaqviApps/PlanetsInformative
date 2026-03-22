package create.develop.planetsinformative.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import create.develop.planetsinformative.data.PlanetsDto

@Composable
fun PlanetsScreenContent(
    modifier: Modifier = Modifier,
    planets: List<PlanetsDto>
) {
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        items(planets) { planet ->
                PlanetsCard(
                    modifier = Modifier,
                    name = planet.name,
                    distance = planet.distance,
                    velocity = planet.velocity,
                    image = planet.image
                )
        }
    }

}
