package com.app.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesAppTheme {
                Scaffold(
                    topBar = {
                        CustomToolbar(title = "Courses App")
                    },
                    content = {
                        Surface(
                            modifier = Modifier.fillMaxSize(),
                            color = MaterialTheme.colors.background
                        ) {
                            CoursesGrid(coursesGrid = Datasource().loadTopics())
                        }
                    }
                )
                // A surface container using the 'background' color from the theme

            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CoursesGrid(coursesGrid: List<Topic>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2)
    ) {
        items(coursesGrid.size) { position ->
            CourseCard(coursesGrid[position], modifier)
        }
    }
}

@Composable
fun CourseCard(topic: Topic, modifier: Modifier) {
    Card(modifier.padding(8.dp), elevation = 8.dp) {
        Row() {
            Image(
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .padding(5.dp),
                painter = painterResource(topic.courseImage),
                contentDescription = stringResource(id = topic.courseName)
            )
            Column(modifier.padding(8.dp)) {
                Text(
                    text = stringResource(id = topic.courseName),
                    style = MaterialTheme.typography.subtitle1
                )
                Text(
                    text = topic.courseAvailable.toString(),
                    style = MaterialTheme.typography.subtitle2
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoursesAppTheme {
    }
}

@Composable
fun CustomToolbar(title: String) {
    TopAppBar(
        title = { Text(text = title) },
    )
}