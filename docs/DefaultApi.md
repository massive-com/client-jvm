# DefaultApi

All URIs are relative to *https://api.massive.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**contractDetails**](DefaultApi.md#contractDetails) | **GET** /futures/vX/contracts/{ticker} | Contract Details |
| [**dailySchedules**](DefaultApi.md#dailySchedules) | **GET** /futures/vX/schedules | Daily Schedules |
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
| [**getBenzingaV1Ratings**](DefaultApi.md#getBenzingaV1Ratings) | **GET** /benzinga/v1/ratings |  |
| [**getBenzingaV2News**](DefaultApi.md#getBenzingaV2News) | **GET** /benzinga/v2/news |  |
| [**getCryptoAggregates**](DefaultApi.md#getCryptoAggregates) | **GET** /v2/aggs/ticker/{cryptoTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getCryptoOpenClose**](DefaultApi.md#getCryptoOpenClose) | **GET** /v1/open-close/crypto/{from}/{to}/{date} | Daily Open/Close |
| [**getCryptoSnapshotDirection**](DefaultApi.md#getCryptoSnapshotDirection) | **GET** /v2/snapshot/locale/global/markets/crypto/{direction} | Gainers/Losers |
| [**getCryptoSnapshotTicker**](DefaultApi.md#getCryptoSnapshotTicker) | **GET** /v2/snapshot/locale/global/markets/crypto/tickers/{ticker} | Ticker |
| [**getCryptoSnapshotTickers**](DefaultApi.md#getCryptoSnapshotTickers) | **GET** /v2/snapshot/locale/global/markets/crypto/tickers | All Tickers |
| [**getCryptoV1Exchanges**](DefaultApi.md#getCryptoV1Exchanges) | **GET** /crypto/v1/exchanges |  |
| [**getCurrencyConversion**](DefaultApi.md#getCurrencyConversion) | **GET** /v1/conversion/{from}/{to} | Real-time Currency Conversion |
| [**getEtfGlobalV1Analytics**](DefaultApi.md#getEtfGlobalV1Analytics) | **GET** /etf-global/v1/analytics |  |
| [**getEtfGlobalV1Constituents**](DefaultApi.md#getEtfGlobalV1Constituents) | **GET** /etf-global/v1/constituents |  |
| [**getEtfGlobalV1FundFlows**](DefaultApi.md#getEtfGlobalV1FundFlows) | **GET** /etf-global/v1/fund-flows |  |
| [**getEtfGlobalV1Profiles**](DefaultApi.md#getEtfGlobalV1Profiles) | **GET** /etf-global/v1/profiles |  |
| [**getEtfGlobalV1Taxonomies**](DefaultApi.md#getEtfGlobalV1Taxonomies) | **GET** /etf-global/v1/taxonomies |  |
| [**getEvents**](DefaultApi.md#getEvents) | **GET** /vX/reference/tickers/{id}/events | Ticker Events |
| [**getFedV1Inflation**](DefaultApi.md#getFedV1Inflation) | **GET** /fed/v1/inflation |  |
| [**getFedV1InflationExpectations**](DefaultApi.md#getFedV1InflationExpectations) | **GET** /fed/v1/inflation-expectations |  |
| [**getFedV1TreasuryYields**](DefaultApi.md#getFedV1TreasuryYields) | **GET** /fed/v1/treasury-yields |  |
| [**getForexAggregates**](DefaultApi.md#getForexAggregates) | **GET** /v2/aggs/ticker/{forexTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getForexSnapshotDirection**](DefaultApi.md#getForexSnapshotDirection) | **GET** /v2/snapshot/locale/global/markets/forex/{direction} | Gainers/Losers |
| [**getForexSnapshotTicker**](DefaultApi.md#getForexSnapshotTicker) | **GET** /v2/snapshot/locale/global/markets/forex/tickers/{ticker} | Ticker |
| [**getForexSnapshotTickers**](DefaultApi.md#getForexSnapshotTickers) | **GET** /v2/snapshot/locale/global/markets/forex/tickers | All Tickers |
| [**getForexV1Exchanges**](DefaultApi.md#getForexV1Exchanges) | **GET** /forex/v1/exchanges |  |
| [**getFuturesAggregates**](DefaultApi.md#getFuturesAggregates) | **GET** /futures/vX/aggs/{ticker} | Aggregates |
| [**getFuturesQuotes**](DefaultApi.md#getFuturesQuotes) | **GET** /futures/vX/quotes/{ticker} | Quotes |
| [**getFuturesTrades**](DefaultApi.md#getFuturesTrades) | **GET** /futures/vX/trades/{ticker} | Trades |
| [**getFuturesVXContractsNew**](DefaultApi.md#getFuturesVXContractsNew) | **GET** /futures/vX/contracts-new | futures_contracts_v1 API |
| [**getFuturesVXExchanges**](DefaultApi.md#getFuturesVXExchanges) | **GET** /futures/vX/exchanges |  |
| [**getFuturesVXProductsNew**](DefaultApi.md#getFuturesVXProductsNew) | **GET** /futures/vX/products-new | Futures Products API |
| [**getFuturesVXSnapshot**](DefaultApi.md#getFuturesVXSnapshot) | **GET** /futures/vX/snapshot | futures_snapshot_v1 API |
| [**getGroupedCryptoAggregates**](DefaultApi.md#getGroupedCryptoAggregates) | **GET** /v2/aggs/grouped/locale/global/market/crypto/{date} | Grouped Daily (Bars) |
| [**getGroupedForexAggregates**](DefaultApi.md#getGroupedForexAggregates) | **GET** /v2/aggs/grouped/locale/global/market/fx/{date} | Grouped Daily (Bars) |
| [**getGroupedStocksAggregates**](DefaultApi.md#getGroupedStocksAggregates) | **GET** /v2/aggs/grouped/locale/us/market/stocks/{date} | Grouped Daily (Bars) |
| [**getIndicesAggregates**](DefaultApi.md#getIndicesAggregates) | **GET** /v2/aggs/ticker/{indicesTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getIndicesOpenClose**](DefaultApi.md#getIndicesOpenClose) | **GET** /v1/open-close/{indicesTicker}/{date} | Daily Open/Close |
| [**getIndicesSnapshot**](DefaultApi.md#getIndicesSnapshot) | **GET** /v3/snapshot/indices | Indices Snapshot |
| [**getLastCryptoTrade**](DefaultApi.md#getLastCryptoTrade) | **GET** /v1/last/crypto/{from}/{to} | Last Trade for a Crypto Pair |
| [**getLastCurrencyQuote**](DefaultApi.md#getLastCurrencyQuote) | **GET** /v1/last_quote/currencies/{from}/{to} | Last Quote for a Currency Pair |
| [**getLastStocksQuote**](DefaultApi.md#getLastStocksQuote) | **GET** /v2/last/nbbo/{stocksTicker} | Last Quote |
| [**getLastStocksTrade**](DefaultApi.md#getLastStocksTrade) | **GET** /v2/last/trade/{stocksTicker} | Last Trade |
| [**getMarketHolidays**](DefaultApi.md#getMarketHolidays) | **GET** /v1/marketstatus/upcoming | Market Holidays |
| [**getMarketStatus**](DefaultApi.md#getMarketStatus) | **GET** /v1/marketstatus/now | Market Status |
| [**getOptionContract**](DefaultApi.md#getOptionContract) | **GET** /v3/snapshot/options/{underlyingAsset}/{optionContract} | Option Contract |
| [**getOptionsAggregates**](DefaultApi.md#getOptionsAggregates) | **GET** /v2/aggs/ticker/{optionsTicker}/range/{multiplier}/{timespan}/{from}/{to} | Aggregates (Bars) |
| [**getOptionsChain**](DefaultApi.md#getOptionsChain) | **GET** /v3/snapshot/options/{underlyingAsset} | Options Chain |
| [**getOptionsContract**](DefaultApi.md#getOptionsContract) | **GET** /v3/reference/options/contracts/{options_ticker} | Options Contract |
| [**getOptionsOpenClose**](DefaultApi.md#getOptionsOpenClose) | **GET** /v1/open-close/{optionsTicker}/{date} | Daily Open/Close |
| [**getOptionsV1Exchanges**](DefaultApi.md#getOptionsV1Exchanges) | **GET** /options/v1/exchanges |  |
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
| [**getStocksFinancialsV1BalanceSheets**](DefaultApi.md#getStocksFinancialsV1BalanceSheets) | **GET** /stocks/financials/v1/balance-sheets |  |
| [**getStocksFinancialsV1CashFlowStatements**](DefaultApi.md#getStocksFinancialsV1CashFlowStatements) | **GET** /stocks/financials/v1/cash-flow-statements |  |
| [**getStocksFinancialsV1IncomeStatements**](DefaultApi.md#getStocksFinancialsV1IncomeStatements) | **GET** /stocks/financials/v1/income-statements |  |
| [**getStocksFinancialsV1Ratios**](DefaultApi.md#getStocksFinancialsV1Ratios) | **GET** /stocks/financials/v1/ratios |  |
| [**getStocksMACD**](DefaultApi.md#getStocksMACD) | **GET** /v1/indicators/macd/{stockTicker} | Moving Average Convergence/Divergence (MACD) |
| [**getStocksOpenClose**](DefaultApi.md#getStocksOpenClose) | **GET** /v1/open-close/{stocksTicker}/{date} | Daily Open/Close |
| [**getStocksQuotes**](DefaultApi.md#getStocksQuotes) | **GET** /v3/quotes/{stockTicker} | Quotes (NBBO) |
| [**getStocksRSI**](DefaultApi.md#getStocksRSI) | **GET** /v1/indicators/rsi/{stockTicker} | Relative Strength Index (RSI) |
| [**getStocksSMA**](DefaultApi.md#getStocksSMA) | **GET** /v1/indicators/sma/{stockTicker} | Simple Moving Average (SMA) |
| [**getStocksSnapshotDirection**](DefaultApi.md#getStocksSnapshotDirection) | **GET** /v2/snapshot/locale/us/markets/stocks/{direction} | Gainers/Losers |
| [**getStocksSnapshotTicker**](DefaultApi.md#getStocksSnapshotTicker) | **GET** /v2/snapshot/locale/us/markets/stocks/tickers/{stocksTicker} | Ticker |
| [**getStocksSnapshotTickers**](DefaultApi.md#getStocksSnapshotTickers) | **GET** /v2/snapshot/locale/us/markets/stocks/tickers | All Tickers |
| [**getStocksTrades**](DefaultApi.md#getStocksTrades) | **GET** /v3/trades/{stockTicker} | Trades |
| [**getStocksV1Dividends**](DefaultApi.md#getStocksV1Dividends) | **GET** /stocks/v1/dividends |  |
| [**getStocksV1Exchanges**](DefaultApi.md#getStocksV1Exchanges) | **GET** /stocks/v1/exchanges |  |
| [**getStocksV1ShortInterest**](DefaultApi.md#getStocksV1ShortInterest) | **GET** /stocks/v1/short-interest |  |
| [**getStocksV1ShortVolume**](DefaultApi.md#getStocksV1ShortVolume) | **GET** /stocks/v1/short-volume |  |
| [**getStocksV1Splits**](DefaultApi.md#getStocksV1Splits) | **GET** /stocks/v1/splits |  |
| [**getTicker**](DefaultApi.md#getTicker) | **GET** /v3/reference/tickers/{ticker} | Ticker Details v3 |
| [**getTmxV1CorporateEvents**](DefaultApi.md#getTmxV1CorporateEvents) | **GET** /tmx/v1/corporate-events |  |
| [**listConditions**](DefaultApi.md#listConditions) | **GET** /v3/reference/conditions | Conditions |
| [**listContracts**](DefaultApi.md#listContracts) | **GET** /futures/vX/contracts | Contracts |
| [**listDividends**](DefaultApi.md#listDividends) | **GET** /v3/reference/dividends | Dividends v3 |
| [**listExchanges**](DefaultApi.md#listExchanges) | **GET** /v3/reference/exchanges | Exchanges |
| [**listFinancials**](DefaultApi.md#listFinancials) | **GET** /vX/reference/financials | Stock Financials vX |
| [**listIPOs**](DefaultApi.md#listIPOs) | **GET** /vX/reference/ipos | IPOs |
| [**listMarketStatuses**](DefaultApi.md#listMarketStatuses) | **GET** /futures/vX/market-status | Market Status |
| [**listNews**](DefaultApi.md#listNews) | **GET** /v2/reference/news | Ticker News |
| [**listOptionsContracts**](DefaultApi.md#listOptionsContracts) | **GET** /v3/reference/options/contracts | Options Contracts |
| [**listProducts**](DefaultApi.md#listProducts) | **GET** /futures/vX/products | Products |
| [**listStockSplits**](DefaultApi.md#listStockSplits) | **GET** /v3/reference/splits | Stock Splits v3 |
| [**listTickerTypes**](DefaultApi.md#listTickerTypes) | **GET** /v3/reference/tickers/types | Ticker Types |
| [**listTickers**](DefaultApi.md#listTickers) | **GET** /v3/reference/tickers | Tickers |
| [**productDetails**](DefaultApi.md#productDetails) | **GET** /futures/vX/products/{product_code} | Product Details |
| [**productSchedules**](DefaultApi.md#productSchedules) | **GET** /futures/vX/products/{product_code}/schedules | Product Schedules |


<a id="contractDetails"></a>
# **contractDetails**
> ContractDetails200Response contractDetails(ticker, asOf)

Contract Details

The Contract Details endpoint returns the details for a single contract at a specific point in time.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ESU0 // kotlin.String | The ticker symbol of the contract to retrieve.
val asOf : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | The point-in-time of the data to be retrieved. Note that the contract data returned for a given date represents the state of that contract on that day. A date in the format YYYY-MM-DD (default=today).
try {
    val result : ContractDetails200Response = apiInstance.contractDetails(ticker, asOf)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#contractDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#contractDetails")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The ticker symbol of the contract to retrieve. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **asOf** | **java.time.LocalDate**| The point-in-time of the data to be retrieved. Note that the contract data returned for a given date represents the state of that contract on that day. A date in the format YYYY-MM-DD (default&#x3D;today). | [optional] |

### Return type

[**ContractDetails200Response**](ContractDetails200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="dailySchedules"></a>
# **dailySchedules**
> DailySchedules200Response dailySchedules(sessionEndDate, tradingVenue, limit, sort)

Daily Schedules

The Trading-Date Based Futures Schedules API provides detailed trading schedules for all products on a specific day. This API allows you to retrieve detailed information about trading sessions, including market events like preopen, open, and closed, along with their precise timestamps.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val sessionEndDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | The session end date for the schedules (also known as the trading date). This is the day in CT for which the user wants to retrieve data. If left blank, this value defaults to 'today' in Central Time. e.g. If a request is made from Pacific Time on '2025-01-01' at 11:00 pm with no 'session_end_date' a default value of `2025-01-02` will be used.
val tradingVenue : kotlin.String = tradingVenue_example // kotlin.String | The trading venue (MIC) of the exchange for the schedules.
val limit : kotlin.Int = 56 // kotlin.Int | The number of results to return per page (default=100, max=1000, min=1).
val sort : kotlin.String = trading_venue.asc // kotlin.String | Sort results by field and direction using dotted notation (e.g., 'ticker.asc', 'name.desc').
try {
    val result : DailySchedules200Response = apiInstance.dailySchedules(sessionEndDate, tradingVenue, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#dailySchedules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#dailySchedules")
    e.printStackTrace()
}
```

### Parameters
| **sessionEndDate** | **java.time.LocalDate**| The session end date for the schedules (also known as the trading date). This is the day in CT for which the user wants to retrieve data. If left blank, this value defaults to &#39;today&#39; in Central Time. e.g. If a request is made from Pacific Time on &#39;2025-01-01&#39; at 11:00 pm with no &#39;session_end_date&#39; a default value of &#x60;2025-01-02&#x60; will be used. | [optional] |
| **tradingVenue** | **kotlin.String**| The trading venue (MIC) of the exchange for the schedules. | [optional] |
| **limit** | **kotlin.Int**| The number of results to return per page (default&#x3D;100, max&#x3D;1000, min&#x3D;1). | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort results by field and direction using dotted notation (e.g., &#39;ticker.asc&#39;, &#39;name.desc&#39;). | [optional] [default to trading_venue.asc] [enum: trading_venue.asc, trading_venue.desc] |

### Return type

[**DailySchedules200Response**](DailySchedules200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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
> GetBenzingaV1AnalystInsights200Response getBenzingaV1AnalystInsights(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, lastUpdated, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, firm, firmAnyOf, firmGt, firmGte, firmLt, firmLte, ratingAction, ratingActionAnyOf, ratingActionGt, ratingActionGte, ratingActionLt, ratingActionLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, benzingaRatingId, benzingaRatingIdAnyOf, benzingaRatingIdGt, benzingaRatingIdGte, benzingaRatingIdLt, benzingaRatingIdLte, limit, sort)



A comprehensive database of financial analyst insights and ratings for various publicly traded companies, capturing detailed information about analyst recommendations and price targets.

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
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedGt : kotlin.String = lastUpdatedGt_example // kotlin.String | Filter greater than the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedGte : kotlin.String = lastUpdatedGte_example // kotlin.String | Filter greater than or equal to the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedLt : kotlin.String = lastUpdatedLt_example // kotlin.String | Filter less than the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedLte : kotlin.String = lastUpdatedLte_example // kotlin.String | Filter less than or equal to the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val firm : kotlin.String = firm_example // kotlin.String | The name of the research firm or investment bank issuing the rating.
val firmAnyOf : kotlin.String = firmAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val firmGt : kotlin.String = firmGt_example // kotlin.String | Filter greater than the value.
val firmGte : kotlin.String = firmGte_example // kotlin.String | Filter greater than or equal to the value.
val firmLt : kotlin.String = firmLt_example // kotlin.String | Filter less than the value.
val firmLte : kotlin.String = firmLte_example // kotlin.String | Filter less than or equal to the value.
val ratingAction : kotlin.String = ratingAction_example // kotlin.String | The description of the change in rating from the firm's last rating. Possible values include: downgrades, maintains, reinstates, reiterates, upgrades, assumes, initiates_coverage_on, terminates_coverage_on, removes, suspends, firm_dissolved.
val ratingActionAnyOf : kotlin.String = ratingActionAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val ratingActionGt : kotlin.String = ratingActionGt_example // kotlin.String | Filter greater than the value.
val ratingActionGte : kotlin.String = ratingActionGte_example // kotlin.String | Filter greater than or equal to the value.
val ratingActionLt : kotlin.String = ratingActionLt_example // kotlin.String | Filter less than the value.
val ratingActionLte : kotlin.String = ratingActionLte_example // kotlin.String | Filter less than or equal to the value.
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
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'last_updated' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetBenzingaV1AnalystInsights200Response = apiInstance.getBenzingaV1AnalystInsights(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, lastUpdated, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, firm, firmAnyOf, firmGt, firmGte, firmLt, firmLte, ratingAction, ratingActionAnyOf, ratingActionGt, ratingActionGte, ratingActionLt, ratingActionLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, benzingaRatingId, benzingaRatingIdAnyOf, benzingaRatingIdGt, benzingaRatingIdGte, benzingaRatingIdLt, benzingaRatingIdLte, limit, sort)
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
| **lastUpdated** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedGt** | **kotlin.String**| Filter greater than the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedLt** | **kotlin.String**| Filter less than the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedLte** | **kotlin.String**| Filter less than or equal to the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **firm** | **kotlin.String**| The name of the research firm or investment bank issuing the rating. | [optional] |
| **firmAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **firmGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **firmGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **firmLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **firmLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ratingAction** | **kotlin.String**| The description of the change in rating from the firm&#39;s last rating. Possible values include: downgrades, maintains, reinstates, reiterates, upgrades, assumes, initiates_coverage_on, terminates_coverage_on, removes, suspends, firm_dissolved. | [optional] |
| **ratingActionAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **ratingActionGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **ratingActionGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **ratingActionLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **ratingActionLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
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
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;last_updated&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;last_updated.desc&quot;] |

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



A comprehensive database of financial analysts, containing detailed performance metrics and identification information for individual analysts across various financial firms.

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
> GetBenzingaV1ConsensusRatings200Response getBenzingaV1ConsensusRatings(ticker, date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, limit)



A comprehensive financial consensus ratings table that aggregates analyst recommendations and price targets for individual stock tickers, capturing detailed rating breakdowns and statistical insights.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | The requested ticker.
val date : kotlin.String = date_example // kotlin.String | The date range to aggregate analyst ratings over. For example, date.gte=2024-10-01 and date.lt=2025-01-01 for ratings published in Q4 2024. By default, all ratings are aggregated regardless of date.
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
try {
    val result : GetBenzingaV1ConsensusRatings200Response = apiInstance.getBenzingaV1ConsensusRatings(ticker, date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, limit)
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
| **date** | **kotlin.String**| The date range to aggregate analyst ratings over. For example, date.gte&#x3D;2024-10-01 and date.lt&#x3D;2025-01-01 for ratings published in Q4 2024. By default, all ratings are aggregated regardless of date. | [optional] |
| **dateAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
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



This table contains earnings data from Benzinga, tracking both actual and estimated financial metrics for publicly traded companies. It includes EPS and revenue figures with surprise calculations, along with metadata like fiscal periods, company identifiers, and reporting timestamps.

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
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the record was last updated in the system. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedAnyOf : kotlin.String = lastUpdatedAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedGt : kotlin.String = lastUpdatedGt_example // kotlin.String | Filter greater than the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedGte : kotlin.String = lastUpdatedGte_example // kotlin.String | Filter greater than or equal to the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedLt : kotlin.String = lastUpdatedLt_example // kotlin.String | Filter less than the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedLte : kotlin.String = lastUpdatedLte_example // kotlin.String | Filter less than or equal to the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
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
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'last_updated' if not specified. The sort order defaults to 'desc' if not specified.
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
| **lastUpdated** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the record was last updated in the system. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedGt** | **kotlin.String**| Filter greater than the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedLt** | **kotlin.String**| Filter less than the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedLte** | **kotlin.String**| Filter less than or equal to the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
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
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;last_updated&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;last_updated.desc&quot;] |

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



A comprehensive database of financial firms, tracking unique identifiers, names, and basic metadata for various financial institutions and research firms.

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



A comprehensive database of financial guidance and earnings estimates for various companies, capturing key metrics related to earnings per share (EPS) and revenue projections across different fiscal periods.

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

<a id="getBenzingaV1Ratings"></a>
# **getBenzingaV1Ratings**
> GetBenzingaV1Ratings200Response getBenzingaV1Ratings(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, importance, importanceGt, importanceGte, importanceLt, importanceLte, lastUpdated, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, ratingAction, ratingActionAnyOf, ratingActionGt, ratingActionGte, ratingActionLt, ratingActionLte, priceTargetAction, priceTargetActionAnyOf, priceTargetActionGt, priceTargetActionGte, priceTargetActionLt, priceTargetActionLte, benzingaId, benzingaIdAnyOf, benzingaIdGt, benzingaIdGte, benzingaIdLt, benzingaIdLte, benzingaAnalystId, benzingaAnalystIdAnyOf, benzingaAnalystIdGt, benzingaAnalystIdGte, benzingaAnalystIdLt, benzingaAnalystIdLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, limit, sort)



This table contains analyst ratings and price target data from investment firms, tracking rating changes (upgrades, downgrades, initiates coverage, etc.) and price target adjustments for publicly traded companies. Each record includes the analyst details, company information, current and previous ratings/targets, and metadata like timestamps and Benzinga identifiers.

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
val importanceGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val importanceGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val importanceLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val importanceLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val lastUpdated : kotlin.String = lastUpdated_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedGt : kotlin.String = lastUpdatedGt_example // kotlin.String | Filter greater than the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedGte : kotlin.String = lastUpdatedGte_example // kotlin.String | Filter greater than or equal to the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedLt : kotlin.String = lastUpdatedLt_example // kotlin.String | Filter less than the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val lastUpdatedLte : kotlin.String = lastUpdatedLte_example // kotlin.String | Filter less than or equal to the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
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
val benzingaAnalystId : kotlin.String = benzingaAnalystId_example // kotlin.String | The identifer used by Benzinga for this analyst.
val benzingaAnalystIdAnyOf : kotlin.String = benzingaAnalystIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaAnalystIdGt : kotlin.String = benzingaAnalystIdGt_example // kotlin.String | Filter greater than the value.
val benzingaAnalystIdGte : kotlin.String = benzingaAnalystIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaAnalystIdLt : kotlin.String = benzingaAnalystIdLt_example // kotlin.String | Filter less than the value.
val benzingaAnalystIdLte : kotlin.String = benzingaAnalystIdLte_example // kotlin.String | Filter less than or equal to the value.
val benzingaFirmId : kotlin.String = benzingaFirmId_example // kotlin.String | The identifer used by Benzinga for this firm.
val benzingaFirmIdAnyOf : kotlin.String = benzingaFirmIdAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val benzingaFirmIdGt : kotlin.String = benzingaFirmIdGt_example // kotlin.String | Filter greater than the value.
val benzingaFirmIdGte : kotlin.String = benzingaFirmIdGte_example // kotlin.String | Filter greater than or equal to the value.
val benzingaFirmIdLt : kotlin.String = benzingaFirmIdLt_example // kotlin.String | Filter less than the value.
val benzingaFirmIdLte : kotlin.String = benzingaFirmIdLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'last_updated' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetBenzingaV1Ratings200Response = apiInstance.getBenzingaV1Ratings(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, importance, importanceGt, importanceGte, importanceLt, importanceLte, lastUpdated, lastUpdatedGt, lastUpdatedGte, lastUpdatedLt, lastUpdatedLte, ratingAction, ratingActionAnyOf, ratingActionGt, ratingActionGte, ratingActionLt, ratingActionLte, priceTargetAction, priceTargetActionAnyOf, priceTargetActionGt, priceTargetActionGte, priceTargetActionLt, priceTargetActionLte, benzingaId, benzingaIdAnyOf, benzingaIdGt, benzingaIdGte, benzingaIdLt, benzingaIdLte, benzingaAnalystId, benzingaAnalystIdAnyOf, benzingaAnalystIdGt, benzingaAnalystIdGte, benzingaAnalystIdLt, benzingaAnalystIdLte, benzingaFirmId, benzingaFirmIdAnyOf, benzingaFirmIdGt, benzingaFirmIdGte, benzingaFirmIdLt, benzingaFirmIdLte, limit, sort)
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
| **importanceGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **importanceGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **importanceLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **importanceLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **lastUpdated** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedGt** | **kotlin.String**| Filter greater than the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedLt** | **kotlin.String**| Filter less than the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastUpdatedLte** | **kotlin.String**| Filter less than or equal to the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
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
| **benzingaAnalystId** | **kotlin.String**| The identifer used by Benzinga for this analyst. | [optional] |
| **benzingaAnalystIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaAnalystIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaAnalystIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaAnalystIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaAnalystIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **benzingaFirmId** | **kotlin.String**| The identifer used by Benzinga for this firm. | [optional] |
| **benzingaFirmIdAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **benzingaFirmIdGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **benzingaFirmIdGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **benzingaFirmIdLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **benzingaFirmIdLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;last_updated&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;last_updated.desc&quot;] |

### Return type

[**GetBenzingaV1Ratings200Response**](GetBenzingaV1Ratings200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBenzingaV2News"></a>
# **getBenzingaV2News**
> GetBenzingaV2News200Response getBenzingaV2News(published, publishedGt, publishedGte, publishedLt, publishedLte, channels, channelsAllOf, channelsAnyOf, tags, tagsAllOf, tagsAnyOf, author, authorAnyOf, authorGt, authorGte, authorLt, authorLte, stocks, stocksAllOf, stocksAnyOf, tickers, tickersAllOf, tickersAnyOf, limit, sort)



A comprehensive news article database from Benzinga, containing detailed information about financial news articles including metadata, content, and associated financial information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val published : kotlin.String = published_example // kotlin.String | The timestamp (formatted as an ISO 8601 timestamp) when the news article was originally published. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val publishedGt : kotlin.String = publishedGt_example // kotlin.String | Filter greater than the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val publishedGte : kotlin.String = publishedGte_example // kotlin.String | Filter greater than or equal to the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val publishedLt : kotlin.String = publishedLt_example // kotlin.String | Filter less than the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
val publishedLte : kotlin.String = publishedLte_example // kotlin.String | Filter less than or equal to the value. Value must be an integer timestamp in seconds or formatted 'yyyy-mm-dd'.
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
val stocks : kotlin.String = stocks_example // kotlin.String | Filter for arrays that contain the value.
val stocksAllOf : kotlin.String = stocksAllOf_example // kotlin.String | Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list.
val stocksAnyOf : kotlin.String = stocksAnyOf_example // kotlin.String | Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list.
val tickers : kotlin.String = tickers_example // kotlin.String | Filter for arrays that contain the value.
val tickersAllOf : kotlin.String = tickersAllOf_example // kotlin.String | Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list.
val tickersAnyOf : kotlin.String = tickersAnyOf_example // kotlin.String | Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'published' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetBenzingaV2News200Response = apiInstance.getBenzingaV2News(published, publishedGt, publishedGte, publishedLt, publishedLte, channels, channelsAllOf, channelsAnyOf, tags, tagsAllOf, tagsAnyOf, author, authorAnyOf, authorGt, authorGte, authorLt, authorLte, stocks, stocksAllOf, stocksAnyOf, tickers, tickersAllOf, tickersAnyOf, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBenzingaV2News")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBenzingaV2News")
    e.printStackTrace()
}
```

### Parameters
| **published** | **kotlin.String**| The timestamp (formatted as an ISO 8601 timestamp) when the news article was originally published. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **publishedGt** | **kotlin.String**| Filter greater than the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **publishedGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **publishedLt** | **kotlin.String**| Filter less than the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **publishedLte** | **kotlin.String**| Filter less than or equal to the value. Value must be an integer timestamp in seconds or formatted &#39;yyyy-mm-dd&#39;. | [optional] |
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
| **stocks** | **kotlin.String**| Filter for arrays that contain the value. | [optional] |
| **stocksAllOf** | **kotlin.String**| Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **stocksAnyOf** | **kotlin.String**| Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickers** | **kotlin.String**| Filter for arrays that contain the value. | [optional] |
| **tickersAllOf** | **kotlin.String**| Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickersAnyOf** | **kotlin.String**| Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;published&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;published.desc&quot;] |

### Return type

[**GetBenzingaV2News200Response**](GetBenzingaV2News200Response.md)

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
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://massive.com/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
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
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://massive.com/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

### Return type

[**GetCryptoAggregates200Response**](GetCryptoAggregates200Response.md)

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

<a id="getCryptoV1Exchanges"></a>
# **getCryptoV1Exchanges**
> GetCryptoV1Exchanges200Response getCryptoV1Exchanges(limit)



Global cryptocurrency exchanges and digital asset trading platforms, including major centralized exchanges (Coinbase, Binance, Bitfinex, etc.) that facilitate trading of cryptocurrencies and digital tokens worldwide.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '999'.
try {
    val result : GetCryptoV1Exchanges200Response = apiInstance.getCryptoV1Exchanges(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCryptoV1Exchanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCryptoV1Exchanges")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;999&#39;. | [optional] [default to 100] |

### Return type

[**GetCryptoV1Exchanges200Response**](GetCryptoV1Exchanges200Response.md)

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

<a id="getEtfGlobalV1Analytics"></a>
# **getEtfGlobalV1Analytics**
> GetEtfGlobalV1Analytics200Response getEtfGlobalV1Analytics(compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, riskTotalScore, riskTotalScoreGt, riskTotalScoreGte, riskTotalScoreLt, riskTotalScoreLte, rewardScore, rewardScoreGt, rewardScoreGte, rewardScoreLt, rewardScoreLte, quantTotalScore, quantTotalScoreGt, quantTotalScoreGte, quantTotalScoreLt, quantTotalScoreLte, quantGrade, quantGradeAnyOf, quantGradeGt, quantGradeGte, quantGradeLt, quantGradeLte, quantCompositeTechnical, quantCompositeTechnicalGt, quantCompositeTechnicalGte, quantCompositeTechnicalLt, quantCompositeTechnicalLte, quantCompositeSentiment, quantCompositeSentimentGt, quantCompositeSentimentGte, quantCompositeSentimentLt, quantCompositeSentimentLte, quantCompositeBehavioral, quantCompositeBehavioralGt, quantCompositeBehavioralGte, quantCompositeBehavioralLt, quantCompositeBehavioralLte, quantCompositeFundamental, quantCompositeFundamentalGt, quantCompositeFundamentalGte, quantCompositeFundamentalLt, quantCompositeFundamentalLte, quantCompositeGlobal, quantCompositeGlobalGt, quantCompositeGlobalGte, quantCompositeGlobalLt, quantCompositeGlobalLte, quantCompositeQuality, quantCompositeQualityGt, quantCompositeQualityGte, quantCompositeQualityLt, quantCompositeQualityLte, limit, sort)



ETF Global analytics data containing risk scores, reward metrics, and quantitative analysis for ETF composite tickers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val compositeTicker : kotlin.String = compositeTicker_example // kotlin.String | The stock ticker symbol used to identify this ETF product on exchanges.
val compositeTickerAnyOf : kotlin.String = compositeTickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val compositeTickerGt : kotlin.String = compositeTickerGt_example // kotlin.String | Filter greater than the value.
val compositeTickerGte : kotlin.String = compositeTickerGte_example // kotlin.String | Filter greater than or equal to the value.
val compositeTickerLt : kotlin.String = compositeTickerLt_example // kotlin.String | Filter less than the value.
val compositeTickerLte : kotlin.String = compositeTickerLte_example // kotlin.String | Filter less than or equal to the value.
val processedDate : kotlin.String = processedDate_example // kotlin.String | The date showing when ETF Global received and processed the data. Value must be formatted 'yyyy-mm-dd'.
val processedDateGt : kotlin.String = processedDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateGte : kotlin.String = processedDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLt : kotlin.String = processedDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLte : kotlin.String = processedDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDate : kotlin.String = effectiveDate_example // kotlin.String | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGt : kotlin.String = effectiveDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGte : kotlin.String = effectiveDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLt : kotlin.String = effectiveDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLte : kotlin.String = effectiveDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val riskTotalScore : kotlin.Double = 1.2 // kotlin.Double | ETF Global's proprietary Red Diamond overall risk assessment score for the ETF. Value must be a floating point number.
val riskTotalScoreGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val riskTotalScoreGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val riskTotalScoreLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val riskTotalScoreLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val rewardScore : kotlin.Double = 1.2 // kotlin.Double | ETF Global's proprietary Green Diamond score measuring the potential reward and return prospects of the ETF. Value must be a floating point number.
val rewardScoreGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val rewardScoreGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val rewardScoreLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val rewardScoreLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val quantTotalScore : kotlin.Double = 1.2 // kotlin.Double | ETF Global's comprehensive quantitative analysis score combining all quantitative factors. Value must be a floating point number.
val quantTotalScoreGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val quantTotalScoreGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val quantTotalScoreLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val quantTotalScoreLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val quantGrade : kotlin.String = quantGrade_example // kotlin.String | Letter grade summarizing the ETF's overall quantitative assessment, where A = 71-100, B = 56-70, etc.
val quantGradeAnyOf : kotlin.String = quantGradeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val quantGradeGt : kotlin.String = quantGradeGt_example // kotlin.String | Filter greater than the value.
val quantGradeGte : kotlin.String = quantGradeGte_example // kotlin.String | Filter greater than or equal to the value.
val quantGradeLt : kotlin.String = quantGradeLt_example // kotlin.String | Filter less than the value.
val quantGradeLte : kotlin.String = quantGradeLte_example // kotlin.String | Filter less than or equal to the value.
val quantCompositeTechnical : kotlin.Double = 1.2 // kotlin.Double | Combined technical analysis score aggregating short, intermediate, and long-term technical factors. Value must be a floating point number.
val quantCompositeTechnicalGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val quantCompositeTechnicalGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val quantCompositeTechnicalLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val quantCompositeTechnicalLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val quantCompositeSentiment : kotlin.Double = 1.2 // kotlin.Double | Overall market sentiment score combining put/call ratios, short interest, and implied volatility. Value must be a floating point number.
val quantCompositeSentimentGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val quantCompositeSentimentGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val quantCompositeSentimentLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val quantCompositeSentimentLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val quantCompositeBehavioral : kotlin.Double = 1.2 // kotlin.Double | Behavioral analysis score measuring investor psychology and market behavior patterns. Value must be a floating point number.
val quantCompositeBehavioralGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val quantCompositeBehavioralGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val quantCompositeBehavioralLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val quantCompositeBehavioralLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val quantCompositeFundamental : kotlin.Double = 1.2 // kotlin.Double | Overall fundamental analysis score combining P/E, P/CF, P/B, and dividend yield metrics. Value must be a floating point number.
val quantCompositeFundamentalGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val quantCompositeFundamentalGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val quantCompositeFundamentalLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val quantCompositeFundamentalLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val quantCompositeGlobal : kotlin.Double = 1.2 // kotlin.Double | Overall global theme score combining sector and country analysis for macro investment views. Value must be a floating point number.
val quantCompositeGlobalGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val quantCompositeGlobalGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val quantCompositeGlobalLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val quantCompositeGlobalLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val quantCompositeQuality : kotlin.Double = 1.2 // kotlin.Double | Overall quality assessment score combining liquidity, diversification, and issuing firm factors. Value must be a floating point number.
val quantCompositeQualityGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val quantCompositeQualityGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val quantCompositeQualityLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val quantCompositeQualityLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '5000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'composite_ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetEtfGlobalV1Analytics200Response = apiInstance.getEtfGlobalV1Analytics(compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, riskTotalScore, riskTotalScoreGt, riskTotalScoreGte, riskTotalScoreLt, riskTotalScoreLte, rewardScore, rewardScoreGt, rewardScoreGte, rewardScoreLt, rewardScoreLte, quantTotalScore, quantTotalScoreGt, quantTotalScoreGte, quantTotalScoreLt, quantTotalScoreLte, quantGrade, quantGradeAnyOf, quantGradeGt, quantGradeGte, quantGradeLt, quantGradeLte, quantCompositeTechnical, quantCompositeTechnicalGt, quantCompositeTechnicalGte, quantCompositeTechnicalLt, quantCompositeTechnicalLte, quantCompositeSentiment, quantCompositeSentimentGt, quantCompositeSentimentGte, quantCompositeSentimentLt, quantCompositeSentimentLte, quantCompositeBehavioral, quantCompositeBehavioralGt, quantCompositeBehavioralGte, quantCompositeBehavioralLt, quantCompositeBehavioralLte, quantCompositeFundamental, quantCompositeFundamentalGt, quantCompositeFundamentalGte, quantCompositeFundamentalLt, quantCompositeFundamentalLte, quantCompositeGlobal, quantCompositeGlobalGt, quantCompositeGlobalGte, quantCompositeGlobalLt, quantCompositeGlobalLte, quantCompositeQuality, quantCompositeQualityGt, quantCompositeQualityGte, quantCompositeQualityLt, quantCompositeQualityLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getEtfGlobalV1Analytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getEtfGlobalV1Analytics")
    e.printStackTrace()
}
```

### Parameters
| **compositeTicker** | **kotlin.String**| The stock ticker symbol used to identify this ETF product on exchanges. | [optional] |
| **compositeTickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **compositeTickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **compositeTickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **compositeTickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **compositeTickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **processedDate** | **kotlin.String**| The date showing when ETF Global received and processed the data. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDate** | **kotlin.String**| The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **riskTotalScore** | **kotlin.Double**| ETF Global&#39;s proprietary Red Diamond overall risk assessment score for the ETF. Value must be a floating point number. | [optional] |
| **riskTotalScoreGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **riskTotalScoreGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **riskTotalScoreLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **riskTotalScoreLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **rewardScore** | **kotlin.Double**| ETF Global&#39;s proprietary Green Diamond score measuring the potential reward and return prospects of the ETF. Value must be a floating point number. | [optional] |
| **rewardScoreGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **rewardScoreGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **rewardScoreLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **rewardScoreLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **quantTotalScore** | **kotlin.Double**| ETF Global&#39;s comprehensive quantitative analysis score combining all quantitative factors. Value must be a floating point number. | [optional] |
| **quantTotalScoreGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **quantTotalScoreGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **quantTotalScoreLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **quantTotalScoreLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **quantGrade** | **kotlin.String**| Letter grade summarizing the ETF&#39;s overall quantitative assessment, where A &#x3D; 71-100, B &#x3D; 56-70, etc. | [optional] |
| **quantGradeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **quantGradeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **quantGradeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **quantGradeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **quantGradeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **quantCompositeTechnical** | **kotlin.Double**| Combined technical analysis score aggregating short, intermediate, and long-term technical factors. Value must be a floating point number. | [optional] |
| **quantCompositeTechnicalGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **quantCompositeTechnicalGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeTechnicalLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **quantCompositeTechnicalLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeSentiment** | **kotlin.Double**| Overall market sentiment score combining put/call ratios, short interest, and implied volatility. Value must be a floating point number. | [optional] |
| **quantCompositeSentimentGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **quantCompositeSentimentGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeSentimentLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **quantCompositeSentimentLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeBehavioral** | **kotlin.Double**| Behavioral analysis score measuring investor psychology and market behavior patterns. Value must be a floating point number. | [optional] |
| **quantCompositeBehavioralGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **quantCompositeBehavioralGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeBehavioralLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **quantCompositeBehavioralLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeFundamental** | **kotlin.Double**| Overall fundamental analysis score combining P/E, P/CF, P/B, and dividend yield metrics. Value must be a floating point number. | [optional] |
| **quantCompositeFundamentalGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **quantCompositeFundamentalGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeFundamentalLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **quantCompositeFundamentalLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeGlobal** | **kotlin.Double**| Overall global theme score combining sector and country analysis for macro investment views. Value must be a floating point number. | [optional] |
| **quantCompositeGlobalGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **quantCompositeGlobalGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeGlobalLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **quantCompositeGlobalLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeQuality** | **kotlin.Double**| Overall quality assessment score combining liquidity, diversification, and issuing firm factors. Value must be a floating point number. | [optional] |
| **quantCompositeQualityGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **quantCompositeQualityGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **quantCompositeQualityLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **quantCompositeQualityLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;5000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;composite_ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;composite_ticker.asc&quot;] |

### Return type

[**GetEtfGlobalV1Analytics200Response**](GetEtfGlobalV1Analytics200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEtfGlobalV1Constituents"></a>
# **getEtfGlobalV1Constituents**
> GetEtfGlobalV1Constituents200Response getEtfGlobalV1Constituents(compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, constituentTicker, constituentTickerAnyOf, constituentTickerGt, constituentTickerGte, constituentTickerLt, constituentTickerLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, usCode, usCodeAnyOf, usCodeGt, usCodeGte, usCodeLt, usCodeLte, isin, isinAnyOf, isinGt, isinGte, isinLt, isinLte, figi, figiAnyOf, figiGt, figiGte, figiLt, figiLte, sedol, sedolAnyOf, sedolGt, sedolGte, sedolLt, sedolLte, limit, sort)



ETF Global constituents data containing detailed information about the securities held within ETFs, including weights, market values, and security identifiers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val compositeTicker : kotlin.String = compositeTicker_example // kotlin.String | The stock ticker symbol of the ETF that holds these constituent securities.
val compositeTickerAnyOf : kotlin.String = compositeTickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val compositeTickerGt : kotlin.String = compositeTickerGt_example // kotlin.String | Filter greater than the value.
val compositeTickerGte : kotlin.String = compositeTickerGte_example // kotlin.String | Filter greater than or equal to the value.
val compositeTickerLt : kotlin.String = compositeTickerLt_example // kotlin.String | Filter less than the value.
val compositeTickerLte : kotlin.String = compositeTickerLte_example // kotlin.String | Filter less than or equal to the value.
val constituentTicker : kotlin.String = constituentTicker_example // kotlin.String | The stock ticker symbol of the individual security held within the ETF.
val constituentTickerAnyOf : kotlin.String = constituentTickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val constituentTickerGt : kotlin.String = constituentTickerGt_example // kotlin.String | Filter greater than the value.
val constituentTickerGte : kotlin.String = constituentTickerGte_example // kotlin.String | Filter greater than or equal to the value.
val constituentTickerLt : kotlin.String = constituentTickerLt_example // kotlin.String | Filter less than the value.
val constituentTickerLte : kotlin.String = constituentTickerLte_example // kotlin.String | Filter less than or equal to the value.
val effectiveDate : kotlin.String = effectiveDate_example // kotlin.String | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGt : kotlin.String = effectiveDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGte : kotlin.String = effectiveDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLt : kotlin.String = effectiveDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLte : kotlin.String = effectiveDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val processedDate : kotlin.String = processedDate_example // kotlin.String | The date showing when ETF Global received and processed the data. Value must be formatted 'yyyy-mm-dd'.
val processedDateGt : kotlin.String = processedDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateGte : kotlin.String = processedDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLt : kotlin.String = processedDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLte : kotlin.String = processedDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val usCode : kotlin.String = usCode_example // kotlin.String | A unique identifier code for the constituent security in US markets.
val usCodeAnyOf : kotlin.String = usCodeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val usCodeGt : kotlin.String = usCodeGt_example // kotlin.String | Filter greater than the value.
val usCodeGte : kotlin.String = usCodeGte_example // kotlin.String | Filter greater than or equal to the value.
val usCodeLt : kotlin.String = usCodeLt_example // kotlin.String | Filter less than the value.
val usCodeLte : kotlin.String = usCodeLte_example // kotlin.String | Filter less than or equal to the value.
val isin : kotlin.String = isin_example // kotlin.String | The International Securities Identification Number, a global standard for identifying securities.
val isinAnyOf : kotlin.String = isinAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val isinGt : kotlin.String = isinGt_example // kotlin.String | Filter greater than the value.
val isinGte : kotlin.String = isinGte_example // kotlin.String | Filter greater than or equal to the value.
val isinLt : kotlin.String = isinLt_example // kotlin.String | Filter less than the value.
val isinLte : kotlin.String = isinLte_example // kotlin.String | Filter less than or equal to the value.
val figi : kotlin.String = figi_example // kotlin.String | The Financial Instrument Global Identifier, an open standard for uniquely identifying financial instruments.
val figiAnyOf : kotlin.String = figiAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val figiGt : kotlin.String = figiGt_example // kotlin.String | Filter greater than the value.
val figiGte : kotlin.String = figiGte_example // kotlin.String | Filter greater than or equal to the value.
val figiLt : kotlin.String = figiLt_example // kotlin.String | Filter less than the value.
val figiLte : kotlin.String = figiLte_example // kotlin.String | Filter less than or equal to the value.
val sedol : kotlin.String = sedol_example // kotlin.String | The Stock Exchange Daily Official List code, primarily used for securities trading in the UK.
val sedolAnyOf : kotlin.String = sedolAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val sedolGt : kotlin.String = sedolGt_example // kotlin.String | Filter greater than the value.
val sedolGte : kotlin.String = sedolGte_example // kotlin.String | Filter greater than or equal to the value.
val sedolLt : kotlin.String = sedolLt_example // kotlin.String | Filter less than the value.
val sedolLte : kotlin.String = sedolLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '5000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'composite_ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetEtfGlobalV1Constituents200Response = apiInstance.getEtfGlobalV1Constituents(compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, constituentTicker, constituentTickerAnyOf, constituentTickerGt, constituentTickerGte, constituentTickerLt, constituentTickerLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, usCode, usCodeAnyOf, usCodeGt, usCodeGte, usCodeLt, usCodeLte, isin, isinAnyOf, isinGt, isinGte, isinLt, isinLte, figi, figiAnyOf, figiGt, figiGte, figiLt, figiLte, sedol, sedolAnyOf, sedolGt, sedolGte, sedolLt, sedolLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getEtfGlobalV1Constituents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getEtfGlobalV1Constituents")
    e.printStackTrace()
}
```

### Parameters
| **compositeTicker** | **kotlin.String**| The stock ticker symbol of the ETF that holds these constituent securities. | [optional] |
| **compositeTickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **compositeTickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **compositeTickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **compositeTickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **compositeTickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **constituentTicker** | **kotlin.String**| The stock ticker symbol of the individual security held within the ETF. | [optional] |
| **constituentTickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **constituentTickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **constituentTickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **constituentTickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **constituentTickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **effectiveDate** | **kotlin.String**| The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDate** | **kotlin.String**| The date showing when ETF Global received and processed the data. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **usCode** | **kotlin.String**| A unique identifier code for the constituent security in US markets. | [optional] |
| **usCodeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **usCodeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **usCodeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **usCodeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **usCodeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **isin** | **kotlin.String**| The International Securities Identification Number, a global standard for identifying securities. | [optional] |
| **isinAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **isinGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **isinGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **isinLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **isinLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **figi** | **kotlin.String**| The Financial Instrument Global Identifier, an open standard for uniquely identifying financial instruments. | [optional] |
| **figiAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **figiGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **figiGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **figiLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **figiLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **sedol** | **kotlin.String**| The Stock Exchange Daily Official List code, primarily used for securities trading in the UK. | [optional] |
| **sedolAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **sedolGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **sedolGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **sedolLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **sedolLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;5000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;composite_ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;composite_ticker.asc&quot;] |

### Return type

[**GetEtfGlobalV1Constituents200Response**](GetEtfGlobalV1Constituents200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEtfGlobalV1FundFlows"></a>
# **getEtfGlobalV1FundFlows**
> GetEtfGlobalV1FundFlows200Response getEtfGlobalV1FundFlows(processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, limit, sort)



ETF Global fund flow data containing information about ETF share movements, net asset values, and fund flow metrics.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val processedDate : kotlin.String = processedDate_example // kotlin.String | The date showing when ETF Global received and processed the data. Value must be formatted 'yyyy-mm-dd'.
val processedDateGt : kotlin.String = processedDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateGte : kotlin.String = processedDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLt : kotlin.String = processedDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLte : kotlin.String = processedDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDate : kotlin.String = effectiveDate_example // kotlin.String | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGt : kotlin.String = effectiveDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGte : kotlin.String = effectiveDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLt : kotlin.String = effectiveDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLte : kotlin.String = effectiveDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val compositeTicker : kotlin.String = compositeTicker_example // kotlin.String | The stock ticker symbol used to identify this ETF on exchanges.
val compositeTickerAnyOf : kotlin.String = compositeTickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val compositeTickerGt : kotlin.String = compositeTickerGt_example // kotlin.String | Filter greater than the value.
val compositeTickerGte : kotlin.String = compositeTickerGte_example // kotlin.String | Filter greater than or equal to the value.
val compositeTickerLt : kotlin.String = compositeTickerLt_example // kotlin.String | Filter less than the value.
val compositeTickerLte : kotlin.String = compositeTickerLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '5000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'composite_ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetEtfGlobalV1FundFlows200Response = apiInstance.getEtfGlobalV1FundFlows(processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getEtfGlobalV1FundFlows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getEtfGlobalV1FundFlows")
    e.printStackTrace()
}
```

### Parameters
| **processedDate** | **kotlin.String**| The date showing when ETF Global received and processed the data. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDate** | **kotlin.String**| The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **compositeTicker** | **kotlin.String**| The stock ticker symbol used to identify this ETF on exchanges. | [optional] |
| **compositeTickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **compositeTickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **compositeTickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **compositeTickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **compositeTickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;5000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;composite_ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;composite_ticker.asc&quot;] |

### Return type

[**GetEtfGlobalV1FundFlows200Response**](GetEtfGlobalV1FundFlows200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEtfGlobalV1Profiles"></a>
# **getEtfGlobalV1Profiles**
> GetEtfGlobalV1Profiles200Response getEtfGlobalV1Profiles(processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, limit, sort)



ETF Global industry profile data containing comprehensive ETF metadata including financial metrics, operational details, and exposure information.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val processedDate : kotlin.String = processedDate_example // kotlin.String | The date showing when ETF Global received and processed the data. Value must be formatted 'yyyy-mm-dd'.
val processedDateGt : kotlin.String = processedDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateGte : kotlin.String = processedDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLt : kotlin.String = processedDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLte : kotlin.String = processedDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDate : kotlin.String = effectiveDate_example // kotlin.String | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGt : kotlin.String = effectiveDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGte : kotlin.String = effectiveDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLt : kotlin.String = effectiveDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLte : kotlin.String = effectiveDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val compositeTicker : kotlin.String = compositeTicker_example // kotlin.String | The stock ticker symbol used to identify this ETF product on exchanges.
val compositeTickerAnyOf : kotlin.String = compositeTickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val compositeTickerGt : kotlin.String = compositeTickerGt_example // kotlin.String | Filter greater than the value.
val compositeTickerGte : kotlin.String = compositeTickerGte_example // kotlin.String | Filter greater than or equal to the value.
val compositeTickerLt : kotlin.String = compositeTickerLt_example // kotlin.String | Filter less than the value.
val compositeTickerLte : kotlin.String = compositeTickerLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '5000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'composite_ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetEtfGlobalV1Profiles200Response = apiInstance.getEtfGlobalV1Profiles(processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getEtfGlobalV1Profiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getEtfGlobalV1Profiles")
    e.printStackTrace()
}
```

### Parameters
| **processedDate** | **kotlin.String**| The date showing when ETF Global received and processed the data. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDate** | **kotlin.String**| The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **compositeTicker** | **kotlin.String**| The stock ticker symbol used to identify this ETF product on exchanges. | [optional] |
| **compositeTickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **compositeTickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **compositeTickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **compositeTickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **compositeTickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;5000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;composite_ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;composite_ticker.asc&quot;] |

### Return type

[**GetEtfGlobalV1Profiles200Response**](GetEtfGlobalV1Profiles200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEtfGlobalV1Taxonomies"></a>
# **getEtfGlobalV1Taxonomies**
> GetEtfGlobalV1Taxonomies200Response getEtfGlobalV1Taxonomies(processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, limit, sort)



ETF Global taxonomy data containing detailed classification and categorization information for ETFs including investment strategy, methodology, and structural characteristics.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val processedDate : kotlin.String = processedDate_example // kotlin.String | The date showing when ETF Global received and processed the data. Value must be formatted 'yyyy-mm-dd'.
val processedDateGt : kotlin.String = processedDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateGte : kotlin.String = processedDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLt : kotlin.String = processedDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val processedDateLte : kotlin.String = processedDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDate : kotlin.String = effectiveDate_example // kotlin.String | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGt : kotlin.String = effectiveDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateGte : kotlin.String = effectiveDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLt : kotlin.String = effectiveDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val effectiveDateLte : kotlin.String = effectiveDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val compositeTicker : kotlin.String = compositeTicker_example // kotlin.String | The stock ticker symbol used to identify this ETF product on exchanges.
val compositeTickerAnyOf : kotlin.String = compositeTickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val compositeTickerGt : kotlin.String = compositeTickerGt_example // kotlin.String | Filter greater than the value.
val compositeTickerGte : kotlin.String = compositeTickerGte_example // kotlin.String | Filter greater than or equal to the value.
val compositeTickerLt : kotlin.String = compositeTickerLt_example // kotlin.String | Filter less than the value.
val compositeTickerLte : kotlin.String = compositeTickerLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '5000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'composite_ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetEtfGlobalV1Taxonomies200Response = apiInstance.getEtfGlobalV1Taxonomies(processedDate, processedDateGt, processedDateGte, processedDateLt, processedDateLte, effectiveDate, effectiveDateGt, effectiveDateGte, effectiveDateLt, effectiveDateLte, compositeTicker, compositeTickerAnyOf, compositeTickerGt, compositeTickerGte, compositeTickerLt, compositeTickerLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getEtfGlobalV1Taxonomies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getEtfGlobalV1Taxonomies")
    e.printStackTrace()
}
```

### Parameters
| **processedDate** | **kotlin.String**| The date showing when ETF Global received and processed the data. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **processedDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDate** | **kotlin.String**| The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **effectiveDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **compositeTicker** | **kotlin.String**| The stock ticker symbol used to identify this ETF product on exchanges. | [optional] |
| **compositeTickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **compositeTickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **compositeTickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **compositeTickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **compositeTickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;5000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;composite_ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;composite_ticker.asc&quot;] |

### Return type

[**GetEtfGlobalV1Taxonomies200Response**](GetEtfGlobalV1Taxonomies200Response.md)

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
val id : kotlin.String = META // kotlin.String | Identifier of an asset, which can be a Ticker, CUSIP, or Composite FIGI. Specify a case-sensitive  ticker symbol (e.g. AAPL for Apple Inc). When provided a ticker, events for the entity currently  represented by that ticker are returned. To find events for entities previously associated with a  ticker, obtain the relevant identifier using the [Ticker Details Endpoint](https://massive.com/docs/rest/stocks/tickers/ticker-overview).
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
| **id** | **kotlin.String**| Identifier of an asset, which can be a Ticker, CUSIP, or Composite FIGI. Specify a case-sensitive  ticker symbol (e.g. AAPL for Apple Inc). When provided a ticker, events for the entity currently  represented by that ticker are returned. To find events for entities previously associated with a  ticker, obtain the relevant identifier using the [Ticker Details Endpoint](https://massive.com/docs/rest/stocks/tickers/ticker-overview). | |
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

<a id="getFedV1Inflation"></a>
# **getFedV1Inflation**
> GetFedV1Inflation200Response getFedV1Inflation(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, limit, sort)



A table tracking inflation and price indices, including Consumer Price Index (CPI) and Personal Consumption Expenditures (PCE) metrics over time.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | Calendar date of the observation (YYYY‑MM‑DD).
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetFedV1Inflation200Response = apiInstance.getFedV1Inflation(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFedV1Inflation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFedV1Inflation")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| Calendar date of the observation (YYYY‑MM‑DD). | [optional] |
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

[**GetFedV1Inflation200Response**](GetFedV1Inflation200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFedV1InflationExpectations"></a>
# **getFedV1InflationExpectations**
> GetFedV1InflationExpectations200Response getFedV1InflationExpectations(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, limit, sort)



A table tracking inflation expectations from both market-based and economic model perspectives across different time horizons.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | Calendar date of the observation (YYYY‑MM‑DD).
val dateAnyOf : kotlin.String = dateAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetFedV1InflationExpectations200Response = apiInstance.getFedV1InflationExpectations(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFedV1InflationExpectations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFedV1InflationExpectations")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| Calendar date of the observation (YYYY‑MM‑DD). | [optional] |
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

[**GetFedV1InflationExpectations200Response**](GetFedV1InflationExpectations200Response.md)

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



A record of U.S. Treasury bond yields across various maturity periods, tracking historical interest rates from short-term to long-term government securities.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | Calendar date of the yield observation (YYYY-MM-DD).
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
| **date** | **kotlin.String**| Calendar date of the yield observation (YYYY-MM-DD). | [optional] |
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
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://massive.com/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
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
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://massive.com/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

### Return type

[**GetCryptoAggregates200Response**](GetCryptoAggregates200Response.md)

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

<a id="getForexV1Exchanges"></a>
# **getForexV1Exchanges**
> GetForexV1Exchanges200Response getForexV1Exchanges(limit)



Global foreign exchange (FX) trading venues and market infrastructure, including electronic trading platforms, banks, and other institutions facilitating currency pair trading worldwide.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '999'.
try {
    val result : GetForexV1Exchanges200Response = apiInstance.getForexV1Exchanges(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getForexV1Exchanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getForexV1Exchanges")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;999&#39;. | [optional] [default to 100] |

### Return type

[**GetForexV1Exchanges200Response**](GetForexV1Exchanges200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFuturesAggregates"></a>
# **getFuturesAggregates**
> GetFuturesAggregates200Response getFuturesAggregates(ticker, resolution, windowStart, limit, windowStartGte, windowStartGt, windowStartLte, windowStartLt, sort)

Aggregates

Get aggregates for a contract in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = GCJ5 // kotlin.String | The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract).
val resolution : kotlin.String = 1min // kotlin.String | This sets the size of the aggregate windows. It accepts custom values that specify the granularity and the duration of the window. For example: 15mins, 30secs, 12hours, or 7days. There are maximum allowable candle sizes. For example, you can request \"1min\" to \"59mins\", but after that you will need to use \"1hr\". If you make a request for a candle size that is not supported, we will return a 400 \"Bad Request - resolution value is not allowed.\"
val windowStart : kotlin.String = windowStart_example // kotlin.String | Specifies the start time of the aggregate (OHLC) candles you want returned (YYYY-MM-DD date or nanosecond Unix timestamp). How it works - If not provided, the API returns the most recent candles available, up to the limit you set. - If provided, the value determines which candle(s) to return. The timestamp or date is “snapped” to the start time of the matching candle interval. - You can use comparison operators to form ranges:   - `window_start.gte` – greater than or equal to   - `window_start.gt` – greater than   - `window_start.lte` – less than or equal to   - `window_start.lt` – less than  Examples 1. Most recent minute candles    `/vX/aggs/ESU5?resolution=1min&limit=5`  2. Daily candle for August 5, 2025    `/vX/aggs/ESU5?resolution=1day&window_start=2025-08-05`  3. Daily candles from July 1–31, 2025    `/vX/aggs/ESU5?resolution=1day&window_start.gte=2025-07-01&window_start.lte=2025-07-31`  4. 1,000 one-second candles after a specific timestamp    `/vX/aggs/ESU5?resolution=1sec&window_start.gt=1751409877000000000&limit=1000`
val limit : kotlin.Int = 56 // kotlin.Int | The number of results to return per page (default=1000, maximum=50000, minimum=1).
val windowStartGte : kotlin.String = windowStartGte_example // kotlin.String | Range by window_start.
val windowStartGt : kotlin.String = windowStartGt_example // kotlin.String | Range by window_start.
val windowStartLte : kotlin.String = windowStartLte_example // kotlin.String | Range by window_start.
val windowStartLt : kotlin.String = windowStartLt_example // kotlin.String | Range by window_start.
val sort : kotlin.String = window_start.desc // kotlin.String | Sort results by field and direction using dotted notation (e.g., 'ticker.asc', 'name.desc').
try {
    val result : GetFuturesAggregates200Response = apiInstance.getFuturesAggregates(ticker, resolution, windowStart, limit, windowStartGte, windowStartGt, windowStartLte, windowStartLt, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFuturesAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFuturesAggregates")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract). | |
| **resolution** | **kotlin.String**| This sets the size of the aggregate windows. It accepts custom values that specify the granularity and the duration of the window. For example: 15mins, 30secs, 12hours, or 7days. There are maximum allowable candle sizes. For example, you can request \&quot;1min\&quot; to \&quot;59mins\&quot;, but after that you will need to use \&quot;1hr\&quot;. If you make a request for a candle size that is not supported, we will return a 400 \&quot;Bad Request - resolution value is not allowed.\&quot; | [optional] [default to &quot;1day&quot;] |
| **windowStart** | **kotlin.String**| Specifies the start time of the aggregate (OHLC) candles you want returned (YYYY-MM-DD date or nanosecond Unix timestamp). How it works - If not provided, the API returns the most recent candles available, up to the limit you set. - If provided, the value determines which candle(s) to return. The timestamp or date is “snapped” to the start time of the matching candle interval. - You can use comparison operators to form ranges:   - &#x60;window_start.gte&#x60; – greater than or equal to   - &#x60;window_start.gt&#x60; – greater than   - &#x60;window_start.lte&#x60; – less than or equal to   - &#x60;window_start.lt&#x60; – less than  Examples 1. Most recent minute candles    &#x60;/vX/aggs/ESU5?resolution&#x3D;1min&amp;limit&#x3D;5&#x60;  2. Daily candle for August 5, 2025    &#x60;/vX/aggs/ESU5?resolution&#x3D;1day&amp;window_start&#x3D;2025-08-05&#x60;  3. Daily candles from July 1–31, 2025    &#x60;/vX/aggs/ESU5?resolution&#x3D;1day&amp;window_start.gte&#x3D;2025-07-01&amp;window_start.lte&#x3D;2025-07-31&#x60;  4. 1,000 one-second candles after a specific timestamp    &#x60;/vX/aggs/ESU5?resolution&#x3D;1sec&amp;window_start.gt&#x3D;1751409877000000000&amp;limit&#x3D;1000&#x60; | [optional] |
| **limit** | **kotlin.Int**| The number of results to return per page (default&#x3D;1000, maximum&#x3D;50000, minimum&#x3D;1). | [optional] [default to 1000] |
| **windowStartGte** | **kotlin.String**| Range by window_start. | [optional] |
| **windowStartGt** | **kotlin.String**| Range by window_start. | [optional] |
| **windowStartLte** | **kotlin.String**| Range by window_start. | [optional] |
| **windowStartLt** | **kotlin.String**| Range by window_start. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort results by field and direction using dotted notation (e.g., &#39;ticker.asc&#39;, &#39;name.desc&#39;). | [optional] [default to window_start.desc] [enum: window_start.asc, window_start.desc] |

### Return type

[**GetFuturesAggregates200Response**](GetFuturesAggregates200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFuturesQuotes"></a>
# **getFuturesQuotes**
> GetFuturesQuotes200Response getFuturesQuotes(ticker, timestamp, sessionEndDate, limit, timestampGte, timestampGt, timestampLte, timestampLt, sessionEndDateGte, sessionEndDateGt, sessionEndDateLte, sessionEndDateLt, sort)

Quotes

Get quotes for a contract in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = GCJ5 // kotlin.String | The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract).
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp.
val sessionEndDate : kotlin.String = sessionEndDate_example // kotlin.String | Also known as the trading date, the date of the end of the trading session, in YYYY-MM-DD format.
val limit : kotlin.Int = 56 // kotlin.Int | The number of results to return per page (default=1000, maximum=50000, minimum=1).
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
val sessionEndDateGte : kotlin.String = sessionEndDateGte_example // kotlin.String | Range by session_end_date.
val sessionEndDateGt : kotlin.String = sessionEndDateGt_example // kotlin.String | Range by session_end_date.
val sessionEndDateLte : kotlin.String = sessionEndDateLte_example // kotlin.String | Range by session_end_date.
val sessionEndDateLt : kotlin.String = sessionEndDateLt_example // kotlin.String | Range by session_end_date.
val sort : kotlin.String = timestamp.desc // kotlin.String | Sort results by field and direction using dotted notation (e.g., 'ticker.asc', 'name.desc').
try {
    val result : GetFuturesQuotes200Response = apiInstance.getFuturesQuotes(ticker, timestamp, sessionEndDate, limit, timestampGte, timestampGt, timestampLte, timestampLt, sessionEndDateGte, sessionEndDateGt, sessionEndDateLte, sessionEndDateLt, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFuturesQuotes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFuturesQuotes")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract). | |
| **timestamp** | **kotlin.String**| Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp. | [optional] |
| **sessionEndDate** | **kotlin.String**| Also known as the trading date, the date of the end of the trading session, in YYYY-MM-DD format. | [optional] |
| **limit** | **kotlin.Int**| The number of results to return per page (default&#x3D;1000, maximum&#x3D;50000, minimum&#x3D;1). | [optional] [default to 1000] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |
| **sessionEndDateGte** | **kotlin.String**| Range by session_end_date. | [optional] |
| **sessionEndDateGt** | **kotlin.String**| Range by session_end_date. | [optional] |
| **sessionEndDateLte** | **kotlin.String**| Range by session_end_date. | [optional] |
| **sessionEndDateLt** | **kotlin.String**| Range by session_end_date. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort results by field and direction using dotted notation (e.g., &#39;ticker.asc&#39;, &#39;name.desc&#39;). | [optional] [default to timestamp.desc] [enum: timestamp.asc, timestamp.desc] |

### Return type

[**GetFuturesQuotes200Response**](GetFuturesQuotes200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFuturesTrades"></a>
# **getFuturesTrades**
> GetFuturesTrades200Response getFuturesTrades(ticker, timestamp, sessionEndDate, limit, timestampGte, timestampGt, timestampLte, timestampLt, sessionEndDateGte, sessionEndDateGt, sessionEndDateLte, sessionEndDateLt, sort)

Trades

Get trades for a contract in a given time range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = GCJ5 // kotlin.String | The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract).
val timestamp : kotlin.String = timestamp_example // kotlin.String | Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp.
val sessionEndDate : kotlin.String = sessionEndDate_example // kotlin.String | Also known as the trading date, the date of the end of the trading session, in YYYY-MM-DD format.
val limit : kotlin.Int = 56 // kotlin.Int | The number of results to return per page (default=1000, maximum=50000, minimum=1).
val timestampGte : kotlin.String = timestampGte_example // kotlin.String | Range by timestamp.
val timestampGt : kotlin.String = timestampGt_example // kotlin.String | Range by timestamp.
val timestampLte : kotlin.String = timestampLte_example // kotlin.String | Range by timestamp.
val timestampLt : kotlin.String = timestampLt_example // kotlin.String | Range by timestamp.
val sessionEndDateGte : kotlin.String = sessionEndDateGte_example // kotlin.String | Range by session_end_date.
val sessionEndDateGt : kotlin.String = sessionEndDateGt_example // kotlin.String | Range by session_end_date.
val sessionEndDateLte : kotlin.String = sessionEndDateLte_example // kotlin.String | Range by session_end_date.
val sessionEndDateLt : kotlin.String = sessionEndDateLt_example // kotlin.String | Range by session_end_date.
val sort : kotlin.String = timestamp.desc // kotlin.String | Sort results by field and direction using dotted notation (e.g., 'ticker.asc', 'name.desc').
try {
    val result : GetFuturesTrades200Response = apiInstance.getFuturesTrades(ticker, timestamp, sessionEndDate, limit, timestampGte, timestampGt, timestampLte, timestampLt, sessionEndDateGte, sessionEndDateGt, sessionEndDateLte, sessionEndDateLt, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFuturesTrades")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFuturesTrades")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract). | |
| **timestamp** | **kotlin.String**| Query by trade timestamp. Either a date with the format YYYY-MM-DD or a nanosecond timestamp. | [optional] |
| **sessionEndDate** | **kotlin.String**| Also known as the trading date, the date of the end of the trading session, in YYYY-MM-DD format. | [optional] |
| **limit** | **kotlin.Int**| The number of results to return per page (default&#x3D;1000, maximum&#x3D;50000, minimum&#x3D;1). | [optional] [default to 1000] |
| **timestampGte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampGt** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLte** | **kotlin.String**| Range by timestamp. | [optional] |
| **timestampLt** | **kotlin.String**| Range by timestamp. | [optional] |
| **sessionEndDateGte** | **kotlin.String**| Range by session_end_date. | [optional] |
| **sessionEndDateGt** | **kotlin.String**| Range by session_end_date. | [optional] |
| **sessionEndDateLte** | **kotlin.String**| Range by session_end_date. | [optional] |
| **sessionEndDateLt** | **kotlin.String**| Range by session_end_date. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort results by field and direction using dotted notation (e.g., &#39;ticker.asc&#39;, &#39;name.desc&#39;). | [optional] [default to timestamp.desc] [enum: timestamp.asc, timestamp.desc] |

### Return type

[**GetFuturesTrades200Response**](GetFuturesTrades200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFuturesVXContractsNew"></a>
# **getFuturesVXContractsNew**
> GetFuturesVXContractsNew200Response getFuturesVXContractsNew(date, dateGt, dateGte, dateLt, dateLte, productCode, productCodeAnyOf, productCodeGt, productCodeGte, productCodeLt, productCodeLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, active, type, typeAnyOf, typeGt, typeGte, typeLt, typeLte, firstTradeDate, firstTradeDateGt, firstTradeDateGte, firstTradeDateLt, firstTradeDateLte, lastTradeDate, lastTradeDateGt, lastTradeDateGte, lastTradeDateLt, lastTradeDateLte, limit, sort)

futures_contracts_v1 API

The Contracts API provides a single source for discovering all listed futures contracts and retrieving complete contract specifications. You can query the full contract index with filters for product code, trade dates, active status, and date, returning key attributes such as ticker, first and last trade dates, days to maturity, exchange code, and order quantity limits in paginated form. The same API also returns the full specification for a single contract, including settlement dates, tick sizes, and other trading and risk related fields. Point-in-time lookups allow you to reconstruct the exact contract definition that applied on any given day.  Use Cases: Historical research, trading system integration, portfolio workflows, risk management.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val date : kotlin.String = date_example // kotlin.String | A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about contracts for the specified day. Value must be formatted 'yyyy-mm-dd'.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val productCode : kotlin.String = productCode_example // kotlin.String | The identifier for the contract's product.
val productCodeAnyOf : kotlin.String = productCodeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val productCodeGt : kotlin.String = productCodeGt_example // kotlin.String | Filter greater than the value.
val productCodeGte : kotlin.String = productCodeGte_example // kotlin.String | Filter greater than or equal to the value.
val productCodeLt : kotlin.String = productCodeLt_example // kotlin.String | Filter less than the value.
val productCodeLte : kotlin.String = productCodeLte_example // kotlin.String | Filter less than or equal to the value.
val ticker : kotlin.String = ticker_example // kotlin.String | The ticker for the contract.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val active : kotlin.String = active_example // kotlin.String | The contract is still trading. Value must be 'true', 'false', '1' or '0'.
val type : kotlin.String = type_example // kotlin.String | The type of contract, one of 'single' or 'combo'.
val typeAnyOf : kotlin.String = typeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val typeGt : kotlin.String = typeGt_example // kotlin.String | Filter greater than the value.
val typeGte : kotlin.String = typeGte_example // kotlin.String | Filter greater than or equal to the value.
val typeLt : kotlin.String = typeLt_example // kotlin.String | Filter less than the value.
val typeLte : kotlin.String = typeLte_example // kotlin.String | Filter less than or equal to the value.
val firstTradeDate : kotlin.String = firstTradeDate_example // kotlin.String | The first date the contract trades. Value must be formatted 'yyyy-mm-dd'.
val firstTradeDateGt : kotlin.String = firstTradeDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val firstTradeDateGte : kotlin.String = firstTradeDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val firstTradeDateLt : kotlin.String = firstTradeDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val firstTradeDateLte : kotlin.String = firstTradeDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val lastTradeDate : kotlin.String = lastTradeDate_example // kotlin.String | The last date the contract trades. Value must be formatted 'yyyy-mm-dd'.
val lastTradeDateGt : kotlin.String = lastTradeDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val lastTradeDateGte : kotlin.String = lastTradeDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val lastTradeDateLt : kotlin.String = lastTradeDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val lastTradeDateLte : kotlin.String = lastTradeDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '1000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'product_code' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetFuturesVXContractsNew200Response = apiInstance.getFuturesVXContractsNew(date, dateGt, dateGte, dateLt, dateLte, productCode, productCodeAnyOf, productCodeGt, productCodeGte, productCodeLt, productCodeLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, active, type, typeAnyOf, typeGt, typeGte, typeLt, typeLte, firstTradeDate, firstTradeDateGt, firstTradeDateGte, firstTradeDateLt, firstTradeDateLte, lastTradeDate, lastTradeDateGt, lastTradeDateGte, lastTradeDateLt, lastTradeDateLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFuturesVXContractsNew")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFuturesVXContractsNew")
    e.printStackTrace()
}
```

### Parameters
| **date** | **kotlin.String**| A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about contracts for the specified day. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **productCode** | **kotlin.String**| The identifier for the contract&#39;s product. | [optional] |
| **productCodeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **productCodeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **productCodeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **productCodeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **productCodeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ticker** | **kotlin.String**| The ticker for the contract. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **active** | **kotlin.String**| The contract is still trading. Value must be &#39;true&#39;, &#39;false&#39;, &#39;1&#39; or &#39;0&#39;. | [optional] |
| **type** | **kotlin.String**| The type of contract, one of &#39;single&#39; or &#39;combo&#39;. | [optional] |
| **typeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **typeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **typeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **typeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **typeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **firstTradeDate** | **kotlin.String**| The first date the contract trades. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **firstTradeDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **firstTradeDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **firstTradeDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **firstTradeDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastTradeDate** | **kotlin.String**| The last date the contract trades. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastTradeDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastTradeDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastTradeDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **lastTradeDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;1000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;product_code&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;product_code.asc&quot;] |

### Return type

[**GetFuturesVXContractsNew200Response**](GetFuturesVXContractsNew200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFuturesVXExchanges"></a>
# **getFuturesVXExchanges**
> GetFuturesVXExchanges200Response getFuturesVXExchanges(limit)



US futures exchanges and trading venues including major derivatives exchanges (CME, CBOT, NYMEX, COMEX) and other futures market infrastructure for commodity, financial, and other derivative contract trading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '999'.
try {
    val result : GetFuturesVXExchanges200Response = apiInstance.getFuturesVXExchanges(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFuturesVXExchanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFuturesVXExchanges")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;999&#39;. | [optional] [default to 100] |

### Return type

[**GetFuturesVXExchanges200Response**](GetFuturesVXExchanges200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFuturesVXProductsNew"></a>
# **getFuturesVXProductsNew**
> GetFuturesVXProductsNew200Response getFuturesVXProductsNew(name, nameAnyOf, nameGt, nameGte, nameLt, nameLte, productCode, productCodeAnyOf, productCodeGt, productCodeGte, productCodeLt, productCodeLte, date, dateGt, dateGte, dateLt, dateLte, sector, sectorAnyOf, sectorGt, sectorGte, sectorLt, sectorLte, subSector, subSectorAnyOf, subSectorGt, subSectorGte, subSectorLt, subSectorLte, assetClass, assetClassAnyOf, assetClassGt, assetClassGte, assetClassLt, assetClassLte, assetSubClass, assetSubClassAnyOf, assetSubClassGt, assetSubClassGte, assetSubClassLt, assetSubClassLte, type, typeAnyOf, typeGt, typeGte, typeLt, typeLte, limit, sort)

Futures Products API

The Products API is a unified source for discovering all supported futures products and retrieving full product specifications. It returns the complete product universe with product codes, names, exchange identifiers, sector and asset class classifications, product type, settlement method, and pricing and quotation details. You can filter by name, exchange, sector, asset class, product type, or date to capture the product set or product definition that existed at a specific point in time. It also retrieves the full specification for a single product, supporting accurate system configuration, analytics, trading workflows, and historical reconciliation.  Use Cases: Product specification, historical product checks, risk management, trading system integration.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val name : kotlin.String = name_example // kotlin.String | The full name of the product.
val nameAnyOf : kotlin.String = nameAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val nameGt : kotlin.String = nameGt_example // kotlin.String | Filter greater than the value.
val nameGte : kotlin.String = nameGte_example // kotlin.String | Filter greater than or equal to the value.
val nameLt : kotlin.String = nameLt_example // kotlin.String | Filter less than the value.
val nameLte : kotlin.String = nameLte_example // kotlin.String | Filter less than or equal to the value.
val productCode : kotlin.String = productCode_example // kotlin.String | The identifier for the product.
val productCodeAnyOf : kotlin.String = productCodeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val productCodeGt : kotlin.String = productCodeGt_example // kotlin.String | Filter greater than the value.
val productCodeGte : kotlin.String = productCodeGte_example // kotlin.String | Filter greater than or equal to the value.
val productCodeLt : kotlin.String = productCodeLt_example // kotlin.String | Filter less than the value.
val productCodeLte : kotlin.String = productCodeLte_example // kotlin.String | Filter less than or equal to the value.
val date : kotlin.String = date_example // kotlin.String | A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about products for the specified day. Value must be formatted 'yyyy-mm-dd'.
val dateGt : kotlin.String = dateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val dateGte : kotlin.String = dateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val dateLt : kotlin.String = dateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val dateLte : kotlin.String = dateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val sector : kotlin.String = sector_example // kotlin.String | The sector to which the product belongs.
val sectorAnyOf : kotlin.String = sectorAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val sectorGt : kotlin.String = sectorGt_example // kotlin.String | Filter greater than the value.
val sectorGte : kotlin.String = sectorGte_example // kotlin.String | Filter greater than or equal to the value.
val sectorLt : kotlin.String = sectorLt_example // kotlin.String | Filter less than the value.
val sectorLte : kotlin.String = sectorLte_example // kotlin.String | Filter less than or equal to the value.
val subSector : kotlin.String = subSector_example // kotlin.String | The sub-sector to which the product belongs.
val subSectorAnyOf : kotlin.String = subSectorAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val subSectorGt : kotlin.String = subSectorGt_example // kotlin.String | Filter greater than the value.
val subSectorGte : kotlin.String = subSectorGte_example // kotlin.String | Filter greater than or equal to the value.
val subSectorLt : kotlin.String = subSectorLt_example // kotlin.String | Filter less than the value.
val subSectorLte : kotlin.String = subSectorLte_example // kotlin.String | Filter less than or equal to the value.
val assetClass : kotlin.String = assetClass_example // kotlin.String | The asset class to which the product belongs.
val assetClassAnyOf : kotlin.String = assetClassAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val assetClassGt : kotlin.String = assetClassGt_example // kotlin.String | Filter greater than the value.
val assetClassGte : kotlin.String = assetClassGte_example // kotlin.String | Filter greater than or equal to the value.
val assetClassLt : kotlin.String = assetClassLt_example // kotlin.String | Filter less than the value.
val assetClassLte : kotlin.String = assetClassLte_example // kotlin.String | Filter less than or equal to the value.
val assetSubClass : kotlin.String = assetSubClass_example // kotlin.String | The asset sub-class to which the product belongs.
val assetSubClassAnyOf : kotlin.String = assetSubClassAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val assetSubClassGt : kotlin.String = assetSubClassGt_example // kotlin.String | Filter greater than the value.
val assetSubClassGte : kotlin.String = assetSubClassGte_example // kotlin.String | Filter greater than or equal to the value.
val assetSubClassLt : kotlin.String = assetSubClassLt_example // kotlin.String | Filter less than the value.
val assetSubClassLte : kotlin.String = assetSubClassLte_example // kotlin.String | Filter less than or equal to the value.
val type : kotlin.String = type_example // kotlin.String | The type of product, one of 'single' or 'combo'.
val typeAnyOf : kotlin.String = typeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val typeGt : kotlin.String = typeGt_example // kotlin.String | Filter greater than the value.
val typeGte : kotlin.String = typeGte_example // kotlin.String | Filter greater than or equal to the value.
val typeLt : kotlin.String = typeLt_example // kotlin.String | Filter less than the value.
val typeLte : kotlin.String = typeLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'date' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetFuturesVXProductsNew200Response = apiInstance.getFuturesVXProductsNew(name, nameAnyOf, nameGt, nameGte, nameLt, nameLte, productCode, productCodeAnyOf, productCodeGt, productCodeGte, productCodeLt, productCodeLte, date, dateGt, dateGte, dateLt, dateLte, sector, sectorAnyOf, sectorGt, sectorGte, sectorLt, sectorLte, subSector, subSectorAnyOf, subSectorGt, subSectorGte, subSectorLt, subSectorLte, assetClass, assetClassAnyOf, assetClassGt, assetClassGte, assetClassLt, assetClassLte, assetSubClass, assetSubClassAnyOf, assetSubClassGt, assetSubClassGte, assetSubClassLt, assetSubClassLte, type, typeAnyOf, typeGt, typeGte, typeLt, typeLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFuturesVXProductsNew")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFuturesVXProductsNew")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**| The full name of the product. | [optional] |
| **nameAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **nameGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **nameGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **nameLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **nameLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **productCode** | **kotlin.String**| The identifier for the product. | [optional] |
| **productCodeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **productCodeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **productCodeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **productCodeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **productCodeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **date** | **kotlin.String**| A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about products for the specified day. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **dateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **dateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **dateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **dateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **sector** | **kotlin.String**| The sector to which the product belongs. | [optional] |
| **sectorAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **sectorGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **sectorGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **sectorLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **sectorLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **subSector** | **kotlin.String**| The sub-sector to which the product belongs. | [optional] |
| **subSectorAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **subSectorGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **subSectorGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **subSectorLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **subSectorLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **assetClass** | **kotlin.String**| The asset class to which the product belongs. | [optional] |
| **assetClassAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **assetClassGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **assetClassGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **assetClassLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **assetClassLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **assetSubClass** | **kotlin.String**| The asset sub-class to which the product belongs. | [optional] |
| **assetSubClassAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **assetSubClassGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **assetSubClassGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **assetSubClassLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **assetSubClassLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **type** | **kotlin.String**| The type of product, one of &#39;single&#39; or &#39;combo&#39;. | [optional] |
| **typeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **typeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **typeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **typeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **typeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;date&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;date.asc&quot;] |

### Return type

[**GetFuturesVXProductsNew200Response**](GetFuturesVXProductsNew200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFuturesVXSnapshot"></a>
# **getFuturesVXSnapshot**
> GetFuturesVXSnapshot200Response getFuturesVXSnapshot(productCode, productCodeAnyOf, productCodeGt, productCodeGte, productCodeLt, productCodeLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, limit, sort)

futures_snapshot_v1 API

Retrieve a snapshot of the most recent futures contract data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val productCode : kotlin.String = productCode_example // kotlin.String | The code for the contracts' underlying product.
val productCodeAnyOf : kotlin.String = productCodeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val productCodeGt : kotlin.String = productCodeGt_example // kotlin.String | Filter greater than the value.
val productCodeGte : kotlin.String = productCodeGte_example // kotlin.String | Filter greater than or equal to the value.
val productCodeLt : kotlin.String = productCodeLt_example // kotlin.String | Filter less than the value.
val productCodeLte : kotlin.String = productCodeLte_example // kotlin.String | Filter less than or equal to the value.
val ticker : kotlin.String = ticker_example // kotlin.String | The futures contract identifier, including the base symbol and contract expiration (e.g., ESZ24 for the December 2024 S&P 500 E-mini contract).
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetFuturesVXSnapshot200Response = apiInstance.getFuturesVXSnapshot(productCode, productCodeAnyOf, productCodeGt, productCodeGte, productCodeLt, productCodeLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getFuturesVXSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getFuturesVXSnapshot")
    e.printStackTrace()
}
```

### Parameters
| **productCode** | **kotlin.String**| The code for the contracts&#39; underlying product. | [optional] |
| **productCodeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **productCodeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **productCodeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **productCodeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **productCodeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **ticker** | **kotlin.String**| The futures contract identifier, including the base symbol and contract expiration (e.g., ESZ24 for the December 2024 S&amp;P 500 E-mini contract). | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;ticker.asc&quot;] |

### Return type

[**GetFuturesVXSnapshot200Response**](GetFuturesVXSnapshot200Response.md)

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
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://massive.com/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
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
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://massive.com/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

### Return type

[**GetPreviousIndicesAggregates200Response**](GetPreviousIndicesAggregates200Response.md)

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
> GetLastStocksTrade200Response getLastStocksTrade(stocksTicker)

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
    val result : GetLastStocksTrade200Response = apiInstance.getLastStocksTrade(stocksTicker)
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

[**GetLastStocksTrade200Response**](GetLastStocksTrade200Response.md)

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
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://massive.com/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
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
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://massive.com/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

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
val optionsTicker : kotlin.String = O:SPY251219C00650000 // kotlin.String | Query for a contract by options ticker. You can learn more about the structure of options tickers [here](https://massive.com/blog/how-to-read-a-stock-options-ticker/).
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
| **optionsTicker** | **kotlin.String**| Query for a contract by options ticker. You can learn more about the structure of options tickers [here](https://massive.com/blog/how-to-read-a-stock-options-ticker/). | |
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

<a id="getOptionsV1Exchanges"></a>
# **getOptionsV1Exchanges**
> GetOptionsV1Exchanges200Response getOptionsV1Exchanges(limit)



US options exchanges and trading venues including traditional options exchanges (CBOE, ISE, etc.), Securities Information Processors (SIP), and other options market infrastructure for derivatives trading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '999'.
try {
    val result : GetOptionsV1Exchanges200Response = apiInstance.getOptionsV1Exchanges(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getOptionsV1Exchanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getOptionsV1Exchanges")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;999&#39;. | [optional] [default to 100] |

### Return type

[**GetOptionsV1Exchanges200Response**](GetOptionsV1Exchanges200Response.md)

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
val tickerAnyOf : kotlin.String = NCLH,O:SPY250321C00380000,C:EURUSD,X:BTCUSD // kotlin.String | Comma separated list of tickers. This API currently supports Stocks/Equities, Crypto, Options, and Forex. See <a rel=\"nofollow\" target=\"_blank\" href=\"https://massive.com/docs/rest/stocks/tickers/all-tickers\">the tickers endpoint</a> for more details on supported tickers. If no tickers are passed then no results will be returned.  Warning: The maximum number of characters allowed in a URL are subject to your technology stack.
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
| **tickerAnyOf** | **kotlin.String**| Comma separated list of tickers. This API currently supports Stocks/Equities, Crypto, Options, and Forex. See &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://massive.com/docs/rest/stocks/tickers/all-tickers\&quot;&gt;the tickers endpoint&lt;/a&gt; for more details on supported tickers. If no tickers are passed then no results will be returned.  Warning: The maximum number of characters allowed in a URL are subject to your technology stack. | [optional] |

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
val limit : kotlin.Int = 120 // kotlin.Int | Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on <a href=\"https://massive.com/blog/aggs-api-updates/\" target=\"_blank\" alt=\"Aggregate Data API Improvements\">Aggregate Data API Improvements</a>. 
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
| **limit** | **kotlin.Int**| Limits the number of base aggregates queried to create the aggregate results. Max 50000 and Default 5000. Read more about how limit is used to calculate aggregate results in our article on &lt;a href&#x3D;\&quot;https://massive.com/blog/aggs-api-updates/\&quot; target&#x3D;\&quot;_blank\&quot; alt&#x3D;\&quot;Aggregate Data API Improvements\&quot;&gt;Aggregate Data API Improvements&lt;/a&gt;.  | [optional] |

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
> GetStocksEMA200Response getStocksEMA(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

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
    val result : GetStocksEMA200Response = apiInstance.getStocksEMA(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
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

[**GetStocksEMA200Response**](GetStocksEMA200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksFinancialsV1BalanceSheets"></a>
# **getStocksFinancialsV1BalanceSheets**
> GetStocksFinancialsV1BalanceSheets200Response getStocksFinancialsV1BalanceSheets(cik, cikAnyOf, cikGt, cikGte, cikLt, cikLte, tickers, tickersAllOf, tickersAnyOf, periodEnd, periodEndGt, periodEndGte, periodEndLt, periodEndLte, filingDate, filingDateGt, filingDateGte, filingDateLt, filingDateLte, fiscalYear, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalQuarter, fiscalQuarterGt, fiscalQuarterGte, fiscalQuarterLt, fiscalQuarterLte, timeframe, timeframeAnyOf, timeframeGt, timeframeGte, timeframeLt, timeframeLte, limit, sort)



A comprehensive financial dataset containing quarterly and annual balance sheet data for public companies. Includes detailed asset, liability, and equity positions representing the company&#39;s financial position at specific points in time. Balance sheet data represents point-in-time snapshots rather than cumulative flows, showing what the company owns, owes, and shareholders&#39; equity as of each period end date.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cik : kotlin.String = cik_example // kotlin.String | The company's Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company's CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup).
val cikAnyOf : kotlin.String = cikAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val cikGt : kotlin.String = cikGt_example // kotlin.String | Filter greater than the value.
val cikGte : kotlin.String = cikGte_example // kotlin.String | Filter greater than or equal to the value.
val cikLt : kotlin.String = cikLt_example // kotlin.String | Filter less than the value.
val cikLte : kotlin.String = cikLte_example // kotlin.String | Filter less than or equal to the value.
val tickers : kotlin.String = tickers_example // kotlin.String | Filter for arrays that contain the value.
val tickersAllOf : kotlin.String = tickersAllOf_example // kotlin.String | Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list.
val tickersAnyOf : kotlin.String = tickersAnyOf_example // kotlin.String | Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list.
val periodEnd : kotlin.String = periodEnd_example // kotlin.String | The last date of the reporting period, representing the specific point in time when the balance sheet snapshot was taken. Value must be formatted 'yyyy-mm-dd'.
val periodEndGt : kotlin.String = periodEndGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndGte : kotlin.String = periodEndGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndLt : kotlin.String = periodEndLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndLte : kotlin.String = periodEndLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val filingDate : kotlin.String = filingDate_example // kotlin.String | The date when the financial statement was filed with the SEC. Value must be formatted 'yyyy-mm-dd'.
val filingDateGt : kotlin.String = filingDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateGte : kotlin.String = filingDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateLt : kotlin.String = filingDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateLte : kotlin.String = filingDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val fiscalYear : kotlin.Double = 1.2 // kotlin.Double | The fiscal year for the reporting period. Value must be a floating point number.
val fiscalYearGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val fiscalYearGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val fiscalYearLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val fiscalYearLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val fiscalQuarter : kotlin.Double = 1.2 // kotlin.Double | The fiscal quarter number (1, 2, 3, or 4) for the reporting period. Value must be a floating point number.
val fiscalQuarterGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val fiscalQuarterGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val fiscalQuarterLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val fiscalQuarterLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val timeframe : kotlin.String = timeframe_example // kotlin.String | The reporting period type. Possible values include: quarterly, annual.
val timeframeAnyOf : kotlin.String = timeframeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val timeframeGt : kotlin.String = timeframeGt_example // kotlin.String | Filter greater than the value.
val timeframeGte : kotlin.String = timeframeGte_example // kotlin.String | Filter greater than or equal to the value.
val timeframeLt : kotlin.String = timeframeLt_example // kotlin.String | Filter less than the value.
val timeframeLte : kotlin.String = timeframeLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'period_end' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetStocksFinancialsV1BalanceSheets200Response = apiInstance.getStocksFinancialsV1BalanceSheets(cik, cikAnyOf, cikGt, cikGte, cikLt, cikLte, tickers, tickersAllOf, tickersAnyOf, periodEnd, periodEndGt, periodEndGte, periodEndLt, periodEndLte, filingDate, filingDateGt, filingDateGte, filingDateLt, filingDateLte, fiscalYear, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalQuarter, fiscalQuarterGt, fiscalQuarterGte, fiscalQuarterLt, fiscalQuarterLte, timeframe, timeframeAnyOf, timeframeGt, timeframeGte, timeframeLt, timeframeLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksFinancialsV1BalanceSheets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksFinancialsV1BalanceSheets")
    e.printStackTrace()
}
```

### Parameters
| **cik** | **kotlin.String**| The company&#39;s Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company&#39;s CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup). | [optional] |
| **cikAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **cikGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **cikGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **cikLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **cikLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **tickers** | **kotlin.String**| Filter for arrays that contain the value. | [optional] |
| **tickersAllOf** | **kotlin.String**| Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickersAnyOf** | **kotlin.String**| Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **periodEnd** | **kotlin.String**| The last date of the reporting period, representing the specific point in time when the balance sheet snapshot was taken. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDate** | **kotlin.String**| The date when the financial statement was filed with the SEC. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **fiscalYear** | **kotlin.Double**| The fiscal year for the reporting period. Value must be a floating point number. | [optional] |
| **fiscalYearGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **fiscalYearGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalYearLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **fiscalYearLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalQuarter** | **kotlin.Double**| The fiscal quarter number (1, 2, 3, or 4) for the reporting period. Value must be a floating point number. | [optional] |
| **fiscalQuarterGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **timeframe** | **kotlin.String**| The reporting period type. Possible values include: quarterly, annual. | [optional] |
| **timeframeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **timeframeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **timeframeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **timeframeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **timeframeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;period_end&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;period_end.asc&quot;] |

### Return type

[**GetStocksFinancialsV1BalanceSheets200Response**](GetStocksFinancialsV1BalanceSheets200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksFinancialsV1CashFlowStatements"></a>
# **getStocksFinancialsV1CashFlowStatements**
> GetStocksFinancialsV1CashFlowStatements200Response getStocksFinancialsV1CashFlowStatements(cik, cikAnyOf, cikGt, cikGte, cikLt, cikLte, periodEnd, periodEndGt, periodEndGte, periodEndLt, periodEndLte, filingDate, filingDateGt, filingDateGte, filingDateLt, filingDateLte, tickers, tickersAllOf, tickersAnyOf, fiscalYear, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalQuarter, fiscalQuarterGt, fiscalQuarterGte, fiscalQuarterLt, fiscalQuarterLte, timeframe, timeframeAnyOf, timeframeGt, timeframeGte, timeframeLt, timeframeLte, limit, sort)



A comprehensive financial dataset containing quarterly, annual, and trailing twelve-month cash flow statement data for public companies. Includes detailed operating, investing, and financing cash flows with proper TTM calculations that sum all cash flow components over four quarters. TTM records are validated to ensure exactly four distinct quarters spanning 250-400 days for accurate trailing twelve-month cash flow analysis.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cik : kotlin.String = cik_example // kotlin.String | The company's Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company’s CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup).
val cikAnyOf : kotlin.String = cikAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val cikGt : kotlin.String = cikGt_example // kotlin.String | Filter greater than the value.
val cikGte : kotlin.String = cikGte_example // kotlin.String | Filter greater than or equal to the value.
val cikLt : kotlin.String = cikLt_example // kotlin.String | Filter less than the value.
val cikLte : kotlin.String = cikLte_example // kotlin.String | Filter less than or equal to the value.
val periodEnd : kotlin.String = periodEnd_example // kotlin.String | The last date of the reporting period (formatted as YYYY-MM-DD). Value must be formatted 'yyyy-mm-dd'.
val periodEndGt : kotlin.String = periodEndGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndGte : kotlin.String = periodEndGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndLt : kotlin.String = periodEndLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndLte : kotlin.String = periodEndLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val filingDate : kotlin.String = filingDate_example // kotlin.String | The date when the financial statement was filed with the SEC. Value must be formatted 'yyyy-mm-dd'.
val filingDateGt : kotlin.String = filingDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateGte : kotlin.String = filingDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateLt : kotlin.String = filingDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateLte : kotlin.String = filingDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val tickers : kotlin.String = tickers_example // kotlin.String | Filter for arrays that contain the value.
val tickersAllOf : kotlin.String = tickersAllOf_example // kotlin.String | Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list.
val tickersAnyOf : kotlin.String = tickersAnyOf_example // kotlin.String | Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list.
val fiscalYear : kotlin.Double = 1.2 // kotlin.Double | The fiscal year for the reporting period. Value must be a floating point number.
val fiscalYearGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val fiscalYearGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val fiscalYearLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val fiscalYearLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val fiscalQuarter : kotlin.Double = 1.2 // kotlin.Double | The fiscal quarter number (1, 2, 3, or 4) for the reporting period. Value must be a floating point number.
val fiscalQuarterGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val fiscalQuarterGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val fiscalQuarterLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val fiscalQuarterLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val timeframe : kotlin.String = timeframe_example // kotlin.String | The reporting period type. Possible values include: quarterly, annual, trailing_twelve_months.
val timeframeAnyOf : kotlin.String = timeframeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val timeframeGt : kotlin.String = timeframeGt_example // kotlin.String | Filter greater than the value.
val timeframeGte : kotlin.String = timeframeGte_example // kotlin.String | Filter greater than or equal to the value.
val timeframeLt : kotlin.String = timeframeLt_example // kotlin.String | Filter less than the value.
val timeframeLte : kotlin.String = timeframeLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'period_end' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetStocksFinancialsV1CashFlowStatements200Response = apiInstance.getStocksFinancialsV1CashFlowStatements(cik, cikAnyOf, cikGt, cikGte, cikLt, cikLte, periodEnd, periodEndGt, periodEndGte, periodEndLt, periodEndLte, filingDate, filingDateGt, filingDateGte, filingDateLt, filingDateLte, tickers, tickersAllOf, tickersAnyOf, fiscalYear, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalQuarter, fiscalQuarterGt, fiscalQuarterGte, fiscalQuarterLt, fiscalQuarterLte, timeframe, timeframeAnyOf, timeframeGt, timeframeGte, timeframeLt, timeframeLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksFinancialsV1CashFlowStatements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksFinancialsV1CashFlowStatements")
    e.printStackTrace()
}
```

### Parameters
| **cik** | **kotlin.String**| The company&#39;s Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company’s CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup). | [optional] |
| **cikAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **cikGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **cikGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **cikLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **cikLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **periodEnd** | **kotlin.String**| The last date of the reporting period (formatted as YYYY-MM-DD). Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDate** | **kotlin.String**| The date when the financial statement was filed with the SEC. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **tickers** | **kotlin.String**| Filter for arrays that contain the value. | [optional] |
| **tickersAllOf** | **kotlin.String**| Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickersAnyOf** | **kotlin.String**| Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **fiscalYear** | **kotlin.Double**| The fiscal year for the reporting period. Value must be a floating point number. | [optional] |
| **fiscalYearGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **fiscalYearGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalYearLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **fiscalYearLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalQuarter** | **kotlin.Double**| The fiscal quarter number (1, 2, 3, or 4) for the reporting period. Value must be a floating point number. | [optional] |
| **fiscalQuarterGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **timeframe** | **kotlin.String**| The reporting period type. Possible values include: quarterly, annual, trailing_twelve_months. | [optional] |
| **timeframeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **timeframeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **timeframeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **timeframeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **timeframeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;period_end&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;period_end.asc&quot;] |

### Return type

[**GetStocksFinancialsV1CashFlowStatements200Response**](GetStocksFinancialsV1CashFlowStatements200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksFinancialsV1IncomeStatements"></a>
# **getStocksFinancialsV1IncomeStatements**
> GetStocksFinancialsV1IncomeStatements200Response getStocksFinancialsV1IncomeStatements(cik, cikAnyOf, cikGt, cikGte, cikLt, cikLte, tickers, tickersAllOf, tickersAnyOf, periodEnd, periodEndGt, periodEndGte, periodEndLt, periodEndLte, filingDate, filingDateGt, filingDateGte, filingDateLt, filingDateLte, fiscalYear, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalQuarter, fiscalQuarterGt, fiscalQuarterGte, fiscalQuarterLt, fiscalQuarterLte, timeframe, timeframeAnyOf, timeframeGt, timeframeGte, timeframeLt, timeframeLte, limit, sort)



A comprehensive database of income statement financial data for public companies, including key metrics such as revenue, expenses, and net income for various reporting periods.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val cik : kotlin.String = cik_example // kotlin.String | The company's Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company’s CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup).
val cikAnyOf : kotlin.String = cikAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val cikGt : kotlin.String = cikGt_example // kotlin.String | Filter greater than the value.
val cikGte : kotlin.String = cikGte_example // kotlin.String | Filter greater than or equal to the value.
val cikLt : kotlin.String = cikLt_example // kotlin.String | Filter less than the value.
val cikLte : kotlin.String = cikLte_example // kotlin.String | Filter less than or equal to the value.
val tickers : kotlin.String = tickers_example // kotlin.String | Filter for arrays that contain the value.
val tickersAllOf : kotlin.String = tickersAllOf_example // kotlin.String | Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list.
val tickersAnyOf : kotlin.String = tickersAnyOf_example // kotlin.String | Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list.
val periodEnd : kotlin.String = periodEnd_example // kotlin.String | The last date of the reporting period (formatted as YYYY-MM-DD). Value must be formatted 'yyyy-mm-dd'.
val periodEndGt : kotlin.String = periodEndGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndGte : kotlin.String = periodEndGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndLt : kotlin.String = periodEndLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val periodEndLte : kotlin.String = periodEndLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val filingDate : kotlin.String = filingDate_example // kotlin.String | The date when the financial statement was filed with the SEC. Value must be formatted 'yyyy-mm-dd'.
val filingDateGt : kotlin.String = filingDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateGte : kotlin.String = filingDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateLt : kotlin.String = filingDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val filingDateLte : kotlin.String = filingDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val fiscalYear : kotlin.Double = 1.2 // kotlin.Double | The fiscal year for the reporting period. Value must be a floating point number.
val fiscalYearGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val fiscalYearGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val fiscalYearLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val fiscalYearLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val fiscalQuarter : kotlin.Double = 1.2 // kotlin.Double | The fiscal quarter number (1, 2, 3, or 4) for the reporting period. Value must be a floating point number.
val fiscalQuarterGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val fiscalQuarterGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val fiscalQuarterLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val fiscalQuarterLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val timeframe : kotlin.String = timeframe_example // kotlin.String | The reporting period type. Possible values include: quarterly, annual, trailing_twelve_months.
val timeframeAnyOf : kotlin.String = timeframeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val timeframeGt : kotlin.String = timeframeGt_example // kotlin.String | Filter greater than the value.
val timeframeGte : kotlin.String = timeframeGte_example // kotlin.String | Filter greater than or equal to the value.
val timeframeLt : kotlin.String = timeframeLt_example // kotlin.String | Filter less than the value.
val timeframeLte : kotlin.String = timeframeLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'period_end' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetStocksFinancialsV1IncomeStatements200Response = apiInstance.getStocksFinancialsV1IncomeStatements(cik, cikAnyOf, cikGt, cikGte, cikLt, cikLte, tickers, tickersAllOf, tickersAnyOf, periodEnd, periodEndGt, periodEndGte, periodEndLt, periodEndLte, filingDate, filingDateGt, filingDateGte, filingDateLt, filingDateLte, fiscalYear, fiscalYearGt, fiscalYearGte, fiscalYearLt, fiscalYearLte, fiscalQuarter, fiscalQuarterGt, fiscalQuarterGte, fiscalQuarterLt, fiscalQuarterLte, timeframe, timeframeAnyOf, timeframeGt, timeframeGte, timeframeLt, timeframeLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksFinancialsV1IncomeStatements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksFinancialsV1IncomeStatements")
    e.printStackTrace()
}
```

### Parameters
| **cik** | **kotlin.String**| The company&#39;s Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company’s CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup). | [optional] |
| **cikAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **cikGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **cikGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **cikLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **cikLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **tickers** | **kotlin.String**| Filter for arrays that contain the value. | [optional] |
| **tickersAllOf** | **kotlin.String**| Filter for arrays that contain all of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickersAnyOf** | **kotlin.String**| Filter for arrays that contain any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **periodEnd** | **kotlin.String**| The last date of the reporting period (formatted as YYYY-MM-DD). Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **periodEndLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDate** | **kotlin.String**| The date when the financial statement was filed with the SEC. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **filingDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **fiscalYear** | **kotlin.Double**| The fiscal year for the reporting period. Value must be a floating point number. | [optional] |
| **fiscalYearGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **fiscalYearGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalYearLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **fiscalYearLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalQuarter** | **kotlin.Double**| The fiscal quarter number (1, 2, 3, or 4) for the reporting period. Value must be a floating point number. | [optional] |
| **fiscalQuarterGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **fiscalQuarterLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **timeframe** | **kotlin.String**| The reporting period type. Possible values include: quarterly, annual, trailing_twelve_months. | [optional] |
| **timeframeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **timeframeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **timeframeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **timeframeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **timeframeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;period_end&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;period_end.asc&quot;] |

### Return type

[**GetStocksFinancialsV1IncomeStatements200Response**](GetStocksFinancialsV1IncomeStatements200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksFinancialsV1Ratios"></a>
# **getStocksFinancialsV1Ratios**
> GetStocksFinancialsV1Ratios200Response getStocksFinancialsV1Ratios(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, cik, cikAnyOf, cikGt, cikGte, cikLt, cikLte, price, priceGt, priceGte, priceLt, priceLte, averageVolume, averageVolumeGt, averageVolumeGte, averageVolumeLt, averageVolumeLte, marketCap, marketCapGt, marketCapGte, marketCapLt, marketCapLte, earningsPerShare, earningsPerShareGt, earningsPerShareGte, earningsPerShareLt, earningsPerShareLte, priceToEarnings, priceToEarningsGt, priceToEarningsGte, priceToEarningsLt, priceToEarningsLte, priceToBook, priceToBookGt, priceToBookGte, priceToBookLt, priceToBookLte, priceToSales, priceToSalesGt, priceToSalesGte, priceToSalesLt, priceToSalesLte, priceToCashFlow, priceToCashFlowGt, priceToCashFlowGte, priceToCashFlowLt, priceToCashFlowLte, priceToFreeCashFlow, priceToFreeCashFlowGt, priceToFreeCashFlowGte, priceToFreeCashFlowLt, priceToFreeCashFlowLte, dividendYield, dividendYieldGt, dividendYieldGte, dividendYieldLt, dividendYieldLte, returnOnAssets, returnOnAssetsGt, returnOnAssetsGte, returnOnAssetsLt, returnOnAssetsLte, returnOnEquity, returnOnEquityGt, returnOnEquityGte, returnOnEquityLt, returnOnEquityLte, debtToEquity, debtToEquityGt, debtToEquityGte, debtToEquityLt, debtToEquityLte, current, currentGt, currentGte, currentLt, currentLte, quick, quickGt, quickGte, quickLt, quickLte, cash, cashGt, cashGte, cashLt, cashLte, evToSales, evToSalesGt, evToSalesGte, evToSalesLt, evToSalesLte, evToEbitda, evToEbitdaGt, evToEbitdaGte, evToEbitdaLt, evToEbitdaLte, enterpriseValue, enterpriseValueGt, enterpriseValueGte, enterpriseValueLt, enterpriseValueLte, freeCashFlow, freeCashFlowGt, freeCashFlowGte, freeCashFlowLt, freeCashFlowLte, limit, sort)



A comprehensive financial ratios dataset providing key valuation, profitability, liquidity, and leverage metrics for public companies. Combines data from income statements, balance sheets, and cash flow statements with daily stock prices to calculate ratios on a daily basis. Uses trailing twelve months (TTM) data for income/cash flow metrics and quarterly data for balance sheet items. Fundamental data updates are applied starting from each filing&#39;s period end date. Market cap calculations use point-in-time shares outstanding for historical accuracy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Stock ticker symbol for the company.
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val cik : kotlin.String = cik_example // kotlin.String | Central Index Key (CIK) number assigned by the SEC to identify the company.
val cikAnyOf : kotlin.String = cikAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val cikGt : kotlin.String = cikGt_example // kotlin.String | Filter greater than the value.
val cikGte : kotlin.String = cikGte_example // kotlin.String | Filter greater than or equal to the value.
val cikLt : kotlin.String = cikLt_example // kotlin.String | Filter less than the value.
val cikLte : kotlin.String = cikLte_example // kotlin.String | Filter less than or equal to the value.
val price : kotlin.Double = 1.2 // kotlin.Double | Stock price used in ratio calculations, typically the closing price for the given date. Value must be a floating point number.
val priceGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val priceGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val priceLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val priceLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val averageVolume : kotlin.Double = 1.2 // kotlin.Double | Average trading volume over the last 30 trading days, providing context for liquidity. Value must be a floating point number.
val averageVolumeGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val averageVolumeGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val averageVolumeLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val averageVolumeLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val marketCap : kotlin.Double = 1.2 // kotlin.Double | Market capitalization, calculated as stock price multiplied by total shares outstanding. Value must be a floating point number.
val marketCapGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val marketCapGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val marketCapLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val marketCapLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val earningsPerShare : kotlin.Double = 1.2 // kotlin.Double | Earnings per share, calculated as net income available to common shareholders divided by weighted shares outstanding. Value must be a floating point number.
val earningsPerShareGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val earningsPerShareGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val earningsPerShareLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val earningsPerShareLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val priceToEarnings : kotlin.Double = 1.2 // kotlin.Double | Price-to-earnings ratio, calculated as stock price divided by earnings per share. Only calculated when earnings per share is positive. Value must be a floating point number.
val priceToEarningsGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val priceToEarningsGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val priceToEarningsLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val priceToEarningsLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val priceToBook : kotlin.Double = 1.2 // kotlin.Double | Price-to-book ratio, calculated as stock price divided by book value per share, comparing market value to book value. Value must be a floating point number.
val priceToBookGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val priceToBookGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val priceToBookLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val priceToBookLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val priceToSales : kotlin.Double = 1.2 // kotlin.Double | Price-to-sales ratio, calculated as stock price divided by revenue per share, measuring valuation relative to sales. Value must be a floating point number.
val priceToSalesGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val priceToSalesGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val priceToSalesLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val priceToSalesLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val priceToCashFlow : kotlin.Double = 1.2 // kotlin.Double | Price-to-cash-flow ratio, calculated as stock price divided by operating cash flow per share. Only calculated when operating cash flow per share is positive. Value must be a floating point number.
val priceToCashFlowGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val priceToCashFlowGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val priceToCashFlowLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val priceToCashFlowLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val priceToFreeCashFlow : kotlin.Double = 1.2 // kotlin.Double | Price-to-free-cash-flow ratio, calculated as stock price divided by free cash flow per share. Only calculated when free cash flow per share is positive. Value must be a floating point number.
val priceToFreeCashFlowGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val priceToFreeCashFlowGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val priceToFreeCashFlowLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val priceToFreeCashFlowLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val dividendYield : kotlin.Double = 1.2 // kotlin.Double | Dividend yield, calculated as annual dividends per share divided by stock price, measuring the income return on investment. Value must be a floating point number.
val dividendYieldGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val dividendYieldGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val dividendYieldLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val dividendYieldLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val returnOnAssets : kotlin.Double = 1.2 // kotlin.Double | Return on assets ratio, calculated as net income divided by total assets, measuring how efficiently a company uses its assets to generate profit. Value must be a floating point number.
val returnOnAssetsGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val returnOnAssetsGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val returnOnAssetsLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val returnOnAssetsLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val returnOnEquity : kotlin.Double = 1.2 // kotlin.Double | Return on equity ratio, calculated as net income divided by total shareholders' equity, measuring profitability relative to shareholders' equity. Value must be a floating point number.
val returnOnEquityGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val returnOnEquityGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val returnOnEquityLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val returnOnEquityLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val debtToEquity : kotlin.Double = 1.2 // kotlin.Double | Debt-to-equity ratio, calculated as total debt (current debt plus long-term debt) divided by total shareholders' equity, measuring financial leverage. Value must be a floating point number.
val debtToEquityGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val debtToEquityGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val debtToEquityLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val debtToEquityLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val current : kotlin.Double = 1.2 // kotlin.Double | Current ratio, calculated as total current assets divided by total current liabilities, measuring short-term liquidity. Value must be a floating point number.
val currentGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val currentGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val currentLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val currentLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val quick : kotlin.Double = 1.2 // kotlin.Double | Quick ratio (acid-test ratio), calculated as (current assets minus inventories) divided by current liabilities, measuring immediate liquidity. Value must be a floating point number.
val quickGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val quickGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val quickLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val quickLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val cash : kotlin.Double = 1.2 // kotlin.Double | Cash ratio, calculated as cash and cash equivalents divided by current liabilities, measuring the most liquid form of liquidity coverage. Value must be a floating point number.
val cashGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val cashGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val cashLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val cashLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val evToSales : kotlin.Double = 1.2 // kotlin.Double | Enterprise value to sales ratio, calculated as enterprise value divided by revenue, measuring company valuation relative to sales. Value must be a floating point number.
val evToSalesGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val evToSalesGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val evToSalesLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val evToSalesLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val evToEbitda : kotlin.Double = 1.2 // kotlin.Double | Enterprise value to EBITDA ratio, calculated as enterprise value divided by EBITDA, measuring company valuation relative to earnings before interest, taxes, depreciation, and amortization. Value must be a floating point number.
val evToEbitdaGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val evToEbitdaGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val evToEbitdaLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val evToEbitdaLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val enterpriseValue : kotlin.Double = 1.2 // kotlin.Double | Enterprise value, calculated as market capitalization plus total debt minus cash and cash equivalents, representing total company value. Value must be a floating point number.
val enterpriseValueGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val enterpriseValueGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val enterpriseValueLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val enterpriseValueLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val freeCashFlow : kotlin.Double = 1.2 // kotlin.Double | Free cash flow, calculated as operating cash flow minus capital expenditures (purchase of property, plant, and equipment). Value must be a floating point number.
val freeCashFlowGt : kotlin.Double = 1.2 // kotlin.Double | Filter greater than the value. Value must be a floating point number.
val freeCashFlowGte : kotlin.Double = 1.2 // kotlin.Double | Filter greater than or equal to the value. Value must be a floating point number.
val freeCashFlowLt : kotlin.Double = 1.2 // kotlin.Double | Filter less than the value. Value must be a floating point number.
val freeCashFlowLte : kotlin.Double = 1.2 // kotlin.Double | Filter less than or equal to the value. Value must be a floating point number.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '50000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetStocksFinancialsV1Ratios200Response = apiInstance.getStocksFinancialsV1Ratios(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, cik, cikAnyOf, cikGt, cikGte, cikLt, cikLte, price, priceGt, priceGte, priceLt, priceLte, averageVolume, averageVolumeGt, averageVolumeGte, averageVolumeLt, averageVolumeLte, marketCap, marketCapGt, marketCapGte, marketCapLt, marketCapLte, earningsPerShare, earningsPerShareGt, earningsPerShareGte, earningsPerShareLt, earningsPerShareLte, priceToEarnings, priceToEarningsGt, priceToEarningsGte, priceToEarningsLt, priceToEarningsLte, priceToBook, priceToBookGt, priceToBookGte, priceToBookLt, priceToBookLte, priceToSales, priceToSalesGt, priceToSalesGte, priceToSalesLt, priceToSalesLte, priceToCashFlow, priceToCashFlowGt, priceToCashFlowGte, priceToCashFlowLt, priceToCashFlowLte, priceToFreeCashFlow, priceToFreeCashFlowGt, priceToFreeCashFlowGte, priceToFreeCashFlowLt, priceToFreeCashFlowLte, dividendYield, dividendYieldGt, dividendYieldGte, dividendYieldLt, dividendYieldLte, returnOnAssets, returnOnAssetsGt, returnOnAssetsGte, returnOnAssetsLt, returnOnAssetsLte, returnOnEquity, returnOnEquityGt, returnOnEquityGte, returnOnEquityLt, returnOnEquityLte, debtToEquity, debtToEquityGt, debtToEquityGte, debtToEquityLt, debtToEquityLte, current, currentGt, currentGte, currentLt, currentLte, quick, quickGt, quickGte, quickLt, quickLte, cash, cashGt, cashGte, cashLt, cashLte, evToSales, evToSalesGt, evToSalesGte, evToSalesLt, evToSalesLte, evToEbitda, evToEbitdaGt, evToEbitdaGte, evToEbitdaLt, evToEbitdaLte, enterpriseValue, enterpriseValueGt, enterpriseValueGte, enterpriseValueLt, enterpriseValueLte, freeCashFlow, freeCashFlowGt, freeCashFlowGte, freeCashFlowLt, freeCashFlowLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksFinancialsV1Ratios")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksFinancialsV1Ratios")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Stock ticker symbol for the company. | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **cik** | **kotlin.String**| Central Index Key (CIK) number assigned by the SEC to identify the company. | [optional] |
| **cikAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **cikGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **cikGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **cikLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **cikLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **price** | **kotlin.Double**| Stock price used in ratio calculations, typically the closing price for the given date. Value must be a floating point number. | [optional] |
| **priceGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **priceGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **priceLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **priceLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **averageVolume** | **kotlin.Double**| Average trading volume over the last 30 trading days, providing context for liquidity. Value must be a floating point number. | [optional] |
| **averageVolumeGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **averageVolumeGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **averageVolumeLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **averageVolumeLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **marketCap** | **kotlin.Double**| Market capitalization, calculated as stock price multiplied by total shares outstanding. Value must be a floating point number. | [optional] |
| **marketCapGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **marketCapGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **marketCapLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **marketCapLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **earningsPerShare** | **kotlin.Double**| Earnings per share, calculated as net income available to common shareholders divided by weighted shares outstanding. Value must be a floating point number. | [optional] |
| **earningsPerShareGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **earningsPerShareGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **earningsPerShareLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **earningsPerShareLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToEarnings** | **kotlin.Double**| Price-to-earnings ratio, calculated as stock price divided by earnings per share. Only calculated when earnings per share is positive. Value must be a floating point number. | [optional] |
| **priceToEarningsGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **priceToEarningsGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToEarningsLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **priceToEarningsLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToBook** | **kotlin.Double**| Price-to-book ratio, calculated as stock price divided by book value per share, comparing market value to book value. Value must be a floating point number. | [optional] |
| **priceToBookGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **priceToBookGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToBookLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **priceToBookLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToSales** | **kotlin.Double**| Price-to-sales ratio, calculated as stock price divided by revenue per share, measuring valuation relative to sales. Value must be a floating point number. | [optional] |
| **priceToSalesGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **priceToSalesGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToSalesLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **priceToSalesLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToCashFlow** | **kotlin.Double**| Price-to-cash-flow ratio, calculated as stock price divided by operating cash flow per share. Only calculated when operating cash flow per share is positive. Value must be a floating point number. | [optional] |
| **priceToCashFlowGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **priceToCashFlowGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToCashFlowLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **priceToCashFlowLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToFreeCashFlow** | **kotlin.Double**| Price-to-free-cash-flow ratio, calculated as stock price divided by free cash flow per share. Only calculated when free cash flow per share is positive. Value must be a floating point number. | [optional] |
| **priceToFreeCashFlowGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **priceToFreeCashFlowGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **priceToFreeCashFlowLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **priceToFreeCashFlowLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **dividendYield** | **kotlin.Double**| Dividend yield, calculated as annual dividends per share divided by stock price, measuring the income return on investment. Value must be a floating point number. | [optional] |
| **dividendYieldGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **dividendYieldGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **dividendYieldLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **dividendYieldLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **returnOnAssets** | **kotlin.Double**| Return on assets ratio, calculated as net income divided by total assets, measuring how efficiently a company uses its assets to generate profit. Value must be a floating point number. | [optional] |
| **returnOnAssetsGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **returnOnAssetsGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **returnOnAssetsLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **returnOnAssetsLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **returnOnEquity** | **kotlin.Double**| Return on equity ratio, calculated as net income divided by total shareholders&#39; equity, measuring profitability relative to shareholders&#39; equity. Value must be a floating point number. | [optional] |
| **returnOnEquityGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **returnOnEquityGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **returnOnEquityLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **returnOnEquityLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **debtToEquity** | **kotlin.Double**| Debt-to-equity ratio, calculated as total debt (current debt plus long-term debt) divided by total shareholders&#39; equity, measuring financial leverage. Value must be a floating point number. | [optional] |
| **debtToEquityGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **debtToEquityGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **debtToEquityLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **debtToEquityLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **current** | **kotlin.Double**| Current ratio, calculated as total current assets divided by total current liabilities, measuring short-term liquidity. Value must be a floating point number. | [optional] |
| **currentGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **currentGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **currentLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **currentLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **quick** | **kotlin.Double**| Quick ratio (acid-test ratio), calculated as (current assets minus inventories) divided by current liabilities, measuring immediate liquidity. Value must be a floating point number. | [optional] |
| **quickGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **quickGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **quickLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **quickLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **cash** | **kotlin.Double**| Cash ratio, calculated as cash and cash equivalents divided by current liabilities, measuring the most liquid form of liquidity coverage. Value must be a floating point number. | [optional] |
| **cashGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **cashGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **cashLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **cashLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **evToSales** | **kotlin.Double**| Enterprise value to sales ratio, calculated as enterprise value divided by revenue, measuring company valuation relative to sales. Value must be a floating point number. | [optional] |
| **evToSalesGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **evToSalesGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **evToSalesLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **evToSalesLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **evToEbitda** | **kotlin.Double**| Enterprise value to EBITDA ratio, calculated as enterprise value divided by EBITDA, measuring company valuation relative to earnings before interest, taxes, depreciation, and amortization. Value must be a floating point number. | [optional] |
| **evToEbitdaGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **evToEbitdaGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **evToEbitdaLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **evToEbitdaLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **enterpriseValue** | **kotlin.Double**| Enterprise value, calculated as market capitalization plus total debt minus cash and cash equivalents, representing total company value. Value must be a floating point number. | [optional] |
| **enterpriseValueGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **enterpriseValueGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **enterpriseValueLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **enterpriseValueLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **freeCashFlow** | **kotlin.Double**| Free cash flow, calculated as operating cash flow minus capital expenditures (purchase of property, plant, and equipment). Value must be a floating point number. | [optional] |
| **freeCashFlowGt** | **kotlin.Double**| Filter greater than the value. Value must be a floating point number. | [optional] |
| **freeCashFlowGte** | **kotlin.Double**| Filter greater than or equal to the value. Value must be a floating point number. | [optional] |
| **freeCashFlowLt** | **kotlin.Double**| Filter less than the value. Value must be a floating point number. | [optional] |
| **freeCashFlowLte** | **kotlin.Double**| Filter less than or equal to the value. Value must be a floating point number. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;50000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;ticker.asc&quot;] |

### Return type

[**GetStocksFinancialsV1Ratios200Response**](GetStocksFinancialsV1Ratios200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksMACD"></a>
# **getStocksMACD**
> GetStocksMACD200Response getStocksMACD(stockTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

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
    val result : GetStocksMACD200Response = apiInstance.getStocksMACD(stockTicker, timestamp, timespan, adjusted, shortWindow, longWindow, signalWindow, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
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

[**GetStocksMACD200Response**](GetStocksMACD200Response.md)

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
> GetStocksRSI200Response getStocksRSI(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

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
    val result : GetStocksRSI200Response = apiInstance.getStocksRSI(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
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

[**GetStocksRSI200Response**](GetStocksRSI200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksSMA"></a>
# **getStocksSMA**
> GetStocksSMA200Response getStocksSMA(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)

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
    val result : GetStocksSMA200Response = apiInstance.getStocksSMA(stockTicker, timestamp, timespan, adjusted, window, seriesType, expandUnderlying, order, limit, timestampGte, timestampGt, timestampLte, timestampLt)
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

[**GetStocksSMA200Response**](GetStocksSMA200Response.md)

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

<a id="getStocksV1Dividends"></a>
# **getStocksV1Dividends**
> GetStocksV1Dividends200Response getStocksV1Dividends(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, exDividendDate, exDividendDateGt, exDividendDateGte, exDividendDateLt, exDividendDateLte, frequency, frequencyGt, frequencyGte, frequencyLt, frequencyLte, distributionType, distributionTypeAnyOf, distributionTypeGt, distributionTypeGte, distributionTypeLt, distributionTypeLte, limit, sort)



Contains historical dividend payment records for US stocks with split-adjusted amounts and historical adjustment factors for price normalization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Stock symbol for the company issuing the dividend
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val exDividendDate : kotlin.String = exDividendDate_example // kotlin.String | Date when the stock begins trading without the dividend value Value must be formatted 'yyyy-mm-dd'.
val exDividendDateGt : kotlin.String = exDividendDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val exDividendDateGte : kotlin.String = exDividendDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val exDividendDateLt : kotlin.String = exDividendDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val exDividendDateLte : kotlin.String = exDividendDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val frequency : kotlin.Long = 789 // kotlin.Long | How many times per year this dividend is expected to occur. A value of 0 means the distribution is non-recurring or irregular (e.g., special, supplemental, or a one-off dividend). Other possible values include 1 (annual), 2 (semi-annual), 3 (trimester), 4 (quarterly), 12 (monthly), 24 (bi-monthly), 26 (bi-weekly), 52 (weekly), and 365 (daily) depending on the issuer's declared or inferred payout cadence. Value must be an integer.
val frequencyGt : kotlin.Long = 789 // kotlin.Long | Filter greater than the value. Value must be an integer.
val frequencyGte : kotlin.Long = 789 // kotlin.Long | Filter greater than or equal to the value. Value must be an integer.
val frequencyLt : kotlin.Long = 789 // kotlin.Long | Filter less than the value. Value must be an integer.
val frequencyLte : kotlin.Long = 789 // kotlin.Long | Filter less than or equal to the value. Value must be an integer.
val distributionType : kotlin.String = distributionType_example // kotlin.String | Classification describing the nature of this dividend's recurrence pattern: recurring (paid on a regular schedule), special (one-time or commemorative), supplemental (extra beyond the regular schedule), irregular (unpredictable or non-recurring), unknown (cannot be classified from available data)
val distributionTypeAnyOf : kotlin.String = distributionTypeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val distributionTypeGt : kotlin.String = distributionTypeGt_example // kotlin.String | Filter greater than the value.
val distributionTypeGte : kotlin.String = distributionTypeGte_example // kotlin.String | Filter greater than or equal to the value.
val distributionTypeLt : kotlin.String = distributionTypeLt_example // kotlin.String | Filter less than the value.
val distributionTypeLte : kotlin.String = distributionTypeLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '5000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'ticker' if not specified. The sort order defaults to 'asc' if not specified.
try {
    val result : GetStocksV1Dividends200Response = apiInstance.getStocksV1Dividends(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, exDividendDate, exDividendDateGt, exDividendDateGte, exDividendDateLt, exDividendDateLte, frequency, frequencyGt, frequencyGte, frequencyLt, frequencyLte, distributionType, distributionTypeAnyOf, distributionTypeGt, distributionTypeGte, distributionTypeLt, distributionTypeLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksV1Dividends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksV1Dividends")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Stock symbol for the company issuing the dividend | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **exDividendDate** | **kotlin.String**| Date when the stock begins trading without the dividend value Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **exDividendDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **exDividendDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **exDividendDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **exDividendDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **frequency** | **kotlin.Long**| How many times per year this dividend is expected to occur. A value of 0 means the distribution is non-recurring or irregular (e.g., special, supplemental, or a one-off dividend). Other possible values include 1 (annual), 2 (semi-annual), 3 (trimester), 4 (quarterly), 12 (monthly), 24 (bi-monthly), 26 (bi-weekly), 52 (weekly), and 365 (daily) depending on the issuer&#39;s declared or inferred payout cadence. Value must be an integer. | [optional] |
| **frequencyGt** | **kotlin.Long**| Filter greater than the value. Value must be an integer. | [optional] |
| **frequencyGte** | **kotlin.Long**| Filter greater than or equal to the value. Value must be an integer. | [optional] |
| **frequencyLt** | **kotlin.Long**| Filter less than the value. Value must be an integer. | [optional] |
| **frequencyLte** | **kotlin.Long**| Filter less than or equal to the value. Value must be an integer. | [optional] |
| **distributionType** | **kotlin.String**| Classification describing the nature of this dividend&#39;s recurrence pattern: recurring (paid on a regular schedule), special (one-time or commemorative), supplemental (extra beyond the regular schedule), irregular (unpredictable or non-recurring), unknown (cannot be classified from available data) | [optional] |
| **distributionTypeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **distributionTypeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **distributionTypeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **distributionTypeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **distributionTypeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;5000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;ticker&#39; if not specified. The sort order defaults to &#39;asc&#39; if not specified. | [optional] [default to &quot;ticker.asc&quot;] |

### Return type

[**GetStocksV1Dividends200Response**](GetStocksV1Dividends200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocksV1Exchanges"></a>
# **getStocksV1Exchanges**
> GetStocksV1Exchanges200Response getStocksV1Exchanges(limit)



US stock exchanges, trading venues, and reporting facilities including exchanges (NYSE, Nasdaq), Trade Reporting Facilities (TRF), Securities Information Processors (SIP), and OTC Reporting Facilities (ORF) for equity trading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '999'.
try {
    val result : GetStocksV1Exchanges200Response = apiInstance.getStocksV1Exchanges(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksV1Exchanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksV1Exchanges")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;999&#39;. | [optional] [default to 100] |

### Return type

[**GetStocksV1Exchanges200Response**](GetStocksV1Exchanges200Response.md)

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



Comprehensive FINRA short interest data that tracks the short selling metrics for securities on a specific settlement date.

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



Contains short selling volume for different stock tickers, capturing total trading volume, short sale details, and breakdown by different trading platforms.

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

<a id="getStocksV1Splits"></a>
# **getStocksV1Splits**
> GetStocksV1Splits200Response getStocksV1Splits(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, executionDate, executionDateGt, executionDateGte, executionDateLt, executionDateLte, adjustmentType, adjustmentTypeAnyOf, adjustmentTypeGt, adjustmentTypeGte, adjustmentTypeLt, adjustmentTypeLte, limit, sort)



Contains historical stock split and reverse split events for US equities with historical adjustment factors for price normalization.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Stock symbol for the company that executed the split
val tickerAnyOf : kotlin.String = tickerAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val tickerGt : kotlin.String = tickerGt_example // kotlin.String | Filter greater than the value.
val tickerGte : kotlin.String = tickerGte_example // kotlin.String | Filter greater than or equal to the value.
val tickerLt : kotlin.String = tickerLt_example // kotlin.String | Filter less than the value.
val tickerLte : kotlin.String = tickerLte_example // kotlin.String | Filter less than or equal to the value.
val executionDate : kotlin.String = executionDate_example // kotlin.String | Date when the stock split was applied and shares adjusted Value must be formatted 'yyyy-mm-dd'.
val executionDateGt : kotlin.String = executionDateGt_example // kotlin.String | Filter greater than the value. Value must be formatted 'yyyy-mm-dd'.
val executionDateGte : kotlin.String = executionDateGte_example // kotlin.String | Filter greater than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val executionDateLt : kotlin.String = executionDateLt_example // kotlin.String | Filter less than the value. Value must be formatted 'yyyy-mm-dd'.
val executionDateLte : kotlin.String = executionDateLte_example // kotlin.String | Filter less than or equal to the value. Value must be formatted 'yyyy-mm-dd'.
val adjustmentType : kotlin.String = adjustmentType_example // kotlin.String | Classification of the share-change event. Possible values include: forward_split (share count increases), reverse_split (share count decreases), stock_dividend (shares issued as a dividend)
val adjustmentTypeAnyOf : kotlin.String = adjustmentTypeAnyOf_example // kotlin.String | Filter equal to any of the values. Multiple values can be specified by using a comma separated list.
val adjustmentTypeGt : kotlin.String = adjustmentTypeGt_example // kotlin.String | Filter greater than the value.
val adjustmentTypeGte : kotlin.String = adjustmentTypeGte_example // kotlin.String | Filter greater than or equal to the value.
val adjustmentTypeLt : kotlin.String = adjustmentTypeLt_example // kotlin.String | Filter less than the value.
val adjustmentTypeLte : kotlin.String = adjustmentTypeLte_example // kotlin.String | Filter less than or equal to the value.
val limit : kotlin.Int = 56 // kotlin.Int | Limit the maximum number of results returned. Defaults to '100' if not specified. The maximum allowed limit is '5000'.
val sort : kotlin.String = sort_example // kotlin.String | A comma separated list of sort columns. For each column, append '.asc' or '.desc' to specify the sort direction. The sort column defaults to 'execution_date' if not specified. The sort order defaults to 'desc' if not specified.
try {
    val result : GetStocksV1Splits200Response = apiInstance.getStocksV1Splits(ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, executionDate, executionDateGt, executionDateGte, executionDateLt, executionDateLte, adjustmentType, adjustmentTypeAnyOf, adjustmentTypeGt, adjustmentTypeGte, adjustmentTypeLt, adjustmentTypeLte, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStocksV1Splits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStocksV1Splits")
    e.printStackTrace()
}
```

### Parameters
| **ticker** | **kotlin.String**| Stock symbol for the company that executed the split | [optional] |
| **tickerAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **tickerGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **tickerGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **tickerLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **tickerLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **executionDate** | **kotlin.String**| Date when the stock split was applied and shares adjusted Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **executionDateGt** | **kotlin.String**| Filter greater than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **executionDateGte** | **kotlin.String**| Filter greater than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **executionDateLt** | **kotlin.String**| Filter less than the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **executionDateLte** | **kotlin.String**| Filter less than or equal to the value. Value must be formatted &#39;yyyy-mm-dd&#39;. | [optional] |
| **adjustmentType** | **kotlin.String**| Classification of the share-change event. Possible values include: forward_split (share count increases), reverse_split (share count decreases), stock_dividend (shares issued as a dividend) | [optional] |
| **adjustmentTypeAnyOf** | **kotlin.String**| Filter equal to any of the values. Multiple values can be specified by using a comma separated list. | [optional] |
| **adjustmentTypeGt** | **kotlin.String**| Filter greater than the value. | [optional] |
| **adjustmentTypeGte** | **kotlin.String**| Filter greater than or equal to the value. | [optional] |
| **adjustmentTypeLt** | **kotlin.String**| Filter less than the value. | [optional] |
| **adjustmentTypeLte** | **kotlin.String**| Filter less than or equal to the value. | [optional] |
| **limit** | **kotlin.Int**| Limit the maximum number of results returned. Defaults to &#39;100&#39; if not specified. The maximum allowed limit is &#39;5000&#39;. | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| A comma separated list of sort columns. For each column, append &#39;.asc&#39; or &#39;.desc&#39; to specify the sort direction. The sort column defaults to &#39;execution_date&#39; if not specified. The sort order defaults to &#39;desc&#39; if not specified. | [optional] [default to &quot;execution_date.desc&quot;] |

### Return type

[**GetStocksV1Splits200Response**](GetStocksV1Splits200Response.md)

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

Get a single ticker supported by Massive.com. This response will have detailed information about the ticker and the company behind it.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = AAPL // kotlin.String | Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc.
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
| **ticker** | **kotlin.String**| Specify a case-sensitive ticker symbol. For example, AAPL represents Apple Inc. | |
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
> GetTmxV1CorporateEvents200Response getTmxV1CorporateEvents(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, type, typeAnyOf, typeGt, typeGte, typeLt, typeLte, status, statusAnyOf, statusGt, statusGte, statusLt, statusLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, isin, isinAnyOf, isinGt, isinGte, isinLt, isinLte, tradingVenue, tradingVenueAnyOf, tradingVenueGt, tradingVenueGte, tradingVenueLt, tradingVenueLte, tmxCompanyId, tmxCompanyIdGt, tmxCompanyIdGte, tmxCompanyIdLt, tmxCompanyIdLte, tmxRecordId, tmxRecordIdAnyOf, tmxRecordIdGt, tmxRecordIdGte, tmxRecordIdLt, tmxRecordIdLte, limit, sort)



Contains corporate events and announcements for publicly traded companies, including earnings releases, conferences, dividends, and business updates sourced from TMX.

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
    val result : GetTmxV1CorporateEvents200Response = apiInstance.getTmxV1CorporateEvents(date, dateAnyOf, dateGt, dateGte, dateLt, dateLte, type, typeAnyOf, typeGt, typeGte, typeLt, typeLte, status, statusAnyOf, statusGt, statusGte, statusLt, statusLte, ticker, tickerAnyOf, tickerGt, tickerGte, tickerLt, tickerLte, isin, isinAnyOf, isinGt, isinGte, isinLt, isinLte, tradingVenue, tradingVenueAnyOf, tradingVenueGt, tradingVenueGte, tradingVenueLt, tradingVenueLte, tmxCompanyId, tmxCompanyIdGt, tmxCompanyIdGte, tmxCompanyIdLt, tmxCompanyIdLte, tmxRecordId, tmxRecordIdAnyOf, tmxRecordIdGt, tmxRecordIdGte, tmxRecordIdLt, tmxRecordIdLte, limit, sort)
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

List all conditions that Massive uses.

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

<a id="listContracts"></a>
# **listContracts**
> ListContracts200Response listContracts(productCode, firstTradeDate, lastTradeDate, asOf, active, type, limit, sort)

Contracts

The Contracts endpoint returns a list of futures contracts. This endpoint can be used to query for contracts based on a variety of parameters, including the contract&#39;s ticker, product code, first trade date, last trade date, and whether or not the contract was active on a given date.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val productCode : kotlin.String = productCode_example // kotlin.String | A unique identifier for the Product a Contract belongs to. Note that multiple contracts can belong to the same product.
val firstTradeDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | The first day that a contract was tradeable. A date with the format YYYY-MM-DD.
val lastTradeDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | The last day that the contract was tradeable. A date with the format YYYY-MM-DD.
val asOf : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Specify the point-in-time for which you want to retrieve information. Note that the contract data returned for a given date is the state of that contract as of that day. A date in the format YYYY-MM-DD (default=today).
val active : kotlin.String = active_example // kotlin.String | Filter for contracts based on whether or not they were tradeable at the given point in time. For example, if the date queried is greater-than or equal-to a contract's 'first_trade_date' and less-than-or-equal-to its 'last_trade_date', then the contract was active. If the date queried is greater-than-or-equal-to the contract's 'last_trade_date' or less-than-or-equal-to its 'first_trade_date', then the contract was inactive.
val type : kotlin.String = type_example // kotlin.String | The type of contract, one of \"all\", \"single\", or \"combo\" (default=all).
val limit : kotlin.Int = 56 // kotlin.Int | The number of results to return per page (default=100, max=1000, min=1).
val sort : kotlin.String = product_code.asc // kotlin.String | Sort results by field and direction using dotted notation (e.g., 'ticker.asc', 'name.desc').
try {
    val result : ListContracts200Response = apiInstance.listContracts(productCode, firstTradeDate, lastTradeDate, asOf, active, type, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listContracts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listContracts")
    e.printStackTrace()
}
```

### Parameters
| **productCode** | **kotlin.String**| A unique identifier for the Product a Contract belongs to. Note that multiple contracts can belong to the same product. | [optional] |
| **firstTradeDate** | **java.time.LocalDate**| The first day that a contract was tradeable. A date with the format YYYY-MM-DD. | [optional] |
| **lastTradeDate** | **java.time.LocalDate**| The last day that the contract was tradeable. A date with the format YYYY-MM-DD. | [optional] |
| **asOf** | **java.time.LocalDate**| Specify the point-in-time for which you want to retrieve information. Note that the contract data returned for a given date is the state of that contract as of that day. A date in the format YYYY-MM-DD (default&#x3D;today). | [optional] |
| **active** | **kotlin.String**| Filter for contracts based on whether or not they were tradeable at the given point in time. For example, if the date queried is greater-than or equal-to a contract&#39;s &#39;first_trade_date&#39; and less-than-or-equal-to its &#39;last_trade_date&#39;, then the contract was active. If the date queried is greater-than-or-equal-to the contract&#39;s &#39;last_trade_date&#39; or less-than-or-equal-to its &#39;first_trade_date&#39;, then the contract was inactive. | [optional] [default to all] [enum: all, true, false] |
| **type** | **kotlin.String**| The type of contract, one of \&quot;all\&quot;, \&quot;single\&quot;, or \&quot;combo\&quot; (default&#x3D;all). | [optional] [default to all] [enum: all, single, combo] |
| **limit** | **kotlin.Int**| The number of results to return per page (default&#x3D;100, max&#x3D;1000, min&#x3D;1). | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort results by field and direction using dotted notation (e.g., &#39;ticker.asc&#39;, &#39;name.desc&#39;). | [optional] [default to product_code.asc] [enum: product_code.asc, product_code.desc, first_trade_date.asc, first_trade_date.desc, last_trade_date.asc, last_trade_date.desc] |

### Return type

[**ListContracts200Response**](ListContracts200Response.md)

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

List all exchanges that Massive knows about.

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
| **assetClass** | **kotlin.String**| Filter by asset class. | [optional] [enum: stocks, options, crypto, fx, futures] |
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

<a id="listMarketStatuses"></a>
# **listMarketStatuses**
> ListMarketStatuses200Response listMarketStatuses(productCodeAnyOf, productCode, limit, sort)

Market Status

The market status endpoint returns the current status of the futures market for the given product code(s).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val productCodeAnyOf : kotlin.String = ES,CL // kotlin.String | The product code(s) to return market statuses for.  Multiple product codes can be specified by separating them with a comma. Currently, the limit is 250 product codes.
val productCode : kotlin.String = ES // kotlin.String | The product code to return market statuses for.
val limit : kotlin.Int = 56 // kotlin.Int | The number of results to return per page (default=100, max=1000, min=1).
val sort : kotlin.String = product_code.asc // kotlin.String | Sort results by field and direction using dotted notation (e.g., 'ticker.asc', 'name.desc').
try {
    val result : ListMarketStatuses200Response = apiInstance.listMarketStatuses(productCodeAnyOf, productCode, limit, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listMarketStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listMarketStatuses")
    e.printStackTrace()
}
```

### Parameters
| **productCodeAnyOf** | **kotlin.String**| The product code(s) to return market statuses for.  Multiple product codes can be specified by separating them with a comma. Currently, the limit is 250 product codes. | [optional] |
| **productCode** | **kotlin.String**| The product code to return market statuses for. | [optional] |
| **limit** | **kotlin.Int**| The number of results to return per page (default&#x3D;100, max&#x3D;1000, min&#x3D;1). | [optional] [default to 100] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort results by field and direction using dotted notation (e.g., &#39;ticker.asc&#39;, &#39;name.desc&#39;). | [optional] [default to product_code.asc] [enum: product_code.asc, product_code.desc] |

### Return type

[**ListMarketStatuses200Response**](ListMarketStatuses200Response.md)

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
val ticker : kotlin.String = ticker_example // kotlin.String | This parameter has been deprecated. To search by specific options ticker, use the Options Contract endpoint [here](https://massive.com/docs/rest/options/contracts/contract-overview).
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
| **ticker** | **kotlin.String**| This parameter has been deprecated. To search by specific options ticker, use the Options Contract endpoint [here](https://massive.com/docs/rest/options/contracts/contract-overview). | [optional] |
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

<a id="listProducts"></a>
# **listProducts**
> ListProducts200Response listProducts(name, asOf, tradingVenue, sector, subSector, assetClass, assetSubClass, type, limit, nameSearch, sort)

Products

The Products endpoint returns a list of futures products. This endpoint can be used to query for products based on a variety of parameters, including by the product&#39;s name, exchange, sector, sub-sector, asset class, asset sub-class, and type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val name : kotlin.String = name_example // kotlin.String | Search for products by Product Name. This parameter supports an exact match, while a name-contains search can be performed using the `name.search` parameter. Note that the search is case-sensitive.
val asOf : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about products for the specified day (default=today).
val tradingVenue : kotlin.String = tradingVenue_example // kotlin.String | The trading venue (MIC) for the exchange on which the products trades.
val sector : kotlin.String = sector_example // kotlin.String | The sector to which the products belong.
val subSector : kotlin.String = subSector_example // kotlin.String | The sub-sector to which the products belong.
val assetClass : kotlin.String = assetClass_example // kotlin.String | The asset class to which the products belong.
val assetSubClass : kotlin.String = assetSubClass_example // kotlin.String | The asset sub-class to which the products belong.
val type : kotlin.String = type_example // kotlin.String | The type of products to return. One of \"all\", \"single\", or \"combo\" (default=all).
val limit : kotlin.Int = 56 // kotlin.Int | The number of results to return per page (default=100, maximum=1000, minimum=1).
val nameSearch : kotlin.String = nameSearch_example // kotlin.String | Search by name.
val sort : kotlin.String = name.asc // kotlin.String | Sort results by field and direction using dotted notation (e.g., 'ticker.asc', 'name.desc').
try {
    val result : ListProducts200Response = apiInstance.listProducts(name, asOf, tradingVenue, sector, subSector, assetClass, assetSubClass, type, limit, nameSearch, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listProducts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listProducts")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**| Search for products by Product Name. This parameter supports an exact match, while a name-contains search can be performed using the &#x60;name.search&#x60; parameter. Note that the search is case-sensitive. | [optional] |
| **asOf** | **java.time.LocalDate**| A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about products for the specified day (default&#x3D;today). | [optional] |
| **tradingVenue** | **kotlin.String**| The trading venue (MIC) for the exchange on which the products trades. | [optional] |
| **sector** | **kotlin.String**| The sector to which the products belong. | [optional] [enum: asia, base, biofuels, coal, cross_rates, crude_oil, custom_index, dairy, dj_ubs_ci, electricity, emissions, europe, fertilizer, forestry, grains_and_oilseeds, intl_index, liq_nat_gas_lng, livestock, long_term_gov, long_term_non_gov, majors, minors, nat_gas, nat_gas_liq_petro, precious, refined_products, s_and_p_gsci, sel_sector_index, short_term_gov, short_term_non_gov, softs, us, us_index, wet_bulk] |
| **subSector** | **kotlin.String**| The sub-sector to which the products belong. | [optional] [enum: asian, canadian, cat, cooling_degree_days, ercot, european, gulf, heating_degree_days, iso_ne, large_cap_index, mid_cap_index, miso, north_american, nyiso, pjm, small_cap_index, west, western_power] |
| **assetClass** | **kotlin.String**| The asset class to which the products belong. | [optional] [enum: alt_investment, commodity, financials] |
| **assetSubClass** | **kotlin.String**| The asset sub-class to which the products belong. | [optional] [enum: agricultural, commodity_index, energy, equity, foreign_exchange, freight, housing, interest_rate, metals, weather] |
| **type** | **kotlin.String**| The type of products to return. One of \&quot;all\&quot;, \&quot;single\&quot;, or \&quot;combo\&quot; (default&#x3D;all). | [optional] [default to all] [enum: all, single, combo] |
| **limit** | **kotlin.Int**| The number of results to return per page (default&#x3D;100, maximum&#x3D;1000, minimum&#x3D;1). | [optional] [default to 100] |
| **nameSearch** | **kotlin.String**| Search by name. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort results by field and direction using dotted notation (e.g., &#39;ticker.asc&#39;, &#39;name.desc&#39;). | [optional] [default to name.asc] [enum: name.asc, name.desc, trading_venue.asc, trading_venue.desc, sector.asc, sector.desc, sub_sector.asc, sub_sector.desc, asset_class.asc, asset_class.desc, asset_sub_class.asc, asset_sub_class.desc, type.asc, type.desc] |

### Return type

[**ListProducts200Response**](ListProducts200Response.md)

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

List all ticker types that Massive.com has.

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

Query all ticker symbols which are supported by Massive.com. This API currently includes Stocks/Equities, Indices, Forex, and Crypto.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ticker : kotlin.String = ticker_example // kotlin.String | Specify a ticker symbol. Defaults to empty string which queries all tickers.
val type : kotlin.String = type_example // kotlin.String | Specify the type of the tickers. Find the types that we support via our [Ticker Types API](https://massive.com/docs/rest/stocks/tickers/ticker-types). Defaults to empty string which queries all types.
val market : kotlin.String = market_example // kotlin.String | Filter by market type. By default all markets are included.
val exchange : kotlin.String = exchange_example // kotlin.String | Specify the asset's primary exchange Market Identifier Code (MIC) according to [ISO 10383](https://www.iso20022.org/market-identifier-codes). Defaults to empty string which queries all exchanges.
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
| **type** | **kotlin.String**| Specify the type of the tickers. Find the types that we support via our [Ticker Types API](https://massive.com/docs/rest/stocks/tickers/ticker-types). Defaults to empty string which queries all types. | [optional] [enum: CS, ADRC, ADRP, ADRR, UNIT, RIGHT, PFD, FUND, SP, WARRANT, INDEX, ETF, ETN, OS, GDR, OTHER, NYRS, AGEN, EQLK, BOND, ADRW, BASKET, LT] |
| **market** | **kotlin.String**| Filter by market type. By default all markets are included. | [optional] [enum: stocks, crypto, fx, otc, indices] |
| **exchange** | **kotlin.String**| Specify the asset&#39;s primary exchange Market Identifier Code (MIC) according to [ISO 10383](https://www.iso20022.org/market-identifier-codes). Defaults to empty string which queries all exchanges. | [optional] |
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

<a id="productDetails"></a>
# **productDetails**
> ProductDetails200Response productDetails(productCode, type, asOf)

Product Details

The Product Details endpoint returns the details for a single product as of a specific day.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val productCode : kotlin.String = ES // kotlin.String | The unique identifier for a product.
val type : kotlin.String = type_example // kotlin.String | The type of product to return. One of \"single\" or \"combo\" (default=single).
val asOf : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | A date string in the format YYYY-MM-DD. Note that the data returned is the state of this product's data at that point-in-time.
try {
    val result : ProductDetails200Response = apiInstance.productDetails(productCode, type, asOf)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#productDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#productDetails")
    e.printStackTrace()
}
```

### Parameters
| **productCode** | **kotlin.String**| The unique identifier for a product. | |
| **type** | **kotlin.String**| The type of product to return. One of \&quot;single\&quot; or \&quot;combo\&quot; (default&#x3D;single). | [optional] [default to single] [enum: single, combo] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **asOf** | **java.time.LocalDate**| A date string in the format YYYY-MM-DD. Note that the data returned is the state of this product&#39;s data at that point-in-time. | [optional] |

### Return type

[**ProductDetails200Response**](ProductDetails200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="productSchedules"></a>
# **productSchedules**
> ProductSchedules200Response productSchedules(productCode, sessionEndDate, limit, sessionEndDateGte, sessionEndDateGt, sessionEndDateLte, sessionEndDateLt, sort)

Product Schedules

The Product-Specific Futures Schedules API provides detailed trading schedules for a specific futures product. This API allows you to query schedules for a single product across a range of dates. Users can access comprehensive information about trading sessions, including market events such as preopen, open, and closed, along with their precise timestamps.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val productCode : kotlin.String = ES // kotlin.String | The product code for the futures product.
val sessionEndDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | The date on which the schedule's trading day ended (sometimes referred to as trading date). Defaults to today. Formatted as `YYYY-MM-DD`. Note that although there is no time component the day is assumed to be that day in Central Time.
val limit : kotlin.Int = 56 // kotlin.Int | The number of results to return per page (default=100, max=1000, min=1).
val sessionEndDateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by session_end_date.
val sessionEndDateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by session_end_date.
val sessionEndDateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by session_end_date.
val sessionEndDateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Range by session_end_date.
val sort : kotlin.String = session_end_date.desc // kotlin.String | Sort results by field and direction using dotted notation (e.g., 'ticker.asc', 'name.desc').
try {
    val result : ProductSchedules200Response = apiInstance.productSchedules(productCode, sessionEndDate, limit, sessionEndDateGte, sessionEndDateGt, sessionEndDateLte, sessionEndDateLt, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#productSchedules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#productSchedules")
    e.printStackTrace()
}
```

### Parameters
| **productCode** | **kotlin.String**| The product code for the futures product. | |
| **sessionEndDate** | **java.time.LocalDate**| The date on which the schedule&#39;s trading day ended (sometimes referred to as trading date). Defaults to today. Formatted as &#x60;YYYY-MM-DD&#x60;. Note that although there is no time component the day is assumed to be that day in Central Time. | [optional] |
| **limit** | **kotlin.Int**| The number of results to return per page (default&#x3D;100, max&#x3D;1000, min&#x3D;1). | [optional] [default to 100] |
| **sessionEndDateGte** | **java.time.LocalDate**| Range by session_end_date. | [optional] |
| **sessionEndDateGt** | **java.time.LocalDate**| Range by session_end_date. | [optional] |
| **sessionEndDateLte** | **java.time.LocalDate**| Range by session_end_date. | [optional] |
| **sessionEndDateLt** | **java.time.LocalDate**| Range by session_end_date. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| Sort results by field and direction using dotted notation (e.g., &#39;ticker.asc&#39;, &#39;name.desc&#39;). | [optional] [default to session_end_date.desc] [enum: session_end_date.asc, session_end_date.desc] |

### Return type

[**ProductSchedules200Response**](ProductSchedules200Response.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["apiKey"] = ""
    ApiClient.apiKeyPrefix["apiKey"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

