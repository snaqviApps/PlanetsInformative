package create.develop.planetsdemo.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import create.develop.planetsdemo.data.Planets
import create.develop.planetsdemo.presentation.MainViewModel

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

    Card(
        modifier
            .padding(
                8.dp,
            )
            .background(
                color = Color(0xFFF4F6F8)
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
                shape = RectangleShape,
            )
            // add transformable to listen to multitouch transformation events
            // after offset
            .background(Color(0xFFDEDEF8))
            .fillMaxSize()
    )
    {
        Card{
            Row() {
                Row(
                    modifier = Modifier.border(
                        width = 2.dp,
                        shape = RectangleShape,
                        brush = Brush.horizontalGradient(
                            0.1f to Color.Red,
                            0.3f to Green,
                            1.0f to Color.Blue,
                            startX = 0.0f,
                            endX = 100.0f
                        ),
                        )
                        .background(Color(0xFFEAEAF6))

                ) {
                    Column() {
                        Text(
                            text = "Planet",
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFF187A9),
                            modifier = Modifier.padding(start = 96.dp)
                        )
                    }
                    Spacer(Modifier.width(48.dp))
                    Column() {
                        Text(
                            text = "Details",
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Serif,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFF187A9),
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
            }
            LazyColumn(
                modifier = Modifier
                    .align(
//                        alignment = Alignment.TopStart
                        alignment = Alignment.Start
                    )
                    .padding(top = 24.dp, start = 24.dp, end = 4.dp)
            ) {
                items(listOfPlanets.size) { p ->
                    Spacer(Modifier.height(14.dp))
                    Row() {
                        Column{
                            Text(
                                text = listOfPlanets[p].name,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xFF7B123C),
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .background(Color(0xFFE6E9FD))
                                    .fillMaxWidth(0.5f)
                            )
                            Spacer(Modifier.height(3.dp))
                            Text(
                                text = listOfPlanets[p].description,
                                fontSize = 10.sp,
                                fontStyle = FontStyle.Italic,
                                modifier = Modifier
                                    .background(Color(0xFFE6E9FD))
                                    .fillMaxWidth(0.5f)
                                    .padding(4.dp)
                            )
                        }
                        Spacer(Modifier.width(8.dp))
                        Column {
                            Column {
                                Row {
                                    Text(
                                        text = "Distance",
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,
                                        color = Color(0xFF7B123C),
                                        modifier = Modifier
                                            .background(Color(0xFFE6E9FD))
                                            .fillMaxWidth(0.5f)
                                            .padding(4.dp)
                                    )
                                }
                                Spacer(Modifier.height(20.dp))
                                Row(
                                ) {
                                    Text(
                                        text = listOfPlanets[p].distance,
                                        fontSize = 10.sp,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .background(Color(0xFFE6E9FD))
                                            .fillMaxWidth(0.5f)
//                                            .padding(4.dp)
                                    )
                                }
                            }
                        }
                        Column{
                            Column{
                                Column {
                                    Text(
                                        text = "Velocity",
                                        fontSize = 12.sp,
                                        color = Color(0xFF7B123C),
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .background(Color(0xFFE6E9FD))
                                            .padding(4.dp)
                                    )
                                }
                                Spacer(Modifier.height(20.dp))
                                Column {
                                    Text(
                                        text = listOfPlanets[p].velocity,
                                        fontSize = 10.sp,
                                        textAlign = TextAlign.Start,
                                        modifier = Modifier
                                            .background(Color(0xFFE6E9FD))
                                            .fillMaxWidth(0.7f)
                                            .padding(start = 18.dp)
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