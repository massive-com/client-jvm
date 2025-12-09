
# GetEtfGlobalV1Constituents200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assetClass** | **kotlin.String** | The broad category of asset type, such as Equity, Corporate Bond, Municipal Bond, etc. |  [optional] |
| **compositeTicker** | **kotlin.String** | The stock ticker symbol of the ETF that holds these constituent securities. |  [optional] |
| **constituentName** | **kotlin.String** | The full company or security name of the constituent holding. |  [optional] |
| **constituentTicker** | **kotlin.String** | The stock ticker symbol of the individual security held within the ETF. |  [optional] |
| **countryOfExchange** | **kotlin.String** | The country where the exchange that lists this constituent security is located. |  [optional] |
| **currencyTraded** | **kotlin.String** | The local currency in which this constituent security is denominated and traded. |  [optional] |
| **effectiveDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. |  [optional] |
| **exchange** | **kotlin.String** | The name of the stock exchange where this constituent security is primarily traded. |  [optional] |
| **figi** | **kotlin.String** | The Financial Instrument Global Identifier, an open standard for uniquely identifying financial instruments. |  [optional] |
| **isin** | **kotlin.String** | The International Securities Identification Number, a global standard for identifying securities. |  [optional] |
| **marketValue** | **kotlin.Double** | The total market value of this constituent position held by the ETF. |  [optional] |
| **processedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when ETF Global received and processed the data. |  [optional] |
| **securityType** | **kotlin.String** | The specific classification of security type using ETF Global&#39;s taxonomy, such as Common Equity, Domestic, Global, etc. |  [optional] |
| **sedol** | **kotlin.String** | The Stock Exchange Daily Official List code, primarily used for securities trading in the UK. |  [optional] |
| **sharesHeld** | **kotlin.Double** | The number of shares of this constituent security that the ETF currently owns. |  [optional] |
| **usCode** | **kotlin.String** | A unique identifier code for the constituent security in US markets. |  [optional] |
| **weight** | **kotlin.Double** | The percentage weight of this constituent security within the ETF&#39;s total portfolio. |  [optional] |



