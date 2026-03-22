package create.develop.planetsinformative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import create.develop.planetsinformative.presentation.screen.loading.PlanetsScreen
import create.develop.planetsinformative.ui.theme.PlanetsInformativeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlanetsInformativeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PlanetsScreen(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PlanetsScreenPreview() {
    PlanetsInformativeTheme {
        PlanetsScreen(modifier = Modifier.fillMaxSize())
    }
}
