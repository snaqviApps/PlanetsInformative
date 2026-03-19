package create.develop.planetsdemo.data.sealedAdvantage

import create.develop.planetsdemo.data.Planet

sealed interface SealedPlanetsUIState {
    val listOfPlanets: List<Planet>
}

