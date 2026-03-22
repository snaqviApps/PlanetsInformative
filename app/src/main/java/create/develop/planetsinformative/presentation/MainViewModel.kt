package create.develop.planetsinformative.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import create.develop.planetsinformative.data.LocalListReadService
import create.develop.planetsinformative.data.PlanetsUIState
import create.develop.planetsinformative.domain.PlanetsLocalService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class MainViewModel() : ViewModel() {
    private val planetsLocalService: PlanetsLocalService = LocalListReadService()
    private val _state = MutableStateFlow<PlanetsUIState>(PlanetsUIState())

    val state = _state.asStateFlow()

    init {
        preparePlanetsData()
    }

    private fun preparePlanetsData() {
        viewModelScope.launch(Dispatchers.IO) {
            _state.value = PlanetsUIState(isLoading = true)
            delay(3.seconds)

            when((0..2).random()) {
                0 -> {
                    _state.update {  PlanetsUIState(
                        isLoading = false,
                        isEmpty = true
                    )
                }
                    }
                1 -> {
                    val result = planetsLocalService.fetchPlanetsLocalList() ?: emptyList()
                    _state.update {
                        PlanetsUIState(
                            isLoading = false,
                            planets = result
                        )
                    }
                }
                2-> {
                    _state.update {
                        PlanetsUIState(
                            isLoading = false,
                            isError = true
                        )
                    }
                }
            }
        }
    }

}