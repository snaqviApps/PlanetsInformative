package create.develop.planetsinformative.presentation

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import create.develop.planetsinformative.data.plain.PlanetsUIState
import create.develop.planetsinformative.data.plain.LocalFilePlanetsService
import create.develop.planetsinformative.data.sealedAdvantage.PlanetsResult
import create.develop.planetsinformative.data.sealedAdvantage.SealedFetchLocalPlanetsService
import create.develop.planetsinformative.data.sealedAdvantage.SealedPlanetsService
import create.develop.planetsinformative.domain.PlanetsService
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
    private val fetchPlanetsSealed: SealedPlanetsService = SealedFetchLocalPlanetsService(context)

    private val _state = MutableStateFlow<PlanetsUIState>(PlanetsUIState())
    val state = _state.asStateFlow()

    private val _sealedState = MutableStateFlow<PlanetsResult>(PlanetsResult.Empty)
    val sealedState = _sealedState.asStateFlow()

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