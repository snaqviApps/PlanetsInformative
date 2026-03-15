package create.develop.planetsdemo.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import create.develop.planetsdemo.data.Planets
import create.develop.planetsdemo.data.PlanetsUIState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _state = MutableStateFlow<PlanetsUIState>(PlanetsUIState(emptyList()))
    val state = _state.asStateFlow()

    init {
        preparePlanetsData()
    }

    private fun preparePlanetsData() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = fetchPlanets()
            _state.value = PlanetsUIState(result)
        }
    }

    private fun fetchPlanets(): List<Planets> {
        val listOfPlanets = listOf(
            Planets(
                position = "1",
                name = "Mercury",
                velocity = "47",
                distance = "58",
                description = "Mercury is the closest planet to the Sun and due to its proximity it is not easily seen except during twilight. For every two orbits of the Sun, Mercury completes three rotations about its axis and up until 1965 it was thought that the same side of Mercury constantly faced the Sun. Thirteen times a century Mercury can be observed from the Earth passing across the face of the Sun in an event called a transit, the next will occur on the 9th May 2016.",

                ),
            Planets(
                position = "2",
                name = "Venus",
                velocity = "35",
                distance = "108",
                description = "Venus is the second planet from the Sun and is the second brightest object in the night sky after the Moon. Named after the Roman goddess of love and beauty, Venus is the second largest terrestrial planet and is sometimes referred to as the Earth’s sister planet due the their similar size and mass. The surface of the planet is obscured by an opaque layer of clouds made up of sulphuric acid."
            ),
            Planets(
                position = "3",
                name = "Earth",
                velocity = "149",
                distance = "29",
                description = "Earth is the third planet from the Sun and is the largest of the terrestrial planets. The Earth is the only planet in our solar system not to be named after a Greek or Roman deity. The Earth was formed approximately 4.54 billion years ago and is the only known planet to support life."
            ),
            Planets(
                position = "4",
                name = "Mars",
                distance = "24",
                velocity = "227",
                description = "Mars is the fourth planet from the Sun and is the second smallest planet in the solar system. Named after the Roman god of war, Mars is also often described as the “Red Planet” due to its reddish appearance. Mars is a terrestrial planet with a thin atmosphere composed primarily of carbon dioxide."
            ),
            Planets(
                position = "5",
                name = "Jupiter",
                velocity = "778",
                distance = "13",
                description = "The planet Jupiter is the fifth planet out from the Sun, and is two and a half times more massive than all the other planets in the solar system combined. It is made primarily of gases and is therefore known as a gas giant."
            ),
            Planets(
                position = "6",
                name = "Saturn",
                velocity = "9",
                distance = "1426",
                description = "Saturn is the sixth planet from the Sun and the most distant that can be seen with the naked eye. Saturn is the second largest planet and is best known for its fabulous ring system that was first observed in 1610 by the astronomer Galileo Galilei. Like Jupiter, Saturn is a gas giant and is composed of similar gasses including hydrogen, helium and methane."
            ),
            Planets(
                position = "7",
                name = "Uranus",
                velocity = "6",
                distance = "2870",
                description = "Uranus is the seventh planet from the Sun. While being visible to the naked eye, it was not recognised as a planet due to its dimness and slow orbit. Uranus became the first planet discovered with the use of a telescope. Uranus is tipped over on its side with an axial tilt of 98 degrees. It is often described as “rolling around the Sun on its side.”"
            ),
            Planets(
                position = "8",
                name = "Neptune",
                velocity = "5",
                distance = "4498",
                description = "Neptune is the eighth planet from the Sun making it the most distant in the solar system. This gas giant planet may have formed much closer to the Sun in early solar system history before migrating to its present position."
            ),
            Planets(
                position = "9",
                name = "Sun",
                velocity = "220",
                distance = "0",
                description = "The Sun (or Sol), is the star at the centre of our solar system and is responsible for the Earth’s climate and weather. The Sun is an almost perfect sphere with a difference of just 10km in diameter between the poles and the equator. The average radius of the Sun is 695,508 km (109.2 x that of the Earth) of which 20–25% is the core."
            )
        )
        return listOfPlanets
    }
}