package create.develop.planetsdemo.data.sealedAdvantage


interface SealedPlanetsService {
    suspend fun fetchPlanets() : List<SealedPlanetsInfoItem>
}