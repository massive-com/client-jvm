
# GetStocksFilingsVXForm3200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accessionNumber** | **kotlin.String** | Unique SEC accession number for the filing (e.g., &#39;0001209191-25-012345&#39;). |  [optional] |
| **aff10b5One** | **kotlin.Boolean** | Whether the transaction was made pursuant to a Rule 10b5-1 trading plan. |  [optional] |
| **dateOfOriginalSubmission** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date of the original filing submission for amendment filings (3/A). Null for initial filings (formatted as YYYY-MM-DD). |  [optional] |
| **directOrIndirect** | **kotlin.String** | Whether ownership is direct (&#39;D&#39;) or indirect (&#39;I&#39;). |  [optional] |
| **exerciseDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date exercisable for derivative securities (formatted as YYYY-MM-DD). |  [optional] |
| **exercisePrice** | **kotlin.Double** | Exercise or conversion price of derivative securities in USD. |  [optional] |
| **filingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the filing was submitted to the SEC (formatted as YYYY-MM-DD). |  [optional] |
| **filingUrl** | **kotlin.String** | Direct URL to the filing on the SEC EDGAR website. |  [optional] |
| **footnotes** | [**kotlin.collections.List&lt;GetStocksFilingsVXForm3200ResponseResultsInnerFootnotesInner&gt;**](GetStocksFilingsVXForm3200ResponseResultsInnerFootnotesInner.md) | List of footnotes from the filing that are relevant to this row, each with an id and description. |  [optional] |
| **formType** | **kotlin.String** | SEC form type (&#39;3&#39; for initial filing, &#39;3/A&#39; for amendments). |  [optional] |
| **isDirector** | **kotlin.Boolean** | Whether the reporting owner is a director of the issuer. |  [optional] |
| **isOfficer** | **kotlin.Boolean** | Whether the reporting owner is an officer of the issuer. |  [optional] |
| **isOther** | **kotlin.Boolean** | Whether the reporting owner has another relationship with the issuer. |  [optional] |
| **isTenPercentOwner** | **kotlin.Boolean** | Whether the reporting owner holds 10% or more of a class of equity securities. |  [optional] |
| **issuerCik** | **kotlin.String** | SEC Central Index Key of the issuer company (10 digits, zero-padded). |  [optional] |
| **issuerName** | **kotlin.String** | Name of the issuer company as reported in the filing. |  [optional] |
| **natureOfOwnership** | **kotlin.String** | Nature of indirect ownership (e.g., &#39;By Trust&#39;, &#39;By Spouse&#39;). |  [optional] |
| **notSubjectToSection16** | **kotlin.Boolean** | Whether the reporting owner is not subject to Section 16 of the Securities Exchange Act. |  [optional] |
| **officerTitle** | **kotlin.String** | Title of the officer, if the reporting owner is an officer. |  [optional] |
| **ownerCik** | **kotlin.String** | SEC Central Index Key of the reporting owner (10 digits, zero-padded). |  [optional] |
| **ownerName** | **kotlin.String** | Name of the reporting owner (individual or entity). |  [optional] |
| **periodOfReport** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date of the event triggering the filing (formatted as YYYY-MM-DD). |  [optional] |
| **remarks** | **kotlin.String** | Additional remarks included in the filing. |  [optional] |
| **securityTitle** | **kotlin.String** | Title or description of the security (e.g., &#39;Common Stock&#39;, &#39;Stock Option&#39;). |  [optional] |
| **securityType** | **kotlin.String** | Type of security (&#39;non-derivative&#39; or &#39;derivative&#39;). |  [optional] |
| **sharesOwned** | **kotlin.Double** | Number of shares beneficially owned. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of ticker symbols for the issuer company. Multiple symbols may indicate different share classes. |  [optional] |
| **underlyingSecurityShares** | **kotlin.Double** | Number of underlying shares for derivative holdings. |  [optional] |
| **underlyingSecurityTitle** | **kotlin.String** | Title of the underlying security for derivative holdings. |  [optional] |



