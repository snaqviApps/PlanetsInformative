package create.develop.planetsinformative.data

sealed interface PlanetsResult {
    object Empty : PlanetsResult
    class Loading(val isLoading: Boolean = true) : PlanetsResult
    data class Success(val listOfPlanets: PlanetsInfo) : PlanetsResult
    data class Error(val message: String) : PlanetsResult
}

inline fun PlanetsResult.onSuccess(block: (PlanetsInfo) -> Unit) : PlanetsResult {
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
