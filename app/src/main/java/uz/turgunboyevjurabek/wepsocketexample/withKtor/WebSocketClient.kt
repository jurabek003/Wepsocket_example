
package uz.turgunboyevjurabek.wepsocketexample.withKtor
import io.ktor.client.HttpClient
import io.ktor.client.features.websocket.WebSockets
import io.ktor.client.features.websocket.wss
import io.ktor.http.cio.websocket.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class WebSocketClient(private val url: String) {

    private val client = HttpClient {
        install(WebSockets)
    }

    fun connect(listener: WebSocketListener) {
        GlobalScope.launch {
            client.wss(url) {
                listener.onConnected()

                try {
                    client.wss(url) {
                        listener.onConnected()
                        for (frame in incoming) {
                            if (frame is Frame.Text) {
                                listener.onMessage(frame.readText())
                            }
                        }
                    }
                } catch (e: Exception) {
                    listener.onDisconnected(e.message.toString())
                }

            }
        }
    }

    fun disconnect() {
        client.close()
    }
}