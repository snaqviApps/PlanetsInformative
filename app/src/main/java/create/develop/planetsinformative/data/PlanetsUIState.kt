package create.develop.planetsinformative.data

data class PlanetsUIState(
    val isLoading: Boolean = true,
    val isEmpty: Boolean = false,
    val isError: Boolean = false,
    val planets: List<PlanetsDto> = emptyList()
)