package uz.turgunboyevjurabek.wepsocketexample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import okhttp3.OkHttpClient
import okhttp3.Request
import uz.turgunboyevjurabek.wepsocketexample.ui.theme.WepsocketExampleTheme
import uz.turgunboyevjurabek.wepsocketexample.withKtor.WebSocketClient
import uz.turgunboyevjurabek.wepsocketexample.withKtor.WebSocketListener

class MainActivity : ComponentActivity() {
//    private val webSocketClient = WebSocketClient("wss://chat.ziyo.me/chat")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WepsocketExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val client =OkHttpClient()
                        val url="wss://chat.ziyo.me/chat"
                    val request:Request=Request.Builder()
                        .url(url)
                        .build()
                    val listner=WepSockedServise()
                    val ws=client.newWebSocket(request,listner)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WepsocketExampleTheme {


    }
}