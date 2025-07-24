# DefaultApi

All URIs are relative to *https://api.polygon.io*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deprecatedGetCryptoSnapshotTickerBook**](DefaultApi.md#deprecatedGetCryptoSnapshotTickerBook) | **GET** /v2/snapshot/locale/global/markets/crypto/tickers/{ticker}/book | Ticker Full Book (L2) |
| [**deprecatedGetHistoricCryptoTrades**](DefaultApi.md#deprecatedGetHistoricCryptoTrades) | **GET** /v1/historic/crypto/{from}/{to}/{date} | Historic Crypto Trades |
| [**deprecatedGetHistoricForexQuotes**](DefaultApi.md#deprecatedGetHistoricForexQuotes) | **GET** /v1/historic/forex/{from}/{to}/{date} | Historic Forex Ticks |
| [**deprecatedGetHistoricStocksQuotes**](DefaultApi.md#deprecatedGetHistoricStocksQuotes) | **GET** /v2/ticks/stocks/nbbo/{ticker}/{date} | Quotes (NBBO) |
| [**deprecatedGetHistoricStocksTrades**](DefaultApi.md#deprecatedGetHistoricStocksTrades) | **GET** /v2/ticks/stocks/trades/{ticker}/{date} | Trades |
| [**getBenzingaV1AnalystInsights**](DefaultApi.md#getBenzingaV1AnalystInsights) | **GET** /benzinga/v1/analyst-insights |  |
| [**getBenzingaV1Analysts**](DefaultApi.md#getBenzingaV1Analysts) | **GET** /benzinga/v1/analysts |  |
| [**getBenzingaV1ConsensusRatings**](DefaultApi.md#getBenzingaV1ConsensusRatings) | **GET** /benzinga/v1/consensus-ratings/{ticker} |  |
| [**getBenzingaV1Earnings**](DefaultApi.md#getBenzingaV1Earnings) | **GET** /benzinga/v1/earnings |  |
| [**getBenzingaV1Firms**](DefaultApi.md#getBenzingaV1Firms) | **GET** /benzinga/v1/firms |  |
| [**getBenzingaV1Guidance**](DefaultApi.md#getBenzingaV1Guidance) | **GET** /benzinga/v1/guidance |  |
| [**getBenzingaV1News**](DefaultApi.md#getBenzingaV1News) | **GET** /benzinga/v1/news |  |
| [**getBenzingaV1Ratings**](DefaultApi.md#getBenzingaV1Ratings) | **GET** /benzinga/v1/ratings |  |
| [**getCryptoAggregates**](DefaultApi.md#getCryptoAggregates) | **GET** /v2/aggs/ticker/{cryptoTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getCryptoEMA**](DefaultApi.md#getCryptoEMA) | **GET** /v1/indicators/ema/{cryptoTicker} | Exponential Moving Average (EMA) |
| [**getCryptoMACD**](DefaultApi.md#getCryptoMACD) | **GET** /v1/indicators/macd/{cryptoTicker} | Moving Average Convergence/Divergence (MACD) |
| [**getCryptoOpenClose**](DefaultApi.md#getCryptoOpenClose) | **GET** /v1/open-close/crypto/{from}/{to}/{date} | Daily Open/Close |
| [**getCryptoRSI**](DefaultApi.md#getCryptoRSI) | **GET** /v1/indicators/rsi/{cryptoTicker} | Relative Strength Index (RSI) |
| [**getCryptoSMA**](DefaultApi.md#getCryptoSMA) | **GET** /v1/indicators/sma/{cryptoTicker} | Simple Moving Average (SMA) |
| [**getCryptoSnapshotDirection**](DefaultApi.md#getCryptoSnapshotDirection) | **GET** /v2/snapshot/locale/global/markets/crypto/{direction} | Gainers/Losers |
| [**getCryptoSnapshotTicker**](DefaultApi.md#getCryptoSnapshotTicker) | **GET** /v2/snapshot/locale/global/markets/crypto/tickers/{ticker} | Ticker |
| [**getCryptoSnapshotTickers**](DefaultApi.md#getCryptoSnapshotTickers) | **GET** /v2/snapshot/locale/global/markets/crypto/tickers | All Tickers |
| [**getCryptoTrades**](DefaultApi.md#getCryptoTrades) | **GET** /v3/trades/{cryptoTicker} | Trades |
| [**getCurrencyConversion**](DefaultApi.md#getCurrencyConversion) | **GET** /v1/conversion/{from}/{to} | Real-time Currency Conversion |
| [**getEvents**](DefaultApi.md#getEvents) | **GET** /vX/reference/tickers/{id}/events | Ticker Events |
| [**getFedV1TreasuryYields**](DefaultApi.md#getFedV1TreasuryYields) | **GET** /fed/v1/treasury-yields |  |
| [**getForexAggregates**](DefaultApi.md#getForexAggregates) | **GET** /v2/aggs/ticker/{forexTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getForexEMA**](DefaultApi.md#getForexEMA) | **GET** /v1/indicators/ema/{fxTicker} | Exponential Moving Average (EMA) |
| [**getForexMACD**](DefaultApi.md#getForexMACD) | **GET** /v1/indicators/macd/{fxTicker} | Moving Average Convergence/Divergence (MACD) |
| [**getForexQuotes**](DefaultApi.md#getForexQuotes) | **GET** /v3/quotes/{fxTicker} | Quotes (BBO) |
| [**getForexRSI**](DefaultApi.md#getForexRSI) | **GET** /v1/indicators/rsi/{fxTicker} | Relative Strength Index (RSI) |
| [**getForexSMA**](DefaultApi.md#getForexSMA) | **GET** /v1/indicators/sma/{fxTicker} | Simple Moving Average (SMA) |
| [**getForexSnapshotDirection**](DefaultApi.md#getForexSnapshotDirection) | **GET** /v2/snapshot/locale/global/markets/forex/{direction} | Gainers/Losers |
| [**getForexSnapshotTicker**](DefaultApi.md#getForexSnapshotTicker) | **GET** /v2/snapshot/locale/global/markets/forex/tickers/{ticker} | Ticker |
| [**getForexSnapshotTickers**](DefaultApi.md#getForexSnapshotTickers) | **GET** /v2/snapshot/locale/global/markets/forex/tickers | All Tickers |
| [**getGroupedCryptoAggregates**](DefaultApi.md#getGroupedCryptoAggregates) | **GET** /v2/aggs/grouped/locale/global/market/crypto/{date} | Grouped Daily (Bars) |
| [**getGroupedForexAggregates**](DefaultApi.md#getGroupedForexAggregates) | **GET** /v2/aggs/grouped/locale/global/market/fx/{date} | Grouped Daily (Bars) |
| [**getGroupedStocksAggregates**](DefaultApi.md#getGroupedStocksAggregates) | **GET** /v2/aggs/grouped/locale/us/market/stocks/{date} | Grouped Daily (Bars) |
| [**getIndicesAggregates**](DefaultApi.md#getIndicesAggregates) | **GET** /v2/aggs/ticker/{indicesTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getIndicesEMA**](DefaultApi.md#getIndicesEMA) | **GET** /v1/indicators/ema/{indicesTicker} | Exponential Moving Average (EMA) |
| [**getIndicesMACD**](DefaultApi.md#getIndicesMACD) | **GET** /v1/indicators/macd/{indicesTicker} | Moving Average Convergence/Divergence (MACD) |
| [**getIndicesOpenClose**](DefaultApi.md#getIndicesOpenClose) | **GET** /v1/open-close/{indicesTicker}/{date} | Daily Open/Close |
| [**getIndicesRSI**](DefaultApi.md#getIndicesRSI) | **GET** /v1/indicators/rsi/{indicesTicker} | Relative Strength Index (RSI) |
| [**getIndicesSMA**](DefaultApi.md#getIndicesSMA) | **GET** /v1/indicators/sma/{indicesTicker} | Simple Moving Average (SMA) |
| [**getIndicesSnapshot**](DefaultApi.md#getIndicesSnapshot) | **GET** /v3/snapshot/indices | Indices Snapshot |
| [**getLastCryptoTrade**](DefaultApi.md#getLastCryptoTrade) | **GET** /v1/last/crypto/{from}/{to} | Last Trade for a Crypto Pair |
| [**getLastCurrencyQuote**](DefaultApi.md#getLastCurrencyQuote) | **GET** /v1/last_quote/currencies/{from}/{to} | Last Quote for a Currency Pair |
| [**getLastOptionsTrade**](DefaultApi.md#getLastOptionsTrade) | **GET** /v2/last/trade/{optionsTicker} | Last Trade |
| [**getLastStocksQuote**](DefaultApi.md#getLastStocksQuote) | **GET** /v2/last/nbbo/{stocksTicker} | Last Quote |
| [**getLastStocksTrade**](DefaultApi.md#getLastStocksTrade) | **GET** /v2/last/trade/{stocksTicker} | Last Trade |
| [**getMarketHolidays**](DefaultApi.md#getMarketHolidays) | **GET** /v1/marketstatus/upcoming | Market Holidays |
| [**getMarketStatus**](DefaultApi.md#getMarketStatus) | **GET** /v1/marketstatus/now | Market Status |
| [**getOptionContract**](DefaultApi.md#getOptionContract) | **GET** /v3/snapshot/options/{underlyingAsset}/{optionContract} | Option Contract |
| [**getOptionsAggregates**](DefaultApi.md#getOptionsAggregates) | **GET** /v2/aggs/ticker/{optionsTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getOptionsChain**](DefaultApi.md#getOptionsChain) | **GET** /v3/snapshot/options/{underlyingAsset} | Options Chain |
| [**getOptionsContract**](DefaultApi.md#getOptionsContract) | **GET** /v3/reference/options/contracts/{options_ticker} | Options Contract |
| [**getOptionsEMA**](DefaultApi.md#getOptionsEMA) | **GET** /v1/indicators/ema/{optionsTicker} | Exponential Moving Average (EMA) |
| [**getOptionsMACD**](DefaultApi.md#getOptionsMACD) | **GET** /v1/indicators/macd/{optionsTicker} | Moving Average Convergence/Divergence (MACD) |
| [**getOptionsOpenClose**](DefaultApi.md#getOptionsOpenClose) | **GET** /v1/open-close/{optionsTicker}/{date} | Daily Open/Close |
| [**getOptionsQuotes**](DefaultApi.md#getOptionsQuotes) | **GET** /v3/quotes/{optionsTicker} | Quotes |
| [**getOptionsRSI**](DefaultApi.md#getOptionsRSI) | **GET** /v1/indicators/rsi/{optionsTicker} | Relative Strength Index (RSI) |
| [**getOptionsSMA**](DefaultApi.md#getOptionsSMA) | **GET** /v1/indicators/sma/{optionsTicker} | Simple Moving Average (SMA) |
| [**getOptionsTrades**](DefaultApi.md#getOptionsTrades) | **GET** /v3/trades/{optionsTicker} | Trades |
| [**getPreviousCryptoAggregates**](DefaultApi.md#getPreviousCryptoAggregates) | **GET** /v2/aggs/ticker/{cryptoTicker}/prev | Previous Close |
| [**getPreviousForexAggregates**](DefaultApi.md#getPreviousForexAggregates) | **GET** /v2/aggs/ticker/{forexTicker}/prev | Previous Close |
| [**getPreviousIndicesAggregates**](DefaultApi.md#getPreviousIndicesAggregates) | **GET** /v2/aggs/ticker/{indicesTicker}/prev | Previous Close |
| [**getPreviousOptionsAggregates**](DefaultApi.md#getPreviousOptionsAggregates) | **GET** /v2/aggs/ticker/{optionsTicker}/prev | Previous Close |
| [**getPreviousStocksAggregates**](DefaultApi.md#getPreviousStocksAggregates) | **GET** /v2/aggs/ticker/{stocksTicker}/prev | Previous Close |
| [**getRelatedCompanies**](DefaultApi.md#getRelatedCompanies) | **GET** /v1/related-companies/{ticker} | Related Companies |
| [**getSnapshotSummary**](DefaultApi.md#getSnapshotSummary) | **GET** /v1/summaries | Summaries |
| [**getSnapshots**](DefaultApi.md#getSnapshots) | **GET** /v3/snapshot | Universal Snapshot |
| [**getStocksAggregates**](DefaultApi.md#getStocksAggregates) | **GET** /v2/aggs/ticker/{stocksTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getStocksEMA**](DefaultApi.md#getStocksEMA) | **GET** /v1/indicators/ema/{stockTicker} | Exponential Moving Average (EMA) |
| [**getStocksMACD**](DefaultApi.md#getStocksMACD) | **GET** /v1/indicators/macd/{stockTicker} | Moving Average Convergence/Divergence (MACD) |
| [**getStocksOpenClose**](DefaultApi.md#getStocksOpenClose) | **GET** /v1/open-close/{stocksTicker}/{date} | Daily Open/Close |
| [**getStocksQuotes**](DefaultApi.md#getStocksQuotes) | **GET** /v3/quotes/{stockTicker} | Quotes (NBBO) |
| [**getStocksRSI**](DefaultApi.md#getStocksRSI) | **GET** /v1/indicators/rsi/{stockTicker} | Relative Strength Index (RSI) |
| [**getStocksSMA**](DefaultApi.md#getStocksSMA) | **GET** /v1/indicators/sma/{stockTicker} | Simple Moving Average (SMA) |
| [**getStocksSnapshotDirection**](DefaultApi.md#getStocksSnapshotDirection) | **GET** /v2/snapshot/locale/us/markets/stocks/{direction} | Gainers/Losers |
| [**getStocksSnapshotTicker**](DefaultApi.md#getStocksSnapshotTicker) | **GET** /v2/snapshot/locale/us/markets/stocks/tickers/{stocksTicker} | Ticker |
| [**getStocksSnapshotTickers**](DefaultApi.md#getStocksSnapshotTickers) | **GET** /v2/snapshot/locale/us/markets/stocks/tickers | All Tickers |
| [**getStocksTrades**](DefaultApi.md#getStocksTrades) | **GET** /v3/trades/{stockTicker} | Trades |
| [**getStocksV1ShortInterest**](DefaultApi.md#getStocksV1ShortInterest) | **GET** /stocks/v1/short-interest |  |
| [**getStocksV1ShortVolume**](DefaultApi.md#getStocksV1ShortVolume) | **GET** /stocks/v1/short-volume |  |
| [**getTicker**](DefaultApi.md#getTicker) | **GET** /v3/reference/tickers/{ticker} | Ticker Details v3 |
| [**getTmxV1CorporateEvents**](DefaultApi.md#getTmxV1CorporateEvents) | **GET** /tmx/v1/corporate-events |  |
| [**listConditions**](DefaultApi.md#listConditions) | **GET** /v3/reference/conditions | Conditions |
| [**listDividends**](DefaultApi.md#listDividends) | **GET** /v3/reference/dividends | Dividends v3 |
| [**listExchanges**](DefaultApi.md#listExchanges) | **GET** /v3/reference/exchanges | Exchanges |
| [**listFinancials**](DefaultApi.md#listFinancials) | **GET** /vX/reference/financials | Stock Financials vX |
| [**listIPOs**](DefaultApi.md#listIPOs) | **GET** /vX/reference/ipos | IPOs |
| [**listNews**](DefaultApi.md#listNews) | **GET** /v2/reference/news | Ticker News |
| [**listOptionsContracts**](DefaultApi.md#listOptionsContracts) | **GET** /v3/reference/options/contracts | Options Contracts |
| [**listStockSplits**](DefaultApi.md#listStockSplits) | **GET** /v3/reference/splits | Stock Splits v3 |
| [**listTickerTypes**](DefaultApi.md#listTickerTypes) | **GET** /v3/reference/tickers/types | Ticker Types |
| [**listTickers**](DefaultApi.md#listTickers) | **GET** /v3/reference/tickers | Tickers |


<a id="deprecatedGetCryptoSnapshotTickerBook"></a>
# **deprecatedGetCryptoSnapshotTickerBook**
> DeprecatedGetCryptoSnapshotTickerBook200Response deprecatedGetCryptoSnapshotTickerBook(ticker)

Ticker Full Book (L2)

Get the current level 2 book of a single ticker. This is the combined book from all of the exchanges. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 12am EST and gets populated as data is received from the exchanges. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = X:BTCUSD // kotlin.String | The cryptocurrency ticker.
try {
    val result : DeprecatedGetCryptoSnapshotTickerBook200Response = apiInstance.deprecatedGetCryptoSnapshotTickerBook(ticker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deprecatedGetCryptoSnapshotTickerBook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deprecatedGetCryptoSnapshotTickerBook")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ticker** | **kotlin.String**| The cryptocurrency ticker. | |

### Return type

[**DeprecatedGetCryptoSnapshotTickerBook200Response**](DeprecatedGetCryptoSnapshotTickerBook200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deprecatedGetHistoricCryptoTrades"></a>
# **deprecatedGetHistoricCryptoTrades**
> DeprecatedGetHistoricCryptoTrades200Response deprecatedGetHistoricCryptoTrades(from, to, date, offset, limit)

Historic Crypto Trades

Get historic trade ticks for a cryptocurrency pair. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val from : kotlin.String = BTC // kotlin.String | The \"from\" symbol of the crypto pair.
val to : kotlin.String = USD // kotlin.String | The \"to\" symbol of the crypto pair.
val date : java.time.LocalDate = 2020-10-14 // java.time.LocalDate | The date/day of the historic ticks to retrieve.
val offset : kotlin.Int = 56 // kotlin.Int | The timestamp offset, used for pagination. This is the offset at which to start the results. Using the `timestamp` of the last result as the offset will give you the next page of results. 
val limit : kotlin.Int = 100 // kotlin.Int | Limit the size of the response, max 10000.
try {
    val result : DeprecatedGetHistoricCryptoTrades200Response = apiInstance.deprecatedGetHistoricCryptoTrades(from, to, date, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deprecatedGetHistoricCryptoTrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deprecatedGetHistoricCryptoTrades")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlin.String**| The \&quot;from\&quot; symbol of the crypto pair. | |
| **to** | **kotlin.String**| The \&quot;to\&quot; symbol of the crypto pair. | |
| **date** | **java.time.LocalDate**| The date/day of the historic ticks to retrieve. | |
| **offset** | **kotlin.Int**| The timestamp offset, used for pagination. This is the offset at which to start the results. Using the &#x60;timestamp&#x60; of the last result as the offset will give you the next page of results.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the size of the response, max 10000. | [optional] |

### Return type

[**DeprecatedGetHistoricCryptoTrades200Response**](DeprecatedGetHistoricCryptoTrades200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deprecatedGetHistoricForexQuotes"></a>
# **deprecatedGetHistoricForexQuotes**
> DeprecatedGetHistoricForexQuotes200Response deprecatedGetHistoricForexQuotes(from, to, date, offset, limit)

Historic Forex Ticks

Get historic ticks for a forex currency pair. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val from : kotlin.String = AUD // kotlin.String | The \"from\" symbol of the currency pair.  Example: For **USD/JPY** the `from` would be **USD**. 
val to : kotlin.String = USD // kotlin.String | The \"to\" symbol of the currency pair.  Example: For **USD/JPY** the `to` would be **JPY**. 
val date : java.time.LocalDate = 2020-10-14 // java.time.LocalDate | The date/day of the historic ticks to retrieve.
val offset : kotlin.Int = 56 // kotlin.Int | The timestamp offset, used for pagination. This is the offset at which to start the results. Using the `timestamp` of the last result as the offset will give you the next page of results. 
val limit : kotlin.Int = 100 // kotlin.Int | Limit the size of the response, max 10000.
try {
    val result : DeprecatedGetHistoricForexQuotes200Response = apiInstance.deprecatedGetHistoricForexQuotes(from, to, date, offset, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deprecatedGetHistoricForexQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deprecatedGetHistoricForexQuotes")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlin.String**| The \&quot;from\&quot; symbol of the currency pair.  Example: For **USD/JPY** the &#x60;from&#x60; would be **USD**.  | |
| **to** | **kotlin.String**| The \&quot;to\&quot; symbol of the currency pair.  Example: For **USD/JPY** the &#x60;to&#x60; would be **JPY**.  | |
| **date** | **java.time.LocalDate**| The date/day of the historic ticks to retrieve. | |
| **offset** | **kotlin.Int**| The timestamp offset, used for pagination. This is the offset at which to start the results. Using the &#x60;timestamp&#x60; of the last result as the offset will give you the next page of results.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the size of the response, max 10000. | [optional] |

### Return type

[**DeprecatedGetHistoricForexQuotes200Response**](DeprecatedGetHistoricForexQuotes200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deprecatedGetHistoricStocksQuotes"></a>
# **deprecatedGetHistoricStocksQuotes**
> DeprecatedGetHistoricStocksQuotes200Response deprecatedGetHistoricStocksQuotes(ticker, date, timestamp, timestampLimit, reverse, limit)

Quotes (NBBO)

Get NBBO quotes for a given ticker symbol on a specified date. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = AAPL // kotlin.String | The ticker symbol we want quotes for.
val date : java.time.LocalDate = 2020-10-14 // java.time.LocalDate | The date/day of the quotes to retrieve in the format YYYY-MM-DD.
val timestamp : kotlin.Int = 56 // kotlin.Int | The timestamp offset, used for pagination. This is the offset at which to start the results. Using the `timestamp` of the last result as the offset will give you the next page of results. 
val timestampLimit : kotlin.Int = 56 // kotlin.Int | The maximum timestamp allowed in the results. 
val reverse : kotlin.Boolean = true // kotlin.Boolean | Reverse the order of the results. 
val limit : kotlin.Int = 10 // kotlin.Int | Limit the size of the response, max 50000 and default 5000.
try {
    val result : DeprecatedGetHistoricStocksQuotes200Response = apiInstance.deprecatedGetHistoricStocksQuotes(ticker, date, timestamp, timestampLimit, reverse, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deprecatedGetHistoricStocksQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deprecatedGetHistoricStocksQuotes")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The ticker symbol we want quotes for. | |
| **date** | **java.time.LocalDate**| The date/day of the quotes to retrieve in the format YYYY-MM-DD. | |
| **timestamp** | **kotlin.Int**| The timestamp offset, used for pagination. This is the offset at which to start the results. Using the &#x60;timestamp&#x60; of the last result as the offset will give you the next page of results.  | [optional] |
| **timestampLimit** | **kotlin.Int**| The maximum timestamp allowed in the results.  | [optional] |
| **reverse** | **kotlin.Boolean**| Reverse the order of the results.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the size of the response, max 50000 and default 5000. | [optional] |

### Return type

[**DeprecatedGetHistoricStocksQuotes200Response**](DeprecatedGetHistoricStocksQuotes200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deprecatedGetHistoricStocksTrades"></a>
# **deprecatedGetHistoricStocksTrades**
> DeprecatedGetHistoricStocksTrades200Response deprecatedGetHistoricStocksTrades(ticker, date, timestamp, timestampLimit, reverse, limit)

Trades

Get trades for a given ticker symbol on a specified date. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = AAPL // kotlin.String | The ticker symbol we want trades for.
val date : java.time.LocalDate = 2020-10-14 // java.time.LocalDate | The date/day of the trades to retrieve in the format YYYY-MM-DD.
val timestamp : kotlin.Int = 56 // kotlin.Int | The timestamp offset, used for pagination. This is the offset at which to start the results. Using the `timestamp` of the last result as the offset will give you the next page of results. 
val timestampLimit : kotlin.Int = 56 // kotlin.Int | The maximum timestamp allowed in the results. 
val reverse : kotlin.Boolean = true // kotlin.Boolean | Reverse the order of the results. 
val limit : kotlin.Int = 10 // kotlin.Int | Limit the size of the response, max 50000 and default 5000.
try {
    val result : DeprecatedGetHistoricStocksTrades200Response = apiInstance.deprecatedGetHistoricStocksTrades(ticker, date, timestamp, timestampLimit, reverse, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deprecatedGetHistoricStocksTrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deprecatedGetHistoricStocksTrades")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The ticker symbol we want trades for. | |
| **date** | **java.time.LocalDate**| The date/day of the trades to retrieve in the format YYYY-MM-DD. | |
| **timestamp** | **kotlin.Int**| The timestamp offset, used for pagination. This is the offset at which to start the results. Using the &#x60;timestamp&#x60; of the last result as the offset will give you the next page of results.  | [optional] |
| **timestampLimit** | **kotlin.Int**| The maximum timestamp allowed in the results.  | [optional] |
| **reverse** | **kotlin.Boolean**| Reverse the order of the results.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the size of the response, max 50000 and default 5000. | [optional] |

### Return type

[**DeprecatedGetHistoricStocksTrades200Response**](DeprecatedGetHistoricStocksTrades200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV1AnalystInsights"></a>
# **getBenzingaV1AnalystInsights**
> GetBenzingaV1AnalystInsights200Response getBenzingaV1AnalystInsights(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, firm, firmAnyOf, firmGt, firmGte, firmLt, firmLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, benzingaRatingId, benzingaRatingIdAnyOf, benzingaRatingIdGt, benzingaRatingIdGte, benzingaRatingIdLt, benzingaRatingIdLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | The calendar date (formatted as YYYY-MM-DD) when the rating was issued.
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val ticker : kotlin.String = ticker_example // kotlin.String | The stock symbol of the company being rated.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system.
val lastUpdatedAnyOf : kotlin.String = lastUpdatedAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val lastUpdatedGt : kotlin.String = lastUpdatedGt_example // kotlin.String | Filter greater than the value.
val lastUpdatedGte : kotlin.String = lastUpdatedGte_example // kotlin.String | Filter greater than or equal to the value.
val lastUpdatedLt : kotlin.String = lastUpdatedLt_example // kotlin.String | Filter less than the value.
val lastUpdatedLte : kotlin.String = lastUpdatedLte_example // kotlin.String | Filter less than or equal to the value.
val firm : kotlin.String = firm_example // kotlin.String | The name of the research firm or investment bank issuing the rating.
val firmAnyOf : kotlin.String = firmAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val firmGt : kotlin.String = firmGt_example // kotlin.String | Filter greater than the value.
val firmGte : kotlin.String = firmGte_example // kotlin.String | Filter greater than or equal to the value.
val firmLt : kotlin.String = firmLt_example // kotlin.String | Filter less than the value.
val firmLte : kotlin.String = firmLte_example // kotlin.String | Filter less than or equal to the value.
val benzingaFirmId : kotlin.String = benzingaFirmId_example // kotlin.String | The identifer used by Benzinga for the firm record.
val benzingaFirmIdAnyOf : kotlin.String = benzingaFirmIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaFirmIdGt : kotlin.String = benzingaFirmIdGt_example // kotlin.String | Filter greater than the value.
val benzingaFirmIdGte : kotlin.String = benzingaFirmIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaFirmIdLt : kotlin.String = benzingaFirmIdLt_example // kotlin.String | Filter less than the value.
val benzingaFirmIdLte : kotlin.String = benzingaFirmIdLte_example // kotlin.String | Filter less than or equal to the value.
val benzingaRatingId : kotlin.String = benzingaRatingId_example // kotlin.String | The identifier used by Benzinga for the rating record.
val benzingaRatingIdAnyOf : kotlin.String = benzingaRatingIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaRatingIdGt : kotlin.String = benzingaRatingIdGt_example // kotlin.String | Filter greater than the value.
val benzingaRatingIdGte : kotlin.String = benzingaRatingIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaRatingIdLt : kotlin.String = benzingaRatingIdLt_example // kotlin.String | Filter less than the value.
val benzingaRatingIdLte : kotlin.String = benzingaRatingIdLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetBenzingaV1AnalystInsights200Response = apiInstance.getBenzingaV1AnalystInsights(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, firm, firmAnyOf, firmGt, firmGte, firmLt, firmLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, benzingaRatingId, benzingaRatingIdAnyOf, benzingaRatingIdGt, benzingaRatingIdGte, benzingaRatingIdLt, benzingaRatingIdLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV1AnalystInsights")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV1AnalystInsights")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| The calendar date (formatted as YYYY-MM-DD) when the rating was issued. | [optional] |
| **dateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ticker** | **kotlin.String**| The stock symbol of the company being rated. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **lastUpdated** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system. | [optional] |
| **lastUpdatedAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **lastUpdatedGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **lastUpdatedGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **lastUpdatedLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **lastUpdatedLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **firm** | **kotlin.String**| The name of the research firm or investment bank issuing the rating. | [optional] |
| **firmAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **firmGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **firmGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **firmLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **firmLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **benzingaFirmId** | **kotlin.String**| The identifer used by Benzinga for the firm record. | [optional] |
| **benzingaFirmIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaFirmIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaFirmIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaFirmIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaFirmIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **benzingaRatingId** | **kotlin.String**| The identifier used by Benzinga for the rating record. | [optional] |
| **benzingaRatingIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaRatingIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaRatingIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaRatingIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaRatingIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;date&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;date.desc&quot;] |

### Return type

[**GetBenzingaV1AnalystInsights200Response**](GetBenzingaV1AnalystInsights200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV1Analysts"></a>
# **getBenzingaV1Analysts**
> GetBenzingaV1Analysts200Response getBenzingaV1Analysts(benzingaId, benzingaIdAnyOf, benzingaIdGt, benzingaIdGte, benzingaIdLt, benzingaIdLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, firmName, firmNameAnyOf, firmNameGt, firmNameGte, firmNameLt, firmNameLte, fullName, fullNameAnyOf, fullNameGt, fullNameGte, fullNameLt, fullNameLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val benzingaId : kotlin.String = benzingaId_example // kotlin.String | The identifier used by Benzinga for this record.
val benzingaIdAnyOf : kotlin.String = benzingaIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaIdGt : kotlin.String = benzingaIdGt_example // kotlin.String | Filter greater than the value.
val benzingaIdGte : kotlin.String = benzingaIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaIdLt : kotlin.String = benzingaIdLt_example // kotlin.String | Filter less than the value.
val benzingaIdLte : kotlin.String = benzingaIdLte_example // kotlin.String | Filter less than or equal to the value.
val benzingaFirmId : kotlin.String = benzingaFirmId_example // kotlin.String | The unique identifier assigned by Benzinga to the research firm or investment bank.
val benzingaFirmIdAnyOf : kotlin.String = benzingaFirmIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaFirmIdGt : kotlin.String = benzingaFirmIdGt_example // kotlin.String | Filter greater than the value.
val benzingaFirmIdGte : kotlin.String = benzingaFirmIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaFirmIdLt : kotlin.String = benzingaFirmIdLt_example // kotlin.String | Filter less than the value.
val benzingaFirmIdLte : kotlin.String = benzingaFirmIdLte_example // kotlin.String | Filter less than or equal to the value.
val firmName : kotlin.String = firmName_example // kotlin.String | The name of the research firm or investment bank issuing the ratings.
val firmNameAnyOf : kotlin.String = firmNameAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val firmNameGt : kotlin.String = firmNameGt_example // kotlin.String | Filter greater than the value.
val firmNameGte : kotlin.String = firmNameGte_example // kotlin.String | Filter greater than or equal to the value.
val firmNameLt : kotlin.String = firmNameLt_example // kotlin.String | Filter less than the value.
val firmNameLte : kotlin.String = firmNameLte_example // kotlin.String | Filter less than or equal to the value.
val fullName : kotlin.String = fullName_example // kotlin.String | The full name of the analyst associated with the ratings.
val fullNameAnyOf : kotlin.String = fullNameAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val fullNameGt : kotlin.String = fullNameGt_example // kotlin.String | Filter greater than the value.
val fullNameGte : kotlin.String = fullNameGte_example // kotlin.String | Filter greater than or equal to the value.
val fullNameLt : kotlin.String = fullNameLt_example // kotlin.String | Filter less than the value.
val fullNameLte : kotlin.String = fullNameLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'full_name' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetBenzingaV1Analysts200Response = apiInstance.getBenzingaV1Analysts(benzingaId, benzingaIdAnyOf, benzingaIdGt, benzingaIdGte, benzingaIdLt, benzingaIdLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, firmName, firmNameAnyOf, firmNameGt, firmNameGte, firmNameLt, firmNameLte, fullName, fullNameAnyOf, fullNameGt, fullNameGte, fullNameLt, fullNameLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV1Analysts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV1Analysts")
    e.printStackTrace()
}
```

### Parameters
| **benzingaId** | **kotlin.String**| The identifier used by Benzinga for this record. | [optional] |
| **benzingaIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **benzingaFirmId** | **kotlin.String**| The unique identifier assigned by Benzinga to the research firm or investment bank. | [optional] |
| **benzingaFirmIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaFirmIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaFirmIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaFirmIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaFirmIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **firmName** | **kotlin.String**| The name of the research firm or investment bank issuing the ratings. | [optional] |
| **firmNameAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **firmNameGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **firmNameGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **firmNameLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **firmNameLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **fullName** | **kotlin.String**| The full name of the analyst associated with the ratings. | [optional] |
| **fullNameAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **fullNameGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **fullNameGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **fullNameLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **fullNameLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;full_name&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;full_name.asc&quot;] |

### Return type

[**GetBenzingaV1Analysts200Response**](GetBenzingaV1Analysts200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV1ConsensusRatings"></a>
# **getBenzingaV1ConsensusRatings**
> GetBenzingaV1ConsensusRatings200Response getBenzingaV1ConsensusRatings(ticker, date, dateGt, dateGte, dateLt, dateLte, limit)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | The requested ticker.
val date : kotlin.String = date_example // kotlin.String | Filter equal to the value.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
try {
    val result : GetBenzingaV1ConsensusRatings200Response = apiInstance.getBenzingaV1ConsensusRatings(ticker, date, dateGt, dateGte, dateLt, dateLte, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV1ConsensusRatings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV1ConsensusRatings")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The requested ticker. | |
| **date** | **kotlin.String**| Filter equal to the value. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |

### Return type

[**GetBenzingaV1ConsensusRatings200Response**](GetBenzingaV1ConsensusRatings200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV1Earnings"></a>
# **getBenzingaV1Earnings**
> GetBenzingaV1Earnings200Response getBenzingaV1Earnings(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, importance, importanceAnyOf, importanceGt, importanceGte, importanceLt, importanceLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, dateStatus, dateStatusAnyOf, dateStatusGt, dateStatusGte, dateStatusLt, dateStatusLte, epsSurprisePercent, epsSurprisePercentAnyOf, epsSurprisePercentGt, epsSurprisePercentGte, epsSurprisePercentLt, epsSurprisePercentLte, revenueSurprisePercent, revenueSurprisePercentAnyOf, revenueSurprisePercentGt, revenueSurprisePercentGte, revenueSurprisePercentLt, revenueSurprisePercentLte, fiscalYear, fiscalYearAnyOf, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalPeriod, fiscalPeriodAnyOf, fiscalPeriodGt, fiscalPeriodGte, fiscalPeriodLt, fiscalPeriodLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | The calendar date (formatted as YYYY-MM-DD) when the earnings are scheduled or were reported.
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val ticker : kotlin.String = ticker_example // kotlin.String | The stock symbol of the company reporting earnings.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val importance : kotlin.Long = 789 // kotlin.Long | A subjective indicator of the importance of the event, on a scale from 0 (lowest) to 5 (highest). Value must be an integer.
val importanceAnyOf : kotlin.String = importanceAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer.
val importanceGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val importanceGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val importanceLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val importanceLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the record was last updated in the system.
val lastUpdatedAnyOf : kotlin.String = lastUpdatedAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val lastUpdatedGt : kotlin.String = lastUpdatedGt_example // kotlin.String | Filter greater than the value.
val lastUpdatedGte : kotlin.String = lastUpdatedGte_example // kotlin.String | Filter greater than or equal to the value.
val lastUpdatedLt : kotlin.String = lastUpdatedLt_example // kotlin.String | Filter less than the value.
val lastUpdatedLte : kotlin.String = lastUpdatedLte_example // kotlin.String | Filter less than or equal to the value.
val dateStatus : kotlin.String = dateStatus_example // kotlin.String | Indicates whether the date of the earnings report has been confirmed. Possible values include: projected, confirmed.
val dateStatusAnyOf : kotlin.String = dateStatusAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateStatusGt : kotlin.String = dateStatusGt_example // kotlin.String | Filter greater than the value.
val dateStatusGte : kotlin.String = dateStatusGte_example // kotlin.String | Filter greater than or equal to the value.
val dateStatusLt : kotlin.String = dateStatusLt_example // kotlin.String | Filter less than the value.
val dateStatusLte : kotlin.String = dateStatusLte_example // kotlin.String | Filter less than or equal to the value.
val epsSurprisePercent : kotlin.Double = 1.2 // kotlin.Double | The percentage difference between the actual and estimated EPS. Value must be a floating point number.
val epsSurprisePercentAnyOf : kotlin.String = epsSurprisePercentAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be a floating point number.
val epsSurprisePercentGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val epsSurprisePercentGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val epsSurprisePercentLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val epsSurprisePercentLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val revenueSurprisePercent : kotlin.Double = 1.2 // kotlin.Double | The percentage difference between the actual and estimated revenue. Value must be a floating point number.
val revenueSurprisePercentAnyOf : kotlin.String = revenueSurprisePercentAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be a floating point number.
val revenueSurprisePercentGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val revenueSurprisePercentGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val revenueSurprisePercentLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val revenueSurprisePercentLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val fiscalYear : kotlin.Long = 789 // kotlin.Long | The fiscal year in which the earnings period falls. Value must be an integer.
val fiscalYearAnyOf : kotlin.String = fiscalYearAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer.
val fiscalYearGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val fiscalYearGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val fiscalYearLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val fiscalYearLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val fiscalPeriod : kotlin.String = fiscalPeriod_example // kotlin.String | The fiscal period for which the earnings are reported. Examples include: Q1, Q2, H1, FY.
val fiscalPeriodAnyOf : kotlin.String = fiscalPeriodAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val fiscalPeriodGt : kotlin.String = fiscalPeriodGt_example // kotlin.String | Filter greater than the value.
val fiscalPeriodGte : kotlin.String = fiscalPeriodGte_example // kotlin.String | Filter greater than or equal to the value.
val fiscalPeriodLt : kotlin.String = fiscalPeriodLt_example // kotlin.String | Filter less than the value.
val fiscalPeriodLte : kotlin.String = fiscalPeriodLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetBenzingaV1Earnings200Response = apiInstance.getBenzingaV1Earnings(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, importance, importanceAnyOf, importanceGt, importanceGte, importanceLt, importanceLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, dateStatus, dateStatusAnyOf, dateStatusGt, dateStatusGte, dateStatusLt, dateStatusLte, epsSurprisePercent, epsSurprisePercentAnyOf, epsSurprisePercentGt, epsSurprisePercentGte, epsSurprisePercentLt, epsSurprisePercentLte, revenueSurprisePercent, revenueSurprisePercentAnyOf, revenueSurprisePercentGt, revenueSurprisePercentGte, revenueSurprisePercentLt, revenueSurprisePercentLte, fiscalYear, fiscalYearAnyOf, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalPeriod, fiscalPeriodAnyOf, fiscalPeriodGt, fiscalPeriodGte, fiscalPeriodLt, fiscalPeriodLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV1Earnings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV1Earnings")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| The calendar date (formatted as YYYY-MM-DD) when the earnings are scheduled or were reported. | [optional] |
| **dateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ticker** | **kotlin.String**| The stock symbol of the company reporting earnings. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **importance** | **kotlin.Long**| A subjective indicator of the importance of the event, on a scale from 0 (lowest) to 5 (highest). Value must be an integer. | [optional] |
| **importanceAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer. | [optional] |
| **importanceGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **importanceGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **importanceLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **importanceLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **lastUpdated** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the record was last updated in the system. | [optional] |
| **lastUpdatedAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **lastUpdatedGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **lastUpdatedGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **lastUpdatedLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **lastUpdatedLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **dateStatus** | **kotlin.String**| Indicates whether the date of the earnings report has been confirmed. Possible values include: projected, confirmed. | [optional] |
| **dateStatusAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **dateStatusGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateStatusGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateStatusLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateStatusLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **epsSurprisePercent** | **kotlin.Double**| The percentage difference between the actual and estimated EPS. Value must be a floating point number. | [optional] |
| **epsSurprisePercentAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be a floating point number. | [optional] |
| **epsSurprisePercentGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **epsSurprisePercentGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **epsSurprisePercentLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **epsSurprisePercentLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **revenueSurprisePercent** | **kotlin.Double**| The percentage difference between the actual and estimated revenue. Value must be a floating point number. | [optional] |
| **revenueSurprisePercentAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be a floating point number. | [optional] |
| **revenueSurprisePercentGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **revenueSurprisePercentGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **revenueSurprisePercentLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **revenueSurprisePercentLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalYear** | **kotlin.Long**| The fiscal year in which the earnings period falls. Value must be an integer. | [optional] |
| **fiscalYearAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer. | [optional] |
| **fiscalYearGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **fiscalYearGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **fiscalYearLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **fiscalYearLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **fiscalPeriod** | **kotlin.String**| The fiscal period for which the earnings are reported. Examples include: Q1, Q2, H1, FY. | [optional] |
| **fiscalPeriodAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **fiscalPeriodGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **fiscalPeriodGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **fiscalPeriodLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **fiscalPeriodLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;date&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;date.desc&quot;] |

### Return type

[**GetBenzingaV1Earnings200Response**](GetBenzingaV1Earnings200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV1Firms"></a>
# **getBenzingaV1Firms**
> GetBenzingaV1Firms200Response getBenzingaV1Firms(benzingaId, benzingaIdAnyOf, benzingaIdGt, benzingaIdGte, benzingaIdLt, benzingaIdLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val benzingaId : kotlin.String = benzingaId_example // kotlin.String | The identifer used by Benzinga for this record.
val benzingaIdAnyOf : kotlin.String = benzingaIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaIdGt : kotlin.String = benzingaIdGt_example // kotlin.String | Filter greater than the value.
val benzingaIdGte : kotlin.String = benzingaIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaIdLt : kotlin.String = benzingaIdLt_example // kotlin.String | Filter less than the value.
val benzingaIdLte : kotlin.String = benzingaIdLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'name' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetBenzingaV1Firms200Response = apiInstance.getBenzingaV1Firms(benzingaId, benzingaIdAnyOf, benzingaIdGt, benzingaIdGte, benzingaIdLt, benzingaIdLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV1Firms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV1Firms")
    e.printStackTrace()
}
```

### Parameters
| **benzingaId** | **kotlin.String**| The identifer used by Benzinga for this record. | [optional] |
| **benzingaIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;name&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;name.asc&quot;] |

### Return type

[**GetBenzingaV1Firms200Response**](GetBenzingaV1Firms200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV1Guidance"></a>
# **getBenzingaV1Guidance**
> GetBenzingaV1Guidance200Response getBenzingaV1Guidance(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, positioning, positioningAnyOf, positioningGt, positioningGte, positioningLt, positioningLte, importance, importanceAnyOf, importanceGt, importanceGte, importanceLt, importanceLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, fiscalYear, fiscalYearAnyOf, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalPeriod, fiscalPeriodAnyOf, fiscalPeriodGt, fiscalPeriodGte, fiscalPeriodLt, fiscalPeriodLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | The calendar date (formatted as YYYY-MM-DD) when the guidance was issued.
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val ticker : kotlin.String = ticker_example // kotlin.String | The stock symbol of the company issuing guidance.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val positioning : kotlin.String = positioning_example // kotlin.String | Indicates how a particular guidance value is presented relative to other figures disclosed by the company. Possible values are 'primary' (the emphasized figure) and 'secondary' (a supporting or alternate figure)
val positioningAnyOf : kotlin.String = positioningAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val positioningGt : kotlin.String = positioningGt_example // kotlin.String | Filter greater than the value.
val positioningGte : kotlin.String = positioningGte_example // kotlin.String | Filter greater than or equal to the value.
val positioningLt : kotlin.String = positioningLt_example // kotlin.String | Filter less than the value.
val positioningLte : kotlin.String = positioningLte_example // kotlin.String | Filter less than or equal to the value.
val importance : kotlin.Long = 789 // kotlin.Long | A subjective indicator of the importance of the event, on a scale from 0 (lowest) to 5 (highest). Value must be an integer.
val importanceAnyOf : kotlin.String = importanceAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer.
val importanceGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val importanceGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val importanceLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val importanceLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the record was last updated in the system.
val lastUpdatedAnyOf : kotlin.String = lastUpdatedAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val lastUpdatedGt : kotlin.String = lastUpdatedGt_example // kotlin.String | Filter greater than the value.
val lastUpdatedGte : kotlin.String = lastUpdatedGte_example // kotlin.String | Filter greater than or equal to the value.
val lastUpdatedLt : kotlin.String = lastUpdatedLt_example // kotlin.String | Filter less than the value.
val lastUpdatedLte : kotlin.String = lastUpdatedLte_example // kotlin.String | Filter less than or equal to the value.
val fiscalYear : kotlin.Long = 789 // kotlin.Long | The fiscal year corresponding to the period for which the guidance is issued. Value must be an integer.
val fiscalYearAnyOf : kotlin.String = fiscalYearAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer.
val fiscalYearGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val fiscalYearGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val fiscalYearLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val fiscalYearLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val fiscalPeriod : kotlin.String = fiscalPeriod_example // kotlin.String | The fiscal quarter to which the guidance applies, such as Q1, Q2, Q3, or Q4.
val fiscalPeriodAnyOf : kotlin.String = fiscalPeriodAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val fiscalPeriodGt : kotlin.String = fiscalPeriodGt_example // kotlin.String | Filter greater than the value.
val fiscalPeriodGte : kotlin.String = fiscalPeriodGte_example // kotlin.String | Filter greater than or equal to the value.
val fiscalPeriodLt : kotlin.String = fiscalPeriodLt_example // kotlin.String | Filter less than the value.
val fiscalPeriodLte : kotlin.String = fiscalPeriodLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetBenzingaV1Guidance200Response = apiInstance.getBenzingaV1Guidance(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, positioning, positioningAnyOf, positioningGt, positioningGte, positioningLt, positioningLte, importance, importanceAnyOf, importanceGt, importanceGte, importanceLt, importanceLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, fiscalYear, fiscalYearAnyOf, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalPeriod, fiscalPeriodAnyOf, fiscalPeriodGt, fiscalPeriodGte, fiscalPeriodLt, fiscalPeriodLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV1Guidance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV1Guidance")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| The calendar date (formatted as YYYY-MM-DD) when the guidance was issued. | [optional] |
| **dateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ticker** | **kotlin.String**| The stock symbol of the company issuing guidance. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **positioning** | **kotlin.String**| Indicates how a particular guidance value is presented relative to other figures disclosed by the company. Possible values are &#39;primary&#39; (the emphasized figure) and &#39;secondary&#39; (a supporting or alternate figure) | [optional] |
| **positioningAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **positioningGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **positioningGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **positioningLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **positioningLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **importance** | **kotlin.Long**| A subjective indicator of the importance of the event, on a scale from 0 (lowest) to 5 (highest). Value must be an integer. | [optional] |
| **importanceAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer. | [optional] |
| **importanceGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **importanceGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **importanceLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **importanceLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **lastUpdated** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the record was last updated in the system. | [optional] |
| **lastUpdatedAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **lastUpdatedGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **lastUpdatedGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **lastUpdatedLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **lastUpdatedLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **fiscalYear** | **kotlin.Long**| The fiscal year corresponding to the period for which the guidance is issued. Value must be an integer. | [optional] |
| **fiscalYearAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer. | [optional] |
| **fiscalYearGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **fiscalYearGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **fiscalYearLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **fiscalYearLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **fiscalPeriod** | **kotlin.String**| The fiscal quarter to which the guidance applies, such as Q1, Q2, Q3, or Q4. | [optional] |
| **fiscalPeriodAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **fiscalPeriodGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **fiscalPeriodGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **fiscalPeriodLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **fiscalPeriodLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;date&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;date.desc&quot;] |

### Return type

[**GetBenzingaV1Guidance200Response**](GetBenzingaV1Guidance200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV1News"></a>
# **getBenzingaV1News**
> GetBenzingaV1News200Response getBenzingaV1News(published, publishedAnyOf, publishedGt, publishedGte, publishedLt, publishedLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, tickers, tickersAllOf, tickersAnyOf, channels, channelsAllOf, channelsAnyOf, tags, tagsAllOf, tagsAnyOf, author, authorAnyOf, authorGt, authorGte, authorLt, authorLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val published : kotlin.String = published_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the news article was originally published.
val publishedAnyOf : kotlin.String = publishedAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val publishedGt : kotlin.String = publishedGt_example // kotlin.String | Filter greater than the value.
val publishedGte : kotlin.String = publishedGte_example // kotlin.String | Filter greater than or equal to the value.
val publishedLt : kotlin.String = publishedLt_example // kotlin.String | Filter less than the value.
val publishedLte : kotlin.String = publishedLte_example // kotlin.String | Filter less than or equal to the value.
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the news article was last updated in the system.
val lastUpdatedAnyOf : kotlin.String = lastUpdatedAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val lastUpdatedGt : kotlin.String = lastUpdatedGt_example // kotlin.String | Filter greater than the value.
val lastUpdatedGte : kotlin.String = lastUpdatedGte_example // kotlin.String | Filter greater than or equal to the value.
val lastUpdatedLt : kotlin.String = lastUpdatedLt_example // kotlin.String | Filter less than the value.
val lastUpdatedLte : kotlin.String = lastUpdatedLte_example // kotlin.String | Filter less than or equal to the value.
val tickers : kotlin.String = tickers_example // kotlin.String | Filter for arrays that contain the value.
val tickersAllOf : kotlin.String = tickersAllOf_example // kotlin.String | Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list.
val tickersAnyOf : kotlin.String = tickersAnyOf_example // kotlin.String | Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list.
val channels : kotlin.String = channels_example // kotlin.String | Filter for arrays that contain the value.
val channelsAllOf : kotlin.String = channelsAllOf_example // kotlin.String | Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list.
val channelsAnyOf : kotlin.String = channelsAnyOf_example // kotlin.String | Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list.
val tags : kotlin.String = tags_example // kotlin.String | Filter for arrays that contain the value.
val tagsAllOf : kotlin.String = tagsAllOf_example // kotlin.String | Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list.
val tagsAnyOf : kotlin.String = tagsAnyOf_example // kotlin.String | Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list.
val author : kotlin.String = author_example // kotlin.String | The name of the journalist or entity that authored the news article.
val authorAnyOf : kotlin.String = authorAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val authorGt : kotlin.String = authorGt_example // kotlin.String | Filter greater than the value.
val authorGte : kotlin.String = authorGte_example // kotlin.String | Filter greater than or equal to the value.
val authorLt : kotlin.String = authorLt_example // kotlin.String | Filter less than the value.
val authorLte : kotlin.String = authorLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'published' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetBenzingaV1News200Response = apiInstance.getBenzingaV1News(published, publishedAnyOf, publishedGt, publishedGte, publishedLt, publishedLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, tickers, tickersAllOf, tickersAnyOf, channels, channelsAllOf, channelsAnyOf, tags, tagsAllOf, tagsAnyOf, author, authorAnyOf, authorGt, authorGte, authorLt, authorLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV1News")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV1News")
    e.printStackTrace()
}
```

### Parameters
| **published** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the news article was originally published. | [optional] |
| **publishedAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **publishedGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **publishedGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **publishedLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **publishedLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **lastUpdated** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the news article was last updated in the system. | [optional] |
| **lastUpdatedAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **lastUpdatedGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **lastUpdatedGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **lastUpdatedLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **lastUpdatedLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **tickers** | **kotlin.String**| Filter for arrays that contain the value. | [optional] |
| **tickersAllOf** | **kotlin.String**| Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickersAnyOf** | **kotlin.String**| Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **channels** | **kotlin.String**| Filter for arrays that contain the value. | [optional] |
| **channelsAllOf** | **kotlin.String**| Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **channelsAnyOf** | **kotlin.String**| Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tags** | **kotlin.String**| Filter for arrays that contain the value. | [optional] |
| **tagsAllOf** | **kotlin.String**| Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tagsAnyOf** | **kotlin.String**| Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **author** | **kotlin.String**| The name of the journalist or entity that authored the news article. | [optional] |
| **authorAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **authorGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **authorGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **authorLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **authorLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;published&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;published.desc&quot;] |

### Return type

[**GetBenzingaV1News200Response**](GetBenzingaV1News200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV1Ratings"></a>
# **getBenzingaV1Ratings**
> GetBenzingaV1Ratings200Response getBenzingaV1Ratings(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, importance, importanceAnyOf, importanceGt, importanceGte, importanceLt, importanceLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, ratingAction, ratingActionAnyOf, ratingActionGt, ratingActionGte, ratingActionLt, ratingActionLte, priceTargetAction, priceTargetActionAnyOf, priceTargetActionGt, priceTargetActionGte, priceTargetActionLt, priceTargetActionLte, benzingaId, benzingaIdAnyOf, benzingaIdGt, benzingaIdGte, benzingaIdLt, benzingaIdLte, benzingaAnalystId, benzingaAnalystIdAnyOf, benzingaAnalystIdGt, benzingaAnalystIdGte, benzingaAnalystIdLt, benzingaAnalystIdLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | The calendar date (formatted as YYYY-MM-DD) when the rating was issued.
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val ticker : kotlin.String = ticker_example // kotlin.String | The stock symbol of the company being rated.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val importance : kotlin.Long = 789 // kotlin.Long | A subjective indicator of the importance of the earnings event, on a scale from 0 (lowest) to 5 (highest). Value must be an integer.
val importanceAnyOf : kotlin.String = importanceAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer.
val importanceGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val importanceGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val importanceLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val importanceLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system.
val lastUpdatedAnyOf : kotlin.String = lastUpdatedAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val lastUpdatedGt : kotlin.String = lastUpdatedGt_example // kotlin.String | Filter greater than the value.
val lastUpdatedGte : kotlin.String = lastUpdatedGte_example // kotlin.String | Filter greater than or equal to the value.
val lastUpdatedLt : kotlin.String = lastUpdatedLt_example // kotlin.String | Filter less than the value.
val lastUpdatedLte : kotlin.String = lastUpdatedLte_example // kotlin.String | Filter less than or equal to the value.
val ratingAction : kotlin.String = ratingAction_example // kotlin.String | The description of the change in rating from the firm's last rating. Possible values include: downgrades, maintains, reinstates, reiterates, upgrades, assumes, initiates_coverage_on, terminates_coverage_on, removes, suspends, firm_dissolved.
val ratingActionAnyOf : kotlin.String = ratingActionAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val ratingActionGt : kotlin.String = ratingActionGt_example // kotlin.String | Filter greater than the value.
val ratingActionGte : kotlin.String = ratingActionGte_example // kotlin.String | Filter greater than or equal to the value.
val ratingActionLt : kotlin.String = ratingActionLt_example // kotlin.String | Filter less than the value.
val ratingActionLte : kotlin.String = ratingActionLte_example // kotlin.String | Filter less than or equal to the value.
val priceTargetAction : kotlin.String = priceTargetAction_example // kotlin.String | The description of the directional change in price target. Possible values include: raises, lowers, maintains, announces, sets.
val priceTargetActionAnyOf : kotlin.String = priceTargetActionAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val priceTargetActionGt : kotlin.String = priceTargetActionGt_example // kotlin.String | Filter greater than the value.
val priceTargetActionGte : kotlin.String = priceTargetActionGte_example // kotlin.String | Filter greater than or equal to the value.
val priceTargetActionLt : kotlin.String = priceTargetActionLt_example // kotlin.String | Filter less than the value.
val priceTargetActionLte : kotlin.String = priceTargetActionLte_example // kotlin.String | Filter less than or equal to the value.
val benzingaId : kotlin.String = benzingaId_example // kotlin.String | The identifer used by Benzinga for this record.
val benzingaIdAnyOf : kotlin.String = benzingaIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaIdGt : kotlin.String = benzingaIdGt_example // kotlin.String | Filter greater than the value.
val benzingaIdGte : kotlin.String = benzingaIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaIdLt : kotlin.String = benzingaIdLt_example // kotlin.String | Filter less than the value.
val benzingaIdLte : kotlin.String = benzingaIdLte_example // kotlin.String | Filter less than or equal to the value.
val benzingaAnalystId : kotlin.String = benzingaAnalystId_example // kotlin.String | Filter equal to the value.
val benzingaAnalystIdAnyOf : kotlin.String = benzingaAnalystIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaAnalystIdGt : kotlin.String = benzingaAnalystIdGt_example // kotlin.String | Filter greater than the value.
val benzingaAnalystIdGte : kotlin.String = benzingaAnalystIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaAnalystIdLt : kotlin.String = benzingaAnalystIdLt_example // kotlin.String | Filter less than the value.
val benzingaAnalystIdLte : kotlin.String = benzingaAnalystIdLte_example // kotlin.String | Filter less than or equal to the value.
val benzingaFirmId : kotlin.String = benzingaFirmId_example // kotlin.String | Filter equal to the value.
val benzingaFirmIdAnyOf : kotlin.String = benzingaFirmIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaFirmIdGt : kotlin.String = benzingaFirmIdGt_example // kotlin.String | Filter greater than the value.
val benzingaFirmIdGte : kotlin.String = benzingaFirmIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaFirmIdLt : kotlin.String = benzingaFirmIdLt_example // kotlin.String | Filter less than the value.
val benzingaFirmIdLte : kotlin.String = benzingaFirmIdLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetBenzingaV1Ratings200Response = apiInstance.getBenzingaV1Ratings(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, importance, importanceAnyOf, importanceGt, importanceGte, importanceLt, importanceLte, lastUpdated, lastUpdatedAnyOf, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, ratingAction, ratingActionAnyOf, ratingActionGt, ratingActionGte, ratingActionLt, ratingActionLte, priceTargetAction, priceTargetActionAnyOf, priceTargetActionGt, priceTargetActionGte, priceTargetActionLt, priceTargetActionLte, benzingaId, benzingaIdAnyOf, benzingaIdGt, benzingaIdGte, benzingaIdLt, benzingaIdLte, benzingaAnalystId, benzingaAnalystIdAnyOf, benzingaAnalystIdGt, benzingaAnalystIdGte, benzingaAnalystIdLt, benzingaAnalystIdLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV1Ratings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV1Ratings")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| The calendar date (formatted as YYYY-MM-DD) when the rating was issued. | [optional] |
| **dateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ticker** | **kotlin.String**| The stock symbol of the company being rated. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **importance** | **kotlin.Long**| A subjective indicator of the importance of the earnings event, on a scale from 0 (lowest) to 5 (highest). Value must be an integer. | [optional] |
| **importanceAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer. | [optional] |
| **importanceGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **importanceGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **importanceLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **importanceLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **lastUpdated** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system. | [optional] |
| **lastUpdatedAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **lastUpdatedGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **lastUpdatedGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **lastUpdatedLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **lastUpdatedLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ratingAction** | **kotlin.String**| The description of the change in rating from the firm&#39;s last rating. Possible values include: downgrades, maintains, reinstates, reiterates, upgrades, assumes, initiates_coverage_on, terminates_coverage_on, removes, suspends, firm_dissolved. | [optional] |
| **ratingActionAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **ratingActionGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **ratingActionGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **ratingActionLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **ratingActionLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **priceTargetAction** | **kotlin.String**| The description of the directional change in price target. Possible values include: raises, lowers, maintains, announces, sets. | [optional] |
| **priceTargetActionAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **priceTargetActionGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **priceTargetActionGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **priceTargetActionLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **priceTargetActionLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **benzingaId** | **kotlin.String**| The identifer used by Benzinga for this record. | [optional] |
| **benzingaIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **benzingaAnalystId** | **kotlin.String**| Filter equal to the value. | [optional] |
| **benzingaAnalystIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaAnalystIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaAnalystIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaAnalystIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaAnalystIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **benzingaFirmId** | **kotlin.String**| Filter equal to the value. | [optional] |
| **benzingaFirmIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaFirmIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaFirmIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaFirmIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaFirmIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;date&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;date.desc&quot;] |

### Return type

[**GetBenzingaV1Ratings200Response**](GetBenzingaV1Ratings200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoAggregates"></a>
# **getCryptoAggregates**
> GetCryptoAggregates200Response getCryptoAggregates(cryptoTicker, multiplier, timespan, from, to, adjusted, sort, limit)

Aggregates (Bars)

Get aggregate bars for a cryptocurrency pair over a given date range in custom time window sizes. &lt;br /&gt; &lt;br /&gt; For example, if timespan &#x3D; ‘minute’ and multiplier &#x3D; ‘5’ then 5-minute bars will be returned. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cryptoTicker : kotlin.String = X:BTCUSD // kotlin.String | The ticker symbol of the currency pair.
val multiplier : kotlin.Int = 1 // kotlin.Int | The size of the timespan multiplier.
val timespan : kotlin.String = day // kotlin.String | The size of the time window.
val from : kotlin.String = 2023-01-09 // kotlin.String | The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val to : kotlin.String = 2023-02-10 // kotlin.String | The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
val sort : kotlin.String = asc // kotlin.String | Sort the results by timestamp. `asc` will return results in ascending order (oldest at the top), `desc` will return results in descending order (newest at the top). 
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://polygon.io/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
try {
    val result : GetCryptoAggregates200Response = apiInstance.getCryptoAggregates(cryptoTicker, multiplier, timespan, from, to, adjusted, sort, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoAggregates")
    e.printStackTrace()
}
```

### Parameters
| **cryptoTicker** | **kotlin.String**| The ticker symbol of the currency pair. | |
| **multiplier** | **kotlin.Int**| The size of the timespan multiplier. | |
| **timespan** | **kotlin.String**| The size of the time window. | [enum: second, minute, hour, day, week, month, quarter, year] |
| **from** | **kotlin.String**| The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **to** | **kotlin.String**| The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |
| **sort** | **kotlin.String**| Sort the results by timestamp. &#x60;asc&#x60; will return results in ascending order (oldest at the top), &#x60;desc&#x60; will return results in descending order (newest at the top).  | [optional] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://polygon.io/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

### Return type

[**GetCryptoAggregates200Response**](GetCryptoAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoEMA"></a>
# **getCryptoEMA**
> GetCryptoEMA200Response getCryptoEMA(cryptoTicker, timestamp, timespan, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Exponential Moving Average (EMA)

Get the exponential moving average (EMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cryptoTicker : kotlin.String = X:BTCUSD // kotlin.String | The ticker symbol for which to get exponential moving average (EMA) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the exponential moving average. i.e. 'close' will result in using close prices to  calculate the exponential moving average (EMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoEMA200Response = apiInstance.getCryptoEMA(cryptoTicker, timestamp, timespan, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoEMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoEMA")
    e.printStackTrace()
}
```

### Parameters
| **cryptoTicker** | **kotlin.String**| The ticker symbol for which to get exponential moving average (EMA) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **window** | **kotlin.Int**| The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the exponential moving average. i.e. &#39;close&#39; will result in using close prices to  calculate the exponential moving average (EMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoEMA200Response**](GetCryptoEMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoMACD"></a>
# **getCryptoMACD**
> GetCryptoMACD200Response getCryptoMACD(cryptoTicker, timestamp, timespan, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Moving Average Convergence/Divergence (MACD)

Get moving average convergence/divergence (MACD) data for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cryptoTicker : kotlin.String = X:BTCUSD // kotlin.String | The ticker symbol for which to get MACD data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val shortWindow : kotlin.Int = 12 // kotlin.Int | The short window size used to calculate MACD data.
val longWindow : kotlin.Int = 26 // kotlin.Int | The long window size used to calculate MACD data.
val signalWindow : kotlin.Int = 9 // kotlin.Int | The window size used to calculate the MACD signal line.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate MACD data. i.e. 'close' will result in using close prices to  calculate the MACD.
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoMACD200Response = apiInstance.getCryptoMACD(cryptoTicker, timestamp, timespan, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoMACD")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoMACD")
    e.printStackTrace()
}
```

### Parameters
| **cryptoTicker** | **kotlin.String**| The ticker symbol for which to get MACD data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **shortWindow** | **kotlin.Int**| The short window size used to calculate MACD data. | [optional] [default to 12] |
| **longWindow** | **kotlin.Int**| The long window size used to calculate MACD data. | [optional] [default to 26] |
| **signalWindow** | **kotlin.Int**| The window size used to calculate the MACD signal line. | [optional] [default to 9] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate MACD data. i.e. &#39;close&#39; will result in using close prices to  calculate the MACD. | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoMACD200Response**](GetCryptoMACD200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoOpenClose"></a>
# **getCryptoOpenClose**
> GetCryptoOpenClose200Response getCryptoOpenClose(from, to, date, adjusted)

Daily Open/Close

Get the open, close prices of a cryptocurrency symbol on a certain day. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val from : kotlin.String = BTC // kotlin.String | The \"from\" symbol of the pair.
val to : kotlin.String = USD // kotlin.String | The \"to\" symbol of the pair.
val date : java.time.LocalDate = 2023-01-09 // java.time.LocalDate | The date of the requested open/close in the format YYYY-MM-DD.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetCryptoOpenClose200Response = apiInstance.getCryptoOpenClose(from, to, date, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoOpenClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoOpenClose")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlin.String**| The \&quot;from\&quot; symbol of the pair. | |
| **to** | **kotlin.String**| The \&quot;to\&quot; symbol of the pair. | |
| **date** | **java.time.LocalDate**| The date of the requested open/close in the format YYYY-MM-DD. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetCryptoOpenClose200Response**](GetCryptoOpenClose200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoRSI"></a>
# **getCryptoRSI**
> GetCryptoRSI200Response getCryptoRSI(cryptoTicker, timestamp, timespan, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Relative Strength Index (RSI)

Get the relative strength index (RSI) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cryptoTicker : kotlin.String = X:BTCUSD // kotlin.String | The ticker symbol for which to get relative strength index (RSI) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val window : kotlin.Int = 14 // kotlin.Int | The window size used to calculate the relative strength index (RSI). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the relative strength index. i.e. 'close' will result in using close prices to  calculate the relative strength index (RSI).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoRSI200Response = apiInstance.getCryptoRSI(cryptoTicker, timestamp, timespan, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoRSI")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoRSI")
    e.printStackTrace()
}
```

### Parameters
| **cryptoTicker** | **kotlin.String**| The ticker symbol for which to get relative strength index (RSI) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **window** | **kotlin.Int**| The window size used to calculate the relative strength index (RSI). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 14] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the relative strength index. i.e. &#39;close&#39; will result in using close prices to  calculate the relative strength index (RSI). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoRSI200Response**](GetCryptoRSI200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoSMA"></a>
# **getCryptoSMA**
> GetCryptoSMA200Response getCryptoSMA(cryptoTicker, timestamp, timespan, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Simple Moving Average (SMA)

Get the simple moving average (SMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cryptoTicker : kotlin.String = X:BTCUSD // kotlin.String | The ticker symbol for which to get simple moving average (SMA) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the simple moving average. i.e. 'close' will result in using close prices to  calculate the simple moving average (SMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoSMA200Response = apiInstance.getCryptoSMA(cryptoTicker, timestamp, timespan, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoSMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoSMA")
    e.printStackTrace()
}
```

### Parameters
| **cryptoTicker** | **kotlin.String**| The ticker symbol for which to get simple moving average (SMA) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **window** | **kotlin.Int**| The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the simple moving average. i.e. &#39;close&#39; will result in using close prices to  calculate the simple moving average (SMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoSMA200Response**](GetCryptoSMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoSnapshotDirection"></a>
# **getCryptoSnapshotDirection**
> GetCryptoSnapshotDirection200Response getCryptoSnapshotDirection(direction)

Gainers/Losers

Get the current top 20 gainers or losers of the day in cryptocurrency markets. &lt;br /&gt; &lt;br /&gt; Top gainers are those tickers whose price has increased by the highest percentage since the previous day&#39;s close. Top losers are those tickers whose price has decreased by the highest percentage since the previous day&#39;s close. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 12am EST and gets populated as data is received from the exchanges. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val direction : kotlin.String = gainers // kotlin.String | The direction of the snapshot results to return. 
try {
    val result : GetCryptoSnapshotDirection200Response = apiInstance.getCryptoSnapshotDirection(direction)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoSnapshotDirection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoSnapshotDirection")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **direction** | **kotlin.String**| The direction of the snapshot results to return.  | [enum: gainers, losers] |

### Return type

[**GetCryptoSnapshotDirection200Response**](GetCryptoSnapshotDirection200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoSnapshotTicker"></a>
# **getCryptoSnapshotTicker**
> GetCryptoSnapshotTicker200Response getCryptoSnapshotTicker(ticker)

Ticker

Get the current minute, day, and previous day’s aggregate, as well as the last trade and quote for a single traded cryptocurrency symbol. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 12am EST and gets populated as data is received from the exchanges. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = X:BTCUSD // kotlin.String | Ticker of the snapshot
try {
    val result : GetCryptoSnapshotTicker200Response = apiInstance.getCryptoSnapshotTicker(ticker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoSnapshotTicker")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoSnapshotTicker")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ticker** | **kotlin.String**| Ticker of the snapshot | |

### Return type

[**GetCryptoSnapshotTicker200Response**](GetCryptoSnapshotTicker200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoSnapshotTickers"></a>
# **getCryptoSnapshotTickers**
> GetCryptoSnapshotTickers200Response getCryptoSnapshotTickers(tickers)

All Tickers

Get the current minute, day, and previous day’s aggregate, as well as the last trade and quote for all traded cryptocurrency symbols. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 12am EST and gets populated as data is received from the exchanges. This can happen as early as 4am EST. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val tickers : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A case-sensitive comma separated list of tickers to get snapshots for. For example, X:BTCUSD, X:ETHBTC, and X:BOBAUSD. Empty string defaults to querying all tickers.
try {
    val result : GetCryptoSnapshotTickers200Response = apiInstance.getCryptoSnapshotTickers(tickers)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoSnapshotTickers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoSnapshotTickers")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tickers** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A case-sensitive comma separated list of tickers to get snapshots for. For example, X:BTCUSD, X:ETHBTC, and X:BOBAUSD. Empty string defaults to querying all tickers. | [optional] |

### Return type

[**GetCryptoSnapshotTickers200Response**](GetCryptoSnapshotTickers200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCryptoTrades"></a>
# **getCryptoTrades**
> GetCryptoTrades200Response getCryptoTrades(cryptoTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)

Trades

Get trades for a crypto ticker symbol in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cryptoTicker : kotlin.String = X:BTC-USD // kotlin.String | The ticker symbol to get trades for.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp.
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 1000 and max is 50000.
val sort : kotlin.String = timestamp // kotlin.String | Sort field used for ordering.
try {
    val result : GetCryptoTrades200Response = apiInstance.getCryptoTrades(cryptoTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoTrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoTrades")
    e.printStackTrace()
}
```

### Parameters
| **cryptoTicker** | **kotlin.String**| The ticker symbol to get trades for. | |
| **timestamp** | **kotlin.String**| Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp. | [optional] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 1000 and max is 50000. | [optional] [default to 1000] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to timestamp] [enum: timestamp] |

### Return type

[**GetCryptoTrades200Response**](GetCryptoTrades200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurrencyConversion"></a>
# **getCurrencyConversion**
> GetCurrencyConversion200Response getCurrencyConversion(from, to, amount, precision)

Real-time Currency Conversion

Get currency conversions using the latest market conversion rates. Note than you can convert in both directions. For example USD to CAD or CAD to USD.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val from : kotlin.String = AUD // kotlin.String | The \"from\" symbol of the pair.
val to : kotlin.String = USD // kotlin.String | The \"to\" symbol of the pair.
val amount : java.math.BigDecimal = 100 // java.math.BigDecimal | The amount to convert, with a decimal.
val precision : kotlin.Int = 2 // kotlin.Int | The decimal precision of the conversion. Defaults to 2 which is 2 decimal places accuracy.
try {
    val result : GetCurrencyConversion200Response = apiInstance.getCurrencyConversion(from, to, amount, precision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCurrencyConversion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCurrencyConversion")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlin.String**| The \&quot;from\&quot; symbol of the pair. | |
| **to** | **kotlin.String**| The \&quot;to\&quot; symbol of the pair. | |
| **amount** | **java.math.BigDecimal**| The amount to convert, with a decimal. | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **precision** | **kotlin.Int**| The decimal precision of the conversion. Defaults to 2 which is 2 decimal places accuracy. | [optional] [default to 2] [enum: 0, 1, 2, 3, 4] |

### Return type

[**GetCurrencyConversion200Response**](GetCurrencyConversion200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEvents"></a>
# **getEvents**
> GetEvents200Response getEvents(id, types)

Ticker Events

Get a timeline of events for the entity associated with the given ticker, CUSIP, or Composite FIGI.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val id : kotlin.String = META // kotlin.String | Identifier of an asset. This can currently be a Ticker, CUSIP, or Composite FIGI. When given a ticker, we return events for the entity currently represented by that ticker. To find events for entities previously associated with a ticker, find the relevant identifier using the  [Ticker Details Endpoint](https://polygon.io/docs/stocks/get_v3_reference_tickers__ticker)
val types : kotlin.String = types_example // kotlin.String | A comma-separated list of the types of event to include. Currently ticker_change is the only supported event_type. Leave blank to return all supported event_types.
try {
    val result : GetEvents200Response = apiInstance.getEvents(id, types)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getEvents")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Identifier of an asset. This can currently be a Ticker, CUSIP, or Composite FIGI. When given a ticker, we return events for the entity currently represented by that ticker. To find events for entities previously associated with a ticker, find the relevant identifier using the  [Ticker Details Endpoint](https://polygon.io/docs/stocks/get_v3_reference_tickers__ticker) | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **types** | **kotlin.String**| A comma-separated list of the types of event to include. Currently ticker_change is the only supported event_type. Leave blank to return all supported event_types. | [optional] |

### Return type

[**GetEvents200Response**](GetEvents200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFedV1TreasuryYields"></a>
# **getFedV1TreasuryYields**
> GetFedV1TreasuryYields200Response getFedV1TreasuryYields(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | Calendar date of the yield observation (YYYY‑MM‑DD).
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetFedV1TreasuryYields200Response = apiInstance.getFedV1TreasuryYields(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFedV1TreasuryYields")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFedV1TreasuryYields")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| Calendar date of the yield observation (YYYY‑MM‑DD). | [optional] |
| **dateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;date&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;date.asc&quot;] |

### Return type

[**GetFedV1TreasuryYields200Response**](GetFedV1TreasuryYields200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexAggregates"></a>
# **getForexAggregates**
> GetCryptoAggregates200Response getForexAggregates(forexTicker, multiplier, timespan, from, to, adjusted, sort, limit)

Aggregates (Bars)

Get aggregate bars for a forex pair over a given date range in custom time window sizes. &lt;br /&gt; &lt;br /&gt; For example, if timespan &#x3D; ‘minute’ and multiplier &#x3D; ‘5’ then 5-minute bars will be returned. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val forexTicker : kotlin.String = C:EURUSD // kotlin.String | The ticker symbol of the currency pair.
val multiplier : kotlin.Int = 1 // kotlin.Int | The size of the timespan multiplier.
val timespan : kotlin.String = day // kotlin.String | The size of the time window.
val from : kotlin.String = 2023-01-09 // kotlin.String | The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val to : kotlin.String = 2023-02-10 // kotlin.String | The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
val sort : kotlin.String = asc // kotlin.String | Sort the results by timestamp. `asc` will return results in ascending order (oldest at the top), `desc` will return results in descending order (newest at the top). 
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://polygon.io/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
try {
    val result : GetCryptoAggregates200Response = apiInstance.getForexAggregates(forexTicker, multiplier, timespan, from, to, adjusted, sort, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexAggregates")
    e.printStackTrace()
}
```

### Parameters
| **forexTicker** | **kotlin.String**| The ticker symbol of the currency pair. | |
| **multiplier** | **kotlin.Int**| The size of the timespan multiplier. | |
| **timespan** | **kotlin.String**| The size of the time window. | [enum: second, minute, hour, day, week, month, quarter, year] |
| **from** | **kotlin.String**| The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **to** | **kotlin.String**| The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |
| **sort** | **kotlin.String**| Sort the results by timestamp. &#x60;asc&#x60; will return results in ascending order (oldest at the top), &#x60;desc&#x60; will return results in descending order (newest at the top).  | [optional] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://polygon.io/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

### Return type

[**GetCryptoAggregates200Response**](GetCryptoAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexEMA"></a>
# **getForexEMA**
> GetCryptoEMA200Response getForexEMA(fxTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Exponential Moving Average (EMA)

Get the exponential moving average (EMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val fxTicker : kotlin.String = C:EURUSD // kotlin.String | The ticker symbol for which to get exponential moving average (EMA) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the exponential moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the exponential moving average. i.e. 'close' will result in using close prices to  calculate the exponential moving average (EMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoEMA200Response = apiInstance.getForexEMA(fxTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexEMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexEMA")
    e.printStackTrace()
}
```

### Parameters
| **fxTicker** | **kotlin.String**| The ticker symbol for which to get exponential moving average (EMA) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the exponential moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the exponential moving average. i.e. &#39;close&#39; will result in using close prices to  calculate the exponential moving average (EMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoEMA200Response**](GetCryptoEMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexMACD"></a>
# **getForexMACD**
> GetCryptoMACD200Response getForexMACD(fxTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Moving Average Convergence/Divergence (MACD)

Get moving average convergence/divergence (MACD) data for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val fxTicker : kotlin.String = C:EURUSD // kotlin.String | The ticker symbol for which to get MACD data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the MACD are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val shortWindow : kotlin.Int = 12 // kotlin.Int | The short window size used to calculate MACD data.
val longWindow : kotlin.Int = 26 // kotlin.Int | The long window size used to calculate MACD data.
val signalWindow : kotlin.Int = 9 // kotlin.Int | The window size used to calculate the MACD signal line.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the MACD. i.e. 'close' will result in using close prices to  calculate the MACD.
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoMACD200Response = apiInstance.getForexMACD(fxTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexMACD")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexMACD")
    e.printStackTrace()
}
```

### Parameters
| **fxTicker** | **kotlin.String**| The ticker symbol for which to get MACD data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the MACD are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **shortWindow** | **kotlin.Int**| The short window size used to calculate MACD data. | [optional] [default to 12] |
| **longWindow** | **kotlin.Int**| The long window size used to calculate MACD data. | [optional] [default to 26] |
| **signalWindow** | **kotlin.Int**| The window size used to calculate the MACD signal line. | [optional] [default to 9] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the MACD. i.e. &#39;close&#39; will result in using close prices to  calculate the MACD. | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoMACD200Response**](GetCryptoMACD200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexQuotes"></a>
# **getForexQuotes**
> GetForexQuotes200Response getForexQuotes(fxTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)

Quotes (BBO)

Get BBO quotes for a ticker symbol in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val fxTicker : kotlin.String = C:EUR-USD // kotlin.String | The ticker symbol to get quotes for.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp.
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 1000 and max is 50000.
val sort : kotlin.String = timestamp // kotlin.String | Sort field used for ordering.
try {
    val result : GetForexQuotes200Response = apiInstance.getForexQuotes(fxTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexQuotes")
    e.printStackTrace()
}
```

### Parameters
| **fxTicker** | **kotlin.String**| The ticker symbol to get quotes for. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp. | [optional] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 1000 and max is 50000. | [optional] [default to 1000] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to timestamp] [enum: timestamp] |

### Return type

[**GetForexQuotes200Response**](GetForexQuotes200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexRSI"></a>
# **getForexRSI**
> GetCryptoRSI200Response getForexRSI(fxTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Relative Strength Index (RSI)

Get the relative strength index (RSI) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val fxTicker : kotlin.String = C:EURUSD // kotlin.String | The ticker symbol for which to get relative strength index (RSI) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the relative strength index are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 14 // kotlin.Int | The window size used to calculate the relative strength index (RSI).
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the relative strength index. i.e. 'close' will result in using close prices to  calculate the relative strength index (RSI).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoRSI200Response = apiInstance.getForexRSI(fxTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexRSI")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexRSI")
    e.printStackTrace()
}
```

### Parameters
| **fxTicker** | **kotlin.String**| The ticker symbol for which to get relative strength index (RSI) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the relative strength index are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the relative strength index (RSI). | [optional] [default to 14] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the relative strength index. i.e. &#39;close&#39; will result in using close prices to  calculate the relative strength index (RSI). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoRSI200Response**](GetCryptoRSI200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexSMA"></a>
# **getForexSMA**
> GetCryptoSMA200Response getForexSMA(fxTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Simple Moving Average (SMA)

Get the simple moving average (SMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val fxTicker : kotlin.String = C:EURUSD // kotlin.String | The ticker symbol for which to get simple moving average (SMA) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the simple moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the simple moving average. i.e. 'close' will result in using close prices to  calculate the simple moving average (SMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoSMA200Response = apiInstance.getForexSMA(fxTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexSMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexSMA")
    e.printStackTrace()
}
```

### Parameters
| **fxTicker** | **kotlin.String**| The ticker symbol for which to get simple moving average (SMA) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the simple moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the simple moving average. i.e. &#39;close&#39; will result in using close prices to  calculate the simple moving average (SMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoSMA200Response**](GetCryptoSMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexSnapshotDirection"></a>
# **getForexSnapshotDirection**
> GetForexSnapshotTickers200Response getForexSnapshotDirection(direction)

Gainers/Losers

Get the current top 20 gainers or losers of the day in forex markets. &lt;br /&gt; &lt;br /&gt; Top gainers are those tickers whose price has increased by the highest percentage since the previous day&#39;s close. Top losers are those tickers whose price has decreased by the highest percentage since the previous day&#39;s close. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 12am EST and gets populated as data is received from the exchanges. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val direction : kotlin.String = gainers // kotlin.String | The direction of the snapshot results to return. 
try {
    val result : GetForexSnapshotTickers200Response = apiInstance.getForexSnapshotDirection(direction)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexSnapshotDirection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexSnapshotDirection")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **direction** | **kotlin.String**| The direction of the snapshot results to return.  | [enum: gainers, losers] |

### Return type

[**GetForexSnapshotTickers200Response**](GetForexSnapshotTickers200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexSnapshotTicker"></a>
# **getForexSnapshotTicker**
> GetForexSnapshotTicker200Response getForexSnapshotTicker(ticker)

Ticker

Get the current minute, day, and previous day’s aggregate, as well as the last trade and quote for a single traded currency symbol. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 12am EST and gets populated as data is received from the exchanges. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = C:EURUSD // kotlin.String | The forex ticker.
try {
    val result : GetForexSnapshotTicker200Response = apiInstance.getForexSnapshotTicker(ticker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexSnapshotTicker")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexSnapshotTicker")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ticker** | **kotlin.String**| The forex ticker. | |

### Return type

[**GetForexSnapshotTicker200Response**](GetForexSnapshotTicker200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForexSnapshotTickers"></a>
# **getForexSnapshotTickers**
> GetForexSnapshotTickers200Response getForexSnapshotTickers(tickers)

All Tickers

Get the current minute, day, and previous day’s aggregate, as well as the last trade and quote for all traded forex symbols. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 12am EST and gets populated as data is received from the exchanges. This can happen as early as 4am EST. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val tickers : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A case-sensitive comma separated list of tickers to get snapshots for. For example, C:EURUSD, C:GBPCAD, and C:AUDINR. Empty string defaults to querying all tickers.
try {
    val result : GetForexSnapshotTickers200Response = apiInstance.getForexSnapshotTickers(tickers)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexSnapshotTickers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexSnapshotTickers")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tickers** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A case-sensitive comma separated list of tickers to get snapshots for. For example, C:EURUSD, C:GBPCAD, and C:AUDINR. Empty string defaults to querying all tickers. | [optional] |

### Return type

[**GetForexSnapshotTickers200Response**](GetForexSnapshotTickers200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGroupedCryptoAggregates"></a>
# **getGroupedCryptoAggregates**
> GetGroupedCryptoAggregates200Response getGroupedCryptoAggregates(date, adjusted)

Grouped Daily (Bars)

Get the daily open, high, low, and close (OHLC) for the entire cryptocurrency markets. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = 2023-01-09 // kotlin.String | The beginning date for the aggregate window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetGroupedCryptoAggregates200Response = apiInstance.getGroupedCryptoAggregates(date, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getGroupedCryptoAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getGroupedCryptoAggregates")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| The beginning date for the aggregate window. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetGroupedCryptoAggregates200Response**](GetGroupedCryptoAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGroupedForexAggregates"></a>
# **getGroupedForexAggregates**
> GetGroupedCryptoAggregates200Response getGroupedForexAggregates(date, adjusted)

Grouped Daily (Bars)

Get the daily open, high, low, and close (OHLC) for the entire forex markets. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = 2023-01-09 // kotlin.String | The beginning date for the aggregate window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetGroupedCryptoAggregates200Response = apiInstance.getGroupedForexAggregates(date, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getGroupedForexAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getGroupedForexAggregates")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| The beginning date for the aggregate window. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetGroupedCryptoAggregates200Response**](GetGroupedCryptoAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGroupedStocksAggregates"></a>
# **getGroupedStocksAggregates**
> GetGroupedStocksAggregates200Response getGroupedStocksAggregates(date, adjusted, includeOtc)

Grouped Daily (Bars)

Get the daily open, high, low, and close (OHLC) for the entire stocks/equities markets. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = 2023-01-09 // kotlin.String | The beginning date for the aggregate window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
val includeOtc : kotlin.Boolean = true // kotlin.Boolean | Include OTC securities in the response. Default is false (don't include OTC securities). 
try {
    val result : GetGroupedStocksAggregates200Response = apiInstance.getGroupedStocksAggregates(date, adjusted, includeOtc)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getGroupedStocksAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getGroupedStocksAggregates")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| The beginning date for the aggregate window. | |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeOtc** | **kotlin.Boolean**| Include OTC securities in the response. Default is false (don&#39;t include OTC securities).  | [optional] |

### Return type

[**GetGroupedStocksAggregates200Response**](GetGroupedStocksAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndicesAggregates"></a>
# **getIndicesAggregates**
> GetPreviousIndicesAggregates200Response getIndicesAggregates(indicesTicker, multiplier, timespan, from, to, sort, limit)

Aggregates (Bars)

Get aggregate bars for an index over a given date range in custom time window sizes. &lt;br /&gt; &lt;br /&gt; For example, if timespan &#x3D; ‘minute’ and multiplier &#x3D; ‘5’ then 5-minute bars will be returned. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val indicesTicker : kotlin.String = I:NDX // kotlin.String | The ticker symbol of Index.
val multiplier : kotlin.Int = 1 // kotlin.Int | The size of the timespan multiplier.
val timespan : kotlin.String = day // kotlin.String | The size of the time window.
val from : kotlin.String = 2023-03-13 // kotlin.String | The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val to : kotlin.String = 2023-03-24 // kotlin.String | The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val sort : kotlin.String = asc // kotlin.String | Sort the results by timestamp. `asc` will return results in ascending order (oldest at the top), `desc` will return results in descending order (newest at the top). 
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://polygon.io/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
try {
    val result : GetPreviousIndicesAggregates200Response = apiInstance.getIndicesAggregates(indicesTicker, multiplier, timespan, from, to, sort, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getIndicesAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getIndicesAggregates")
    e.printStackTrace()
}
```

### Parameters
| **indicesTicker** | **kotlin.String**| The ticker symbol of Index. | |
| **multiplier** | **kotlin.Int**| The size of the timespan multiplier. | |
| **timespan** | **kotlin.String**| The size of the time window. | [enum: second, minute, hour, day, week, month, quarter, year] |
| **from** | **kotlin.String**| The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **to** | **kotlin.String**| The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **sort** | **kotlin.String**| Sort the results by timestamp. &#x60;asc&#x60; will return results in ascending order (oldest at the top), &#x60;desc&#x60; will return results in descending order (newest at the top).  | [optional] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://polygon.io/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

### Return type

[**GetPreviousIndicesAggregates200Response**](GetPreviousIndicesAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndicesEMA"></a>
# **getIndicesEMA**
> GetCryptoEMA200Response getIndicesEMA(indicesTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Exponential Moving Average (EMA)

Get the exponential moving average (EMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val indicesTicker : kotlin.String = I:NDX // kotlin.String | The ticker symbol for which to get exponential moving average (EMA) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the exponential moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The value in the aggregate which will be used to calculate the exponential moving average. i.e. 'close' will result in using close values to  calculate the exponential moving average (EMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoEMA200Response = apiInstance.getIndicesEMA(indicesTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getIndicesEMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getIndicesEMA")
    e.printStackTrace()
}
```

### Parameters
| **indicesTicker** | **kotlin.String**| The ticker symbol for which to get exponential moving average (EMA) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the exponential moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The value in the aggregate which will be used to calculate the exponential moving average. i.e. &#39;close&#39; will result in using close values to  calculate the exponential moving average (EMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoEMA200Response**](GetCryptoEMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndicesMACD"></a>
# **getIndicesMACD**
> GetCryptoMACD200Response getIndicesMACD(indicesTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Moving Average Convergence/Divergence (MACD)

Get moving average convergence/divergence (MACD) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val indicesTicker : kotlin.String = I:NDX // kotlin.String | The ticker symbol for which to get MACD data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the MACD are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val shortWindow : kotlin.Int = 12 // kotlin.Int | The short window size used to calculate MACD data.
val longWindow : kotlin.Int = 26 // kotlin.Int | The long window size used to calculate MACD data.
val signalWindow : kotlin.Int = 9 // kotlin.Int | The window size used to calculate the MACD signal line.
val seriesType : kotlin.String = close // kotlin.String | The value in the aggregate which will be used to calculate the MACD. i.e. 'close' will result in using close values to  calculate the MACD.
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoMACD200Response = apiInstance.getIndicesMACD(indicesTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getIndicesMACD")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getIndicesMACD")
    e.printStackTrace()
}
```

### Parameters
| **indicesTicker** | **kotlin.String**| The ticker symbol for which to get MACD data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the MACD are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **shortWindow** | **kotlin.Int**| The short window size used to calculate MACD data. | [optional] [default to 12] |
| **longWindow** | **kotlin.Int**| The long window size used to calculate MACD data. | [optional] [default to 26] |
| **signalWindow** | **kotlin.Int**| The window size used to calculate the MACD signal line. | [optional] [default to 9] |
| **seriesType** | **kotlin.String**| The value in the aggregate which will be used to calculate the MACD. i.e. &#39;close&#39; will result in using close values to  calculate the MACD. | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoMACD200Response**](GetCryptoMACD200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndicesOpenClose"></a>
# **getIndicesOpenClose**
> GetIndicesOpenClose200Response getIndicesOpenClose(indicesTicker, date)

Daily Open/Close

Get the open, close and afterhours values of a index symbol on a certain date. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val indicesTicker : kotlin.String = I:NDX // kotlin.String | The ticker symbol of Index.
val date : kotlin.String = 2023-03-10 // kotlin.String | The date of the requested open/close in the format YYYY-MM-DD.
try {
    val result : GetIndicesOpenClose200Response = apiInstance.getIndicesOpenClose(indicesTicker, date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getIndicesOpenClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getIndicesOpenClose")
    e.printStackTrace()
}
```

### Parameters
| **indicesTicker** | **kotlin.String**| The ticker symbol of Index. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **date** | **kotlin.String**| The date of the requested open/close in the format YYYY-MM-DD. | |

### Return type

[**GetIndicesOpenClose200Response**](GetIndicesOpenClose200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndicesRSI"></a>
# **getIndicesRSI**
> GetCryptoRSI200Response getIndicesRSI(indicesTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Relative Strength Index (RSI)

Get the relative strength index (RSI) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val indicesTicker : kotlin.String = I:NDX // kotlin.String | The ticker symbol for which to get relative strength index (RSI) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the relative strength index are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 14 // kotlin.Int | The window size used to calculate the relative strength index (RSI).
val seriesType : kotlin.String = close // kotlin.String | The value in the aggregate which will be used to calculate the relative strength index. i.e. 'close' will result in using close values to  calculate the relative strength index (RSI).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoRSI200Response = apiInstance.getIndicesRSI(indicesTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getIndicesRSI")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getIndicesRSI")
    e.printStackTrace()
}
```

### Parameters
| **indicesTicker** | **kotlin.String**| The ticker symbol for which to get relative strength index (RSI) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the relative strength index are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the relative strength index (RSI). | [optional] [default to 14] |
| **seriesType** | **kotlin.String**| The value in the aggregate which will be used to calculate the relative strength index. i.e. &#39;close&#39; will result in using close values to  calculate the relative strength index (RSI). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoRSI200Response**](GetCryptoRSI200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndicesSMA"></a>
# **getIndicesSMA**
> GetCryptoSMA200Response getIndicesSMA(indicesTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Simple Moving Average (SMA)

Get the simple moving average (SMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val indicesTicker : kotlin.String = I:NDX // kotlin.String | The ticker symbol for which to get simple moving average (SMA) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the simple moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The value in the aggregate which will be used to calculate the simple moving average. i.e. 'close' will result in using close values to  calculate the simple moving average (SMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoSMA200Response = apiInstance.getIndicesSMA(indicesTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getIndicesSMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getIndicesSMA")
    e.printStackTrace()
}
```

### Parameters
| **indicesTicker** | **kotlin.String**| The ticker symbol for which to get simple moving average (SMA) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the simple moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The value in the aggregate which will be used to calculate the simple moving average. i.e. &#39;close&#39; will result in using close values to  calculate the simple moving average (SMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoSMA200Response**](GetCryptoSMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndicesSnapshot"></a>
# **getIndicesSnapshot**
> GetIndicesSnapshot200Response getIndicesSnapshot(tickerAnyOf, ticker, tickerGte, tickerGt, tickerLte, tickerLt, order, limit, sort)

Indices Snapshot

Get a Snapshot of indices data for said tickers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val tickerAnyOf : kotlin.String = I:DJI // kotlin.String | Comma separated list of tickers, up to a maximum of 250. If no tickers are passed then all results will be returned in a paginated manner.  Warning: The maximum number of characters allowed in a URL are subject to your technology stack.
val ticker : kotlin.String = ticker_example // kotlin.String | Search a range of tickers lexicographically.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Range by ticker.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Range by ticker.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Range by ticker.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Range by ticker.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 250.
val sort : kotlin.String = ticker // kotlin.String | Sort field used for ordering.
try {
    val result : GetIndicesSnapshot200Response = apiInstance.getIndicesSnapshot(tickerAnyOf, ticker, tickerGte, tickerGt, tickerLte, tickerLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getIndicesSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getIndicesSnapshot")
    e.printStackTrace()
}
```

### Parameters
| **tickerAnyOf** | **kotlin.String**| Comma separated list of tickers, up to a maximum of 250. If no tickers are passed then all results will be returned in a paginated manner.  Warning: The maximum number of characters allowed in a URL are subject to your technology stack. | [optional] |
| **ticker** | **kotlin.String**| Search a range of tickers lexicographically. | [optional] |
| **tickerGte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerGt** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLt** | **kotlin.String**| Range by ticker. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 250. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to ticker] [enum: ticker] |

### Return type

[**GetIndicesSnapshot200Response**](GetIndicesSnapshot200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLastCryptoTrade"></a>
# **getLastCryptoTrade**
> GetLastCryptoTrade200Response getLastCryptoTrade(from, to)

Last Trade for a Crypto Pair

Get the last trade tick for a cryptocurrency pair.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val from : kotlin.String = BTC // kotlin.String | The \"from\" symbol of the pair.
val to : kotlin.String = USD // kotlin.String | The \"to\" symbol of the pair.
try {
    val result : GetLastCryptoTrade200Response = apiInstance.getLastCryptoTrade(from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getLastCryptoTrade")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getLastCryptoTrade")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlin.String**| The \&quot;from\&quot; symbol of the pair. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **to** | **kotlin.String**| The \&quot;to\&quot; symbol of the pair. | |

### Return type

[**GetLastCryptoTrade200Response**](GetLastCryptoTrade200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLastCurrencyQuote"></a>
# **getLastCurrencyQuote**
> GetLastCurrencyQuote200Response getLastCurrencyQuote(from, to)

Last Quote for a Currency Pair

Get the last quote tick for a forex currency pair.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val from : kotlin.String = AUD // kotlin.String | The \"from\" symbol of the pair.
val to : kotlin.String = USD // kotlin.String | The \"to\" symbol of the pair.
try {
    val result : GetLastCurrencyQuote200Response = apiInstance.getLastCurrencyQuote(from, to)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getLastCurrencyQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getLastCurrencyQuote")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlin.String**| The \&quot;from\&quot; symbol of the pair. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **to** | **kotlin.String**| The \&quot;to\&quot; symbol of the pair. | |

### Return type

[**GetLastCurrencyQuote200Response**](GetLastCurrencyQuote200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLastOptionsTrade"></a>
# **getLastOptionsTrade**
> GetLastOptionsTrade200Response getLastOptionsTrade(optionsTicker)

Last Trade

Get the most recent trade for a given options contract.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:TSLA210903C00700000 // kotlin.String | The ticker symbol of the options contract.
try {
    val result : GetLastOptionsTrade200Response = apiInstance.getLastOptionsTrade(optionsTicker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getLastOptionsTrade")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getLastOptionsTrade")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionsTicker** | **kotlin.String**| The ticker symbol of the options contract. | |

### Return type

[**GetLastOptionsTrade200Response**](GetLastOptionsTrade200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLastStocksQuote"></a>
# **getLastStocksQuote**
> GetLastStocksQuote200Response getLastStocksQuote(stocksTicker)

Last Quote

Get the most recent NBBO (Quote) tick for a given stock.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stocksTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
try {
    val result : GetLastStocksQuote200Response = apiInstance.getLastStocksQuote(stocksTicker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getLastStocksQuote")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getLastStocksQuote")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stocksTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |

### Return type

[**GetLastStocksQuote200Response**](GetLastStocksQuote200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLastStocksTrade"></a>
# **getLastStocksTrade**
> GetLastOptionsTrade200Response getLastStocksTrade(stocksTicker)

Last Trade

Get the most recent trade for a given stock.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stocksTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
try {
    val result : GetLastOptionsTrade200Response = apiInstance.getLastStocksTrade(stocksTicker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getLastStocksTrade")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getLastStocksTrade")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stocksTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |

### Return type

[**GetLastOptionsTrade200Response**](GetLastOptionsTrade200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketHolidays"></a>
# **getMarketHolidays**
> kotlin.collections.List&lt;GetMarketHolidays200ResponseInner&gt; getMarketHolidays()

Market Holidays

Get upcoming market holidays and their open/close times.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<GetMarketHolidays200ResponseInner> = apiInstance.getMarketHolidays()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMarketHolidays")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMarketHolidays")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetMarketHolidays200ResponseInner&gt;**](GetMarketHolidays200ResponseInner.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketStatus"></a>
# **getMarketStatus**
> GetMarketStatus200Response getMarketStatus()

Market Status

Get the current trading status of the exchanges and overall financial markets.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : GetMarketStatus200Response = apiInstance.getMarketStatus()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getMarketStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getMarketStatus")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMarketStatus200Response**](GetMarketStatus200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionContract"></a>
# **getOptionContract**
> GetOptionContract200Response getOptionContract(underlyingAsset, optionContract)

Option Contract

Get the snapshot of an option contract for a stock equity.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val underlyingAsset : kotlin.String = EVRI // kotlin.String | The underlying ticker symbol of the option contract.
val optionContract : kotlin.String = O:EVRI260116C00015000 // kotlin.String | The option contract identifier.
try {
    val result : GetOptionContract200Response = apiInstance.getOptionContract(underlyingAsset, optionContract)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionContract")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionContract")
    e.printStackTrace()
}
```

### Parameters
| **underlyingAsset** | **kotlin.String**| The underlying ticker symbol of the option contract. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionContract** | **kotlin.String**| The option contract identifier. | |

### Return type

[**GetOptionContract200Response**](GetOptionContract200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsAggregates"></a>
# **getOptionsAggregates**
> GetCryptoAggregates200Response getOptionsAggregates(optionsTicker, multiplier, timespan, from, to, adjusted, sort, limit)

Aggregates (Bars)

Get aggregate bars for an option contract over a given date range in custom time window sizes. &lt;br /&gt; &lt;br /&gt; For example, if timespan &#x3D; ‘minute’ and multiplier &#x3D; ‘5’ then 5-minute bars will be returned. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY251219C00650000 // kotlin.String | The ticker symbol of the options contract.
val multiplier : kotlin.Int = 1 // kotlin.Int | The size of the timespan multiplier.
val timespan : kotlin.String = day // kotlin.String | The size of the time window.
val from : kotlin.String = 2023-01-09 // kotlin.String | The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val to : kotlin.String = 2023-02-10 // kotlin.String | The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
val sort : kotlin.String = asc // kotlin.String | Sort the results by timestamp. `asc` will return results in ascending order (oldest at the top), `desc` will return results in descending order (newest at the top). 
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://polygon.io/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
try {
    val result : GetCryptoAggregates200Response = apiInstance.getOptionsAggregates(optionsTicker, multiplier, timespan, from, to, adjusted, sort, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsAggregates")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The ticker symbol of the options contract. | |
| **multiplier** | **kotlin.Int**| The size of the timespan multiplier. | |
| **timespan** | **kotlin.String**| The size of the time window. | [enum: second, minute, hour, day, week, month, quarter, year] |
| **from** | **kotlin.String**| The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **to** | **kotlin.String**| The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |
| **sort** | **kotlin.String**| Sort the results by timestamp. &#x60;asc&#x60; will return results in ascending order (oldest at the top), &#x60;desc&#x60; will return results in descending order (newest at the top).  | [optional] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://polygon.io/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

### Return type

[**GetCryptoAggregates200Response**](GetCryptoAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsChain"></a>
# **getOptionsChain**
> GetOptionsChain200Response getOptionsChain(underlyingAsset, strikePrice, expirationDate, contractType, strikePriceGte, strikePriceGt, strikePriceLte, strikePriceLt, expirationDateGte, expirationDateGt, expirationDateLte, expirationDateLt, order, limit, sort)

Options Chain

Get the snapshot of all options contracts for an underlying ticker.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val underlyingAsset : kotlin.String = EVRI // kotlin.String | The underlying ticker symbol of the option contract.
val strikePrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Query by strike price of a contract.
val expirationDate : kotlin.String = expirationDate_example // kotlin.String | Query by contract expiration with date format YYYY-MM-DD.
val contractType : kotlin.String = contractType_example // kotlin.String | Query by the type of contract.
val strikePriceGte : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by strike_price.
val strikePriceGt : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by strike_price.
val strikePriceLte : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by strike_price.
val strikePriceLt : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by strike_price.
val expirationDateGte : kotlin.String = expirationDateGte_example // kotlin.String | Range by expiration_date.
val expirationDateGt : kotlin.String = expirationDateGt_example // kotlin.String | Range by expiration_date.
val expirationDateLte : kotlin.String = expirationDateLte_example // kotlin.String | Range by expiration_date.
val expirationDateLt : kotlin.String = expirationDateLt_example // kotlin.String | Range by expiration_date.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 250.
val sort : kotlin.String = ticker // kotlin.String | Sort field used for ordering.
try {
    val result : GetOptionsChain200Response = apiInstance.getOptionsChain(underlyingAsset, strikePrice, expirationDate, contractType, strikePriceGte, strikePriceGt, strikePriceLte, strikePriceLt, expirationDateGte, expirationDateGt, expirationDateLte, expirationDateLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsChain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsChain")
    e.printStackTrace()
}
```

### Parameters
| **underlyingAsset** | **kotlin.String**| The underlying ticker symbol of the option contract. | |
| **strikePrice** | **java.math.BigDecimal**| Query by strike price of a contract. | [optional] |
| **expirationDate** | **kotlin.String**| Query by contract expiration with date format YYYY-MM-DD. | [optional] |
| **contractType** | **kotlin.String**| Query by the type of contract. | [optional] [enum: call, put] |
| **strikePriceGte** | **java.math.BigDecimal**| Range by strike_price. | [optional] |
| **strikePriceGt** | **java.math.BigDecimal**| Range by strike_price. | [optional] |
| **strikePriceLte** | **java.math.BigDecimal**| Range by strike_price. | [optional] |
| **strikePriceLt** | **java.math.BigDecimal**| Range by strike_price. | [optional] |
| **expirationDateGte** | **kotlin.String**| Range by expiration_date. | [optional] |
| **expirationDateGt** | **kotlin.String**| Range by expiration_date. | [optional] |
| **expirationDateLte** | **kotlin.String**| Range by expiration_date. | [optional] |
| **expirationDateLt** | **kotlin.String**| Range by expiration_date. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 250. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to ticker] [enum: ticker, expiration_date, strike_price] |

### Return type

[**GetOptionsChain200Response**](GetOptionsChain200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsContract"></a>
# **getOptionsContract**
> GetOptionsContract200Response getOptionsContract(optionsTicker, asOf)

Options Contract

Get an options contract

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY251219C00650000 // kotlin.String | Query for a contract by options ticker. You can learn more about the structure of options tickers [here](https://polygon.io/blog/how-to-read-a-stock-options-ticker/).
val asOf : kotlin.String = asOf_example // kotlin.String | Specify a point in time for the contract as of this date with format YYYY-MM-DD. Defaults to today's date.
try {
    val result : GetOptionsContract200Response = apiInstance.getOptionsContract(optionsTicker, asOf)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsContract")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsContract")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| Query for a contract by options ticker. You can learn more about the structure of options tickers [here](https://polygon.io/blog/how-to-read-a-stock-options-ticker/). | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **asOf** | **kotlin.String**| Specify a point in time for the contract as of this date with format YYYY-MM-DD. Defaults to today&#39;s date. | [optional] |

### Return type

[**GetOptionsContract200Response**](GetOptionsContract200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsEMA"></a>
# **getOptionsEMA**
> GetCryptoEMA200Response getOptionsEMA(optionsTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Exponential Moving Average (EMA)

Get the exponential moving average (EMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY241220P00720000 // kotlin.String | The ticker symbol for which to get exponential moving average (EMA) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the exponential moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the exponential moving average. i.e. 'close' will result in using close prices to  calculate the exponential moving average (EMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoEMA200Response = apiInstance.getOptionsEMA(optionsTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsEMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsEMA")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The ticker symbol for which to get exponential moving average (EMA) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the exponential moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the exponential moving average. i.e. &#39;close&#39; will result in using close prices to  calculate the exponential moving average (EMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoEMA200Response**](GetCryptoEMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsMACD"></a>
# **getOptionsMACD**
> GetCryptoMACD200Response getOptionsMACD(optionsTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Moving Average Convergence/Divergence (MACD)

Get moving average convergence/divergence (MACD) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY241220P00720000 // kotlin.String | The ticker symbol for which to get MACD data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the MACD are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val shortWindow : kotlin.Int = 12 // kotlin.Int | The short window size used to calculate MACD data.
val longWindow : kotlin.Int = 26 // kotlin.Int | The long window size used to calculate MACD data.
val signalWindow : kotlin.Int = 9 // kotlin.Int | The window size used to calculate the MACD signal line.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the MACD. i.e. 'close' will result in using close prices to  calculate the MACD.
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoMACD200Response = apiInstance.getOptionsMACD(optionsTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsMACD")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsMACD")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The ticker symbol for which to get MACD data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the MACD are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **shortWindow** | **kotlin.Int**| The short window size used to calculate MACD data. | [optional] [default to 12] |
| **longWindow** | **kotlin.Int**| The long window size used to calculate MACD data. | [optional] [default to 26] |
| **signalWindow** | **kotlin.Int**| The window size used to calculate the MACD signal line. | [optional] [default to 9] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the MACD. i.e. &#39;close&#39; will result in using close prices to  calculate the MACD. | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoMACD200Response**](GetCryptoMACD200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsOpenClose"></a>
# **getOptionsOpenClose**
> GetOptionsOpenClose200Response getOptionsOpenClose(optionsTicker, date, adjusted)

Daily Open/Close

Get the open, close and afterhours prices of an options contract on a certain date. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY251219C00650000 // kotlin.String | The ticker symbol of the options contract.
val date : java.time.LocalDate = 2023-01-09 // java.time.LocalDate | The date of the requested open/close in the format YYYY-MM-DD.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetOptionsOpenClose200Response = apiInstance.getOptionsOpenClose(optionsTicker, date, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsOpenClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsOpenClose")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The ticker symbol of the options contract. | |
| **date** | **java.time.LocalDate**| The date of the requested open/close in the format YYYY-MM-DD. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetOptionsOpenClose200Response**](GetOptionsOpenClose200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsQuotes"></a>
# **getOptionsQuotes**
> GetOptionsQuotes200Response getOptionsQuotes(optionsTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)

Quotes

Get quotes for an options ticker symbol in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY241220P00720000 // kotlin.String | The ticker symbol to get quotes for.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp.
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 1000 and max is 50000.
val sort : kotlin.String = timestamp // kotlin.String | Sort field used for ordering.
try {
    val result : GetOptionsQuotes200Response = apiInstance.getOptionsQuotes(optionsTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsQuotes")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The ticker symbol to get quotes for. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp. | [optional] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 1000 and max is 50000. | [optional] [default to 1000] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to timestamp] [enum: timestamp] |

### Return type

[**GetOptionsQuotes200Response**](GetOptionsQuotes200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsRSI"></a>
# **getOptionsRSI**
> GetCryptoRSI200Response getOptionsRSI(optionsTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Relative Strength Index (RSI)

Get the relative strength index (RSI) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY241220P00720000 // kotlin.String | The ticker symbol for which to get relative strength index (RSI) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the relative strength index are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 14 // kotlin.Int | The window size used to calculate the relative strength index (RSI).
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the relative strength index. i.e. 'close' will result in using close prices to  calculate the relative strength index (RSI).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoRSI200Response = apiInstance.getOptionsRSI(optionsTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsRSI")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsRSI")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The ticker symbol for which to get relative strength index (RSI) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the relative strength index are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the relative strength index (RSI). | [optional] [default to 14] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the relative strength index. i.e. &#39;close&#39; will result in using close prices to  calculate the relative strength index (RSI). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoRSI200Response**](GetCryptoRSI200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsSMA"></a>
# **getOptionsSMA**
> GetCryptoSMA200Response getOptionsSMA(optionsTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Simple Moving Average (SMA)

Get the simple moving average (SMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY241220P00720000 // kotlin.String | The ticker symbol for which to get simple moving average (SMA) data.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the simple moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the simple moving average. i.e. 'close' will result in using close prices to  calculate the simple moving average (SMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoSMA200Response = apiInstance.getOptionsSMA(optionsTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsSMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsSMA")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The ticker symbol for which to get simple moving average (SMA) data. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the simple moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the simple moving average. i.e. &#39;close&#39; will result in using close prices to  calculate the simple moving average (SMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoSMA200Response**](GetCryptoSMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOptionsTrades"></a>
# **getOptionsTrades**
> GetOptionsTrades200Response getOptionsTrades(optionsTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)

Trades

Get trades for an options ticker symbol in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:TSLA210903C00700000 // kotlin.String | The options ticker symbol to get trades for.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp.
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 1000 and max is 50000.
val sort : kotlin.String = timestamp // kotlin.String | Sort field used for ordering.
try {
    val result : GetOptionsTrades200Response = apiInstance.getOptionsTrades(optionsTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsTrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsTrades")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The options ticker symbol to get trades for. | |
| **timestamp** | **kotlin.String**| Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp. | [optional] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 1000 and max is 50000. | [optional] [default to 1000] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to timestamp] [enum: timestamp] |

### Return type

[**GetOptionsTrades200Response**](GetOptionsTrades200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPreviousCryptoAggregates"></a>
# **getPreviousCryptoAggregates**
> GetPreviousCryptoAggregates200Response getPreviousCryptoAggregates(cryptoTicker, adjusted)

Previous Close

Get the previous day&#39;s open, high, low, and close (OHLC) for the specified cryptocurrency pair. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cryptoTicker : kotlin.String = X:BTCUSD // kotlin.String | The ticker symbol of the currency pair.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetPreviousCryptoAggregates200Response = apiInstance.getPreviousCryptoAggregates(cryptoTicker, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getPreviousCryptoAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getPreviousCryptoAggregates")
    e.printStackTrace()
}
```

### Parameters
| **cryptoTicker** | **kotlin.String**| The ticker symbol of the currency pair. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetPreviousCryptoAggregates200Response**](GetPreviousCryptoAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPreviousForexAggregates"></a>
# **getPreviousForexAggregates**
> GetPreviousForexAggregates200Response getPreviousForexAggregates(forexTicker, adjusted)

Previous Close

Get the previous day&#39;s open, high, low, and close (OHLC) for the specified forex pair. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val forexTicker : kotlin.String = C:EURUSD // kotlin.String | The ticker symbol of the currency pair.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetPreviousForexAggregates200Response = apiInstance.getPreviousForexAggregates(forexTicker, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getPreviousForexAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getPreviousForexAggregates")
    e.printStackTrace()
}
```

### Parameters
| **forexTicker** | **kotlin.String**| The ticker symbol of the currency pair. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetPreviousForexAggregates200Response**](GetPreviousForexAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPreviousIndicesAggregates"></a>
# **getPreviousIndicesAggregates**
> GetPreviousIndicesAggregates200Response getPreviousIndicesAggregates(indicesTicker)

Previous Close

Get the previous day&#39;s open, high, low, and close (OHLC) for the specified index. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val indicesTicker : kotlin.String = I:NDX // kotlin.String | The ticker symbol of Index.
try {
    val result : GetPreviousIndicesAggregates200Response = apiInstance.getPreviousIndicesAggregates(indicesTicker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getPreviousIndicesAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getPreviousIndicesAggregates")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **indicesTicker** | **kotlin.String**| The ticker symbol of Index. | |

### Return type

[**GetPreviousIndicesAggregates200Response**](GetPreviousIndicesAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPreviousOptionsAggregates"></a>
# **getPreviousOptionsAggregates**
> GetCryptoAggregates200Response getPreviousOptionsAggregates(optionsTicker, adjusted)

Previous Close

Get the previous day&#39;s open, high, low, and close (OHLC) for the specified option contract. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val optionsTicker : kotlin.String = O:SPY251219C00650000 // kotlin.String | The ticker symbol of the options contract.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetCryptoAggregates200Response = apiInstance.getPreviousOptionsAggregates(optionsTicker, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getPreviousOptionsAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getPreviousOptionsAggregates")
    e.printStackTrace()
}
```

### Parameters
| **optionsTicker** | **kotlin.String**| The ticker symbol of the options contract. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetCryptoAggregates200Response**](GetCryptoAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPreviousStocksAggregates"></a>
# **getPreviousStocksAggregates**
> GetCryptoAggregates200Response getPreviousStocksAggregates(stocksTicker, adjusted)

Previous Close

Get the previous day&#39;s open, high, low, and close (OHLC) for the specified stock ticker. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stocksTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetCryptoAggregates200Response = apiInstance.getPreviousStocksAggregates(stocksTicker, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getPreviousStocksAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getPreviousStocksAggregates")
    e.printStackTrace()
}
```

### Parameters
| **stocksTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetCryptoAggregates200Response**](GetCryptoAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRelatedCompanies"></a>
# **getRelatedCompanies**
> GetRelatedCompanies200Response getRelatedCompanies(ticker)

Related Companies

Get a list of tickers related to the queried ticker based on News and Returns data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = AAPL // kotlin.String | The ticker symbol to search.
try {
    val result : GetRelatedCompanies200Response = apiInstance.getRelatedCompanies(ticker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getRelatedCompanies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getRelatedCompanies")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ticker** | **kotlin.String**| The ticker symbol to search. | |

### Return type

[**GetRelatedCompanies200Response**](GetRelatedCompanies200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSnapshotSummary"></a>
# **getSnapshotSummary**
> GetSnapshotSummary200Response getSnapshotSummary(tickerAnyOf)

Summaries

Get everything needed to visualize the tick-by-tick movement of a list of tickers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val tickerAnyOf : kotlin.String = NCLH,O:SPY250321C00380000,C:EURUSD,X:BTCUSD // kotlin.String | Comma separated list of tickers. This API currently supports Stocks/Equities, Crypto, Options, and Forex. See <a rel=\"nofollow\" target=\"_blank\" href=\"https://polygon.io/docs/stocks/get_v3_reference_tickers\">the tickers endpoint</a> for more details on supported tickers. If no tickers are passed then no results will be returned.  Warning: The maximum number of characters allowed in a URL are subject to your technology stack.
try {
    val result : GetSnapshotSummary200Response = apiInstance.getSnapshotSummary(tickerAnyOf)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getSnapshotSummary")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getSnapshotSummary")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tickerAnyOf** | **kotlin.String**| Comma separated list of tickers. This API currently supports Stocks/Equities, Crypto, Options, and Forex. See &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://polygon.io/docs/stocks/get_v3_reference_tickers\&quot;&gt;the tickers endpoint&lt;/a&gt; for more details on supported tickers. If no tickers are passed then no results will be returned.  Warning: The maximum number of characters allowed in a URL are subject to your technology stack. | [optional] |

### Return type

[**GetSnapshotSummary200Response**](GetSnapshotSummary200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSnapshots"></a>
# **getSnapshots**
> GetSnapshots200Response getSnapshots(ticker, type, tickerGte, tickerGt, tickerLte, tickerLt, tickerAnyOf, order, limit, sort)

Universal Snapshot

Get snapshots for assets of all types

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Search a range of tickers lexicographically.
val type : kotlin.String = type_example // kotlin.String | Query by the type of asset.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Range by ticker.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Range by ticker.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Range by ticker.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Range by ticker.
val tickerAnyOf : kotlin.String = NCLH,O:SPY250321C00380000,C:EURUSD,X:BTCUSD,I:SPX // kotlin.String | Comma separated list of tickers, up to a maximum of 250. If no tickers are passed then all results will be returned in a paginated manner.  Warning: The maximum number of characters allowed in a URL are subject to your technology stack. 
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 250.
val sort : kotlin.String = ticker // kotlin.String | Sort field used for ordering.
try {
    val result : GetSnapshots200Response = apiInstance.getSnapshots(ticker, type, tickerGte, tickerGt, tickerLte, tickerLt, tickerAnyOf, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getSnapshots")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getSnapshots")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Search a range of tickers lexicographically. | [optional] |
| **type** | **kotlin.String**| Query by the type of asset. | [optional] [enum: stocks, options, crypto, fx, indices] |
| **tickerGte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerGt** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLt** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Comma separated list of tickers, up to a maximum of 250. If no tickers are passed then all results will be returned in a paginated manner.  Warning: The maximum number of characters allowed in a URL are subject to your technology stack.  | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 250. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to ticker] [enum: ticker] |

### Return type

[**GetSnapshots200Response**](GetSnapshots200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksAggregates"></a>
# **getStocksAggregates**
> GetStocksAggregates200Response getStocksAggregates(stocksTicker, multiplier, timespan, from, to, adjusted, sort, limit)

Aggregates (Bars)

Get aggregate bars for a stock over a given date range in custom time window sizes. &lt;br /&gt; &lt;br /&gt; For example, if timespan &#x3D; ‘minute’ and multiplier &#x3D; ‘5’ then 5-minute bars will be returned. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stocksTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
val multiplier : kotlin.Int = 1 // kotlin.Int | The size of the timespan multiplier.
val timespan : kotlin.String = day // kotlin.String | The size of the time window.
val from : kotlin.String = 2023-01-09 // kotlin.String | The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val to : kotlin.String = 2023-02-10 // kotlin.String | The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
val sort : kotlin.String = asc // kotlin.String | Sort the results by timestamp. `asc` will return results in ascending order (oldest at the top), `desc` will return results in descending order (newest at the top). 
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://polygon.io/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
try {
    val result : GetStocksAggregates200Response = apiInstance.getStocksAggregates(stocksTicker, multiplier, timespan, from, to, adjusted, sort, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksAggregates")
    e.printStackTrace()
}
```

### Parameters
| **stocksTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |
| **multiplier** | **kotlin.Int**| The size of the timespan multiplier. | |
| **timespan** | **kotlin.String**| The size of the time window. | [enum: second, minute, hour, day, week, month, quarter, year] |
| **from** | **kotlin.String**| The start of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **to** | **kotlin.String**| The end of the aggregate time window. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |
| **sort** | **kotlin.String**| Sort the results by timestamp. &#x60;asc&#x60; will return results in ascending order (oldest at the top), &#x60;desc&#x60; will return results in descending order (newest at the top).  | [optional] [enum: asc, desc] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://polygon.io/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

### Return type

[**GetStocksAggregates200Response**](GetStocksAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksEMA"></a>
# **getStocksEMA**
> GetCryptoEMA200Response getStocksEMA(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Exponential Moving Average (EMA)

Get the exponential moving average (EMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stockTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol for which to get exponential moving average (EMA) data. For example, AAPL represents Apple Inc.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the exponential moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the exponential moving average. i.e. 'close' will result in using close prices to  calculate the exponential moving average (EMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoEMA200Response = apiInstance.getStocksEMA(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksEMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksEMA")
    e.printStackTrace()
}
```

### Parameters
| **stockTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol for which to get exponential moving average (EMA) data. For example, AAPL represents Apple Inc. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the exponential moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the exponential moving average (EMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the exponential moving average. i.e. &#39;close&#39; will result in using close prices to  calculate the exponential moving average (EMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoEMA200Response**](GetCryptoEMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksMACD"></a>
# **getStocksMACD**
> GetCryptoMACD200Response getStocksMACD(stockTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Moving Average Convergence/Divergence (MACD)

Get moving average convergence/divergence (MACD) data for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stockTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol for which to get moving average convergence/divergence (MACD) data. For example, AAPL represents Apple Inc.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the MACD are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val shortWindow : kotlin.Int = 12 // kotlin.Int | The short window size used to calculate MACD data.
val longWindow : kotlin.Int = 26 // kotlin.Int | The long window size used to calculate MACD data.
val signalWindow : kotlin.Int = 9 // kotlin.Int | The window size used to calculate the MACD signal line.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the MACD. i.e. 'close' will result in using close prices to  calculate the MACD.
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoMACD200Response = apiInstance.getStocksMACD(stockTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksMACD")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksMACD")
    e.printStackTrace()
}
```

### Parameters
| **stockTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol for which to get moving average convergence/divergence (MACD) data. For example, AAPL represents Apple Inc. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the MACD are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **shortWindow** | **kotlin.Int**| The short window size used to calculate MACD data. | [optional] [default to 12] |
| **longWindow** | **kotlin.Int**| The long window size used to calculate MACD data. | [optional] [default to 26] |
| **signalWindow** | **kotlin.Int**| The window size used to calculate the MACD signal line. | [optional] [default to 9] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the MACD. i.e. &#39;close&#39; will result in using close prices to  calculate the MACD. | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoMACD200Response**](GetCryptoMACD200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksOpenClose"></a>
# **getStocksOpenClose**
> GetOptionsOpenClose200Response getStocksOpenClose(stocksTicker, date, adjusted)

Daily Open/Close

Get the open, close and afterhours prices of a stock symbol on a certain date. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stocksTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
val date : java.time.LocalDate = 2023-01-09 // java.time.LocalDate | The date of the requested open/close in the format YYYY-MM-DD.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits. 
try {
    val result : GetOptionsOpenClose200Response = apiInstance.getStocksOpenClose(stocksTicker, date, adjusted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksOpenClose")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksOpenClose")
    e.printStackTrace()
}
```

### Parameters
| **stocksTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |
| **date** | **java.time.LocalDate**| The date of the requested open/close in the format YYYY-MM-DD. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adjusted** | **kotlin.Boolean**| Whether or not the results are adjusted for splits.  By default, results are adjusted. Set this to false to get results that are NOT adjusted for splits.  | [optional] |

### Return type

[**GetOptionsOpenClose200Response**](GetOptionsOpenClose200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksQuotes"></a>
# **getStocksQuotes**
> GetStocksQuotes200Response getStocksQuotes(stockTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)

Quotes (NBBO)

Get NBBO quotes for a ticker symbol in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stockTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp.
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 1000 and max is 50000.
val sort : kotlin.String = timestamp // kotlin.String | Sort field used for ordering.
try {
    val result : GetStocksQuotes200Response = apiInstance.getStocksQuotes(stockTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksQuotes")
    e.printStackTrace()
}
```

### Parameters
| **stockTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp. | [optional] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 1000 and max is 50000. | [optional] [default to 1000] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to timestamp] [enum: timestamp] |

### Return type

[**GetStocksQuotes200Response**](GetStocksQuotes200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksRSI"></a>
# **getStocksRSI**
> GetCryptoRSI200Response getStocksRSI(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Relative Strength Index (RSI)

Get the relative strength index (RSI) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stockTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol for which to get relative strength index (RSI) data. For example, AAPL represents Apple Inc.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the relative strength index are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 14 // kotlin.Int | The window size used to calculate the relative strength index (RSI).
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the relative strength index. i.e. 'close' will result in using close prices to  calculate the relative strength index (RSI).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoRSI200Response = apiInstance.getStocksRSI(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksRSI")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksRSI")
    e.printStackTrace()
}
```

### Parameters
| **stockTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol for which to get relative strength index (RSI) data. For example, AAPL represents Apple Inc. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the relative strength index are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the relative strength index (RSI). | [optional] [default to 14] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the relative strength index. i.e. &#39;close&#39; will result in using close prices to  calculate the relative strength index (RSI). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoRSI200Response**](GetCryptoRSI200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksSMA"></a>
# **getStocksSMA**
> GetCryptoSMA200Response getStocksSMA(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

Simple Moving Average (SMA)

Get the simple moving average (SMA) for a ticker symbol over a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stockTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol for which to get simple moving average (SMA) data. For example, AAPL represents Apple Inc.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp.
val timespan : kotlin.String = day // kotlin.String | The size of the aggregate time window.
val adjusted : kotlin.Boolean = true // kotlin.Boolean | Whether or not the aggregates used to calculate the simple moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits.
val window : kotlin.Int = 50 // kotlin.Int | The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average.
val seriesType : kotlin.String = close // kotlin.String | The price in the aggregate which will be used to calculate the simple moving average. i.e. 'close' will result in using close prices to  calculate the simple moving average (SMA).
val expandUnderlying : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the aggregates used to calculate this indicator in the response.
val order : kotlin.String = desc // kotlin.String | The order in which to return the results, ordered by timestamp.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the number of results returned, default is 10 and max is 5000
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
try {
    val result : GetCryptoSMA200Response = apiInstance.getStocksSMA(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksSMA")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksSMA")
    e.printStackTrace()
}
```

### Parameters
| **stockTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol for which to get simple moving average (SMA) data. For example, AAPL represents Apple Inc. | |
| **timestamp** | **kotlin.String**| Query by timestamp. Either a date with the format YYYY-MM-DD or a millisecond timestamp. | [optional] |
| **timespan** | **kotlin.String**| The size of the aggregate time window. | [optional] [default to day] [enum: minute, hour, day, week, month, quarter, year] |
| **adjusted** | **kotlin.Boolean**| Whether or not the aggregates used to calculate the simple moving average are adjusted for splits. By default, aggregates are adjusted. Set this to false to get results that are NOT adjusted for splits. | [optional] [default to true] |
| **window** | **kotlin.Int**| The window size used to calculate the simple moving average (SMA). i.e. a window size of 10 with daily aggregates would result in a 10 day moving average. | [optional] [default to 50] |
| **seriesType** | **kotlin.String**| The price in the aggregate which will be used to calculate the simple moving average. i.e. &#39;close&#39; will result in using close prices to  calculate the simple moving average (SMA). | [optional] [default to close] [enum: open, high, low, close] |
| **expandUnderlying** | **kotlin.Boolean**| Whether or not to include the aggregates used to calculate this indicator in the response. | [optional] [default to false] |
| **order** | **kotlin.String**| The order in which to return the results, ordered by timestamp. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 5000 | [optional] [default to 10] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |

### Return type

[**GetCryptoSMA200Response**](GetCryptoSMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksSnapshotDirection"></a>
# **getStocksSnapshotDirection**
> GetStocksSnapshotDirection200Response getStocksSnapshotDirection(direction, includeOtc)

Gainers/Losers

Get the most up-to-date market data for the current top 20 gainers or losers of the day in the stocks/equities markets. &lt;br /&gt; &lt;br /&gt; Top gainers are those tickers whose price has increased by the highest percentage since the previous day&#39;s close. Top losers are those tickers whose price has decreased by the highest percentage since the previous day&#39;s close. This output will only include tickers with a trading volume of 10,000 or more. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 3:30am EST and gets populated as data is received from the exchanges. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val direction : kotlin.String = gainers // kotlin.String | The direction of the snapshot results to return. 
val includeOtc : kotlin.Boolean = true // kotlin.Boolean | Include OTC securities in the response. Default is false (don't include OTC securities). 
try {
    val result : GetStocksSnapshotDirection200Response = apiInstance.getStocksSnapshotDirection(direction, includeOtc)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksSnapshotDirection")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksSnapshotDirection")
    e.printStackTrace()
}
```

### Parameters
| **direction** | **kotlin.String**| The direction of the snapshot results to return.  | [enum: gainers, losers] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeOtc** | **kotlin.Boolean**| Include OTC securities in the response. Default is false (don&#39;t include OTC securities).  | [optional] |

### Return type

[**GetStocksSnapshotDirection200Response**](GetStocksSnapshotDirection200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksSnapshotTicker"></a>
# **getStocksSnapshotTicker**
> GetStocksSnapshotTicker200Response getStocksSnapshotTicker(stocksTicker)

Ticker

Get the most up-to-date market data for a single traded stock ticker. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 3:30am EST and gets populated as data is received from the exchanges. This can happen as early as 4am EST. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stocksTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
try {
    val result : GetStocksSnapshotTicker200Response = apiInstance.getStocksSnapshotTicker(stocksTicker)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksSnapshotTicker")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksSnapshotTicker")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **stocksTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |

### Return type

[**GetStocksSnapshotTicker200Response**](GetStocksSnapshotTicker200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksSnapshotTickers"></a>
# **getStocksSnapshotTickers**
> GetStocksSnapshotTickers200Response getStocksSnapshotTickers(tickers, includeOtc)

All Tickers

Get the most up-to-date market data for all traded stock symbols. &lt;br /&gt; &lt;br /&gt; Note: Snapshot data is cleared at 3:30am EST and gets populated as data is received from the exchanges. This can happen as early as 4am EST. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val tickers : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A case-sensitive comma separated list of tickers to get snapshots for. For example, AAPL,TSLA,GOOG. Empty string defaults to querying all tickers.
val includeOtc : kotlin.Boolean = true // kotlin.Boolean | Include OTC securities in the response. Default is false (don't include OTC securities). 
try {
    val result : GetStocksSnapshotTickers200Response = apiInstance.getStocksSnapshotTickers(tickers, includeOtc)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksSnapshotTickers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksSnapshotTickers")
    e.printStackTrace()
}
```

### Parameters
| **tickers** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A case-sensitive comma separated list of tickers to get snapshots for. For example, AAPL,TSLA,GOOG. Empty string defaults to querying all tickers. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeOtc** | **kotlin.Boolean**| Include OTC securities in the response. Default is false (don&#39;t include OTC securities).  | [optional] |

### Return type

[**GetStocksSnapshotTickers200Response**](GetStocksSnapshotTickers200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksTrades"></a>
# **getStocksTrades**
> GetStocksTrades200Response getStocksTrades(stockTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)

Trades

Get trades for a ticker symbol in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val stockTicker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp.
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 1000 and max is 50000.
val sort : kotlin.String = timestamp // kotlin.String | Sort field used for ordering.
try {
    val result : GetStocksTrades200Response = apiInstance.getStocksTrades(stockTicker, timestamp, timestampGte, timestampGt, timestampLte, timestampLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksTrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksTrades")
    e.printStackTrace()
}
```

### Parameters
| **stockTicker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |
| **timestamp** | **kotlin.String**| Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp. | [optional] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 1000 and max is 50000. | [optional] [default to 1000] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to timestamp] [enum: timestamp] |

### Return type

[**GetStocksTrades200Response**](GetStocksTrades200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksV1ShortInterest"></a>
# **getStocksV1ShortInterest**
> GetStocksV1ShortInterest200Response getStocksV1ShortInterest(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, daysToCover, daysToCoverAnyOf, daysToCoverGt, daysToCoverGte, daysToCoverLt, daysToCoverLte, settlementDate, settlementDateAnyOf, settlementDateGt, settlementDateGte, settlementDateLt, settlementDateLte, avgDailyVolume, avgDailyVolumeAnyOf, avgDailyVolumeGt, avgDailyVolumeGte, avgDailyVolumeLt, avgDailyVolumeLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | The primary ticker symbol for the stock.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val daysToCover : kotlin.Double = 1.2 // kotlin.Double | Calculated as short_interest divided by avg_daily_volume, representing the estimated number of days it would take to cover all short positions based on average trading volume. Value must be a floating point number.
val daysToCoverAnyOf : kotlin.String = daysToCoverAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be a floating point number.
val daysToCoverGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val daysToCoverGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val daysToCoverLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val daysToCoverLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val settlementDate : kotlin.String = settlementDate_example // kotlin.String | The date (formatted as YYYY-MM-DD) on which the short interest data is considered settled, typically based on exchange reporting schedules.
val settlementDateAnyOf : kotlin.String = settlementDateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val settlementDateGt : kotlin.String = settlementDateGt_example // kotlin.String | Filter greater than the value.
val settlementDateGte : kotlin.String = settlementDateGte_example // kotlin.String | Filter greater than or equal to the value.
val settlementDateLt : kotlin.String = settlementDateLt_example // kotlin.String | Filter less than the value.
val settlementDateLte : kotlin.String = settlementDateLte_example // kotlin.String | Filter less than or equal to the value.
val avgDailyVolume : kotlin.Long = 789 // kotlin.Long | The average daily trading volume for the stock over a specified period, typically used to contextualize short interest. Value must be an integer.
val avgDailyVolumeAnyOf : kotlin.String = avgDailyVolumeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer.
val avgDailyVolumeGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val avgDailyVolumeGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val avgDailyVolumeLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val avgDailyVolumeLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '10' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetStocksV1ShortInterest200Response = apiInstance.getStocksV1ShortInterest(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, daysToCover, daysToCoverAnyOf, daysToCoverGt, daysToCoverGte, daysToCoverLt, daysToCoverLte, settlementDate, settlementDateAnyOf, settlementDateGt, settlementDateGte, settlementDateLt, settlementDateLte, avgDailyVolume, avgDailyVolumeAnyOf, avgDailyVolumeGt, avgDailyVolumeGte, avgDailyVolumeLt, avgDailyVolumeLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksV1ShortInterest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksV1ShortInterest")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The primary ticker symbol for the stock. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **daysToCover** | **kotlin.Double**| Calculated as short_interest divided by avg_daily_volume, representing the estimated number of days it would take to cover all short positions based on average trading volume. Value must be a floating point number. | [optional] |
| **daysToCoverAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be a floating point number. | [optional] |
| **daysToCoverGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **daysToCoverGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **daysToCoverLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **daysToCoverLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **settlementDate** | **kotlin.String**| The date (formatted as YYYY-MM-DD) on which the short interest data is considered settled, typically based on exchange reporting schedules. | [optional] |
| **settlementDateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **settlementDateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **settlementDateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **settlementDateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **settlementDateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **avgDailyVolume** | **kotlin.Long**| The average daily trading volume for the stock over a specified period, typically used to contextualize short interest. Value must be an integer. | [optional] |
| **avgDailyVolumeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer. | [optional] |
| **avgDailyVolumeGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **avgDailyVolumeGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **avgDailyVolumeLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **avgDailyVolumeLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;10&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;ticker.asc&quot;] |

### Return type

[**GetStocksV1ShortInterest200Response**](GetStocksV1ShortInterest200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksV1ShortVolume"></a>
# **getStocksV1ShortVolume**
> GetStocksV1ShortVolume200Response getStocksV1ShortVolume(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, shortVolumeRatio, shortVolumeRatioAnyOf, shortVolumeRatioGt, shortVolumeRatioGte, shortVolumeRatioLt, shortVolumeRatioLte, totalVolume, totalVolumeAnyOf, totalVolumeGt, totalVolumeGte, totalVolumeLt, totalVolumeLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | The primary ticker symbol for the stock.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val date : kotlin.String = date_example // kotlin.String | The date of trade activity reported in the format YYYY-MM-DD
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val shortVolumeRatio : kotlin.Double = 1.2 // kotlin.Double | The percentage of total volume that was sold short. Calculated as (short_volume / total_volume) * 100. Value must be a floating point number.
val shortVolumeRatioAnyOf : kotlin.String = shortVolumeRatioAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be a floating point number.
val shortVolumeRatioGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val shortVolumeRatioGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val shortVolumeRatioLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val shortVolumeRatioLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val totalVolume : kotlin.Long = 789 // kotlin.Long | Total reported volume across all venues for the ticker on the given date. Value must be an integer.
val totalVolumeAnyOf : kotlin.String = totalVolumeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer.
val totalVolumeGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val totalVolumeGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val totalVolumeLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val totalVolumeLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '10' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetStocksV1ShortVolume200Response = apiInstance.getStocksV1ShortVolume(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, shortVolumeRatio, shortVolumeRatioAnyOf, shortVolumeRatioGt, shortVolumeRatioGte, shortVolumeRatioLt, shortVolumeRatioLte, totalVolume, totalVolumeAnyOf, totalVolumeGt, totalVolumeGte, totalVolumeLt, totalVolumeLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksV1ShortVolume")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksV1ShortVolume")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The primary ticker symbol for the stock. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **date** | **kotlin.String**| The date of trade activity reported in the format YYYY-MM-DD | [optional] |
| **dateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **shortVolumeRatio** | **kotlin.Double**| The percentage of total volume that was sold short. Calculated as (short_volume / total_volume) * 100. Value must be a floating point number. | [optional] |
| **shortVolumeRatioAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be a floating point number. | [optional] |
| **shortVolumeRatioGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **shortVolumeRatioGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **shortVolumeRatioLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **shortVolumeRatioLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **totalVolume** | **kotlin.Long**| Total reported volume across all venues for the ticker on the given date. Value must be an integer. | [optional] |
| **totalVolumeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer. | [optional] |
| **totalVolumeGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **totalVolumeGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **totalVolumeLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **totalVolumeLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;10&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;ticker.asc&quot;] |

### Return type

[**GetStocksV1ShortVolume200Response**](GetStocksV1ShortVolume200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTicker"></a>
# **getTicker**
> GetTicker200Response getTicker(ticker, date)

Ticker Details v3

Get a single ticker supported by Polygon.io. This response will have detailed information about the ticker and the company behind it.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = AAPL // kotlin.String | The ticker symbol of the asset.
val date : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Specify a point in time to get information about the ticker available on that date. When retrieving information from SEC filings, we compare this date with the period of report date on the SEC filing.  For example, consider an SEC filing submitted by AAPL on 2019-07-31, with a period of report date ending on 2019-06-29. That means that the filing was submitted on 2019-07-31, but the filing was created based on information from 2019-06-29. If you were to query for AAPL details on 2019-06-29, the ticker details would include information from the SEC filing.  Defaults to the most recent available date.
try {
    val result : GetTicker200Response = apiInstance.getTicker(ticker, date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getTicker")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getTicker")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The ticker symbol of the asset. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **date** | **java.time.LocalDate**| Specify a point in time to get information about the ticker available on that date. When retrieving information from SEC filings, we compare this date with the period of report date on the SEC filing.  For example, consider an SEC filing submitted by AAPL on 2019-07-31, with a period of report date ending on 2019-06-29. That means that the filing was submitted on 2019-07-31, but the filing was created based on information from 2019-06-29. If you were to query for AAPL details on 2019-06-29, the ticker details would include information from the SEC filing.  Defaults to the most recent available date. | [optional] |

### Return type

[**GetTicker200Response**](GetTicker200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTmxV1CorporateEvents"></a>
# **getTmxV1CorporateEvents**
> GetTmxV1CorporateEvents200Response getTmxV1CorporateEvents(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, type, typeAnyOf, typeGt, typeGte, typeLt, typeLte, status, statusAnyOf, statusGt, statusGte, statusLt, statusLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, isin, isinAnyOf, isinGt, isinGte, isinLt, isinLte, tradingVenue, tradingVenueAnyOf, tradingVenueGt, tradingVenueGte, tradingVenueLt, tradingVenueLte, tmxCompanyId, tmxCompanyIdAnyOf, tmxCompanyIdGt, tmxCompanyIdGte, tmxCompanyIdLt, tmxCompanyIdLte, tmxRecordId, tmxRecordIdAnyOf, tmxRecordIdGt, tmxRecordIdGte, tmxRecordIdLt, tmxRecordIdLte, limit, sort)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | Scheduled date of the corporate event, formatted as YYYY-MM-DD.
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val type : kotlin.String = type_example // kotlin.String | The normalized type of corporate event. Possible values include: analyst_day, business_update, capital_markets_day, conference, dividend, earnings_announcement_date, earnings_conference_call, earnings_results_announcement, forum, interim_statement, other_interim_announcement, production_update, research_and_development_day, seminar, shareholder_meeting, sales_update, stock_split, summit, service_level_update, tradeshow, company_travel, and workshop.
val typeAnyOf : kotlin.String = typeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val typeGt : kotlin.String = typeGt_example // kotlin.String | Filter greater than the value.
val typeGte : kotlin.String = typeGte_example // kotlin.String | Filter greater than or equal to the value.
val typeLt : kotlin.String = typeLt_example // kotlin.String | Filter less than the value.
val typeLte : kotlin.String = typeLte_example // kotlin.String | Filter less than or equal to the value.
val status : kotlin.String = status_example // kotlin.String | The current status of the event. Possible values include: approved, canceled, confirmed, historical, pending_approval, postponed, and unconfirmed.
val statusAnyOf : kotlin.String = statusAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val statusGt : kotlin.String = statusGt_example // kotlin.String | Filter greater than the value.
val statusGte : kotlin.String = statusGte_example // kotlin.String | Filter greater than or equal to the value.
val statusLt : kotlin.String = statusLt_example // kotlin.String | Filter less than the value.
val statusLte : kotlin.String = statusLte_example // kotlin.String | Filter less than or equal to the value.
val ticker : kotlin.String = ticker_example // kotlin.String | The company's stock symbol.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val isin : kotlin.String = isin_example // kotlin.String | Standard international identifier for the company's common stock.
val isinAnyOf : kotlin.String = isinAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val isinGt : kotlin.String = isinGt_example // kotlin.String | Filter greater than the value.
val isinGte : kotlin.String = isinGte_example // kotlin.String | Filter greater than or equal to the value.
val isinLt : kotlin.String = isinLt_example // kotlin.String | Filter less than the value.
val isinLte : kotlin.String = isinLte_example // kotlin.String | Filter less than or equal to the value.
val tradingVenue : kotlin.String = tradingVenue_example // kotlin.String | MIC (Market Identifier Code) of the exchange where the company's stock is listed.
val tradingVenueAnyOf : kotlin.String = tradingVenueAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tradingVenueGt : kotlin.String = tradingVenueGt_example // kotlin.String | Filter greater than the value.
val tradingVenueGte : kotlin.String = tradingVenueGte_example // kotlin.String | Filter greater than or equal to the value.
val tradingVenueLt : kotlin.String = tradingVenueLt_example // kotlin.String | Filter less than the value.
val tradingVenueLte : kotlin.String = tradingVenueLte_example // kotlin.String | Filter less than or equal to the value.
val tmxCompanyId : kotlin.Long = 789 // kotlin.Long | Unique numeric identifier for the company used by TMX. Value must be an integer.
val tmxCompanyIdAnyOf : kotlin.String = tmxCompanyIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer.
val tmxCompanyIdGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val tmxCompanyIdGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val tmxCompanyIdLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val tmxCompanyIdLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val tmxRecordId : kotlin.String = tmxRecordId_example // kotlin.String | The unique alphanumeric identifier for the event record used by TMX.
val tmxRecordIdAnyOf : kotlin.String = tmxRecordIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tmxRecordIdGt : kotlin.String = tmxRecordIdGt_example // kotlin.String | Filter greater than the value.
val tmxRecordIdGte : kotlin.String = tmxRecordIdGte_example // kotlin.String | Filter greater than or equal to the value.
val tmxRecordIdLt : kotlin.String = tmxRecordIdLt_example // kotlin.String | Filter less than the value.
val tmxRecordIdLte : kotlin.String = tmxRecordIdLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetTmxV1CorporateEvents200Response = apiInstance.getTmxV1CorporateEvents(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, type, typeAnyOf, typeGt, typeGte, typeLt, typeLte, status, statusAnyOf, statusGt, statusGte, statusLt, statusLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, isin, isinAnyOf, isinGt, isinGte, isinLt, isinLte, tradingVenue, tradingVenueAnyOf, tradingVenueGt, tradingVenueGte, tradingVenueLt, tradingVenueLte, tmxCompanyId, tmxCompanyIdAnyOf, tmxCompanyIdGt, tmxCompanyIdGte, tmxCompanyIdLt, tmxCompanyIdLte, tmxRecordId, tmxRecordIdAnyOf, tmxRecordIdGt, tmxRecordIdGte, tmxRecordIdLt, tmxRecordIdLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getTmxV1CorporateEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getTmxV1CorporateEvents")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| Scheduled date of the corporate event, formatted as YYYY-MM-DD. | [optional] |
| **dateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **type** | **kotlin.String**| The normalized type of corporate event. Possible values include: analyst_day, business_update, capital_markets_day, conference, dividend, earnings_announcement_date, earnings_conference_call, earnings_results_announcement, forum, interim_statement, other_interim_announcement, production_update, research_and_development_day, seminar, shareholder_meeting, sales_update, stock_split, summit, service_level_update, tradeshow, company_travel, and workshop. | [optional] |
| **typeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **typeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **typeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **typeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **typeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **status** | **kotlin.String**| The current status of the event. Possible values include: approved, canceled, confirmed, historical, pending_approval, postponed, and unconfirmed. | [optional] |
| **statusAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **statusGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **statusGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **statusLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **statusLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ticker** | **kotlin.String**| The company&#39;s stock symbol. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **isin** | **kotlin.String**| Standard international identifier for the company&#39;s common stock. | [optional] |
| **isinAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **isinGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **isinGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **isinLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **isinLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **tradingVenue** | **kotlin.String**| MIC (Market Identifier Code) of the exchange where the company&#39;s stock is listed. | [optional] |
| **tradingVenueAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tradingVenueGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tradingVenueGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tradingVenueLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tradingVenueLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **tmxCompanyId** | **kotlin.Long**| Unique numeric identifier for the company used by TMX. Value must be an integer. | [optional] |
| **tmxCompanyIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer. | [optional] |
| **tmxCompanyIdGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **tmxCompanyIdGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **tmxCompanyIdLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **tmxCompanyIdLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **tmxRecordId** | **kotlin.String**| The unique alphanumeric identifier for the event record used by TMX. | [optional] |
| **tmxRecordIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tmxRecordIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tmxRecordIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tmxRecordIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tmxRecordIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;date&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;date.desc&quot;] |

### Return type

[**GetTmxV1CorporateEvents200Response**](GetTmxV1CorporateEvents200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listConditions"></a>
# **listConditions**
> ListConditions200Response listConditions(assetClass, dataType, id, sip, order, limit, sort)

Conditions

List all conditions that Polygon.io uses.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val assetClass : kotlin.String = stocks // kotlin.String | Filter for conditions within a given asset class.
val dataType : kotlin.String = dataType_example // kotlin.String | Filter by data type.
val id : kotlin.Int = 56 // kotlin.Int | Filter for conditions with a given ID.
val sip : kotlin.String = sip_example // kotlin.String | Filter by SIP. If the condition contains a mapping for that SIP, the condition will be returned.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 1000.
val sort : kotlin.String = asset_class // kotlin.String | Sort field used for ordering.
try {
    val result : ListConditions200Response = apiInstance.listConditions(assetClass, dataType, id, sip, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listConditions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listConditions")
    e.printStackTrace()
}
```

### Parameters
| **assetClass** | **kotlin.String**| Filter for conditions within a given asset class. | [optional] [enum: stocks, options, crypto, fx] |
| **dataType** | **kotlin.String**| Filter by data type. | [optional] [enum: trade, bbo, nbbo] |
| **id** | **kotlin.Int**| Filter for conditions with a given ID. | [optional] |
| **sip** | **kotlin.String**| Filter by SIP. If the condition contains a mapping for that SIP, the condition will be returned. | [optional] [enum: CTA, UTP, OPRA] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 1000. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to asset_class] [enum: asset_class, id, type, name, data_types, legacy] |

### Return type

[**ListConditions200Response**](ListConditions200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listDividends"></a>
# **listDividends**
> ListDividends200Response listDividends(ticker, exDividendDate, recordDate, declarationDate, payDate, frequency, cashAmount, dividendType, tickerGte, tickerGt, tickerLte, tickerLt, exDividendDateGte, exDividendDateGt, exDividendDateLte, exDividendDateLt, recordDateGte, recordDateGt, recordDateLte, recordDateLt, declarationDateGte, declarationDateGt, declarationDateLte, declarationDateLt, payDateGte, payDateGt, payDateLte, payDateLt, cashAmountGte, cashAmountGt, cashAmountLte, cashAmountLt, order, limit, sort)

Dividends v3

Get a list of historical cash dividends, including the ticker symbol, declaration date, ex-dividend date, record date, pay date, frequency, and amount.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
val exDividendDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Query by ex-dividend date with the format YYYY-MM-DD.
val recordDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Query by record date with the format YYYY-MM-DD.
val declarationDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Query by declaration date with the format YYYY-MM-DD.
val payDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Query by pay date with the format YYYY-MM-DD.
val frequency : kotlin.Int = 56 // kotlin.Int | Query by the number of times per year the dividend is paid out.  Possible values are 0 (one-time), 1 (annually), 2 (bi-annually), 4 (quarterly), 12 (monthly), 24 (bi-monthly), and 52 (weekly).
val cashAmount : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Query by the cash amount of the dividend.
val dividendType : kotlin.String = dividendType_example // kotlin.String | Query by the type of dividend. Dividends that have been paid and/or are expected to be paid on consistent schedules are denoted as CD. Special Cash dividends that have been paid that are infrequent or unusual, and/or can not be expected to occur in the future are denoted as SC.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Range by ticker.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Range by ticker.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Range by ticker.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Range by ticker.
val exDividendDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by ex_dividend_date.
val exDividendDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by ex_dividend_date.
val exDividendDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by ex_dividend_date.
val exDividendDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by ex_dividend_date.
val recordDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by record_date.
val recordDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by record_date.
val recordDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by record_date.
val recordDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by record_date.
val declarationDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by declaration_date.
val declarationDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by declaration_date.
val declarationDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by declaration_date.
val declarationDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by declaration_date.
val payDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by pay_date.
val payDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by pay_date.
val payDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by pay_date.
val payDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by pay_date.
val cashAmountGte : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by cash_amount.
val cashAmountGt : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by cash_amount.
val cashAmountLte : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by cash_amount.
val cashAmountLt : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by cash_amount.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 1000.
val sort : kotlin.String = ex_dividend_date // kotlin.String | Sort field used for ordering.
try {
    val result : ListDividends200Response = apiInstance.listDividends(ticker, exDividendDate, recordDate, declarationDate, payDate, frequency, cashAmount, dividendType, tickerGte, tickerGt, tickerLte, tickerLt, exDividendDateGte, exDividendDateGt, exDividendDateLte, exDividendDateLt, recordDateGte, recordDateGt, recordDateLte, recordDateLt, declarationDateGte, declarationDateGt, declarationDateLte, declarationDateLt, payDateGte, payDateGt, payDateLte, payDateLt, cashAmountGte, cashAmountGt, cashAmountLte, cashAmountLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listDividends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listDividends")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | [optional] |
| **exDividendDate** | **java.time.LocalDate**| Query by ex-dividend date with the format YYYY-MM-DD. | [optional] |
| **recordDate** | **java.time.LocalDate**| Query by record date with the format YYYY-MM-DD. | [optional] |
| **declarationDate** | **java.time.LocalDate**| Query by declaration date with the format YYYY-MM-DD. | [optional] |
| **payDate** | **java.time.LocalDate**| Query by pay date with the format YYYY-MM-DD. | [optional] |
| **frequency** | **kotlin.Int**| Query by the number of times per year the dividend is paid out.  Possible values are 0 (one-time), 1 (annually), 2 (bi-annually), 4 (quarterly), 12 (monthly), 24 (bi-monthly), and 52 (weekly). | [optional] [enum: 0, 1, 2, 4, 12, 24, 52] |
| **cashAmount** | **java.math.BigDecimal**| Query by the cash amount of the dividend. | [optional] |
| **dividendType** | **kotlin.String**| Query by the type of dividend. Dividends that have been paid and/or are expected to be paid on consistent schedules are denoted as CD. Special Cash dividends that have been paid that are infrequent or unusual, and/or can not be expected to occur in the future are denoted as SC. | [optional] [enum: CD, SC, LT, ST] |
| **tickerGte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerGt** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLt** | **kotlin.String**| Range by ticker. | [optional] |
| **exDividendDateGte** | **java.time.LocalDate**| Range by ex_dividend_date. | [optional] |
| **exDividendDateGt** | **java.time.LocalDate**| Range by ex_dividend_date. | [optional] |
| **exDividendDateLte** | **java.time.LocalDate**| Range by ex_dividend_date. | [optional] |
| **exDividendDateLt** | **java.time.LocalDate**| Range by ex_dividend_date. | [optional] |
| **recordDateGte** | **java.time.LocalDate**| Range by record_date. | [optional] |
| **recordDateGt** | **java.time.LocalDate**| Range by record_date. | [optional] |
| **recordDateLte** | **java.time.LocalDate**| Range by record_date. | [optional] |
| **recordDateLt** | **java.time.LocalDate**| Range by record_date. | [optional] |
| **declarationDateGte** | **java.time.LocalDate**| Range by declaration_date. | [optional] |
| **declarationDateGt** | **java.time.LocalDate**| Range by declaration_date. | [optional] |
| **declarationDateLte** | **java.time.LocalDate**| Range by declaration_date. | [optional] |
| **declarationDateLt** | **java.time.LocalDate**| Range by declaration_date. | [optional] |
| **payDateGte** | **java.time.LocalDate**| Range by pay_date. | [optional] |
| **payDateGt** | **java.time.LocalDate**| Range by pay_date. | [optional] |
| **payDateLte** | **java.time.LocalDate**| Range by pay_date. | [optional] |
| **payDateLt** | **java.time.LocalDate**| Range by pay_date. | [optional] |
| **cashAmountGte** | **java.math.BigDecimal**| Range by cash_amount. | [optional] |
| **cashAmountGt** | **java.math.BigDecimal**| Range by cash_amount. | [optional] |
| **cashAmountLte** | **java.math.BigDecimal**| Range by cash_amount. | [optional] |
| **cashAmountLt** | **java.math.BigDecimal**| Range by cash_amount. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 1000. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to ex_dividend_date] [enum: ex_dividend_date, pay_date, declaration_date, record_date, cash_amount, ticker] |

### Return type

[**ListDividends200Response**](ListDividends200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listExchanges"></a>
# **listExchanges**
> ListExchanges200Response listExchanges(assetClass, locale)

Exchanges

List all exchanges that Polygon.io knows about.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val assetClass : kotlin.String = stocks // kotlin.String | Filter by asset class.
val locale : kotlin.String = us // kotlin.String | Filter by locale.
try {
    val result : ListExchanges200Response = apiInstance.listExchanges(assetClass, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listExchanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listExchanges")
    e.printStackTrace()
}
```

### Parameters
| **assetClass** | **kotlin.String**| Filter by asset class. | [optional] [enum: stocks, options, crypto, fx] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| Filter by locale. | [optional] [enum: us, global] |

### Return type

[**ListExchanges200Response**](ListExchanges200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listFinancials"></a>
# **listFinancials**
> ListFinancials200Response listFinancials(ticker, cik, companyName, sic, filingDate, periodOfReportDate, timeframe, includeSources, companyNameSearch, filingDateGte, filingDateGt, filingDateLte, filingDateLt, periodOfReportDateGte, periodOfReportDateGt, periodOfReportDateLte, periodOfReportDateLt, order, limit, sort)

Stock Financials vX

Get historical financial data for a stock ticker. The financials data is extracted from XBRL from company SEC filings using the methodology outlined &lt;a rel&#x3D;\&quot;noopener noreferrer nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;http://xbrl.squarespace.com/understanding-sec-xbrl-financi/\&quot;&gt;here&lt;/a&gt;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Query by company ticker.
val cik : kotlin.String = cik_example // kotlin.String | Query by central index key (<a rel=\"noopener noreferrer nofollow\" target=\"_blank\" href=\"https://www.sec.gov/edgar/searchedgar/cik.htm\">CIK</a>) Number
val companyName : kotlin.String = companyName_example // kotlin.String | Query by company name.
val sic : kotlin.String = sic_example // kotlin.String | Query by standard industrial classification (<a rel=\"noopener noreferrer nofollow\" target=\"_blank\" href=\"https://www.sec.gov/corpfin/division-of-corporation-finance-standard-industrial-classification-sic-code-list\">SIC</a>)
val filingDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Query by the date when the filing with financials data was filed in YYYY-MM-DD format.  Best used when querying over date ranges to find financials based on filings that happen in a time period.  Examples:  To get financials based on filings that have happened after January 1, 2009 use the query param filing_date.gte=2009-01-01  To get financials based on filings that happened in the year 2009 use the query params filing_date.gte=2009-01-01&filing_date.lt=2010-01-01
val periodOfReportDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | The period of report for the filing with financials data in YYYY-MM-DD format.
val timeframe : kotlin.String = timeframe_example // kotlin.String | Query by timeframe. Annual financials originate from 10-K filings, and quarterly financials originate from 10-Q filings. Note: Most companies do not file quarterly reports for Q4 and instead include those financials in their annual report, so some companies my not return quarterly financials for Q4
val includeSources : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include the `xpath` and `formula` attributes for each financial data point. See the `xpath` and `formula` response attributes for more info. False by default.
val companyNameSearch : kotlin.String = companyNameSearch_example // kotlin.String | Search by company_name.
val filingDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Search by filing_date.
val filingDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Search by filing_date.
val filingDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Search by filing_date.
val filingDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Search by filing_date.
val periodOfReportDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Search by period_of_report_date.
val periodOfReportDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Search by period_of_report_date.
val periodOfReportDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Search by period_of_report_date.
val periodOfReportDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Search by period_of_report_date.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 100.
val sort : kotlin.String = filing_date // kotlin.String | Sort field used for ordering.
try {
    val result : ListFinancials200Response = apiInstance.listFinancials(ticker, cik, companyName, sic, filingDate, periodOfReportDate, timeframe, includeSources, companyNameSearch, filingDateGte, filingDateGt, filingDateLte, filingDateLt, periodOfReportDateGte, periodOfReportDateGt, periodOfReportDateLte, periodOfReportDateLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listFinancials")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listFinancials")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Query by company ticker. | [optional] |
| **cik** | **kotlin.String**| Query by central index key (&lt;a rel&#x3D;\&quot;noopener noreferrer nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.sec.gov/edgar/searchedgar/cik.htm\&quot;&gt;CIK&lt;/a&gt;) Number | [optional] |
| **companyName** | **kotlin.String**| Query by company name. | [optional] |
| **sic** | **kotlin.String**| Query by standard industrial classification (&lt;a rel&#x3D;\&quot;noopener noreferrer nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.sec.gov/corpfin/division-of-corporation-finance-standard-industrial-classification-sic-code-list\&quot;&gt;SIC&lt;/a&gt;) | [optional] |
| **filingDate** | **java.time.LocalDate**| Query by the date when the filing with financials data was filed in YYYY-MM-DD format.  Best used when querying over date ranges to find financials based on filings that happen in a time period.  Examples:  To get financials based on filings that have happened after January 1, 2009 use the query param filing_date.gte&#x3D;2009-01-01  To get financials based on filings that happened in the year 2009 use the query params filing_date.gte&#x3D;2009-01-01&amp;filing_date.lt&#x3D;2010-01-01 | [optional] |
| **periodOfReportDate** | **java.time.LocalDate**| The period of report for the filing with financials data in YYYY-MM-DD format. | [optional] |
| **timeframe** | **kotlin.String**| Query by timeframe. Annual financials originate from 10-K filings, and quarterly financials originate from 10-Q filings. Note: Most companies do not file quarterly reports for Q4 and instead include those financials in their annual report, so some companies my not return quarterly financials for Q4 | [optional] [enum: annual, quarterly, ttm] |
| **includeSources** | **kotlin.Boolean**| Whether or not to include the &#x60;xpath&#x60; and &#x60;formula&#x60; attributes for each financial data point. See the &#x60;xpath&#x60; and &#x60;formula&#x60; response attributes for more info. False by default. | [optional] [default to false] |
| **companyNameSearch** | **kotlin.String**| Search by company_name. | [optional] |
| **filingDateGte** | **java.time.LocalDate**| Search by filing_date. | [optional] |
| **filingDateGt** | **java.time.LocalDate**| Search by filing_date. | [optional] |
| **filingDateLte** | **java.time.LocalDate**| Search by filing_date. | [optional] |
| **filingDateLt** | **java.time.LocalDate**| Search by filing_date. | [optional] |
| **periodOfReportDateGte** | **java.time.LocalDate**| Search by period_of_report_date. | [optional] |
| **periodOfReportDateGt** | **java.time.LocalDate**| Search by period_of_report_date. | [optional] |
| **periodOfReportDateLte** | **java.time.LocalDate**| Search by period_of_report_date. | [optional] |
| **periodOfReportDateLt** | **java.time.LocalDate**| Search by period_of_report_date. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 100. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to period_of_report_date] [enum: filing_date, period_of_report_date] |

### Return type

[**ListFinancials200Response**](ListFinancials200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listIPOs"></a>
# **listIPOs**
> ListIPOs200Response listIPOs(ticker, usCode, isin, listingDate, ipoStatus, listingDateGte, listingDateGt, listingDateLte, listingDateLt, order, limit, sort)

IPOs

The IPOs API provides access to detailed information about Initial Public Offerings (IPOs), including both upcoming and historical events. With this API, you can query for a comprehensive list of IPOs, along with key details such as the issuer name, ticker symbol, ISIN, IPO date, number of shares offered, expected price range, and final offering price. You can filter the results by status to focus on new, rumors, pending, historical, and more.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Specify a case-sensitive ticker symbol. For example, TSLA represents Tesla Inc.
val usCode : kotlin.String = usCode_example // kotlin.String | Specify a us_code. This is a unique nine-character alphanumeric code that identifies a North American financial security for the purposes of facilitating clearing and settlement of trades.
val isin : kotlin.String = isin_example // kotlin.String | Specify an International Securities Identification Number (ISIN). This is a unique twelve-digit code that is assigned to every security issuance in the world.
val listingDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Specify a listing date. This is the first trading date for the newly listed entity.
val ipoStatus : kotlin.String = ipoStatus_example // kotlin.String | Specify an IPO status.
val listingDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by listing_date.
val listingDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by listing_date.
val listingDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by listing_date.
val listingDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by listing_date.
val order : kotlin.String = desc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 1000.
val sort : kotlin.String = listing_date // kotlin.String | Sort field used for ordering.
try {
    val result : ListIPOs200Response = apiInstance.listIPOs(ticker, usCode, isin, listingDate, ipoStatus, listingDateGte, listingDateGt, listingDateLte, listingDateLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listIPOs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listIPOs")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, TSLA represents Tesla Inc. | [optional] |
| **usCode** | **kotlin.String**| Specify a us_code. This is a unique nine-character alphanumeric code that identifies a North American financial security for the purposes of facilitating clearing and settlement of trades. | [optional] |
| **isin** | **kotlin.String**| Specify an International Securities Identification Number (ISIN). This is a unique twelve-digit code that is assigned to every security issuance in the world. | [optional] |
| **listingDate** | **java.time.LocalDate**| Specify a listing date. This is the first trading date for the newly listed entity. | [optional] |
| **ipoStatus** | **kotlin.String**| Specify an IPO status. | [optional] [enum: direct_listing_process, history, new, pending, postponed, rumor, withdrawn] |
| **listingDateGte** | **java.time.LocalDate**| Range by listing_date. | [optional] |
| **listingDateGt** | **java.time.LocalDate**| Range by listing_date. | [optional] |
| **listingDateLte** | **java.time.LocalDate**| Range by listing_date. | [optional] |
| **listingDateLt** | **java.time.LocalDate**| Range by listing_date. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 1000. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to listing_date] [enum: listing_date, ticker, last_updated, security_type, issuer_name, currency_code, isin, us_code, final_issue_price, min_shares_offered, max_shares_offered, lowest_offer_price, highest_offer_price, total_offer_size, shares_outstanding, primary_exchange, lot_size, security_description, ipo_status, announced_date] |

### Return type

[**ListIPOs200Response**](ListIPOs200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listNews"></a>
# **listNews**
> ListNews200Response listNews(ticker, publishedUtc, tickerGte, tickerGt, tickerLte, tickerLt, publishedUtcGte, publishedUtcGt, publishedUtcLte, publishedUtcLt, order, limit, sort)

Ticker News

Get the most recent news articles relating to a stock ticker symbol, including a summary of the article and a link to the original source.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
val publishedUtc : ListNewsPublishedUtcParameter =  // ListNewsPublishedUtcParameter | Return results published on, before, or after this date.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Search by ticker.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Search by ticker.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Search by ticker.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Search by ticker.
val publishedUtcGte : ListNewsPublishedUtcParameter =  // ListNewsPublishedUtcParameter | Search by published_utc.
val publishedUtcGt : ListNewsPublishedUtcParameter =  // ListNewsPublishedUtcParameter | Search by published_utc.
val publishedUtcLte : ListNewsPublishedUtcParameter =  // ListNewsPublishedUtcParameter | Search by published_utc.
val publishedUtcLt : ListNewsPublishedUtcParameter =  // ListNewsPublishedUtcParameter | Search by published_utc.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 1000.
val sort : kotlin.String = published_utc // kotlin.String | Sort field used for ordering.
try {
    val result : ListNews200Response = apiInstance.listNews(ticker, publishedUtc, tickerGte, tickerGt, tickerLte, tickerLt, publishedUtcGte, publishedUtcGt, publishedUtcLte, publishedUtcLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listNews")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listNews")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | [optional] |
| **publishedUtc** | [**ListNewsPublishedUtcParameter**](.md)| Return results published on, before, or after this date. | [optional] |
| **tickerGte** | **kotlin.String**| Search by ticker. | [optional] |
| **tickerGt** | **kotlin.String**| Search by ticker. | [optional] |
| **tickerLte** | **kotlin.String**| Search by ticker. | [optional] |
| **tickerLt** | **kotlin.String**| Search by ticker. | [optional] |
| **publishedUtcGte** | [**ListNewsPublishedUtcParameter**](.md)| Search by published_utc. | [optional] |
| **publishedUtcGt** | [**ListNewsPublishedUtcParameter**](.md)| Search by published_utc. | [optional] |
| **publishedUtcLte** | [**ListNewsPublishedUtcParameter**](.md)| Search by published_utc. | [optional] |
| **publishedUtcLt** | [**ListNewsPublishedUtcParameter**](.md)| Search by published_utc. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 1000. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to published_utc] [enum: published_utc] |

### Return type

[**ListNews200Response**](ListNews200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listOptionsContracts"></a>
# **listOptionsContracts**
> ListOptionsContracts200Response listOptionsContracts(underlyingTicker, ticker, contractType, expirationDate, asOf, strikePrice, expired, underlyingTickerGte, underlyingTickerGt, underlyingTickerLte, underlyingTickerLt, expirationDateGte, expirationDateGt, expirationDateLte, expirationDateLt, strikePriceGte, strikePriceGt, strikePriceLte, strikePriceLt, order, limit, sort)

Options Contracts

Query for historical options contracts. This provides both active and expired options contracts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val underlyingTicker : kotlin.String = underlyingTicker_example // kotlin.String | Query for contracts relating to an underlying stock ticker.
val ticker : kotlin.String = ticker_example // kotlin.String | This parameter has been deprecated. To search by specific options ticker, use the Options Contract endpoint [here](https://polygon.io/docs/options/get_v3_reference_options_contracts__options_ticker).
val contractType : kotlin.String = contractType_example // kotlin.String | Query by the type of contract.
val expirationDate : kotlin.String = expirationDate_example // kotlin.String | Query by contract expiration with date format YYYY-MM-DD.
val asOf : kotlin.String = asOf_example // kotlin.String | Specify a point in time for contracts as of this date with format YYYY-MM-DD. Defaults to today's date.
val strikePrice : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Query by strike price of a contract.
val expired : kotlin.Boolean = true // kotlin.Boolean | Query for expired contracts. Default is false.
val underlyingTickerGte : kotlin.String = underlyingTickerGte_example // kotlin.String | Range by underlying_ticker.
val underlyingTickerGt : kotlin.String = underlyingTickerGt_example // kotlin.String | Range by underlying_ticker.
val underlyingTickerLte : kotlin.String = underlyingTickerLte_example // kotlin.String | Range by underlying_ticker.
val underlyingTickerLt : kotlin.String = underlyingTickerLt_example // kotlin.String | Range by underlying_ticker.
val expirationDateGte : kotlin.String = expirationDateGte_example // kotlin.String | Range by expiration_date.
val expirationDateGt : kotlin.String = expirationDateGt_example // kotlin.String | Range by expiration_date.
val expirationDateLte : kotlin.String = expirationDateLte_example // kotlin.String | Range by expiration_date.
val expirationDateLt : kotlin.String = expirationDateLt_example // kotlin.String | Range by expiration_date.
val strikePriceGte : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by strike_price.
val strikePriceGt : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by strike_price.
val strikePriceLte : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by strike_price.
val strikePriceLt : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Range by strike_price.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 1000.
val sort : kotlin.String = ticker // kotlin.String | Sort field used for ordering.
try {
    val result : ListOptionsContracts200Response = apiInstance.listOptionsContracts(underlyingTicker, ticker, contractType, expirationDate, asOf, strikePrice, expired, underlyingTickerGte, underlyingTickerGt, underlyingTickerLte, underlyingTickerLt, expirationDateGte, expirationDateGt, expirationDateLte, expirationDateLt, strikePriceGte, strikePriceGt, strikePriceLte, strikePriceLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listOptionsContracts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listOptionsContracts")
    e.printStackTrace()
}
```

### Parameters
| **underlyingTicker** | **kotlin.String**| Query for contracts relating to an underlying stock ticker. | [optional] |
| **ticker** | **kotlin.String**| This parameter has been deprecated. To search by specific options ticker, use the Options Contract endpoint [here](https://polygon.io/docs/options/get_v3_reference_options_contracts__options_ticker). | [optional] |
| **contractType** | **kotlin.String**| Query by the type of contract. | [optional] [enum: call, put] |
| **expirationDate** | **kotlin.String**| Query by contract expiration with date format YYYY-MM-DD. | [optional] |
| **asOf** | **kotlin.String**| Specify a point in time for contracts as of this date with format YYYY-MM-DD. Defaults to today&#39;s date. | [optional] |
| **strikePrice** | **java.math.BigDecimal**| Query by strike price of a contract. | [optional] |
| **expired** | **kotlin.Boolean**| Query for expired contracts. Default is false. | [optional] |
| **underlyingTickerGte** | **kotlin.String**| Range by underlying_ticker. | [optional] |
| **underlyingTickerGt** | **kotlin.String**| Range by underlying_ticker. | [optional] |
| **underlyingTickerLte** | **kotlin.String**| Range by underlying_ticker. | [optional] |
| **underlyingTickerLt** | **kotlin.String**| Range by underlying_ticker. | [optional] |
| **expirationDateGte** | **kotlin.String**| Range by expiration_date. | [optional] |
| **expirationDateGt** | **kotlin.String**| Range by expiration_date. | [optional] |
| **expirationDateLte** | **kotlin.String**| Range by expiration_date. | [optional] |
| **expirationDateLt** | **kotlin.String**| Range by expiration_date. | [optional] |
| **strikePriceGte** | **java.math.BigDecimal**| Range by strike_price. | [optional] |
| **strikePriceGt** | **java.math.BigDecimal**| Range by strike_price. | [optional] |
| **strikePriceLte** | **java.math.BigDecimal**| Range by strike_price. | [optional] |
| **strikePriceLt** | **java.math.BigDecimal**| Range by strike_price. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 1000. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to ticker] [enum: ticker, underlying_ticker, expiration_date, strike_price] |

### Return type

[**ListOptionsContracts200Response**](ListOptionsContracts200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listStockSplits"></a>
# **listStockSplits**
> ListStockSplits200Response listStockSplits(ticker, executionDate, reverseSplit, tickerGte, tickerGt, tickerLte, tickerLt, executionDateGte, executionDateGt, executionDateLte, executionDateLt, order, limit, sort)

Stock Splits v3

Get a list of historical stock splits, including the ticker symbol, the execution date, and the factors of the split ratio.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
val executionDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Query by execution date with the format YYYY-MM-DD.
val reverseSplit : kotlin.Boolean = true // kotlin.Boolean | Query for reverse stock splits. A split ratio where split_from is greater than split_to represents a reverse split. By default this filter is not used.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Range by ticker.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Range by ticker.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Range by ticker.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Range by ticker.
val executionDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by execution_date.
val executionDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by execution_date.
val executionDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by execution_date.
val executionDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by execution_date.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 10 // kotlin.Int | Limit the number of results returned, default is 10 and max is 1000.
val sort : kotlin.String = execution_date // kotlin.String | Sort field used for ordering.
try {
    val result : ListStockSplits200Response = apiInstance.listStockSplits(ticker, executionDate, reverseSplit, tickerGte, tickerGt, tickerLte, tickerLt, executionDateGte, executionDateGt, executionDateLte, executionDateLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listStockSplits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listStockSplits")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | [optional] |
| **executionDate** | **java.time.LocalDate**| Query by execution date with the format YYYY-MM-DD. | [optional] |
| **reverseSplit** | **kotlin.Boolean**| Query for reverse stock splits. A split ratio where split_from is greater than split_to represents a reverse split. By default this filter is not used. | [optional] |
| **tickerGte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerGt** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLt** | **kotlin.String**| Range by ticker. | [optional] |
| **executionDateGte** | **java.time.LocalDate**| Range by execution_date. | [optional] |
| **executionDateGt** | **java.time.LocalDate**| Range by execution_date. | [optional] |
| **executionDateLte** | **java.time.LocalDate**| Range by execution_date. | [optional] |
| **executionDateLt** | **java.time.LocalDate**| Range by execution_date. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 10 and max is 1000. | [optional] [default to 10] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to execution_date] [enum: execution_date, ticker] |

### Return type

[**ListStockSplits200Response**](ListStockSplits200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listTickerTypes"></a>
# **listTickerTypes**
> ListTickerTypes200Response listTickerTypes(assetClass, locale)

Ticker Types

List all ticker types that Polygon.io has.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val assetClass : kotlin.String = stocks // kotlin.String | Filter by asset class.
val locale : kotlin.String = us // kotlin.String | Filter by locale.
try {
    val result : ListTickerTypes200Response = apiInstance.listTickerTypes(assetClass, locale)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listTickerTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listTickerTypes")
    e.printStackTrace()
}
```

### Parameters
| **assetClass** | **kotlin.String**| Filter by asset class. | [optional] [enum: stocks, options, crypto, fx, indices] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locale** | **kotlin.String**| Filter by locale. | [optional] [enum: us, global] |

### Return type

[**ListTickerTypes200Response**](ListTickerTypes200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listTickers"></a>
# **listTickers**
> ListTickers200Response listTickers(ticker, type, market, exchange, cusip, cik, date, search, active, tickerGte, tickerGt, tickerLte, tickerLt, order, limit, sort)

Tickers

Query all ticker symbols which are supported by Polygon.io. This API currently includes Stocks/Equities, Indices, Forex, and Crypto.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Specify a ticker symbol. Defaults to empty string which queries all tickers.
val type : kotlin.String = type_example // kotlin.String | Specify the type of the tickers. Find the types that we support via our [Ticker Types API](https://polygon.io/docs/stocks/get_v3_reference_tickers_types). Defaults to empty string which queries all types.
val market : kotlin.String = market_example // kotlin.String | Filter by market type. By default all markets are included.
val exchange : kotlin.String = exchange_example // kotlin.String | Specify the primary exchange of the asset in the ISO code format. Find more information about the ISO codes [at the ISO org website](https://www.iso20022.org/market-identifier-codes). Defaults to empty string which queries all exchanges.
val cusip : kotlin.String = cusip_example // kotlin.String | Specify the CUSIP code of the asset you want to search for. Find more information about CUSIP codes [at their website](https://www.cusip.com/identifiers.html#/CUSIP). Defaults to empty string which queries all CUSIPs.  Note: Although you can query by CUSIP, due to legal reasons we do not return the CUSIP in the response.
val cik : kotlin.String = cik_example // kotlin.String | Specify the CIK of the asset you want to search for. Find more information about CIK codes [at their website](https://www.sec.gov/edgar/searchedgar/cik.htm). Defaults to empty string which queries all CIKs.
val date : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Specify a point in time to retrieve tickers available on that date. Defaults to the most recent available date.
val search : kotlin.String = search_example // kotlin.String | Search for terms within the ticker and/or company name.
val active : kotlin.Boolean = true // kotlin.Boolean | Specify if the tickers returned should be actively traded on the queried date. Default is true.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Range by ticker.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Range by ticker.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Range by ticker.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Range by ticker.
val order : kotlin.String = asc // kotlin.String | Order results based on the `sort` field.
val limit : kotlin.Int = 100 // kotlin.Int | Limit the number of results returned, default is 100 and max is 1000.
val sort : kotlin.String = ticker // kotlin.String | Sort field used for ordering.
try {
    val result : ListTickers200Response = apiInstance.listTickers(ticker, type, market, exchange, cusip, cik, date, search, active, tickerGte, tickerGt, tickerLte, tickerLt, order, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listTickers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listTickers")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Specify a ticker symbol. Defaults to empty string which queries all tickers. | [optional] |
| **type** | **kotlin.String**| Specify the type of the tickers. Find the types that we support via our [Ticker Types API](https://polygon.io/docs/stocks/get_v3_reference_tickers_types). Defaults to empty string which queries all types. | [optional] [enum: CS, ADRC, ADRP, ADRR, UNIT, RIGHT, PFD, FUND, SP, WARRANT, INDEX, ETF, ETN, OS, GDR, OTHER, NYRS, AGEN, EQLK, BOND, ADRW, BASKET, LT] |
| **market** | **kotlin.String**| Filter by market type. By default all markets are included. | [optional] [enum: stocks, crypto, fx, otc, indices] |
| **exchange** | **kotlin.String**| Specify the primary exchange of the asset in the ISO code format. Find more information about the ISO codes [at the ISO org website](https://www.iso20022.org/market-identifier-codes). Defaults to empty string which queries all exchanges. | [optional] |
| **cusip** | **kotlin.String**| Specify the CUSIP code of the asset you want to search for. Find more information about CUSIP codes [at their website](https://www.cusip.com/identifiers.html#/CUSIP). Defaults to empty string which queries all CUSIPs.  Note: Although you can query by CUSIP, due to legal reasons we do not return the CUSIP in the response. | [optional] |
| **cik** | **kotlin.String**| Specify the CIK of the asset you want to search for. Find more information about CIK codes [at their website](https://www.sec.gov/edgar/searchedgar/cik.htm). Defaults to empty string which queries all CIKs. | [optional] |
| **date** | **java.time.LocalDate**| Specify a point in time to retrieve tickers available on that date. Defaults to the most recent available date. | [optional] |
| **search** | **kotlin.String**| Search for terms within the ticker and/or company name. | [optional] |
| **active** | **kotlin.Boolean**| Specify if the tickers returned should be actively traded on the queried date. Default is true. | [optional] |
| **tickerGte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerGt** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLte** | **kotlin.String**| Range by ticker. | [optional] |
| **tickerLt** | **kotlin.String**| Range by ticker. | [optional] |
| **order** | **kotlin.String**| Order results based on the &#x60;sort&#x60; field. | [optional] [enum: asc, desc] |
| **limit** | **kotlin.Int**| Limit the number of results returned, default is 100 and max is 1000. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort field used for ordering. | [optional] [default to ticker] [enum: ticker, name, market, locale, primary_exchange, type, currency_symbol, currency_name, base_currency_symbol, base_currency_name, cik, composite_figi, share_class_figi, last_updated_utc, delisted_utc] |

### Return type

[**ListTickers200Response**](ListTickers200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

