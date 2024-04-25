package uz.turgunboyevjurabek.wepsocketexample.withKtor

interface WebSocketListener {
    fun onConnected()
    fun onMessage(message: String)
    fun onDisconnected(e:String)
}