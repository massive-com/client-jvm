
# GetFuturesV1QuotesTicker200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **channel** | **kotlin.Int** | The CME multicast channel this event was sourced from. |  |
| **reportSequence** | **kotlin.Long** | The reporting sequence number. |  |
| **sequenceNumber** | **kotlin.Long** | The unique sequence number assigned to this quote by the exchange. |  |
| **ticker** | **kotlin.String** | The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract). |  |
| **timestamp** | **kotlin.Long** | The time when the quote was generated at the exchange to nanosecond precision. |  |
| **askPrice** | **kotlin.Double** | The ask price is expressed per unit of the underlying asset, and you apply the contract multiplier to get the full contract value. |  [optional] |
| **askSize** | **kotlin.Int** | The quote size represents the number of futures contracts available at the given ask price. |  [optional] |
| **askTimestamp** | **kotlin.Long** | The time when the ask price was submitted to the exchange. |  [optional] |
| **bidPrice** | **kotlin.Double** | The bid price is expressed per unit of the underlying asset, and you apply the contract multiplier to get the full contract value. |  [optional] |
| **bidSize** | **kotlin.Int** | The quote size represents the number of futures contracts available at the given bid price. |  [optional] |
| **bidTimestamp** | **kotlin.Long** | The time when the bid price was submitted to the exchange. |  [optional] |
| **sessionEndDate** | **kotlin.String** | Also known as the trading date, the date of the end of the trading session, in YYYY-MM-DD format. |  [optional] |



