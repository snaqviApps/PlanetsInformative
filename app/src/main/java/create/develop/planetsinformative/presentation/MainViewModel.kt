package create.develop.planetsinformative.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import create.develop.planetsinformative.data.PlanetsUIState
import create.develop.planetsinformative.data.LocalFilePlanetsService
import create.develop.planetsinformative.data.toPlanetsDto
import create.develop.planetsinformative.domain.PlanetsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class MainViewModel(context: Context) : ViewModel() {
    private val fetchFilePlanets: PlanetsService = LocalFilePlanetsService(context = context)
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
            val result = fetchFilePlanets.fetchPlanets()
            _state.update {
                PlanetsUIState(
                    isLoading = false,
                    planets = result.map {planetsInfoItem ->
                        planetsInfoItem.toPlanetsDto()
                    }
                )
            }
        }
    }

}