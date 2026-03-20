package create.develop.planetsinformative.data

data class PlanetsUIState(
    val isLoading: Boolean = true,
    val planets: List<PlanetsDto> = emptyList()
)