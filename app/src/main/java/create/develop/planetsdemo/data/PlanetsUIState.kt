package create.develop.planetsdemo.data

data class PlanetsUIState(
    val isLoading: Boolean = true,
    val listOfPlanets: PlanetsInfo = emptyList()
)