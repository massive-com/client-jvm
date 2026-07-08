
# GetOptionsV3QuotesTicker200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **askExchange** | **kotlin.Int** | The exchange ID reporting the ask side of the quote. |  |
| **askPrice** | **kotlin.Double** | The ask price. |  |
| **askSize** | **kotlin.Long** | The size available at the ask price. |  |
| **bidExchange** | **kotlin.Int** | The exchange ID reporting the bid side of the quote. |  |
| **bidPrice** | **kotlin.Double** | The bid price. |  |
| **bidSize** | **kotlin.Long** | The size available at the bid price. |  |
| **sequenceNumber** | **kotlin.Long** | The sequence number represents the sequence in which quote events happened. These are increasing and unique per ticker symbol, but will not always be sequential. Values reset after each trading session/day. |  |
| **sipTimestamp** | **kotlin.Long** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this quote from the exchange which produced it. |  |
| **ticker** | **kotlin.String** | The options ticker symbol (e.g., O:SPY260123C00687000). |  |



