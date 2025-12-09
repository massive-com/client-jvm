
# GetStocksV1Exchanges200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Numeric identifier for the trading venue or exchange. |  |
| **name** | **kotlin.String** | Full official name of the exchange, trading venue, or reporting facility. |  |
| **type** | **kotlin.String** | Type of trading venue: &#39;exchange&#39; for stock exchanges, &#39;TRF&#39; for Trade Reporting Facilities, &#39;SIP&#39; for Securities Information Processors, &#39;ORF&#39; for OTC Reporting Facility. |  |
| **acronym** | **kotlin.String** | Short acronym or abbreviation (may be null for some venues). |  [optional] |
| **locale** | **kotlin.String** | Geographic location code. |  [optional] |
| **mic** | **kotlin.String** | Market Identifier Code (MIC) - ISO 10383 standard four-character code for the market (may be empty for some venues). |  [optional] |
| **operatingMic** | **kotlin.String** | Operating Market Identifier Code - identifies the specific operating entity or parent organization. |  [optional] |
| **participantId** | **kotlin.String** | Single-character participant identifier used in market data feeds and trade reporting. |  [optional] |
| **url** | **kotlin.String** | Official website URL of the organization operating the venue. |  [optional] |



