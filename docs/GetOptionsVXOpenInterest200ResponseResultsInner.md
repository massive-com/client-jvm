
# GetOptionsVXOpenInterest200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | The trading date the open interest applies to (formatted as YYYY-MM-DD). |  |
| **ticker** | **kotlin.String** | The options ticker symbol (e.g., O:SPY260123C00687000). |  |
| **contractType** | **kotlin.String** | The contract type. Possible values: call, put. |  [optional] |
| **expirationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date the contract expires (formatted as YYYY-MM-DD). |  [optional] |
| **openInterest** | **kotlin.Long** | The number of outstanding contracts that have not been closed or exercised, as of the last open interest update of the day. |  [optional] |
| **openInterestChange** | **kotlin.Long** | The change in open interest from the previous trading day (open_interest - previous_open_interest). Null when previous_open_interest is null. |  [optional] |
| **previousOpenInterest** | **kotlin.Long** | The contract&#39;s open interest on the previous trading day. Null if the contract had no open interest reported that day, such as a new listing. |  [optional] |
| **root** | **kotlin.String** | The OCC root symbol of the contract (e.g., SPXW). Differs from the underlying for weekly roots and for contracts adjusted after a corporate action (e.g., AMCR1). |  [optional] |
| **strikePrice** | **kotlin.Double** | The strike price of the contract. |  [optional] |
| **underlyingTicker** | **kotlin.String** | The ticker of the contract&#39;s underlying (e.g., SPX). Weekly and adjusted roots are folded in, so SPXW contracts report SPX and AMCR1 contracts report AMCR; see root to tell them apart. |  [optional] |



