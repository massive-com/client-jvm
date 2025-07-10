package org.openapitools.client

import org.openapitools.client.apis.DefaultApi
import org.openapitools.client.apis.DefaultApi.TimespanGetStocksAggregates
import org.openapitools.client.infrastructure.*
import org.openapitools.client.models.*

fun main() {
    // Set your Polygon.io API key here
    ApiClient.apiKey["apiKey"] = "NaDb7rd5pGD2CALbHvURQ0VJbfgpxbCv"

    val api = DefaultApi()
    try {
        val result = api.getStocksAggregates(
            stocksTicker = "NVDA",
            multiplier = 1,
            //timespan = TimespanGetStocksAggregates("minute"),
            timespan = TimespanGetStocksAggregates.hour,
            from = "2025-06-09",
            to = "2025-06-13",
            adjusted = true,
            //sort = SortGetStocksAggregates.asc,
            limit = 5000
        )

        println("Hourly aggregates for NVDA (2025-06-09 to 2025-06-13):")
        result.results?.forEach { bar ->
            //println("Timestamp: ${bar.timestamp}, Open: ${bar.open}, High: ${bar.high}, Low: ${bar.low}, Close: ${bar.close}, Volume: ${bar.volume}")
            println("${bar}")
        }
    } catch (e: Exception) {
        println("Error calling getStocksAggregates: ${e.message}")
        e.printStackTrace()
    }
}
