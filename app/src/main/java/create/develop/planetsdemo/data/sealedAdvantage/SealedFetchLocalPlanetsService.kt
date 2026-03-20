package create.develop.planetsdemo.data.sealedAdvantage

import android.content.Context
import kotlinx.serialization.json.Json

class SealedFetchLocalPlanetsService(
    private val context: Context
) : SealedPlanetsService {
    override suspend fun fetchPlanets(): SealedPlanetsInfo {
        val result = context.resources.assets.open("planets.json")
            .bufferedReader()
            .use { it.readText() }

        return Json.decodeFromString<SealedPlanetsInfo>(result)
    }
}
