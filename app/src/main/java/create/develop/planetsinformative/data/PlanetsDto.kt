package create.develop.planetsinformative.data

data class PlanetsDto (
    val name: String,
    val image: String,
    val velocity: String,
    val distance: String
)

fun PlanetsInfoItem.toPlanetsDto() = PlanetsDto (
    name = this.name,
    image = this.image,
    distance = this.distance,
    velocity = this.velocity
)