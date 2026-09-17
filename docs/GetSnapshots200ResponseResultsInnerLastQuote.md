
# GetSnapshots200ResponseResultsInnerLastQuote

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ask** | **kotlin.Double** | The ask price. |  |
| **bid** | **kotlin.Double** | The bid price. |  |
| **lastUpdated** | **kotlin.Long** | The nanosecond timestamp of when this information was updated. |  |
| **timeframe** | [**inline**](#Timeframe) | The time relevance of the data. |  |
| **askExchange** | **kotlin.Int** | The ask side exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/options/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive&#39;s mapping of exchange IDs. |  [optional] |
| **askSize** | **kotlin.Double** | The ask size. This represents the number of shares, or contracts for options, sellers are offering at the given ask price. |  [optional] |
| **bidExchange** | **kotlin.Int** | The bid side exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/options/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive&#39;s mapping of exchange IDs. |  [optional] |
| **bidSize** | **kotlin.Double** | The bid size. This represents the number of shares, or contracts for options, buyers are bidding for at the given bid price. |  [optional] |
| **midpoint** | **kotlin.Double** | The average of the bid and ask price. |  [optional] |


<a id="Timeframe"></a>
## Enum: timeframe
| Name | Value |
| ---- | ----- |
| timeframe | DELAYED, REAL-TIME |



