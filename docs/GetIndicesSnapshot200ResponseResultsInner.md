
# GetIndicesSnapshot200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ticker** | **kotlin.String** | Ticker of asset queried. |  |
| **error** | **kotlin.String** | The error while looking for this ticker. |  [optional] |
| **lastUpdated** | **kotlin.Long** | The nanosecond timestamp of when this information was updated. |  [optional] |
| **marketStatus** | **kotlin.String** | The market status for the market that trades this ticker. |  [optional] |
| **message** | **kotlin.String** | The error message while looking for this ticker. |  [optional] |
| **name** | **kotlin.String** | Name of Index. |  [optional] |
| **session** | [**GetIndicesSnapshot200ResponseResultsInnerSession**](GetIndicesSnapshot200ResponseResultsInnerSession.md) |  |  [optional] |
| **timeframe** | [**inline**](#Timeframe) | The time relevance of the data. |  [optional] |
| **type** | [**inline**](#Type) | The indices market. |  [optional] |
| **&#x60;value&#x60;** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Value of Index. |  [optional] |


<a id="Timeframe"></a>
## Enum: timeframe
| Name | Value |
| ---- | ----- |
| timeframe | DELAYED, REAL-TIME |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | indices |



