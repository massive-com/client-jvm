
# CryptoTick

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **c** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes.  |  |
| **i** | **kotlin.String** | The Trade ID which uniquely identifies a trade. These are unique per combination of ticker, exchange, and TRF. For example: A trade for AAPL executed on NYSE and a trade for AAPL executed on NASDAQ could potentially have the same Trade ID.  |  |
| **p** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole share of this trade. A trade of 100 shares with a price of $2.00 would be worth a total dollar value of $200.00.  |  |
| **s** | **kotlin.Double** | The size of a trade (also known as volume).  |  |
| **t** | **kotlin.Int** | The Unix millisecond timestamp for the start of the aggregate window. |  |
| **x** | **kotlin.Int** | The exchange that this crypto trade happened on.   See &lt;a href&#x3D;\&quot;https://massive.com/docs/crypto/get_v3_reference_exchanges\&quot;&gt;Exchanges&lt;/a&gt; for a mapping of exchanges to IDs.  |  |



