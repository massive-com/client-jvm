
# GetEtfGlobalV1FundFlows200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **compositeTicker** | **kotlin.String** | The stock ticker symbol used to identify this ETF on exchanges. |  [optional] |
| **effectiveDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. |  [optional] |
| **fundFlow** | **kotlin.Double** | The net daily capital flow into or out of the ETF through the creation and redemption process, where positive values indicate inflows and negative values indicate outflows. |  [optional] |
| **nav** | **kotlin.Double** | The net asset value per share, representing the per-share value of the ETF&#39;s underlying holdings. |  [optional] |
| **processedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when ETF Global received and processed the data. |  [optional] |
| **sharesOutstanding** | **kotlin.Double** | The total number of ETF shares currently issued and outstanding in the market. |  [optional] |



