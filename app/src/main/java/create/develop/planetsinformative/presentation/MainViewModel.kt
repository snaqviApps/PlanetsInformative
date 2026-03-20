package create.develop.planetsinformative.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import create.develop.planetsinformative.data.PlanetsUIState
import create.develop.planetsinformative.data.LocalListReadService
import create.develop.planetsinformative.domain.PlanetsLocalService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class MainViewModel() : ViewModel() {
    private val fetchLocalListPlanets: PlanetsLocalService = LocalListReadService()
    private val _state = MutableStateFlow<PlanetsUIState>(PlanetsUIState())

    val state = _state.asStateFlow()

    init {
        preparePlanetsData()
    }

    private fun preparePlanetsData() {
        viewModelScope.launch(Dispatchers.IO) {
            _state.update {
                PlanetsUIState()
            }
            delay(2.seconds)
            val result = fetchLocalListPlanets.fetchPlanetsLocalList()
            _state.value = PlanetsUIState(
                isLoading = false,
                planets = result
            )

        }
    }

}