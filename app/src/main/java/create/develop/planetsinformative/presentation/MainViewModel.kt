package create.develop.planetsinformative.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import create.develop.planetsinformative.data.LocalFilePlanetsService
import create.develop.planetsinformative.data.LocalListReadService
import create.develop.planetsinformative.data.PlanetsUIState
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
    private val localFilePlanetsService: PlanetsService = LocalFilePlanetsService(context)
    private val localListReadService: LocalListReadService = LocalListReadService()
    private val _state = MutableStateFlow<PlanetsUIState>(PlanetsUIState())

    val state = _state.asStateFlow()

    init {
        preparePlanetsData()
    }

    private fun preparePlanetsData() {
        viewModelScope.launch(Dispatchers.IO) {

            _state.value = PlanetsUIState()
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
                    val result = localFilePlanetsService.fetchPlanets()
                    val resultLocalList = localListReadService.fetchPlanetsLocalList()

                    _state.update {
                        PlanetsUIState(
                            isLoading = false,
//                            planets = result.map { it.toPlanetsDto() }              // reading from file: planets.json
                            planets = resultLocalList                             // reading from local list
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
