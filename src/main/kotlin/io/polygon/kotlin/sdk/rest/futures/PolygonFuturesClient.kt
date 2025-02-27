package io.polygon.kotlin.sdk.rest.futures

import com.thinkinglogic.builder.annotation.Builder
import io.ktor.http.*
import io.polygon.kotlin.sdk.ext.coroutineToRestCallback
import io.polygon.kotlin.sdk.rest.ComparisonQueryFilterParameters
import io.polygon.kotlin.sdk.rest.Paginatable
import io.polygon.kotlin.sdk.rest.PolygonRestApiCallback
import io.polygon.kotlin.sdk.rest.PolygonRestClient
import io.polygon.kotlin.sdk.rest.PolygonRestOption
import io.polygon.kotlin.sdk.rest.applyComparisonQueryFilterParameters
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Client for Polygon.io's futures RESTful APIs.
 *
 * You should access this client through [PolygonRestClient].
 */
class PolygonFuturesClient internal constructor(internal val polygonClient: PolygonRestClient) {

    // --- Aggregates Endpoint ---

    /**
     * Retrieves historical aggregated data (e.g., OHLCV) for a futures contract.
     * See [getFuturesAggregatesBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun getFuturesAggregates(
        params: FuturesAggregatesParameters,
        vararg opts: PolygonRestOption
    ): FuturesAggregatesResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "aggs", params.ticker)
            parameters["resolution"] = params.resolution
            applyComparisonQueryFilterParameters("window_start", params.windowStart)
            parameters["order"] = params.order
            parameters["limit"] = params.limit.toString()
            parameters["sort"] = params.sort
        }, *opts)

    @SafeVarargs
    fun getFuturesAggregatesBlocking(
        params: FuturesAggregatesParameters,
        vararg opts: PolygonRestOption
    ): FuturesAggregatesResponse =
        runBlocking { getFuturesAggregates(params, *opts) }

    @SafeVarargs
    fun getFuturesAggregatesAsync(
        params: FuturesAggregatesParameters,
        callback: PolygonRestApiCallback<FuturesAggregatesResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { getFuturesAggregates(params, *opts) })
    }

    // --- Contracts Endpoints ---

    /**
     * Lists all futures contracts based on the provided parameters.
     * See [listFuturesContractsBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun listFuturesContracts(
        params: FuturesContractsParameters,
        vararg opts: PolygonRestOption
    ): FuturesContractsResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "contracts")
            parameters["product_code"] = params.productCode
            parameters["first_trade_date"] = params.firstTradeDate
            parameters["last_trade_date"] = params.lastTradeDate
            parameters["as_of"] = params.asOf
            parameters["active"] = params.active
            parameters["type"] = params.type
            parameters["order"] = params.order
            parameters["limit"] = params.limit.toString()
            parameters["sort"] = params.sort
        }, *opts)

    @SafeVarargs
    fun listFuturesContractsBlocking(
        params: FuturesContractsParameters,
        vararg opts: PolygonRestOption
    ): FuturesContractsResponse =
        runBlocking { listFuturesContracts(params, *opts) }

    @SafeVarargs
    fun listFuturesContractsAsync(
        params: FuturesContractsParameters,
        callback: PolygonRestApiCallback<FuturesContractsResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { listFuturesContracts(params, *opts) })
    }

    /**
     * Retrieves details for a specific futures contract.
     * See [getFuturesContractBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun getFuturesContract(
        ticker: String,
        params: FuturesContractParameters,
        vararg opts: PolygonRestOption
    ): FuturesContractResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "contracts", ticker)
            parameters["as_of"] = params.asOf
        }, *opts)

    @SafeVarargs
    fun getFuturesContractBlocking(
        ticker: String,
        params: FuturesContractParameters,
        vararg opts: PolygonRestOption
    ): FuturesContractResponse =
        runBlocking { getFuturesContract(ticker, params, *opts) }

    @SafeVarargs
    fun getFuturesContractAsync(
        ticker: String,
        params: FuturesContractParameters,
        callback: PolygonRestApiCallback<FuturesContractResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { getFuturesContract(ticker, params, *opts) })
    }

    // --- Market Statuses Endpoint ---

    /**
     * Lists current market statuses for futures products.
     * See [listFuturesMarketStatusesBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun listFuturesMarketStatuses(
        params: FuturesMarketStatusesParameters,
        vararg opts: PolygonRestOption
    ): FuturesMarketStatusesResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "market-status")
            parameters["product_code"] = params.productCode
            parameters["exchange_code"] = params.exchangeCode
            parameters["order"] = params.order
            parameters["limit"] = params.limit.toString()
            parameters["sort"] = params.sort
        }, *opts)

    @SafeVarargs
    fun listFuturesMarketStatusesBlocking(
        params: FuturesMarketStatusesParameters,
        vararg opts: PolygonRestOption
    ): FuturesMarketStatusesResponse =
        runBlocking { listFuturesMarketStatuses(params, *opts) }

    @SafeVarargs
    fun listFuturesMarketStatusesAsync(
        params: FuturesMarketStatusesParameters,
        callback: PolygonRestApiCallback<FuturesMarketStatusesResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { listFuturesMarketStatuses(params, *opts) })
    }

    // --- Products Endpoints ---

    /**
     * Lists all futures products based on the provided parameters.
     * See [listFuturesProductsBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun listFuturesProducts(
        params: FuturesProductsParameters,
        vararg opts: PolygonRestOption
    ): FuturesProductsResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "products")
            parameters["name"] = params.name
            parameters["as_of"] = params.asOf
            parameters["exchange_code"] = params.exchangeCode
            parameters["sector"] = params.sector
            parameters["sub_sector"] = params.subSector
            parameters["type"] = params.type
            parameters["order"] = params.order
            parameters["limit"] = params.limit.toString()
            parameters["sort"] = params.sort
        }, *opts)

    @SafeVarargs
    fun listFuturesProductsBlocking(
        params: FuturesProductsParameters,
        vararg opts: PolygonRestOption
    ): FuturesProductsResponse =
        runBlocking { listFuturesProducts(params, *opts) }

    @SafeVarargs
    fun listFuturesProductsAsync(
        params: FuturesProductsParameters,
        callback: PolygonRestApiCallback<FuturesProductsResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { listFuturesProducts(params, *opts) })
    }

    /**
     * Retrieves details for a specific futures product.
     * See [getFuturesProductBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun getFuturesProduct(
        productCode: String,
        params: FuturesProductParameters,
        vararg opts: PolygonRestOption
    ): FuturesProductResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "products", productCode)
            parameters["as_of"] = params.asOf
        }, *opts)

    @SafeVarargs
    fun getFuturesProductBlocking(
        productCode: String,
        params: FuturesProductParameters,
        vararg opts: PolygonRestOption
    ): FuturesProductResponse =
        runBlocking { getFuturesProduct(productCode, params, *opts) }

    @SafeVarargs
    fun getFuturesProductAsync(
        productCode: String,
        params: FuturesProductParameters,
        callback: PolygonRestApiCallback<FuturesProductResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { getFuturesProduct(productCode, params, *opts) })
    }

    // --- Schedules Endpoints ---

    /**
     * Lists trading schedules for futures markets.
     * See [listFuturesSchedulesBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun listFuturesSchedules(
        params: FuturesSchedulesParameters,
        vararg opts: PolygonRestOption
    ): FuturesSchedulesResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "schedules")
            parameters["session_start_date"] = params.sessionStartDate
            parameters["market_identifier_code"] = params.marketIdentifierCode
            parameters["order"] = params.order
            parameters["limit"] = params.limit.toString()
            parameters["sort"] = params.sort
        }, *opts)

    @SafeVarargs
    fun listFuturesSchedulesBlocking(
        params: FuturesSchedulesParameters,
        vararg opts: PolygonRestOption
    ): FuturesSchedulesResponse =
        runBlocking { listFuturesSchedules(params, *opts) }

    @SafeVarargs
    fun listFuturesSchedulesAsync(
        params: FuturesSchedulesParameters,
        callback: PolygonRestApiCallback<FuturesSchedulesResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { listFuturesSchedules(params, *opts) })
    }

    /**
     * Lists trading schedules for a specific futures product.
     * See [listFuturesProductSchedulesBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun listFuturesProductSchedules(
        productCode: String,
        params: FuturesProductSchedulesParameters,
        vararg opts: PolygonRestOption
    ): FuturesProductSchedulesResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "products", productCode, "schedules")
            applyComparisonQueryFilterParameters("session_end_date", params.sessionEndDate)
            parameters["order"] = params.order
            parameters["limit"] = params.limit.toString()
        }, *opts)

    @SafeVarargs
    fun listFuturesProductSchedulesBlocking(
        productCode: String,
        params: FuturesProductSchedulesParameters,
        vararg opts: PolygonRestOption
    ): FuturesProductSchedulesResponse =
        runBlocking { listFuturesProductSchedules(productCode, params, *opts) }

    @SafeVarargs
    fun listFuturesProductSchedulesAsync(
        productCode: String,
        params: FuturesProductSchedulesParameters,
        callback: PolygonRestApiCallback<FuturesProductSchedulesResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { listFuturesProductSchedules(productCode, params, *opts) })
    }

    // --- Trades Endpoint ---

    /**
     * Lists trade data for a futures contract.
     * See [listFuturesTradesBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun listFuturesTrades(
        ticker: String,
        params: FuturesTradesParameters,
        vararg opts: PolygonRestOption
    ): FuturesTradesResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "trades", ticker)
            applyComparisonQueryFilterParameters("timestamp", params.timestamp)
            parameters["order"] = params.order
            parameters["limit"] = params.limit.toString()
            parameters["sort"] = params.sort
        }, *opts)

    @SafeVarargs
    fun listFuturesTradesBlocking(
        ticker: String,
        params: FuturesTradesParameters,
        vararg opts: PolygonRestOption
    ): FuturesTradesResponse =
        runBlocking { listFuturesTrades(ticker, params, *opts) }

    @SafeVarargs
    fun listFuturesTradesAsync(
        ticker: String,
        params: FuturesTradesParameters,
        callback: PolygonRestApiCallback<FuturesTradesResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { listFuturesTrades(ticker, params, *opts) })
    }

    // --- Quotes Endpoint ---

    /**
     * Lists quote data for a futures contract.
     * See [listFuturesQuotesBlocking] for the blocking version.
     */
    @SafeVarargs
    suspend fun listFuturesQuotes(
        ticker: String,
        params: FuturesQuotesParameters,
        vararg opts: PolygonRestOption
    ): FuturesQuotesResponse =
        polygonClient.fetchResult({
            path("futures", "vX", "quotes", ticker)
            applyComparisonQueryFilterParameters("timestamp", params.timestamp)
            parameters["order"] = params.order
            parameters["limit"] = params.limit.toString()
            parameters["sort"] = params.sort
        }, *opts)

