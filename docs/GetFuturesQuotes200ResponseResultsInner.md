
# GetFuturesQuotes200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sessionEndDate** | **kotlin.String** | Also known as the trading date, the date of the end of the trading session, in YYYY-MM-DD format. |  |
| **ticker** | **kotlin.String** | The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract). |  |
| **timestamp** | **kotlin.Int** | The time when the quote was generated at the exchange to nanosecond precision. |  |
| **askPrice** | **kotlin.Double** | The ask price is expressed per unit of the underlying asset, and you apply the contract multiplier to get the full contract value. |  [optional] |
| **askSize** | **kotlin.Double** | The quote size represents the number of futures contracts available at the given ask price. |  [optional] |
| **askTimestamp** | **kotlin.Int** | The time when the ask price was submitted to the exchange. |  [optional] |
| **bidPrice** | **kotlin.Double** | The bid price is expressed per unit of the underlying asset, and you apply the contract multiplier to get the full contract value. |  [optional] |
| **bidSize** | **kotlin.Double** | The quote size represents the number of futures contracts available at the given bid price. |  [optional] |
| **bidTimestamp** | **kotlin.Int** | The time when the bid price was submitted to the exchange. |  [optional] |



