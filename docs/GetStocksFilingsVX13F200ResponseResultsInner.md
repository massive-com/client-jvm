
# GetStocksFilingsVX13F200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accessionNumber** | **kotlin.String** | Unique SEC accession number for the filing (e.g., &#39;0000950123-24-011775&#39;). |  [optional] |
| **cusip** | **kotlin.String** | The CUSIP identifier for the held security. |  [optional] |
| **fileNumber** | **kotlin.String** | The 13F-specific file number assigned to the filer. |  [optional] |
| **filerCik** | **kotlin.String** | SEC Central Index Key (10 digits, zero-padded) of the filing entity. |  [optional] |
| **filingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the filing was submitted to the SEC (formatted as YYYY-MM-DD). |  [optional] |
| **filingUrl** | **kotlin.String** | Direct URL to the filing on the SEC EDGAR website. |  [optional] |
| **filmNumber** | **kotlin.String** | SEC EDGAR film number for the filing. |  [optional] |
| **formType** | **kotlin.String** | SEC form type (e.g., &#39;13F-HR&#39; for holdings report, &#39;13F-HR/A&#39; for amended report). |  [optional] |
| **investmentDiscretion** | **kotlin.String** | Type of investment discretion. Possible values: SOLE, SHARED, DFND (defined). |  [optional] |
| **issuerName** | **kotlin.String** | Name of the company whose securities are held. |  [optional] |
| **marketValue** | **kotlin.Long** | Market value of the holding in USD. |  [optional] |
| **otherManagers** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of names of other manager(s) sharing investment discretion over the reported holdings, if applicable. |  [optional] |
| **period** | [**java.time.LocalDate**](java.time.LocalDate.md) | The quarter end date that the filing covers (formatted as YYYY-MM-DD). |  [optional] |
| **putCall** | **kotlin.String** | Indicates if the holding is a put or call option. Possible values: PUT, CALL, or empty for common stock. |  [optional] |
| **sharesOrPrincipalAmount** | **kotlin.Long** | Number of shares or principal amount held. |  [optional] |
| **sharesOrPrincipalType** | **kotlin.String** | Type of amount reported. Possible values: SH (shares), PRN (principal amount). |  [optional] |
| **titleOfClass** | **kotlin.String** | Description of the class of securities held (e.g., &#39;COM&#39;, &#39;CL A&#39;). |  [optional] |
| **votingAuthorityNone** | **kotlin.Long** | Number of shares with no voting authority. |  [optional] |
| **votingAuthorityShared** | **kotlin.Long** | Number of shares with shared voting authority. |  [optional] |
| **votingAuthoritySole** | **kotlin.Long** | Number of shares with sole voting authority. |  [optional] |



