# Massive (formerly Polygon.io) JVM Client SDK — Kotlin, REST & WebSocket

The official JVM client library SDK, written in Kotlin, for the [Massive](https://massive.com/)
REST and WebSocket APIs. Usable from any JVM language (including Android SDK 21+). See the
[Getting Started](https://massive.com/docs/stocks/getting-started) guide and the
[docs](https://massive.com/docs/rest/quickstart) for more code snippets.

**Note:** Polygon.io rebranded as [Massive.com](https://massive.com) on Oct 30, 2025. Existing
API keys, accounts, and integrations continue to work exactly as before. This SDK now defaults to
the new API base at `api.massive.com`, while `api.polygon.io` remains supported for an extended
period. See the [rebrand announcement](https://massive.com/blog/polygon-is-now-massive/), or
contact [support@massive.com](mailto:support@massive.com) with questions.

---

## How this SDK stays up to date

The REST client is **generated from the Massive OpenAPI specification**, not written by hand, so
it never drifts from the live API.

- **Automated (daily).** A GitHub Actions workflow
  ([`.github/workflows/sync-openapi.yml`](.github/workflows/sync-openapi.yml)) runs every day. It
  pulls the latest spec from `https://api.massive.com/openapi`, regenerates the client, and — only
  when something changed — opens a new `[bot]`-prefixed pull request for review. Each run opens its
  own PR; existing ones are never reused.
- **Hand-written parts are preserved.** The generator only covers REST endpoints. The WebSocket
  client (`com.massive.client.websocket`) and its support classes are maintained by hand and are
  never overwritten by regeneration.
- **Manual regeneration** (for maintainers) is documented in [`scripts/readme.md`](scripts/readme.md).

---

## Getting started

You need a Massive.com account and an API key. Create one at
[massive.com](https://massive.com/). The examples read your key from the `MASSIVE_API_KEY`
environment variable:

```bash
export MASSIVE_API_KEY="<your_api_key>"   # macOS / Linux
setx MASSIVE_API_KEY "<your_api_key>"     # Windows
```

To persist it, add the `export` line to your shell startup file (e.g. `.bashrc` / `.zshrc`).

---

## Build and run the examples locally

Follow these steps to clone, build, and verify the SDK works end-to-end with a live REST call and
a live WebSocket stream.

### Prerequisites
- **JDK 17+** (the bundled `./gradlew` wrapper uses Gradle 8.7)
- **git**
- A `MASSIVE_API_KEY` (see above)

### 1. Clone the repo

```bash
git clone https://github.com/polygon-io/client-jvm.git
cd client-jvm
```

### 2. Build

```bash
./gradlew build
```

This compiles the REST client, the WebSocket client, and runs the test suite.

### 3. Set your API key

```bash
export MASSIVE_API_KEY="<your_api_key>"
```

### 4. Run the REST example

Source: [`src/main/kotlin/com/massive/client/test.kt`](src/main/kotlin/com/massive/client/test.kt).
It fetches hourly aggregate bars for NVDA.

```bash
./gradlew runRestExample
```

Expected output (abbreviated):

```
Hourly aggregates for NVDA (2025-06-09 to 2025-06-13):
GetStocksAggregates200ResponseResultsInner(volume=..., open=..., close=..., ...)
...
```

### 5. Run the WebSocket example

Source: [`src/main/kotlin/com/massive/client/WebSocketExample.kt`](src/main/kotlin/com/massive/client/WebSocketExample.kt).
It connects to the delayed stocks feed (available on every plan), subscribes to AAPL per-minute
aggregates, prints messages for ~30 seconds, then disconnects.

```bash
./gradlew runWebSocketExample
```

Expected output (abbreviated):

```
Connecting to the Massive WebSocket (delayed stocks feed)…
Authenticated — subscribing to AAPL minute aggregates
Received: StatusMessage(ev=status, status=success, message=...)
Received: StocksMessage.Aggregate(eventType=AM, ticker=AAPL, ...)
...
Disconnected
Done.
```

> Tip: minute aggregates only arrive while the market is open. Outside market hours you'll still
> see the authentication and subscription status messages, confirming the connection works.

---

## Using the REST client

Create the client, set your API key, and call an endpoint. Every endpoint lives on `DefaultApi`.

```kotlin
import com.massive.client.apis.DefaultApi
import com.massive.client.apis.DefaultApi.TimespanGetStocksAggregates
import com.massive.client.infrastructure.*
import com.massive.client.models.*

fun main() {
    ApiClient.apiKey["apiKey"] = System.getenv("MASSIVE_API_KEY")

    val api = DefaultApi()
    val result = api.getStocksAggregates(
        stocksTicker = "NVDA",
        multiplier = 1,
        timespan = TimespanGetStocksAggregates.hour,
        from = "2025-06-09",
        to = "2025-06-13",
        adjusted = true,
        limit = 5000,
    )
    println(result)
}
```

By default the client targets `https://api.massive.com`. Every endpoint and model is documented
under [`docs/`](docs/) (see [`docs/DefaultApi.md`](docs/DefaultApi.md)).

---

## Using the WebSocket client

The WebSocket client streams real-time (or delayed) market data. Implement a listener, connect,
and subscribe.

```kotlin
import com.massive.client.websocket.*

fun main() {
    val client = MassiveWebSocketClient(
        apiKey = System.getenv("MASSIVE_API_KEY"),
        feed = Feed.Delayed,        // or Feed.RealTime, etc.
        market = Market.Stocks,     // or Options, Forex, Crypto, Indices, Futures
        listener = object : DefaultMassiveWebSocketListener() {
            override fun onAuthenticated(client: MassiveWebSocketClient) {
                client.subscribeBlocking(
                    listOf(
                        MassiveWebSocketSubscription(
                            MassiveWebSocketChannel.Stocks.AggPerMinute, "AAPL"
                        )
                    )
                )
            }

            override fun onReceive(client: MassiveWebSocketClient, message: MassiveWebSocketMessage) {
                println(message)
            }
        },
    )

    client.connectBlocking()   // suspend variants (connect/subscribe/…) are also available
}
```

Blocking (`*Blocking`), async/callback (`*Async`), and coroutine (`suspend`) variants are provided
for `connect`, `subscribe`, `unsubscribe`, and `disconnect`.

---

## Contributing

Contributions are welcome — open an issue or PR. If you're changing how the client is generated,
see [`scripts/readme.md`](scripts/readme.md) for the generation pipeline and the daily sync workflow.
