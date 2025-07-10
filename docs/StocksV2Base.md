
# StocksV2Base

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **T** | **kotlin.String** | The exchange symbol that this item is traded under. |  |
| **f** | **kotlin.Int** | The nanosecond accuracy TRF(Trade Reporting Facility) Unix Timestamp. This is the timestamp of when the trade reporting facility received this message. |  |
| **q** | **kotlin.Long** | The sequence number represents the sequence in which message events happened. These are increasing and unique per ticker symbol, but will not always be sequential (e.g., 1, 2, 6, 9, 10, 11).  |  |
| **t** | **kotlin.Int** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this message from the exchange which produced it. |  |
| **y** | **kotlin.Int** | The nanosecond accuracy Participant/Exchange Unix Timestamp. This is the timestamp of when the quote was actually generated at the exchange. |  |



