package create.develop.planetsinformative.data.sealedAdvantage


interface SealedPlanetsService {
    suspend fun fetchPlanets() : SealedPlanetsInfo
}