
# GetStocksFilings8KVXDisclosures200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accessionNumber** | **kotlin.String** | Unique SEC accession number for the filing (e.g., &#39;0000320193-25-000010&#39;). |  [optional] |
| **cik** | **kotlin.String** | SEC Central Index Key of the filer (10 digits, zero-padded). |  [optional] |
| **filingDate** | **kotlin.String** | Date when the filing was submitted to the SEC (formatted as YYYY-MM-DD). |  [optional] |
| **filingUrl** | **kotlin.String** | Direct URL to the full submission text file for the filing on SEC EDGAR. |  [optional] |
| **primaryCategory** | **kotlin.String** | Top-level disclosure category (e.g., &#39;financial_results&#39;). See the full taxonomy at /stocks/taxonomies/vX/disclosures. |  [optional] |
| **secondaryCategory** | **kotlin.String** | Mid-level disclosure category (e.g., &#39;earnings_announcement&#39;). See the full taxonomy at /stocks/taxonomies/vX/disclosures. |  [optional] |
| **supportingText** | **kotlin.String** | A verbatim excerpt from the filing text supporting the assigned categories. |  [optional] |
| **tertiaryCategory** | **kotlin.String** | Most specific disclosure category (e.g., &#39;quarterly_results&#39;). Filtering on this column must use an exact match. See the full taxonomy at /stocks/taxonomies/vX/disclosures. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of ticker symbols for the filing company. Multiple symbols may indicate different share classes; empty if no ticker is currently mapped to the filer. |  [optional] |



