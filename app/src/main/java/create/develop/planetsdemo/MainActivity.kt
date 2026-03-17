package create.develop.planetsdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import create.develop.planetsdemo.presentation.loading.LoadingScreen
import create.develop.planetsdemo.ui.theme.PlanetsDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlanetsDemoTheme {
                Scaffold(modifier = Modifier) { innerPadding ->
                    LoadingScreen(
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoadingScreenPreview() {
    PlanetsDemoTheme {
        LoadingScreen(modifier = Modifier)
    }
}