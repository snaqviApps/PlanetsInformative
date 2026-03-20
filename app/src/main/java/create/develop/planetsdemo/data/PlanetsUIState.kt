package create.develop.planetsdemo.data

data class PlanetsUIState(
    val isLoading: Boolean = true,
//    val planets: PlanetsInfo
    val planets: List<PlanetsInfoItem>
)