
# GetStocksV1Splits200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adjustmentType** | **kotlin.String** | Classification of the share-change event. Possible values include: forward_split (share count increases), reverse_split (share count decreases), stock_dividend (shares issued as a dividend) |  |
| **executionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the stock split was applied and shares adjusted |  [optional] |
| **historicalAdjustmentFactor** | **kotlin.Double** | Cumulative adjustment factor used to offset split effects on historical prices. To adjust a historical price for splits: for a price on date D, find the first split whose &#x60;execution_date&#x60; is after date D and multiply the unadjusted price by the &#x60;historical_adjustment_factor&#x60;. |  [optional] |
| **id** | **kotlin.String** | Unique identifier for each stock split event |  [optional] |
| **splitFrom** | **kotlin.Double** | Denominator of the split ratio (old shares) |  [optional] |
| **splitTo** | **kotlin.Double** | Numerator of the split ratio (new shares) |  [optional] |
| **ticker** | **kotlin.String** | Stock symbol for the company that executed the split |  [optional] |



