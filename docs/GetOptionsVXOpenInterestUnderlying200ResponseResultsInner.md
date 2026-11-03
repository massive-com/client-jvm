
# GetOptionsVXOpenInterestUnderlying200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | The trading date the open interest applies to (formatted as YYYY-MM-DD). |  |
| **openInterestCalls** | **kotlin.Long** | Total open interest across the underlying&#39;s call contracts. |  |
| **openInterestPuts** | **kotlin.Long** | Total open interest across the underlying&#39;s put contracts. |  |
| **openInterest** | **kotlin.Long** | Total open interest across every contract on the underlying. |  [optional] |
| **openInterestChange** | **kotlin.Long** | The change in total open interest from the previous trading day (open_interest - previous_open_interest). Null when previous_open_interest is null. |  [optional] |
| **openInterestChangeCalls** | **kotlin.Long** | The change in call open interest from the previous trading day, including call contracts that have since expired. Null when previous_open_interest is null. |  [optional] |
| **openInterestChangePuts** | **kotlin.Long** | The change in put open interest from the previous trading day, including put contracts that have since expired. Null when previous_open_interest is null. |  [optional] |
| **previousOpenInterest** | **kotlin.Long** | Total open interest on the underlying on the previous trading day, including contracts that have since expired. Null if the underlying had no open interest reported that day. |  [optional] |
| **underlyingTicker** | **kotlin.String** | The ticker of the underlying (e.g., SPX). Totals cover every root on the underlying, so weekly roots (SPXW) and roots adjusted after a corporate action (AMCR1) are included. |  [optional] |



