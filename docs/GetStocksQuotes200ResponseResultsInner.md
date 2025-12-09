
# GetStocksQuotes200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **participantTimestamp** | **kotlin.Long** | The nanosecond accuracy Participant/Exchange Unix Timestamp. This is the timestamp of when the quote was actually generated at the exchange. |  |
| **sequenceNumber** | **kotlin.Long** | The sequence number represents the sequence in which quote events happened. These are increasing and unique per ticker symbol, but will not always be sequential (e.g., 1, 2, 6, 9, 10, 11). Values reset after each trading session/day. |  |
| **sipTimestamp** | **kotlin.Long** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this quote from the exchange which produced it. |  |
| **askExchange** | **kotlin.Int** | The ask exchange ID |  [optional] |
| **askPrice** | **kotlin.Double** | The ask price. |  [optional] |
| **askSize** | **kotlin.Double** | The total number of shares available for sale at the current ask price. |  [optional] |
| **bidExchange** | **kotlin.Int** | The bid exchange ID |  [optional] |
| **bidPrice** | **kotlin.Double** | The bid price. |  [optional] |
| **bidSize** | **kotlin.Double** | The total number of shares that buyers want to purchase at the current bid price. |  [optional] |
| **conditions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes. |  [optional] |
| **indicators** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of indicator codes. |  [optional] |
| **tape** | **kotlin.Int** | There are 3 tapes which define which exchange the ticker is listed on. These are integers in our objects which represent the letter of the alphabet. Eg: 1 &#x3D; A, 2 &#x3D; B, 3 &#x3D; C. * Tape A is NYSE listed securities * Tape B is NYSE ARCA / NYSE American * Tape C is NASDAQ |  [optional] |
| **trfTimestamp** | **kotlin.Long** | The nanosecond accuracy TRF (Trade Reporting Facility) Unix Timestamp. This is the timestamp of when the trade reporting facility received this quote. |  [optional] |



