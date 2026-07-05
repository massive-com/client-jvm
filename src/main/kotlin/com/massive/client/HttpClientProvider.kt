package com.massive.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.websocket.WebSockets

/**
 * Provides the ktor [HttpClient] used by [com.massive.client.websocket.MassiveWebSocketClient].
 *
 * Implement this to supply a custom engine/configuration (e.g. in tests).
 */
interface HttpClientProvider {
    fun buildClient(): HttpClient
}

/**
 * Default [HttpClientProvider] for the JVM. Backed by the OkHttp engine (already a
 * dependency of the REST client) with the WebSockets plugin installed.
 */
class DefaultJvmHttpClientProvider : HttpClientProvider {
    override fun buildClient(): HttpClient =
            HttpClient(OkHttp) {
                install(WebSockets)
            }
}
