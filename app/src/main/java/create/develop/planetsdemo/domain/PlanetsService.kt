package create.develop.planetsdemo.domain

import create.develop.planetsdemo.data.PlanetsInfoItem

interface PlanetsService {
//    suspend fun fetchPlanets(): PlanetsInfo
    suspend fun fetchPlanets(): List<PlanetsInfoItem>
}

