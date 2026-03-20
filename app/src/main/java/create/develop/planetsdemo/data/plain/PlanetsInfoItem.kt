package create.develop.planetsinformative.data.plain

import kotlinx.serialization.Serializable

@Serializable
data class PlanetsInfoItem(
    val position : String,
    val  name : String,
    val velocity : String,
    val distance : String,
    val image : String,
    val description : String
)