package create.develop.planetsinformative.data

data class PlanetsUIState(
    val isLoading: Boolean = true,
//    val planets: PlanetsInfo
    val planets: List<PlanetsInfoItem>
)