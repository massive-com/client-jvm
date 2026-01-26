
# GetStocksFilings10KVXSections200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cik** | **kotlin.String** | SEC Central Index Key (10 digits, zero-padded). |  [optional] |
| **filingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the filing was submitted to the SEC (formatted as YYYY-MM-DD). |  [optional] |
| **filingUrl** | **kotlin.String** | SEC URL source for the full filing. |  [optional] |
| **periodEnd** | [**java.time.LocalDate**](java.time.LocalDate.md) | Period end date that the filing relates to (formatted as YYYY-MM-DD). |  [optional] |
| **section** | **kotlin.String** | Standardized section identifier from the filing (e.g. &#39;business&#39;, &#39;risk_factors&#39;, etc.). |  [optional] |
| **text** | **kotlin.String** | Full raw text content of the section, including headers and formatting. |  [optional] |
| **ticker** | **kotlin.String** | Stock ticker symbol for the company. |  [optional] |



