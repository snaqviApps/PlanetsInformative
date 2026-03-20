package create.develop.planetsinformative.domain

import create.develop.planetsinformative.data.PlanetsDto
import create.develop.planetsinformative.data.PlanetsInfoItem

interface PlanetsService {
    suspend fun fetchPlanets(): List<PlanetsInfoItem>
}

interface PlanetsLocalService {
    suspend fun fetchPlanetsLocalList() : List<PlanetsDto>
}
