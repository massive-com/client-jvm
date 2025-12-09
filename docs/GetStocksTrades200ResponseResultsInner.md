
# GetStocksTrades200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **exchange** | **kotlin.Int** | The exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/stocks/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  |
| **id** | **kotlin.String** | The Trade ID which uniquely identifies a trade. These are unique per combination of ticker, exchange, and TRF. For example: A trade for AAPL executed on NYSE and a trade for AAPL executed on NASDAQ could potentially have the same Trade ID. |  |
| **participantTimestamp** | **kotlin.Long** | The nanosecond accuracy Participant/Exchange Unix Timestamp. This is the timestamp of when the trade was actually generated at the exchange. |  |
| **price** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole share of this trade. A trade of 100 shares with a price of $2.00 would be worth a total dollar value of $200.00. |  |
| **sequenceNumber** | **kotlin.Long** | The sequence number represents the sequence in which trade events happened. These are increasing and unique per ticker symbol, but will not always be sequential (e.g., 1, 2, 6, 9, 10, 11). Values reset after each trading session/day. |  |
| **sipTimestamp** | **kotlin.Long** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this trade from the exchange which produced it. |  |
| **propertySize** | **kotlin.Double** | The size of a trade (also known as volume). |  |
| **conditions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes. |  [optional] |
| **correction** | **kotlin.Int** | The trade correction indicator. |  [optional] |
| **tape** | **kotlin.Int** | There are 3 tapes which define which exchange the ticker is listed on. These are integers in our objects which represent the letter of the alphabet. Eg: 1 &#x3D; A, 2 &#x3D; B, 3 &#x3D; C. * Tape A is NYSE listed securities * Tape B is NYSE ARCA / NYSE American * Tape C is NASDAQ |  [optional] |
| **trfId** | **kotlin.Int** | The ID for the Trade Reporting Facility where the trade took place. |  [optional] |
| **trfTimestamp** | **kotlin.Long** | The nanosecond accuracy TRF (Trade Reporting Facility) Unix Timestamp. This is the timestamp of when the trade reporting facility received this trade. |  [optional] |



