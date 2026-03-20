package create.develop.planetsinformative.data.sealedAdvantage

sealed interface PlanetsResult {
    object Empty : PlanetsResult
    class Loading(val isLoading: Boolean = true) : PlanetsResult
    data class Success(val listOfPlanets: SealedPlanetsInfo) : PlanetsResult
    data class Error(val message: String) : PlanetsResult
}

inline fun PlanetsResult.onSuccess(block: (SealedPlanetsInfo) -> Unit) : PlanetsResult {
    if (this is PlanetsResult.Success) {
        block(this.listOfPlanets)
    }
    return this
}

inline fun PlanetsResult.onError(block: (String) -> Unit) : PlanetsResult {
    if(this is PlanetsResult.Error) {
        block(this.message)
    }
    return this
}
