package create.develop.planetsdemo.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import create.develop.planetsdemo.R
import create.develop.planetsdemo.data.PlanetsInfoItem
import create.develop.planetsdemo.ui.theme.PlanetsDemoTheme

@Composable
fun PlanetsCard(
    modifier: Modifier = Modifier,
    listOfPlanets: List<PlanetsInfoItem>,
    planetCount: Int
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
                FetchImage(listOfPlanets[planetCount].image)
                Spacer(Modifier.height(8.dp))
            }

            Spacer(Modifier.width(12.dp))
            Column {
                Text(
                    text = listOfPlanets[planetCount].name,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF176757),
                    fontSize = 16.sp,
                    modifier = Modifier.background(Color(0xFFE6E9FD))
                )

                Spacer(Modifier.height(8.dp))
                Column {
                    Text(
                        text = "Distance:   ${listOfPlanets[planetCount].distance} MKm",
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
                        text = "Velocity:   ${listOfPlanets[planetCount].velocity.toInt() * 3600 - (1000)} Km/hr ",
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


@Composable
private fun FetchImage(image: String) {
    AsyncImage(
        model = image,
        contentDescription = stringResource(R.string.planetImage),
        placeholder = painterResource(R.drawable.solar),
        modifier = Modifier
            .size(70.dp, 75.dp),
    )
}

@Preview(showBackground = true)
@Composable
fun PlanetsCardPreview() {
    PlanetsDemoTheme {
        PlanetsCard(
            Modifier,
            listOfPlanets = listOf(
                PlanetsInfoItem(
                    position = "1",
                    name = "Mercury",
                    velocity = "47",
                    distance = "58",
                    image = "https://space-facts.com/wp-content/uploads/mercury-transparent.png",
                    description = "Mercury is the closest planet to the Sun and due to its proximity it is not easily seen except during twilight. For every two orbits of the Sun, Mercury completes three rotations about its axis and up until 1965 it was thought that the same side of Mercury constantly faced the Sun. Thirteen times a century Mercury can be observed from the Earth passing across the face of the Sun in an event called a transit, the next will occur on the 9th May 2016.",
                )
            ),
            0
        )
    }
}
