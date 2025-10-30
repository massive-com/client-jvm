package io.massive.kotlin.sdk.websocket

interface MassiveWebSocketListener {
    fun onAuthenticated(client: MassiveWebSocketClient)
    fun onReceive(client: MassiveWebSocketClient, message: MassiveWebSocketMessage)
    fun onDisconnect(client: MassiveWebSocketClient)
    fun onError(client: MassiveWebSocketClient, error: Throwable)
}

/**
 * A default implementation of [MassiveWebSocketListener] with stubbed implementations for each method.
 *
 * Extend this class to implement only the callbacks you care about
 */
open class DefaultMassiveWebSocketListener : MassiveWebSocketListener {
    override fun onAuthenticated(client: MassiveWebSocketClient) { }
    override fun onReceive(client: MassiveWebSocketClient, message: MassiveWebSocketMessage) { }
    override fun onDisconnect(client: MassiveWebSocketClient) { }
    override fun onError(client: MassiveWebSocketClient, error: Throwable) { }
}
