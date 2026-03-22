package create.develop.planetsinformative.domain

import create.develop.planetsinformative.data.plain.PlanetsInfo

interface PlanetsService {
    suspend fun fetchPlanets() : PlanetsInfo
}
