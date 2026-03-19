package create.develop.planetsdemo.data

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