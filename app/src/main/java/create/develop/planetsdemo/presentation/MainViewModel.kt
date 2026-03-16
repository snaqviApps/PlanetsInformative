package create.develop.planetsdemo.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import create.develop.planetsdemo.data.PlanetsUIState
import create.develop.planetsdemo.data.sealedapproach.FetchPlanetsService
import create.develop.planetsdemo.domain.FetchPlanets
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel() : ViewModel() {

    private val fetchPlanets : FetchPlanets = FetchPlanetsService()
    private val _state = MutableStateFlow<PlanetsUIState>(PlanetsUIState(emptyList()))
    val state = _state.asStateFlow()

    init {
        preparePlanetsData()
    }

    private fun preparePlanetsData() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = fetchPlanets.fetchPlanets()
            _state.value = PlanetsUIState(result)
        }
    }
}