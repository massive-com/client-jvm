
# GetCryptoSnapshotTickers200ResponseAllOfTickersInnerLastTrade

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **c** | **kotlin.collections.List&lt;kotlin.Int&gt;** | The trade conditions. |  |
| **i** | **kotlin.String** | The Trade ID which uniquely identifies a trade. These are unique per combination of ticker, exchange, and TRF. For example: A trade for AAPL executed on NYSE and a trade for AAPL executed on NASDAQ could potentially have the same Trade ID.  |  |
| **p** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole share of this trade. A trade of 100 shares with a price of $2.00 would be worth a total dollar value of $200.00.  |  |
| **s** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The size (volume) of the trade. |  |
| **t** | **kotlin.Int** | The millisecond accuracy timestamp. This is the timestamp of when the trade was generated at the exchange. |  |
| **x** | **kotlin.Int** | The exchange that this crypto trade happened on.   See &lt;a href&#x3D;\&quot;https://massive.com/docs/crypto/get_v3_reference_exchanges\&quot;&gt;Exchanges&lt;/a&gt; for a mapping of exchanges to IDs.  |  |



