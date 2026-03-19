package create.develop.planetsdemo.data

import android.content.Context

import create.develop.planetsdemo.domain.PlanetsService
import kotlinx.serialization.json.Json

class LocalFilePlanetsService(
    private val context: Context
) : PlanetsService {
//    override suspend fun fetchPlanets(): ArrayList<PlanetsInfoItem> {
    override suspend fun fetchPlanets(): PlanetsInfo {
        val result = context.resources.assets.open("planets.json")
            .bufferedReader()
            .use { it.readText() }

//        return Json.decodeFromString<List<PlanetsInfoItem>>(result)
        return Json.decodeFromString<PlanetsInfo>(result)
    }
}