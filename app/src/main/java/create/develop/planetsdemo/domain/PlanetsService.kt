package create.develop.planetsdemo.domain

import create.develop.planetsdemo.data.plain.PlanetsInfo

interface PlanetsService {
    suspend fun fetchPlanets() : PlanetsInfo
}
