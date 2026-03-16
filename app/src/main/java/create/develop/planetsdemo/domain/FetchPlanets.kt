package create.develop.planetsdemo.domain

import create.develop.planetsdemo.data.Planet

interface FetchPlanets {
    suspend fun fetchPlanets() : List<Planet>
}