import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import com.example.shared.Greeting

fun main() {
    renderComposable(rootElementId = "root") {
        GreetingText(Greeting().greeting())
    }
}

@Composable
fun GreetingText(text: String) {
    Div {
        Text(text)
    }
}
