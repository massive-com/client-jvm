
# GetSnapshots200ResponseResultsInnerUnderlyingAsset

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **changeToBreakEven** | **kotlin.Double** | The change in price for the contract to break even. |  |
| **ticker** | **kotlin.String** | The ticker symbol for the contract&#39;s underlying asset. |  |
| **lastUpdated** | **kotlin.Long** | The nanosecond timestamp of when this information was updated. |  [optional] |
| **price** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole share of this trade. A trade of 100 shares with a price of $2.00 would be worth a total dollar value of $200.00. |  [optional] |
| **timeframe** | [**inline**](#Timeframe) | The time relevance of the data. |  [optional] |
| **&#x60;value&#x60;** | **kotlin.Double** | The value of the underlying index. |  [optional] |


<a id="Timeframe"></a>
## Enum: timeframe
| Name | Value |
| ---- | ----- |
| timeframe | DELAYED, REAL-TIME |



