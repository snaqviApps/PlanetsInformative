package create.develop.PlanetsInformative

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
import create.develop.planetsinformative.presentation.loading.LoadingScreen
import create.develop.planetsinformative.ui.theme.PlanetsInformativeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlanetsInformativeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoadingScreen(
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
fun LoadingScreenPreview() {
    PlanetsInformativeTheme {
        LoadingScreen(modifier = Modifier.fillMaxSize())
    }
}
