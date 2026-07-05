package com.massive.client

import com.massive.client.websocket.DefaultMassiveWebSocketListener
import com.massive.client.websocket.Feed
import com.massive.client.websocket.Market
import com.massive.client.websocket.MassiveWebSocketChannel
import com.massive.client.websocket.MassiveWebSocketClient
import com.massive.client.websocket.MassiveWebSocketMessage
import com.massive.client.websocket.MassiveWebSocketSubscription
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/**
 * Minimal WebSocket example. Run with:  ./gradlew runWebSocketExample
 *
 * Requires the MASSIVE_API_KEY environment variable to be set. Uses the delayed
 * stocks feed, which is available on every plan, and streams per-minute
 * aggregates for AAPL for ~30 seconds.
 */
fun main() = runBlocking {
    val apiKey =
            System.getenv("MASSIVE_API_KEY")
                    ?: error("Set the MASSIVE_API_KEY environment variable before running this example.")

    val client =
            MassiveWebSocketClient(
                    apiKey = apiKey,
                    feed = Feed.Delayed,
                    market = Market.Stocks,
                    listener =
                            object : DefaultMassiveWebSocketListener() {
                                override fun onAuthenticated(client: MassiveWebSocketClient) {
                                    println("Authenticated — subscribing to AAPL minute aggregates")
                                    client.subscribeBlocking(
                                            listOf(
                                                    MassiveWebSocketSubscription(
                                                            MassiveWebSocketChannel.Stocks.AggPerMinute,
                                                            "AAPL",
                                                    )
                                            )
                                    )
                                }

                                override fun onReceive(
                                        client: MassiveWebSocketClient,
                                        message: MassiveWebSocketMessage,
                                ) {
                                    println("Received: $message")
                                }

                                override fun onError(
                                        client: MassiveWebSocketClient,
                                        error: Throwable,
                                ) {
                                    System.err.println("WebSocket error: ${error.message}")
                                }

                                override fun onDisconnect(client: MassiveWebSocketClient) {
                                    println("Disconnected")
                                }
                            },
            )

    println("Connecting to the Massive WebSocket (delayed stocks feed)…")
    client.connectBlocking()

    // Keep the process alive briefly to receive messages, then disconnect.
    delay(30_000)
    client.disconnectBlocking()
    println("Done.")
}
