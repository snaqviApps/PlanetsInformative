package create.develop.planetsinformative.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SpinnerScreen(
    modifier: Modifier = Modifier
) {
    // Fill the entire screen/container and center the content
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            // Using a fixed size (e.g., 60dp) to ensure it stays centered 
            // and is reduced from a full-screen or large size.
            modifier = Modifier.size(140.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SpinnerScreenPreview() {
    SpinnerScreen()
}
