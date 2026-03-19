package create.develop.planetsdemo.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import create.develop.planetsdemo.data.PlanetsUIState
import create.develop.planetsdemo.data.LocalFilePlanetsService
import create.develop.planetsdemo.domain.PlanetsService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class MainViewModel(
    context: Context
) : ViewModel() {
    private val fetchPlanets: PlanetsService = LocalFilePlanetsService(context)
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
            val result = fetchPlanets.fetchPlanets()
            _state.update {
                PlanetsUIState(
                    isLoading = false,
                    listOfPlanets = result
                )
            }
        }
    }

}