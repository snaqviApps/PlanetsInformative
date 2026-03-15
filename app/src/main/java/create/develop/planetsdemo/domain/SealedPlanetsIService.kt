package create.develop.planetsdemo.domain

import create.develop.planetsdemo.data.sealedapproach.SealedPlanetsInfoItem

interface SealedPlanetsIService {
    suspend fun fetchPlanets() : ArrayList<ArrayList<SealedPlanetsInfoItem>>
}