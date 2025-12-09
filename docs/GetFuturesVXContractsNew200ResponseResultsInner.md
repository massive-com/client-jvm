
# GetFuturesVXContractsNew200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **active** | **kotlin.Boolean** | The contract is still trading. |  |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about contracts for the specified day. |  |
| **daysToMaturity** | **kotlin.Long** |  |  [optional] |
| **firstTradeDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The first date the contract trades. |  [optional] |
| **groupCode** | **kotlin.String** |  |  [optional] |
| **guid** | **kotlin.String** |  |  [optional] |
| **lastTradeDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The last date the contract trades. |  [optional] |
| **maturityMonth** | **kotlin.String** |  |  [optional] |
| **maxOrderQuantity** | **kotlin.String** | The maximum order quantity. |  [optional] |
| **minOrderQuantity** | **kotlin.String** | The minimum order quantity. |  [optional] |
| **name** | **kotlin.String** | The name of this contract. |  [optional] |
| **productCode** | **kotlin.String** | The identifier for the contract&#39;s product. |  [optional] |
| **securityId** | **kotlin.String** |  |  [optional] |
| **settlementDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **settlementTickSize** | **kotlin.Double** | The tick size for settlement. |  [optional] |
| **spreadTickSize** | **kotlin.Double** | The tick size for spreads. |  [optional] |
| **ticker** | **kotlin.String** | The ticker for the contract. |  [optional] |
| **tradeTickSize** | **kotlin.Double** | The tick size for trades. |  [optional] |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this contract trades. |  [optional] |
| **type** | **kotlin.String** | The type of contract, one of &#39;single&#39; or &#39;combo&#39;. |  [optional] |



