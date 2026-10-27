
# GetStocksInsidersVXActivity200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **netShares** | **kotlin.Double** | Shares purchased minus shares sold. |  |
| **netValue** | **kotlin.Double** | Value purchased minus value sold in USD. |  |
| **plannedPurchaseValue** | **kotlin.Double** | Value of shares purchased under a Rule 10b5-1 trading plan in USD. Zero on filings before the plan checkbox was introduced in 2023. |  |
| **plannedSaleValue** | **kotlin.Double** | Value of shares sold under a Rule 10b5-1 trading plan in USD. Zero on filings before the plan checkbox was introduced in 2023. |  |
| **purchaseCount** | **kotlin.Long** | Number of open-market purchase transactions. |  |
| **purchaseShares** | **kotlin.Double** | Shares purchased. |  |
| **purchaseValue** | **kotlin.Double** | Value of shares purchased in USD. |  |
| **purchaserCount** | **kotlin.Long** | Number of distinct insiders who purchased. |  |
| **saleCount** | **kotlin.Long** | Number of open-market sale transactions. |  |
| **saleShares** | **kotlin.Double** | Shares sold. |  |
| **saleValue** | **kotlin.Double** | Value of shares sold in USD. |  |
| **sellerCount** | **kotlin.Long** | Number of distinct insiders who sold. |  |
| **issuerCik** | **kotlin.String** | SEC Central Index Key of the issuer company (10 digits, zero-padded). |  [optional] |
| **issuerName** | **kotlin.String** | Name of the issuer company as reported in the filings. |  [optional] |
| **lastFilingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Filing date of the latest filing that reported one of these transactions (formatted as YYYY-MM-DD). Transactions are usually filed within two business days. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | Ticker symbols of the issuer as of the transaction date. Multiple symbols may indicate different share classes; the totals cover the issuer, not each ticker. |  [optional] |
| **transactionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date of the transactions (formatted as YYYY-MM-DD). |  [optional] |



