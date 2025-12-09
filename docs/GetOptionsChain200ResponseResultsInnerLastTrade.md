
# GetOptionsChain200ResponseResultsInnerLastTrade

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exchange** | **kotlin.Int** | The exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/options/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  |
| **price** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole share of this trade. A trade of 100 shares with a price of $2.00 would be worth a total dollar value of $200.00. |  |
| **sipTimestamp** | **kotlin.Long** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this trade from the exchange which produced it. |  |
| **propertySize** | **kotlin.Int** | The size of a trade (also known as volume). |  |
| **conditions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes. |  [optional] |
| **timeframe** | [**inline**](#Timeframe) | The time relevance of the data. |  [optional] |


<a id="Timeframe"></a>
## Enum: timeframe
| Name | Value |
| ---- | ----- |
| timeframe | DELAYED, REAL-TIME |



