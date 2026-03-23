package create.develop.planetsinformative.domain

import create.develop.planetsinformative.data.PlanetsDto
import create.develop.planetsinformative.data.PlanetsInfo

interface PlanetsService {
    suspend fun fetchPlanets() : PlanetsInfo
}

interface LocalListPlanetsService {
    suspend fun fetchPlanetsLocalList() : List<PlanetsDto>
}