package uz.turgunboyevjurabek.wepsocketexample.WepsocketListner

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString

class MessageService{
    private val  _isConnected= MutableStateFlow(false)
    val isConnected = _isConnected.asStateFlow()

    private val _messages = MutableStateFlow(emptyList<Pair<Boolean, String>>())
    val messages = _messages.asStateFlow()

    private val okHttpClient =OkHttpClient()
    private var wepSocket: WebSocket?=null

    private val wepSocketListener = object :WebSocketListener(){

        override fun onOpen(webSocket: WebSocket, response: Response) {
            super.onOpen(webSocket, response)
            _isConnected.value=true
            webSocket.send("Android Client Connected")

        }

        override fun onMessage(webSocket: WebSocket, text: String) {
            super.onMessage(webSocket, text)
            _messages.update {
                val list=it.toMutableList()
                list.add(false to text)
                list
            }

        }

        override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
            super.onClosing(webSocket, code, reason)

        }

        override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
            super.onClosed(webSocket, code, reason)
            _isConnected.value=false
        }

        override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
            super.onFailure(webSocket, t, response)

        }


    }


}