
# GetOptionsV3TradesTicker200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conditions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes. |  |
| **exchange** | **kotlin.Int** | The exchange ID. |  |
| **price** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole contract of this trade. |  |
| **sequenceNumber** | **kotlin.Long** | The sequence number represents the sequence in which trade events happened. These are increasing and unique per ticker symbol, but will not always be sequential. Values reset after each trading session/day. |  |
| **sipTimestamp** | **kotlin.Long** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this trade from the exchange which produced it. |  |
| **propertySize** | **kotlin.Long** | The size of a trade (also known as volume). |  |
| **ticker** | **kotlin.String** | The options ticker symbol (e.g., O:SPY260123C00687000). |  |
| **participantTimestamp** | **kotlin.Long** | The nanosecond accuracy Participant/Exchange Unix Timestamp. This is the timestamp of when the trade was actually generated at the exchange. |  [optional] |



