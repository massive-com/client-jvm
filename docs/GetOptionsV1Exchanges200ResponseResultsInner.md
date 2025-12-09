
# GetOptionsV1Exchanges200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Numeric identifier for the options trading venue or exchange. |  |
| **name** | **kotlin.String** | Full official name of the options exchange or trading venue. |  |
| **type** | **kotlin.String** | Type of venue: &#39;exchange&#39; for options exchanges, &#39;SIP&#39; for Securities Information Processors like OPRA (Options Price Reporting Authority). |  |
| **acronym** | **kotlin.String** | Exchange acronym or short name (e.g., &#39;ISE&#39;, &#39;GEMX&#39;) - may be null for some venues. |  [optional] |
| **locale** | **kotlin.String** | Geographic location code. |  [optional] |
| **mic** | **kotlin.String** | Market Identifier Code (MIC) - ISO 10383 standard four-character code identifying the specific options market. |  [optional] |
| **operatingMic** | **kotlin.String** | Operating Market Identifier Code - identifies the parent organization or operating entity. |  [optional] |
| **participantId** | **kotlin.String** | Single-character participant identifier used in consolidator market data feeds and options trade reporting. |  [optional] |
| **url** | **kotlin.String** | Official website URL of the organization operating the options exchange. |  [optional] |



