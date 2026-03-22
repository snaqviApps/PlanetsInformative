package create.develop.planetsinformative.data

import kotlinx.serialization.Serializable

@Serializable
data class PlanetsInfoItem(
    val position: String,
    val name: String,
    val image: String,
    val velocity: String,
    val distance: String,
    val description: String
)