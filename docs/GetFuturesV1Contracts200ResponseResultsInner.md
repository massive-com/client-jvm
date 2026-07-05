
# GetFuturesV1Contracts200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **active** | **kotlin.Boolean** | Whether or not a given contract was tradeable at the given point in time. Active is true when (first_trade_date &lt;&#x3D; date &gt;&#x3D; last_trade_date) and false otherwise. |  |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about contracts for the specified day. |  |
| **daysToMaturity** | **kotlin.Long** | The number of calendar days between the &#39;date&#39; and the contract&#39;s final settlement date. |  [optional] |
| **firstTradeDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The first day on which the contract was tradeable. |  [optional] |
| **groupCode** | **kotlin.String** | An identifier used to identify logical groups of products. The group_code is only populated for contracts listed for trading on CME Globex. |  [optional] |
| **lastTradeDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The last day on which the contract was tradeable. |  [optional] |
| **maxOrderQuantity** | **kotlin.Long** | The maximum order quantity. |  [optional] |
| **minOrderQuantity** | **kotlin.Long** | The minimum order quantity. |  [optional] |
| **name** | **kotlin.String** | The name of this contract. |  [optional] |
| **productCode** | **kotlin.String** | The identifier for the contract&#39;s product. |  [optional] |
| **settlementDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date on which this contract settles. |  [optional] |
| **settlementTickSize** | **kotlin.Double** | The tick size for settlement. |  [optional] |
| **spreadTickSize** | **kotlin.Double** | The tick size for spreads. |  [optional] |
| **ticker** | **kotlin.String** | The ticker for the contract. |  [optional] |
| **tradeTickSize** | **kotlin.Double** | The tick size for trades. |  [optional] |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this contract trades. |  [optional] |
| **type** | **kotlin.String** | The type of contract, one of &#39;single&#39; or &#39;combo&#39;. Leaving this filter blank will query for contracts where type is &#39;single&#39;, &#39;combo&#39; or empty. This field only exists on contracts as of 2025-03-12 and later. It will be null when date &lt; 2025-03-12. |  [optional] |



