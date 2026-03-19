package create.develop.planetsdemo.data.sealedAdvantage

sealed interface PlanetsResult {
    object Empty : PlanetsResult
    class Loading(val isLoading: Boolean = true) : PlanetsResult
    data class Success(val listOfPlanets: SealedPlanetsInfo) : PlanetsResult
    data class Error(val message: String) : PlanetsResult
}
