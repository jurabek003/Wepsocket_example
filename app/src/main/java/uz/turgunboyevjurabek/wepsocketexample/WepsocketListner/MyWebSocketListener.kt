package uz.turgunboyevjurabek.wepsocketexample.WepsocketListner

import android.util.Log

//
//class MyWebSocketListener : WebSocketListener() {
//    override fun onOpen(webSocket: WebSocket, response: Response) {
//        println("WebSocket ochildi")
//        webSocket.send("Salom")
//        Log.d("JJJ","onOpen : $response ")
//    }
//
//    override fun onMessage(webSocket: WebSocket, text: String) {
//        println("Yangi xabar: $text")
//        Log.d("JJJ","onMessage : $text ")
//    }
//
//    override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
//        println("Yangi byte xabar: $bytes")
//    }
//
//    override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
//        println("WebSocket yopilmoqda: $code - $reason")
//        webSocket.close(1000, null)
//    }
//
//    override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
//        println("WebSocketda xatolik yuz berdi: ${t.message}")
//        Log.d("JJJ","onFailure : ${t.message} ")
//
//    }
//}
//
//fun createWebSocket() {
//    val client = OkHttpClient()
//    val request = Request.Builder().url("https://chat.ziyo.me/chat").build()
//    val webSocketListener = MyWebSocketListener()
//    val webSocket = client.newWebSocket(request, webSocketListener)
//
//    // WebSocket yopilganda tozalash
//    client.dispatcher.executorService.shutdown()
//}
