
# GetOptionsQuotes200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sequenceNumber** | **kotlin.Long** | The sequence number represents the sequence in which quote events happened. These are increasing and unique per ticker symbol, but will not always be sequential (e.g., 1, 2, 6, 9, 10, 11). |  |
| **sipTimestamp** | **kotlin.Long** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this quote from the exchange which produced it. |  |
| **askExchange** | **kotlin.Int** | The ask exchange ID |  [optional] |
| **askPrice** | **kotlin.Double** | The ask price. |  [optional] |
| **askSize** | **kotlin.Double** | The ask size. This represents the number of round lot orders at the given ask price. The normal round lot size is 100 shares. An ask size of 2 means there are 200 shares available to purchase at the given ask price. |  [optional] |
| **bidExchange** | **kotlin.Int** | The bid exchange ID |  [optional] |
| **bidPrice** | **kotlin.Double** | The bid price. |  [optional] |
| **bidSize** | **kotlin.Double** | The bid size. This represents the number of round lot orders at the given bid price. The normal round lot size is 100 shares. A bid size of 2 means there are 200 shares for purchase at the given bid price. |  [optional] |



