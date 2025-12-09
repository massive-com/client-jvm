
# GetSnapshots200ResponseResultsInnerLastQuote

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ask** | **kotlin.Double** | The ask price. |  |
| **bid** | **kotlin.Double** | The bid price. |  |
| **lastUpdated** | **kotlin.Long** | The nanosecond timestamp of when this information was updated. |  |
| **timeframe** | [**inline**](#Timeframe) | The time relevance of the data. |  |
| **askExchange** | **kotlin.Int** | The ask side exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/options/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  [optional] |
| **askSize** | **kotlin.Double** | The ask size. This represents the number of round lot orders at the given ask price. The normal round lot size is 100 shares. An ask size of 2 means there are 200 shares available to purchase at the given ask price. |  [optional] |
| **bidExchange** | **kotlin.Int** | The bid side exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/options/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  [optional] |
| **bidSize** | **kotlin.Double** | The bid size. This represents the number of round lot orders at the given bid price. The normal round lot size is 100 shares. A bid size of 2 means there are 200 shares for purchase at the given bid price. |  [optional] |
| **midpoint** | **kotlin.Double** | The average of the bid and ask price. |  [optional] |


<a id="Timeframe"></a>
## Enum: timeframe
| Name | Value |
| ---- | ----- |
| timeframe | DELAYED, REAL-TIME |



