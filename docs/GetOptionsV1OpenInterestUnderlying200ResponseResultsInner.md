
# GetOptionsV1OpenInterestUnderlying200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | The trading date the open interest applies to (formatted as YYYY-MM-DD). |  |
| **openInterestCalls** | **kotlin.Long** | Total open interest across the underlying&#39;s call contracts. |  |
| **openInterestPuts** | **kotlin.Long** | Total open interest across the underlying&#39;s put contracts. |  |
| **openInterest** | **kotlin.Long** | Total open interest across every contract on the underlying. |  [optional] |
| **underlyingTicker** | **kotlin.String** | The ticker of the underlying (e.g., SPX). Totals cover every root on the underlying, so weekly roots (SPXW) and roots adjusted after a corporate action (AMCR1) are included. |  [optional] |



