package create.develop.planetsdemo.data.sealedapproach

import create.develop.planetsdemo.data.Planet
import create.develop.planetsdemo.domain.FetchPlanets

class FetchPlanetsService : FetchPlanets {
    override suspend fun fetchPlanets() : List<Planet> {
            val listOfPlanets = listOf(
                Planet(
                    position = "1",
                    name = "Mercury",
                    velocity = "47",
                    distance = "58",
                    image = "https://space-facts.com/wp-content/uploads/mercury-transparent.png",
                    description = "Mercury is the closest planet to the Sun and due to its proximity it is not easily seen except during twilight. For every two orbits of the Sun, Mercury completes three rotations about its axis and up until 1965 it was thought that the same side of Mercury constantly faced the Sun. Thirteen times a century Mercury can be observed from the Earth passing across the face of the Sun in an event called a transit, the next will occur on the 9th May 2016.",

                    ),
                Planet(
                    position = "2",
                    name = "Venus",
                    velocity = "35",
                    distance = "108",
                    image = "https://space-facts.com/wp-content/uploads/venus-transparent.png",
                    description = "Venus is the second planet from the Sun and is the second brightest object in the night sky after the Moon. Named after the Roman goddess of love and beauty, Venus is the second largest terrestrial planet and is sometimes referred to as the Earth’s sister planet due the their similar size and mass. The surface of the planet is obscured by an opaque layer of clouds made up of sulphuric acid."
                ),
                Planet(
                    position = "3",
                    name = "Earth",
                    velocity = "149",
                    distance = "29",
                    image = "https://space-facts.com/wp-content/uploads/earth-transparent.png",
                    description = "Earth is the third planet from the Sun and is the largest of the terrestrial planets. The Earth is the only planet in our solar system not to be named after a Greek or Roman deity. The Earth was formed approximately 4.54 billion years ago and is the only known planet to support life."
                ),
                Planet(
                    position = "4",
                    name = "Mars",
                    distance = "24",
                    velocity = "227",
                    image = "https://space-facts.com/wp-content/uploads/mars-transparent.png",
                    description = "Mars is the fourth planet from the Sun and is the second smallest planet in the solar system. Named after the Roman god of war, Mars is also often described as the “Red Planet” due to its reddish appearance. Mars is a terrestrial planet with a thin atmosphere composed primarily of carbon dioxide."
                ),
                Planet(
                    position = "5",
                    name = "Jupiter",
                    velocity = "778",
                    distance = "13",
                    image = "https://space-facts.com/wp-content/uploads/jupiter-transparent.png",
                    description = "The planet Jupiter is the fifth planet out from the Sun, and is two and a half times more massive than all the other planets in the solar system combined. It is made primarily of gases and is therefore known as a gas giant."
                ),
                Planet(
                    position = "6",
                    name = "Saturn",
                    velocity = "9",
                    distance = "1426",
                    image = "https://space-facts.com/wp-content/uploads/saturn-transparent.png",

                    description = "Saturn is the sixth planet from the Sun and the most distant that can be seen with the naked eye. Saturn is the second largest planet and is best known for its fabulous ring system that was first observed in 1610 by the astronomer Galileo Galilei. Like Jupiter, Saturn is a gas giant and is composed of similar gasses including hydrogen, helium and methane."
                ),
                Planet(
                    position = "7",
                    name = "Uranus",
                    velocity = "6",
                    distance = "2870",
                    image = "https://space-facts.com/wp-content/uploads/uranus-transparent.png",

                    description = "Uranus is the seventh planet from the Sun. While being visible to the naked eye, it was not recognised as a planet due to its dimness and slow orbit. Uranus became the first planet discovered with the use of a telescope. Uranus is tipped over on its side with an axial tilt of 98 degrees. It is often described as “rolling around the Sun on its side.”"
                ),
                Planet(
                    position = "8",
                    name = "Neptune",
                    velocity = "5",
                    distance = "4498",
                    image = "https://space-facts.com/wp-content/uploads/neptune-transparent.png",

                    description = "Neptune is the eighth planet from the Sun making it the most distant in the solar system. This gas giant planet may have formed much closer to the Sun in early solar system history before migrating to its present position."
                ),
                Planet(
                    position = "9",
                    name = "Sun",
                    velocity = "220",
                    distance = "0",
                    image = "https://pngimg.com/uploads/sun/sun_PNG13424.png",
                    description = "The Sun (or Sol), is the star at the centre of our solar system and is responsible for the Earth’s climate and weather. The Sun is an almost perfect sphere with a difference of just 10km in diameter between the poles and the equator. The average radius of the Sun is 695,508 km (109.2 x that of the Earth) of which 20–25% is the core."
                )
            )
        return listOfPlanets

    }

}

