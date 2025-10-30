
# GetOptionsChain200ResponseResultsInnerLastQuote

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ask** | **kotlin.Double** | The ask price. |  |
| **askSize** | **kotlin.Double** | The ask size. |  |
| **bid** | **kotlin.Double** | The bid price. |  |
| **bidSize** | **kotlin.Double** | The bid size. |  |
| **midpoint** | **kotlin.Double** | The average of the bid and ask price. |  |
| **askExchange** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The ask side exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/stocks/get_v3_reference_exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  [optional] |
| **bidExchange** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The bid side exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/stocks/get_v3_reference_exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  [optional] |
| **lastUpdated** | **kotlin.Long** | The nanosecond timestamp of when this information was updated. |  [optional] |
| **timeframe** | [**inline**](#Timeframe) | The time relevance of the data. |  [optional] |


<a id="Timeframe"></a>
## Enum: timeframe
| Name | Value |
| ---- | ----- |
| timeframe | DELAYED, REAL-TIME |