    @SafeVarargs
    fun listFuturesQuotesBlocking(
        ticker: String,
        params: FuturesQuotesParameters,
        vararg opts: PolygonRestOption
    ): FuturesQuotesResponse =
        runBlocking { listFuturesQuotes(ticker, params, *opts) }

    @SafeVarargs
    fun listFuturesQuotesAsync(
        ticker: String,
        params: FuturesQuotesParameters,
        callback: PolygonRestApiCallback<FuturesQuotesResponse>,
        vararg opts: PolygonRestOption
    ) {
        coroutineToRestCallback(callback, { listFuturesQuotes(ticker, params, *opts) })
    }
}

// --- Parameter Classes ---

@Builder
data class FuturesAggregatesParameters(
    val ticker: String,
    val resolution: String,
    val windowStart: ComparisonQueryFilterParameters<String>? = null,
    val order: String = "desc",
    val limit: Int = 1000,
    val sort: String = "timestamp"
)

@Builder
data class FuturesContractsParameters(
    val productCode: String? = null,
    val firstTradeDate: String? = null,
    val lastTradeDate: String? = null,
    val asOf: String? = null,
    val active: String? = null,
    val type: String? = null,
    val order: String = "asc",
    val limit: Int = 1000,
    val sort: String = "product_code"
)

