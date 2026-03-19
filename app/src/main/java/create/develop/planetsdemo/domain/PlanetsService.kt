package create.develop.planetsdemo.domain

import create.develop.planetsdemo.data.PlanetsInfo

interface PlanetsService {
    suspend fun fetchPlanets() : PlanetsInfo
}
