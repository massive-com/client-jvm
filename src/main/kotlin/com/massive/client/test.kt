package com.massive.client

import com.massive.client.apis.DefaultApi
import com.massive.client.apis.DefaultApi.TimespanGetStocksAggregates
import com.massive.client.infrastructure.*
import com.massive.client.models.*

/**
 * Minimal REST example. Run with:  ./gradlew runRestExample
 *
 * Requires the MASSIVE_API_KEY environment variable to be set.
 */
fun main() {
    ApiClient.apiKey["apiKey"] =
            System.getenv("MASSIVE_API_KEY")
                    ?: error("Set the MASSIVE_API_KEY environment variable before running this example.")

    val api = DefaultApi()
    try {
        val result =
                api.getStocksAggregates(
                        stocksTicker = "NVDA",
                        multiplier = 1,
                        timespan = TimespanGetStocksAggregates.hour,
                        from = "2025-06-09",
                        to = "2025-06-13",
                        adjusted = true,
                        limit = 5000,
                )

        println("Hourly aggregates for NVDA (2025-06-09 to 2025-06-13):")
        result.results?.forEach { bar -> println(bar) }
    } catch (e: Exception) {
        println("Error calling getStocksAggregates: ${e.message}")
        e.printStackTrace()
    }
}
