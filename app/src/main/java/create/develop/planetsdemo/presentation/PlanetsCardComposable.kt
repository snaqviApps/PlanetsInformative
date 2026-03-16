package create.develop.planetsdemo.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import create.develop.planetsdemo.R
import create.develop.planetsdemo.data.Planet
import create.develop.planetsdemo.ui.theme.PlanetsDemoTheme

@Composable
fun PlanetsCard(
    modifier: Modifier,
    listOfPlanets: List<Planet>,
    p: Int
) {
    Card(
        modifier
            .padding(8.dp)
            .clip(CircleShape)
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .padding(top = 16.dp, start = 12.dp, bottom = 8.dp, end = 8.dp)
                .align(alignment = Alignment.Start)
        ) {
            Column {
                FetchImage(listOfPlanets[p].image)
                Spacer(Modifier.height(8.dp))
            }

            Spacer(Modifier.width(12.dp))
            Column(
            ) {
                Text(
                    text = listOfPlanets[p].name,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF176757),
                    fontSize = 16.sp,
                    modifier = Modifier.background(Color(0xFFE6E9FD))
                )

                Spacer(Modifier.width(8.dp))
                Column {
                    Column {
                        Row {
                            Text(
                                text = "Distance:   ${listOfPlanets[p].distance} MKm",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                color = Color(0xFF7B123C),
                                modifier = Modifier
                                    .background(Color(0xFFE6E9FD))
                                    .padding(4.dp)
                            )
                        }
                        Row(
                        ) {
                            Text(
                                text = "Velocity:   ${listOfPlanets[p].velocity.toInt() * 3600} Km/hr ",
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
    }
}


@OptIn(ExperimentalSubclassOptIn::class)
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

@Preview
@Composable
fun PlanetsCardPreview() {
    PlanetsDemoTheme() {
        PlanetsCard(
            Modifier,
            listOfPlanets = listOf(
                Planet(
                    position = "1",
                    name = "Mercury",
                    velocity = "47",
                    distance = "58",
                    image = "https://space-facts.com/wp-content/uploads/mercury-transparent.png",
                    description = "Mercury is the closest planet to the Sun and due to its proximity it is not easily seen except during twilight. For every two orbits of the Sun, Mercury completes three rotations about its axis and up until 1965 it was thought that the same side of Mercury constantly faced the Sun. Thirteen times a century Mercury can be observed from the Earth passing across the face of the Sun in an event called a transit, the next will occur on the 9th May 2016.",

                    ),
                Planet(
                    position = "2",
                    name = "Venus",
                    velocity = "35",
                    distance = "108",
                    image = "https://space-facts.com/wp-content/uploads/venus-transparent.png",
                    description = "Venus is the second planet from the Sun and is the second brightest object in the night sky after the Moon. Named after the Roman goddess of love and beauty, Venus is the second largest terrestrial planet and is sometimes referred to as the Earth’s sister planet due the their similar size and mass. The surface of the planet is obscured by an opaque layer of clouds made up of sulphuric acid."
                )
            ),
            p = 1
        )
    }
}