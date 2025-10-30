package io.massive.kotlin.sdk.websocket

/**
 * See https://massive.com/sockets for details
 */
data class MassiveWebSocketSubscription(
    val channel: MassiveWebSocketChannel,
    val symbol: String
) {
    override fun toString() = "${channel.prefix}.$symbol"
}

/**
 * Available web socket channels. See https://massive.com/sockets for details
 */
sealed class MassiveWebSocketChannel(val prefix: String) {

    /**
     * Usable in the [MassiveWebSocketCluster.Stocks] cluster
     */
    sealed class Stocks(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object Trades: Stocks("T")
        object Quotes: Stocks("Q")
        object AggPerSecond : Stocks("A")
        object AggPerMinute : Stocks("AM")
        object AggPerMinuteLaunchpad : Stocks("AM")
    }

    /**
     * Usable in the [MassiveWebSocketCluster.LaunchpadStocks] cluster
     */
    sealed class LaunchpadStocks(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object AggPerMinute : LaunchpadStocks("AM")
        object LaunchpadValue : LaunchpadStocks("LV")
    }

    /**
     * Usable in the [MassiveWebSocketCluster.Options] cluster
     */
    sealed class Options(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object Trades: Options("T")
        object Quotes: Options("Q")
        object AggPerSecond : Options("A")
        object AggPerMinute : Options("AM")
    }

	/**
     * Usable in the [MassiveWebSocketCluster.Futures] cluster
     */
	sealed class Futures(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object Trades : Futures("T")
        object Quotes : Futures("Q")
        object AggPerSecond : Futures("A")
        object AggPerMinute : Futures("AM")
    }

    /**
     * Usable in the [MassiveWebSocketCluster.LaunchpadOptions] cluster
     */
    sealed class LaunchpadOptions(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object AggPerMinute : LaunchpadOptions("AM")
        object LaunchpadValue : LaunchpadOptions("LV")
    }

    /**
     * Usable in the [MassiveWebSocketCluster.Forex] cluster
     */
    sealed class Forex(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object Quotes: Forex("C")
        object AggPerSecond : Forex("CAS")
        object AggPerMinute: Forex("CA")
    }

    /**
     * Usable in the [MassiveWebSocketCluster.LaunchpadForex] cluster
     */
    sealed class LaunchpadForex(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object AggPerMinute : LaunchpadForex("AM")
        object LaunchpadValue : LaunchpadForex("LV")
    }

    /**
     * Usable in the [MassiveWebSocketCluster.Crypto] cluster
     */
    sealed class Crypto(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object Trades : Crypto("XT")
        object Quotes : Crypto("XQ")
        object AggPerSecond : Crypto("XAS")
        object AggPerMinute : Crypto("XA")
        object ConsolidatedQuotes : Crypto("XS")
        object Level2Books : Crypto("XL2")
    }

    /**
     * Usable in the [MassiveWebSocketCluster.LaunchpadCrypto] cluster
     */
    sealed class LaunchpadCrypto(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object AggPerMinute : LaunchpadCrypto("AM")
        object LaunchpadValue : LaunchpadCrypto("LV")
    }

    /**
     * Usable in the [MassiveWebSocketCluster.Indices] cluster
     */
    sealed class Indices(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object AggPerSecond : Indices("A")
        object AggPerMinute : Indices("AM")
        object Value : Indices("V")
    }

    sealed class Business(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix) {
        object FairMarketValue : Business("FMV")
    }

    /**
     * Use this if there's a new channel that this SDK doesn't fully support yet
     */
    class Other(channelPrefix: String) : MassiveWebSocketChannel(channelPrefix)
}
