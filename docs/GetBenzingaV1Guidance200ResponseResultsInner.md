
# GetBenzingaV1Guidance200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **benzingaId** | **kotlin.String** | A unique identifier assigned by Benzinga to the guidance record. |  [optional] |
| **companyName** | **kotlin.String** | The name of the company issuing guidance. |  [optional] |
| **currency** | **kotlin.String** | The ISO 4217 code representing the currency in which the company issued its guidance figures. |  [optional] |
| **date** | **kotlin.String** | The calendar date (formatted as YYYY-MM-DD) when the guidance was issued. |  [optional] |
| **epsMethod** | **kotlin.String** | The methodology of the EPS figure. Possible values are gaap (standardized financials under Generally Accepted Accounting Principles), ffo (Funds From Operations, a non-GAAP metric commonly used to assess the operating performance of REITs), and adj (adjusted, non-GAAP). |  [optional] |
| **estimatedEpsGuidance** | **kotlin.Double** | The midpoint or central earnings per share (EPS) value the company expects for the given fiscal period. |  [optional] |
| **estimatedRevenueGuidance** | **kotlin.Double** | The midpoint or central revenue figure the company expects for the given fiscal period. |  [optional] |
| **fiscalPeriod** | **kotlin.String** | The fiscal quarter to which the guidance applies, such as Q1, Q2, Q3, or Q4. |  [optional] |
| **fiscalYear** | **kotlin.Long** | The fiscal year corresponding to the period for which the guidance is issued. |  [optional] |
| **importance** | **kotlin.Long** | A subjective indicator of the importance of the event, on a scale from 0 (lowest) to 5 (highest). |  [optional] |
| **lastUpdated** | **kotlin.String** | The timestamp (formatted as an ISO 8601 timestamp) when the record was last updated in the system. |  [optional] |
| **maxEpsGuidance** | **kotlin.Double** | The highest EPS value the company expects for the fiscal period if a range was provided. |  [optional] |
| **maxRevenueGuidance** | **kotlin.Double** | The highest revenue figure the company expects for the fiscal period if a range was provided. |  [optional] |
| **minEpsGuidance** | **kotlin.Double** | The lowest EPS value the company expects for the fiscal period if a range was provided. |  [optional] |
| **minRevenueGuidance** | **kotlin.Double** | The lowest revenue figure the company expects for the fiscal period if a range was provided. |  [optional] |
| **notes** | **kotlin.String** | Additional descriptive text or commentary provided about the guidance record. |  [optional] |
| **positioning** | **kotlin.String** | Indicates how a particular guidance value is presented relative to other figures disclosed by the company. Possible values are &#39;primary&#39; (the emphasized figure) and &#39;secondary&#39; (a supporting or alternate figure) |  [optional] |
| **previousMaxEpsGuidance** | **kotlin.Double** | The highest EPS value issued in a previous guidance record for the same fiscal period. |  [optional] |
| **previousMaxRevenueGuidance** | **kotlin.Double** | The highest revenue value issued in a previous guidance record for the same fiscal period. |  [optional] |
| **previousMinEpsGuidance** | **kotlin.Double** | The lowest EPS value issued in a previous guidance record for the same fiscal period. |  [optional] |
| **previousMinRevenueGuidance** | **kotlin.Double** | The lowest revenue value issued in a previous guidance record for the same fiscal period. |  [optional] |
| **releaseType** | **kotlin.String** | Indicates whether the guidance was issued as part of a scheduled earnings release (&#39;official&#39;) or as an unscheduled update (&#39;preliminary&#39;). |  [optional] |
| **revenueMethod** | **kotlin.String** | The methodology of the revenue figure. Possible values are gaap (standardized financials under Generally Accepted Accounting Principles) and adj (adjusted, non-GAAP). |  [optional] |
| **ticker** | **kotlin.String** | The stock symbol of the company issuing guidance. |  [optional] |
| **time** | **kotlin.String** | The time of day the guidance was announced, in HH:mm:ss format. |  [optional] |



