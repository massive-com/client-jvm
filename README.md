# Massive (formerly Polygon.io) JVM Client SDK written in Kotlin - WebSocket & RESTful APIs

Welcome to the official JVM client library SDK, written in Kotlin, for the [Massive](https://massive.com/) REST and WebSocket API. This client SDK is usable by any JVM language (including in Android SDK version 21+). To get started, please see the [Getting Started](https://massive.com/docs/stocks/getting-started) section in our documentation, and the [docs](https://massive.com/docs/rest/quickstart) for code snippets.

**Note:** Polygon.io has rebranded as [Massive.com](https://massive.com) on Oct 30, 2025. Existing API keys, accounts, and integrations continue to work exactly as before. The only change in this SDK is that it now defaults to the new API base at `api.massive.com`, while `api.polygon.io` remains supported for an extended period.

For details, see our [rebrand announcement blog post](https://massive.com/blog/polygon-is-now-massive/) or open an issue / contact [support@massive.com](mailto:support@massive.com) if you have questions.

### Key improvements:
- Breaking changes to method names and request/response structures.
- The client is now automatically synchronized with the latest Massive.com API, ensuring faster access to new endpoints and updates.
- Reduces the risk of SDK/API drift—what you see in the docs is what you get in the client.

### Action required:
- If you're upgrading from a previous version, expect incompatibilities—please update your integration accordingly.
- We've updated the [docs](https://massive.com/docs) with usage examples and new patterns for making requests.

## Getting started

To access real-time and historical market data with Massive.com, you will first need to create an account and obtain an API key to authenticate your requests. If you run the samples makes sure to set the `MASSIVE_API_KEY` environment variable for the sample code to use. To persist the environment variable you need to add the above command to the shell startup script (e.g. .bashrc or .bash_profile.

```bash
setx MASSIVE_API_KEY "<your_api_key>"   # windows
export MASSIVE_API_KEY="<your_api_key>" # mac/linux
```

## REST API Client

The [REST API](https://massive.com/docs/stocks/getting-started) provides endpoints that let you query the latest stock, options, indices, forex, and crypto market data market data. You can request data using client methods.

Create the client using your API key.

```kotlin
    ApiClient.apiKey["apiKey"] = "MASSIVE_API_KEY"
```

Get [aggregate bars](https://massive.com/docs/rest/stocks/aggregates/custom-bars) for a stock over a given date range in custom time window sizes.

```kotlin
package org.openapitools.client

import org.openapitools.client.apis.DefaultApi
import org.openapitools.client.apis.DefaultApi.*
import org.openapitools.client.infrastructure.*
import org.openapitools.client.models.*

fun main() {
    ApiClient.apiKey["apiKey"] = "MASSIVE_API_KEY"

    val api = DefaultApi()
    try {
        val result = api.GetStocksAggregates(
            multiplier = "1",
            timespan = "day",
            from = "2023-01-09",
            to = "2023-02-10",
            adjusted = "true",
            sort = "asc",
            limit = "120"
        )
        println(result)
    } catch (e: Exception) {
        println("Error calling GetStocksAggregates: ${e.message}")
        e.printStackTrace()
    }
}
```

Get [trades](https://massive.com/docs/stocks/get_v3_trades__stockticker) for a ticker symbol in a given time range.

```kotlin
package org.openapitools.client

import org.openapitools.client.apis.DefaultApi
import org.openapitools.client.apis.DefaultApi.*
import org.openapitools.client.infrastructure.*
import org.openapitools.client.models.*

fun main() {
    ApiClient.apiKey["apiKey"] = "MASSIVE_API_KEY"

    val api = DefaultApi()
    try {
        val result = api.GetStocksTrades(
            stockTicker = "AAPL",
            order = "asc",
            limit = "10",
            sort = "timestamp"
        )
        println(result)
    } catch (e: Exception) {
        println("Error calling GetStocksTrades: ${e.message}")
        e.printStackTrace()
    }
}
```

Get a [Full Market Snapshot](https://massive.com/docs/rest/stocks/snapshots/full-market-snapshot) for a all stocks.

```kotlin
package org.openapitools.client

import org.openapitools.client.apis.DefaultApi
import org.openapitools.client.apis.DefaultApi.*
import org.openapitools.client.infrastructure.*
import org.openapitools.client.models.*

fun main() {
    ApiClient.apiKey["apiKey"] = "MASSIVE_API_KEY"

    val api = DefaultApi()
    try {
        val result = api.GetStocksSnapshotTickers(
        )
        println(result)
    } catch (e: Exception) {
        println("Error calling GetStocksSnapshotTickers: ${e.message}")
        e.printStackTrace()
    }
}
```

Please see more detailed code in the [docs](https://massive.com/docs/rest/quickstart) for code snippets.

