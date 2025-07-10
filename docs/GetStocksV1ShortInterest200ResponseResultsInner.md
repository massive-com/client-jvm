
# GetStocksV1ShortInterest200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **avgDailyVolume** | **kotlin.Long** | The average daily trading volume for the stock over a specified period, typically used to contextualize short interest. |  |
| **daysToCover** | **kotlin.Double** | Calculated as short_interest divided by avg_daily_volume, representing the estimated number of days it would take to cover all short positions based on average trading volume. |  |
| **settlementDate** | **kotlin.String** | The date (formatted as YYYY-MM-DD) on which the short interest data is considered settled, typically based on exchange reporting schedules. |  |
| **shortInterest** | **kotlin.Long** | The total number of shares that have been sold short but have not yet been covered or closed out. |  [optional] |
| **ticker** | **kotlin.String** | The primary ticker symbol for the stock. |  [optional] |



