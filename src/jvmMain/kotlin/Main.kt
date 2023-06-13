import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication

@OptIn(ExperimentalMaterialApi::class)
@Composable
@Preview
fun App() {
    var sliderPosition by remember {
        mutableStateOf(0f..100f)
    }
    Text(text = sliderPosition.toString())
    RangeSlider(
        steps = 9,
        value = sliderPosition,
        onValueChange = { sliderPosition = it },
        valueRange = 0f..100f,
        onValueChangeFinished = {

        },
        enabled = true,
        modifier =
    )
    Text(text = sliderPosition.start.toString())
    Text(text = sliderPosition.endInclusive.toString())

}
fun main() = singleWindowApplication (
    title = "The One of Material elements",
    state = WindowState(size = DpSize(500.dp, 200.dp))
) {
    App()
}

/*
* fun App() {
    var text by remember { mutableStateOf("Hello, World!")
    }

    MaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
* */
