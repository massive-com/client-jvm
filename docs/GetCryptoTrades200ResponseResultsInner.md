
# GetCryptoTrades200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exchange** | **kotlin.Int** | The exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/crypto/get_v3_reference_exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  |
| **price** | **kotlin.Double** | The price of the trade in the base currency of the crypto pair. |  |
| **propertySize** | **kotlin.Double** | The size of a trade (also known as volume). |  |
| **conditions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes. |  [optional] |
| **id** | **kotlin.String** | The Trade ID which uniquely identifies a trade on the exchange that the trade happened on. |  [optional] |
| **participantTimestamp** | **kotlin.Long** | The nanosecond Exchange Unix Timestamp. This is the timestamp of when the trade was generated at the exchange. |  [optional] |



