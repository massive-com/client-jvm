
# StocksV2NBBO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **T** | **kotlin.String** | The exchange symbol that this item is traded under. |  |
| **f** | **kotlin.Int** | The nanosecond accuracy TRF(Trade Reporting Facility) Unix Timestamp. This is the timestamp of when the trade reporting facility received this message. |  |
| **q** | **kotlin.Long** | The sequence number represents the sequence in which message events happened. These are increasing and unique per ticker symbol, but will not always be sequential (e.g., 1, 2, 6, 9, 10, 11).  |  |
| **t** | **kotlin.Int** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this message from the exchange which produced it. |  |
| **y** | **kotlin.Int** | The nanosecond accuracy Participant/Exchange Unix Timestamp. This is the timestamp of when the quote was actually generated at the exchange. |  |
| **P** | **kotlin.Double** | The ask price. |  |
| **S** | **kotlin.Int** | The ask size. This represents the number of round lot orders at the given ask price. The normal round lot size is 100 shares. An ask size of 2 means there are 200 shares available to purchase at the given ask price. |  |
| **X** | **kotlin.Int** | The ask exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/stocks/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  |
| **c** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes.  |  |
| **i** | **kotlin.collections.List&lt;kotlin.Int&gt;** | The indicators. For more information, see our glossary of [Conditions and Indicators](https://massive.com/glossary/conditions-indicators).  |  |
| **p** | **kotlin.Double** | The bid price. |  |
| **s** | **kotlin.Int** | The bid size. This represents the number of round lot orders at the given bid price. The normal round lot size is 100 shares. A bid size of 2 means there are 200 shares for purchase at the given bid price. |  |
| **x** | **kotlin.Int** | The bid exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/stocks/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive.com&#39;s mapping of exchange IDs. |  |
| **z** | **kotlin.Int** | There are 3 tapes which define which exchange the ticker is listed on. These are integers in our objects which represent the letter of the alphabet. Eg: 1 &#x3D; A, 2 &#x3D; B, 3 &#x3D; C. * Tape A is NYSE listed securities * Tape B is NYSE ARCA / NYSE American * Tape C is NASDAQ  |  |



