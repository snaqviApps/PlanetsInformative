package create.develop.planetsinformative.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import create.develop.planetsinformative.R

@Composable
fun ErrorScreen(image: Int = R.drawable.error) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(Color(0xFFF5F8F8))
            .paint(painterResource(id = image)
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "An Error occurred",
            fontWeight = FontWeight.Bold,
            fontSize = 39.sp,
            color = Color(0x3BAFB1BA),

        )
    }

}

@Preview(showBackground = true)
@Composable
fun ErrorScreenPreview() {
    ErrorScreen()

}