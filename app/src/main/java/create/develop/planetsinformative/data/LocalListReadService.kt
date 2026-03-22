package create.develop.planetsinformative.data

import create.develop.planetsinformative.domain.PlanetsLocalService

class LocalListReadService() : PlanetsLocalService {
    override suspend fun fetchPlanetsLocalList(): List<PlanetsDto> {
            return listOf(
                PlanetsDto(
                    name = "Mercury",
                    image = "https://space-facts.com/wp-content/uploads/mercury-transparent.png",
                    velocity = "47",
                    distance = "58"
                ),
                PlanetsDto(
                    name = "Venus",
                    image = "https://space-facts.com/wp-content/uploads/venus-transparent.png",
                    velocity = "35",
                    distance = "108",
                ),
                PlanetsDto(
                    name = "Earth",
                    image = "https://space-facts.com/wp-content/uploads/earth-transparent.png",
                    velocity = "149",
                    distance = "29",
                ),
                PlanetsDto(
                    name = "Mars",
                    image = "https://space-facts.com/wp-content/uploads/mars-transparent.png",
                    velocity = "24",
                    distance = "227",
                ),
                PlanetsDto(
                    name = "Jupiter",
                    image = "https://space-facts.com/wp-content/uploads/jupiter-transparent.png",
                    velocity = "13",
                    distance = "7",
                ),
                PlanetsDto(
                    name = "Saturn",
                    image = "https://space-facts.com/wp-content/uploads/saturn-transparent.png",
                    velocity = "9",
                    distance = "1426",
                ),
                PlanetsDto(
                    name = "Uranus",
                    image = "https://space-facts.com/wp-content/uploads/uranus-transparent.png",
                    velocity = "6",
                    distance=  "2870"
                ),
                PlanetsDto(
                    name = "Neptune",
                    image = "https://space-facts.com/wp-content/uploads/neptune-transparent.png",
                    velocity = "5",
                    distance =  "4498"
                ),
                PlanetsDto(
                    name = "Sun",
                    image =  "https://pngimg.com/uploads/sun/sun_PNG13424.png",
                    velocity = "220",
                    distance =  "0"
                )
            )
    }

}