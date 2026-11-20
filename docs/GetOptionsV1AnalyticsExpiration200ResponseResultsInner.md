
# GetOptionsV1AnalyticsExpiration200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | The trading date the values apply to (formatted as YYYY-MM-DD). Open interest is as published the morning of date, for the prior trading day&#39;s close. Greeks are from 15 minutes before the close on date. |  |
| **deltaExposure** | **kotlin.Double** | Delta exposure in dollars: the sum of open interest x 100 x delta x underlying_price. Put deltas are negative. Null if no contract has Greeks. |  [optional] |
| **excludedOpenInterest** | **kotlin.Long** | Open interest of binary options and of the contracts that do not have a standard deliverable of 100 shares, for example contracts adjusted after a corporate action. These contracts are not in any other field. |  [optional] |
| **expirationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The expiration date of the contracts (formatted as YYYY-MM-DD). |  [optional] |
| **gammaExposure** | **kotlin.Double** | Net gamma exposure in dollars per 1% move of the underlying price: the sum of open interest x 100 x gamma x underlying_price² x 0.01, with calls positive and puts negative. Null if no contract has Greeks. |  [optional] |
| **gammaExposureCalls** | **kotlin.Double** | Gamma exposure of the call contracts (positive). Null if no call contract has Greeks. |  [optional] |
| **gammaExposurePuts** | **kotlin.Double** | Gamma exposure of the put contracts (negative). Null if no put contract has Greeks. |  [optional] |
| **maxPain** | **kotlin.Double** | The strike price at which the open contracts of this expiration date have the smallest total value if the underlying asset settles there. Every strike price of the expiration date is a candidate. If strike prices tie, the lower one. Null if the expiration date has no open interest. |  [optional] |
| **openInterest** | **kotlin.Long** | Total open interest of the standard (not binary) contracts with a standard deliverable of 100 shares. |  [optional] |
| **openInterestCalls** | **kotlin.Long** | Total open interest of the standard (not binary) call contracts with a standard deliverable of 100 shares. |  [optional] |
| **openInterestPuts** | **kotlin.Long** | Total open interest of the standard (not binary) put contracts with a standard deliverable of 100 shares. |  [optional] |
| **openInterestWithGreeks** | **kotlin.Long** | Open interest of the contracts that count in the exposure values: contracts with open interest above 0 and a gamma and a delta. |  [optional] |
| **underlyingPrice** | **kotlin.Double** | The underlying price used for the Greeks: the last SIP trade, or the last published index value, at or before 15 minutes before the close. Null if no contract of the expiration date has Greeks. |  [optional] |
| **underlyingTicker** | **kotlin.String** | The ticker of the underlying asset (e.g., AAPL). The values cover every root on the underlying asset. |  [optional] |



