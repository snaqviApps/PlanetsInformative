package create.develop.planetsdemo.data.plain

data class PlanetsUIState(
    val isLoading: Boolean = true,
    val listOfPlanets: PlanetsInfo = emptyList()
)