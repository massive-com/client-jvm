
# GetStocksFilingsVXForm4200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accessionNumber** | **kotlin.String** | Unique SEC accession number for the filing (e.g., &#39;0001209191-25-012345&#39;). |  [optional] |
| **aff10b5One** | **kotlin.Boolean** | Whether the transaction was made pursuant to a Rule 10b5-1 trading plan. |  [optional] |
| **dateOfOriginalSubmission** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date of the original filing submission for amendment filings (4/A). Null for standard filings (formatted as YYYY-MM-DD). |  [optional] |
| **deemedExecutionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Deemed execution date if different from transaction date (formatted as YYYY-MM-DD). |  [optional] |
| **directOrIndirect** | **kotlin.String** | Whether ownership is direct (&#39;D&#39;) or indirect (&#39;I&#39;). |  [optional] |
| **equitySwapInvolved** | **kotlin.Boolean** | Whether an equity swap was involved in the transaction. |  [optional] |
| **exerciseDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date exercisable for derivative securities (formatted as YYYY-MM-DD). |  [optional] |
| **exercisePrice** | **kotlin.Double** | Exercise or conversion price of derivative securities in USD. |  [optional] |
| **expirationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Expiration date for derivative securities (formatted as YYYY-MM-DD). |  [optional] |
| **filingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the filing was submitted to the SEC (formatted as YYYY-MM-DD). |  [optional] |
| **filingUrl** | **kotlin.String** | Direct URL to the filing on the SEC EDGAR website. |  [optional] |
| **footnotes** | [**kotlin.collections.List&lt;GetStocksFilingsVXForm3200ResponseResultsInnerFootnotesInner&gt;**](GetStocksFilingsVXForm3200ResponseResultsInnerFootnotesInner.md) | List of footnotes from the filing that are relevant to this row, each with an id and description. |  [optional] |
| **formType** | **kotlin.String** | SEC form type (&#39;4&#39; for standard filing, &#39;4/A&#39; for amendments). |  [optional] |
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
| **recordType** | **kotlin.String** | Type of record in the filing (e.g., &#39;transaction&#39;, &#39;holding&#39;). |  [optional] |
| **remarks** | **kotlin.String** | Additional remarks included in the filing. |  [optional] |
| **securityTitle** | **kotlin.String** | Title or description of the security (e.g., &#39;Common Stock&#39;, &#39;Stock Option&#39;). |  [optional] |
| **securityType** | **kotlin.String** | Type of security (&#39;non-derivative&#39; or &#39;derivative&#39;). |  [optional] |
| **sharesOwnedFollowingTransaction** | **kotlin.Double** | Total shares beneficially owned after the transaction. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of ticker symbols for the issuer company. Multiple symbols may indicate different share classes. |  [optional] |
| **transactionAcquiredDisposed** | **kotlin.String** | Whether shares were acquired (&#39;A&#39;) or disposed of (&#39;D&#39;). |  [optional] |
| **transactionCode** | **kotlin.String** | SEC transaction code indicating the type of transaction (e.g., &#39;P&#39; for purchase, &#39;S&#39; for sale, &#39;A&#39; for grant/award, &#39;M&#39; for exercise/conversion). |  [optional] |
| **transactionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date of the transaction (formatted as YYYY-MM-DD). |  [optional] |
| **transactionPricePerShare** | **kotlin.Double** | Price per share of the transaction in USD. |  [optional] |
| **transactionShares** | **kotlin.Double** | Number of shares involved in the transaction. |  [optional] |
| **transactionTimeliness** | **kotlin.String** | Timeliness of the filing: &#39;O&#39; (on time) or &#39;L&#39; (late). |  [optional] |
| **transactionValue** | **kotlin.Double** | Total value of the transaction in USD (transaction_shares x transaction_price_per_share). Null when shares or price is not reported. |  [optional] |
| **underlyingSecurityShares** | **kotlin.Double** | Number of underlying shares for derivative transactions. |  [optional] |
| **underlyingSecurityTitle** | **kotlin.String** | Title of the underlying security for derivative transactions. |  [optional] |



