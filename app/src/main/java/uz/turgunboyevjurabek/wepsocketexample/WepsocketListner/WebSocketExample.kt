package uz.turgunboyevjurabek.wepsocketexample.WepsocketListner
//
//import android.util.Log
//import androidx.compose.runtime.*
//import kotlinx.coroutines.*
//import okhttp3.OkHttpClient
//import okhttp3.Request
//import okhttp3.WebSocket
//
//@Composable
//fun WebSocketExample() {
//
//    val coroutineScope = rememberCoroutineScope()
//    var webSocket: WebSocket? by remember { mutableStateOf(null) }
//
//    LaunchedEffect(Unit) {
//        coroutineScope.launch {
//            val client = OkHttpClient()
//            val request = Request.Builder().url("https://chat.ziyo.me/chat").build()
//            Log.d("JJJ2",request.body.toString())
//            val listener = MyWebSocketListener()
//            webSocket = client.newWebSocket(request, listener)
//
//            // WebSocket yopilganda tozalash
//            client.dispatcher.executorService.shutdown()
//        }
//    }
//}
