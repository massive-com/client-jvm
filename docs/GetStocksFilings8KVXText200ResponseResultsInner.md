
# GetStocksFilings8KVXText200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accessionNumber** | **kotlin.String** | SEC accession number uniquely identifying the filing (e.g., &#39;0000004962-25-000002&#39;). |  [optional] |
| **cik** | **kotlin.String** | SEC Central Index Key (10 digits, zero-padded). |  [optional] |
| **filingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the filing was submitted to the SEC (formatted as YYYY-MM-DD). |  [optional] |
| **filingUrl** | **kotlin.String** | SEC URL source for the full filing. |  [optional] |
| **formType** | **kotlin.String** | SEC form type (e.g., &#39;8-K&#39;, &#39;8-K/A&#39; for amendments). |  [optional] |
| **itemsText** | **kotlin.String** | Parsed text content from the 8-K filing, including item numbers and descriptions. |  [optional] |
| **ticker** | **kotlin.String** | Stock ticker symbol for the company. |  [optional] |



