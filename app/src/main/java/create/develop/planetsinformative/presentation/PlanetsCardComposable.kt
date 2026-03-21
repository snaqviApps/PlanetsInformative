package create.develop.planetsinformative.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import create.develop.planetsinformative.ui.theme.PlanetsInformativeTheme
import create.develop.planetsinformative.presentation.screen.FetchImage

@Composable
fun PlanetsCard(
    modifier: Modifier = Modifier,
    name: String,
    distance: String,
    velocity: String,
    image: String
) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(12.dp),
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(top = 16.dp, start = 12.dp, bottom = 8.dp, end = 8.dp)
                .clip(RectangleShape)
                .fillMaxWidth()
                .align(alignment = Alignment.Start)
        ) {
            Column {
                FetchImage(image)
                Spacer(Modifier.height(8.dp))
            }
            Spacer(Modifier.width(12.dp))
            Column {
                Text(
                    text = name,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF176757),
                    fontSize = 16.sp,
                    modifier = Modifier.background(Color(0xFFE6E9FD))
                )

                Spacer(Modifier.height(8.dp))
                Column {
                    Text(
                        text = "Distance:   $distance MKm",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF7B123C),
                        modifier = Modifier
                            .background(Color(0xFFE6E9FD))
                            .padding(4.dp)
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = "Velocity:   ${velocity.toInt() * 3600 - (1000)} Km/hr ",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF7B123C),
                        modifier = Modifier
                            .background(Color(0xFFE6E9FD))
                            .padding(4.dp)
                    )
                }
            }
        }
    }

}
    @Preview(showBackground = true)
    @Composable
    fun PlanetsCardPreview() {
        PlanetsInformativeTheme {
            PlanetsCard(
                Modifier,
                name = "Mercury",
                velocity = "47",
                distance = "58",
                image = "https://space-facts.com/wp-content/uploads/mercury-transparent.png",
            )
        }
    }