@Builder
data class FuturesContractParameters(
    val asOf: String? = null
)

@Builder
data class FuturesMarketStatusesParameters(
    val productCode: String? = null,
    val exchangeCode: String? = null,
    val order: String = "asc",
    val limit: Int = 1000,
    val sort: String = "product_code"
)

@Builder
data class FuturesProductsParameters(
    val name: String? = null,
    val asOf: String? = null,
    val exchangeCode: String? = null,
    val sector: String? = null,
    val subSector: String? = null,
    val type: String? = null,
    val order: String = "asc",
    val limit: Int = 1000,
    val sort: String = "name"
)

@Builder
data class FuturesProductParameters(
    val asOf: String? = null
)

@Builder
data class FuturesSchedulesParameters(
    val sessionStartDate: String? = null,
    val marketIdentifierCode: String? = null,
    val order: String = "desc",
    val limit: Int = 1000,
    val sort: String = "session_start_date"
)

@Builder
data class FuturesProductSchedulesParameters(
    val sessionEndDate: ComparisonQueryFilterParameters<String>? = null,
    val order: String = "desc",
    val limit: Int = 1000
)

@Builder
data class FuturesTradesParameters(
    val timestamp: ComparisonQueryFilterParameters<String>? = null,
    val order: String = "desc",
    val limit: Int = 1000,
    val sort: String = "timestamp"
)

