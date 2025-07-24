
# GetBenzingaV1Earnings200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **actualEps** | **kotlin.Double** | The actual earnings per share (EPS) reported by the company for the given period. |  [optional] |
| **actualRevenue** | **kotlin.Double** | The actual revenue reported by the company for the given fiscal period. |  [optional] |
| **benzingaId** | **kotlin.String** | The identifer used by Benzinga for this record. |  [optional] |
| **companyName** | **kotlin.String** | The name of the company releasing earnings. |  [optional] |
| **currency** | **kotlin.String** | The ISO 4217 currency code indicating the denomination in which the figures are reported. |  [optional] |
| **date** | **kotlin.String** | The calendar date (formatted as YYYY-MM-DD) when the earnings are scheduled or were reported. |  [optional] |
| **dateStatus** | **kotlin.String** | Indicates whether the date of the earnings report has been confirmed. Possible values include: projected, confirmed. |  [optional] |
| **epsMethod** | **kotlin.String** | The methodology of the EPS figure. Possible values are gaap (standardized financials under Generally Accepted Accounting Principles), ffo (Funds From Operations, a non-GAAP metric commonly used to assess the operating performance of REITs), and adj (adjusted, non-GAAP). |  [optional] |
| **epsSurprise** | **kotlin.Double** | The difference between the actual and estimated EPS. |  [optional] |
| **epsSurprisePercent** | **kotlin.Double** | The percentage difference between the actual and estimated EPS. |  [optional] |
| **estimatedEps** | **kotlin.Double** | The analyst consensus estimate for earnings per share (EPS) for the given period. |  [optional] |
| **estimatedRevenue** | **kotlin.Double** | The analyst consensus estimate for the company&#39;s revenue in the given period. |  [optional] |
| **fiscalPeriod** | **kotlin.String** | The fiscal period for which the earnings are reported. Examples include: Q1, Q2, H1, FY. |  [optional] |
| **fiscalYear** | **kotlin.Long** | The fiscal year in which the earnings period falls. |  [optional] |
| **importance** | **kotlin.Long** | A subjective indicator of the importance of the event, on a scale from 0 (lowest) to 5 (highest). |  [optional] |
| **lastUpdated** | **kotlin.String** | The timestamp (formatted as an ISO 8601 timestamp) when the record was last updated in the system. |  [optional] |
| **notes** | **kotlin.String** | Additional context, commentary, or clarifying notes related to the earnings event. |  [optional] |
| **previousEps** | **kotlin.Double** | The company&#39;s reported earnings per share (EPS) for the previous comparable period. |  [optional] |
| **previousRevenue** | **kotlin.Double** | The company&#39;s revenue for the previous comparable fiscal period. |  [optional] |
| **revenueMethod** | **kotlin.String** | The methodology of the revenue figure. Possible values are gaap (standardized financials under Generally Accepted Accounting Principles), adj (adjusted, non-GAAP figures that exclude certain items like one-time charges or divestitures), and rental (revenue specifically derived from rental operations, typically used by REITs, leasing companies, or businesses with a rental-based model). |  [optional] |
| **revenueSurprise** | **kotlin.Double** | The difference between the actual and estimated revenue. |  [optional] |
| **revenueSurprisePercent** | **kotlin.Double** | The percentage difference between the actual and estimated revenue. |  [optional] |
| **ticker** | **kotlin.String** | The stock symbol of the company reporting earnings. |  [optional] |
| **time** | **kotlin.String** | The time (formatted as 24-hour HH:MM:SS UTC) when the earnings are scheduled or were reported. |  [optional] |



