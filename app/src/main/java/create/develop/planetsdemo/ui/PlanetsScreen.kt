package create.develop.planetsdemo.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import create.develop.planetsdemo.R
import create.develop.planetsdemo.data.Planets
import create.develop.planetsdemo.domain.MainViewModel

@Composable
fun PlanetsScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = MainViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    PlanetsScreenContent(
        modifier,
        listOfPlanets = state.listOfPlanets,
    )
}

@Composable
fun PlanetsScreenContent(
    modifier: Modifier = Modifier,
    listOfPlanets: List<Planets>
) {
//    Box(
    Card(
            modifier
                .padding(
                    start = 12.dp,

                )
                .background(
                    color = Color(0xFFE6D6DB)
                )
                .border(
                    width = 2.dp,
                    brush = Brush.horizontalGradient(
                        0.1f to Color.Red,
                        0.3f to Green,
                        1.0f to Color.Blue,
                        startX = 0.0f,
                        endX = 100.0f
                    ),
                    shape = RectangleShape
                )
                .fillMaxSize()
        )
        {
            LazyColumn() {
                items(listOfPlanets.size) { p ->
                    Row(
                        modifier = Modifier
                            .padding(top = 12.dp, start = 12.dp, end = 8.dp)
                            .align(
                                alignment = Alignment.Start
                            )
                    ) {
                    Column(
                        modifier = Modifier
                            .background(
                                Color(0xFFDBF1F3)
                            )
                    ) {
                        AsyncImage(
                            model = "http://space-facts.com/wp-content/uploads/jupiter-transparent.png",
                            contentDescription = "",
                            modifier = Modifier.size(70.dp, 70.dp))
                        Spacer(Modifier.height(8.dp))

                        Image(
                            painterResource(R.drawable.solar),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(70.dp, 75.dp)
                        )

                    }
                        Spacer(Modifier.width(12.dp))
                        Column {
                            Text(
                                text = listOfPlanets[p].name,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF7B123C),
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .background(Color(0xFFE6E9FD))
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
//                                                .fillMaxWidth(0.5f)
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
//                                                .fillMaxWidth(0.5f)
                                                .padding(4.dp)
                                        )
                                    }
                                }
                            }

                        }
                        Spacer(Modifier.height(8.dp))

                    }
                }
            }

        }
    }




@Preview(showBackground = true)
@Composable
fun PlanetsScreenContentPreview() {
    PlanetsScreen()
}