@Builder
data class FuturesQuotesParameters(
    val timestamp: ComparisonQueryFilterParameters<String>? = null,
    val order: String = "desc",
    val limit: Int = 1000,
    val sort: String = "timestamp"
)

// --- Response Classes ---

@Serializable
data class FuturesAggregatesResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    val results: List<FuturesAggregate>? = emptyList()
)

@Serializable
data class FuturesAggregate(
    @SerialName("ticker") val ticker: String? = null,
    @SerialName("open") val open: Double? = null,
    @SerialName("high") val high: Double? = null,
    @SerialName("low") val low: Double? = null,
    @SerialName("close") val close: Double? = null,
    @SerialName("volume") val volume: Double? = null,
    @SerialName("window_start") val windowStart: Long? = null,
    @SerialName("window_end") val windowEnd: Long? = null
)

@Serializable
data class FuturesContractsResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    @SerialName("next_url") override val nextUrl: String? = null,
    override val results: List<FuturesContract>? = emptyList()
) : Paginatable<FuturesContract>

@Serializable
data class FuturesContract(
    @SerialName("ticker") val ticker: String? = null,
    @SerialName("product_code") val productCode: String? = null,
    @SerialName("expiration_date") val expirationDate: String? = null,
    @SerialName("first_trade_date") val firstTradeDate: String? = null,
    @SerialName("last_trade_date") val lastTradeDate: String? = null,
    @SerialName("active") val active: Boolean? = null,
    @SerialName("type") val type: String? = null
)

@Serializable
data class FuturesContractResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    val result: FuturesContract? = null
)

@Serializable
data class FuturesMarketStatusesResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    val results: List<FuturesMarketStatus>? = emptyList()
)

@Serializable
data class FuturesMarketStatus(
    @SerialName("product_code") val productCode: String? = null,
    @SerialName("exchange_code") val exchangeCode: String? = null,
    @SerialName("market_status") val marketStatus: String? = null,
    @SerialName("timestamp") val timestamp: Long? = null
)

@Serializable
data class FuturesProductsResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    @SerialName("next_url") override val nextUrl: String? = null,
    override val results: List<FuturesProduct>? = emptyList()
) : Paginatable<FuturesProduct>

@Serializable
data class FuturesProduct(
    @SerialName("product_code") val productCode: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("asset_class") val assetClass: String? = null,
    @SerialName("exchange_code") val exchangeCode: String? = null,
    @SerialName("sector") val sector: String? = null,
    @SerialName("sub_sector") val subSector: String? = null,
    @SerialName("type") val type: String? = null
)

@Serializable
data class FuturesProductResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    val result: FuturesProduct? = null
)

@Serializable
data class FuturesSchedulesResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    val results: List<FuturesSchedule>? = emptyList()
)

@Serializable
data class FuturesProductSchedulesResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    val results: List<FuturesSchedule>? = emptyList()
)

@Serializable
data class FuturesSchedule(
    @SerialName("market_identifier_code") val marketIdentifierCode: String? = null,
    @SerialName("product_code") val productCode: String? = null,
    @SerialName("product_name") val productName: String? = null,
    @SerialName("session_end_date") val sessionEndDate: String? = null,
    @SerialName("schedule") val schedule: List<ScheduleEvent>? = emptyList()
)

@Serializable
data class ScheduleEvent(
    @SerialName("event") val event: String? = null,
    @SerialName("timestamp") val timestamp: String? = null
)

@Serializable
data class FuturesTradesResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    @SerialName("next_url") override val nextUrl: String? = null,
    override val results: List<FuturesTrade>? = emptyList()
) : Paginatable<FuturesTrade>

@Serializable
data class FuturesTrade(
    @SerialName("price") val price: Double? = null,
    @SerialName("size") val size: Double? = null,
    @SerialName("ticker") val ticker: String? = null,
    @SerialName("timestamp") val timestamp: Long? = null
)

@Serializable
data class FuturesQuotesResponse(
    val status: String? = null,
    @SerialName("request_id") val requestId: String? = null,
    @SerialName("next_url") override val nextUrl: String? = null,
    override val results: List<FuturesQuote>? = emptyList()
) : Paginatable<FuturesQuote>

@Serializable
data class FuturesQuote(
    @SerialName("ask_price") val askPrice: Double? = null,
    @SerialName("ask_size") val askSize: Double? = null,
    @SerialName("bid_price") val bidPrice: Double? = null,
    @SerialName("bid_size") val bidSize: Double? = null,
    @SerialName("ticker") val ticker: String? = null,
    @SerialName("timestamp") val timestamp: Long? = null
)
