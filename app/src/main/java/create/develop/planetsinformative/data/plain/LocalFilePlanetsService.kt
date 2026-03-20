package create.develop.planetsinformative.data.plain

import android.content.Context

import create.develop.planetsinformative.domain.PlanetsService
import kotlinx.serialization.json.Json

class LocalFilePlanetsService(
    private val context: Context
) : PlanetsService {
    override suspend fun fetchPlanets(): PlanetsInfo {
        val result = context.resources.assets.open("planets.json")
            .bufferedReader()
            .use { it.readText() }

        return Json.decodeFromString<PlanetsInfo>(result)
    }
}