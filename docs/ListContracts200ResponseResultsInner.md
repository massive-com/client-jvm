
# ListContracts200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **active** | **kotlin.Boolean** | Whether or not this contract was tradeable at the given point-in-time specified in the &#39;as_of&#39; attribute (a contract was active if the given day was after the &#39;first_trade_date&#39; and before the &#39;last_trade_date&#39;). |  |
| **firstTradeDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date on which this contract first became tradeable. |  |
| **lastTradeDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date on which this contract last became tradeable. |  |
| **productCode** | **kotlin.String** | The unique identifier for the product to which this contract belongs. |  |
| **ticker** | **kotlin.String** | The unique identifier for the contract, typically consisting of the product code and expiration date. |  |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this contract trades. |  |
| **type** | **kotlin.String** | The type of contract, one of \&quot;single\&quot; or \&quot;combo\&quot;. |  |
| **asOf** | [**java.time.LocalDate**](java.time.LocalDate.md) | The point-in-time date for the given contract - e.g. if &#39;as_of&#39; is set to 2021-04-25, then the data retrieved describes the contract(s) as of 2021-04-25. |  [optional] |
| **daysToMaturity** | **kotlin.Int** | The number of days until this contract matures (since the point-in-time date). Note that the absence of this field means there are 0 days until maturity. |  [optional] |
| **maturity** | **kotlin.String** | This field provides the calendar month reflected in the instrument symbol. For futures spreads and options spreads, this field contains the first leg&#39;s calendar month reflected in the instrument symbol. For daily products, this tag contains the full calendar date (YYYYMMDD) as reflected in the instrument symbol. |  [optional] |
| **maxOrderQuantity** | **kotlin.Int** | The maximum order quantity for this contract. |  [optional] |
| **minOrderQuantity** | **kotlin.Int** | The minimum order quantity for this contract. |  [optional] |
| **name** | **kotlin.String** | The name of the contract. |  [optional] |
| **settlementDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The final settlement date for the contract. |  [optional] |
| **settlementTickSize** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The settlement tick size for this contract. |  [optional] |
| **spreadTickSize** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The spread tick size for this contract. |  [optional] |
| **tradeTickSize** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The tick size for this contract. |  [optional] |



