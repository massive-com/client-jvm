
# GetStocksInsidersVXHoldings200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **filingCount** | **kotlin.Long** | Number of Form 3, 4, and 5 filings by the owner for this issuer. |  |
| **firstFilingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date of the owner&#39;s first Form 3, 4, or 5 filing for this issuer (formatted as YYYY-MM-DD). Filings begin in 2003. |  [optional] |
| **issuerCik** | **kotlin.String** | SEC Central Index Key of the issuer company (10 digits, zero-padded). |  [optional] |
| **issuerName** | **kotlin.String** | Name of the issuer company as reported in the most recent filing. |  [optional] |
| **lastFilingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date of the owner&#39;s most recent Form 3, 4, or 5 filing for this issuer (formatted as YYYY-MM-DD). |  [optional] |
| **officerTitle** | **kotlin.String** | Title of the officer in the most recent filing, if the reporting owner is an officer. |  [optional] |
| **oldestPositionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Earliest as_of_date among the summed positions (formatted as YYYY-MM-DD). A date far behind last_filing_date means at least one position has not been restated recently and may be stale. |  [optional] |
| **ownerCik** | **kotlin.String** | SEC Central Index Key of the reporting owner (10 digits, zero-padded). Stable across issuers and years; use it to follow a person through the Form 3, 4, and 5 endpoints. |  [optional] |
| **ownerName** | **kotlin.String** | Name of the reporting owner (individual or entity) as reported in the most recent filing. |  [optional] |
| **ownershipPct** | **kotlin.Double** | shares_owned as a percentage of the issuer&#39;s shares outstanding (largest share class) as of last_filing_date. Absent when shares outstanding is not available for the issuer. |  [optional] |
| **positionCount** | **kotlin.Long** | Number of positions summed into shares_owned: one for direct holdings plus one per indirect vehicle. |  [optional] |
| **roles** | **kotlin.collections.List&lt;kotlin.String&gt;** | Relationships of the reporting owner to the issuer in the most recent filing. Possible values: director, officer, ten_percent_owner, other. |  [optional] |
| **sharesOwned** | **kotlin.Double** | Shares of the issuer&#39;s non-derivative securities the owner holds: the sum of the latest reported balance of each position (direct, and each indirect vehicle) across their Form 3, 4, and 5 filings. As filed, not adjusted for splits. Unexercised options and other derivative securities are not included. Absent when the owner has never reported a share balance. |  [optional] |
| **sharesOwnedDirect** | **kotlin.Double** | Shares held directly, in the owner&#39;s own name. |  [optional] |
| **sharesOwnedIndirect** | **kotlin.Double** | Shares held indirectly through trusts, LLCs, family members, and other vehicles. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | Ticker symbols of the issuer as of the owner&#39;s most recent filing. Multiple symbols may indicate different share classes. |  [optional] |



