package create.develop.planetsinformative.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun EmptyScreen() {
    Column (
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.5f)
                .wrapContentHeight(),
            text = "No Data Available",
            style = TextStyle.Default,
            color = Color.LightGray,
            textAlign = TextAlign.Center,
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun EmptyScreenPreview() {
    EmptyScreen()

}