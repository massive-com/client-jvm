
# GetOptionsV1UnusualTrades200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sequenceNumber** | **kotlin.Long** | The sequence number represents the sequence in which trade events happened. These are increasing and unique per ticker symbol, but will not always be sequential. Values reset after each trading session/day. |  |
| **sipTimestamp** | **kotlin.Long** | The nanosecond accuracy SIP Unix Timestamp. This is the timestamp of when the SIP received this trade from the exchange which produced it. |  |
| **ticker** | **kotlin.String** | The options ticker symbol (e.g., O:SPY260123C00687000). |  |
| **conditions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes. See [Options Condition Codes](https://massive.com/docs/rest/options/market-operations/condition-codes) for what each code means. |  [optional] |
| **exchange** | **kotlin.Int** | The exchange ID. See &lt;a href&#x3D;\&quot;https://massive.com/docs/rest/options/market-operations/exchanges\&quot; alt&#x3D;\&quot;Exchanges\&quot;&gt;Exchanges&lt;/a&gt; for Massive&#39;s mapping of exchange IDs. |  [optional] |
| **flags** | **kotlin.collections.List&lt;kotlin.String&gt;** | The unusual-activity cases the trade meets, as a list. Values: block_premium (notional premium of $100,000 or more), block_size (1,000 contracts or more), iso (intermarket sweep, condition 219). A trade that meets several cases carries every matching flag. |  [optional] |
| **price** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole contract of this trade. |  [optional] |
| **root** | **kotlin.String** | The OCC root symbol of the contract (e.g., SPXW). Differs from the underlying for weekly roots and for contracts adjusted after a corporate action (e.g., AMCR1). |  [optional] |
| **propertySize** | **kotlin.Long** | The size of a trade (also known as volume), in contracts. |  [optional] |
| **underlyingTicker** | **kotlin.String** | The ticker of the contract&#39;s underlying (e.g., SPX). Weekly and adjusted roots are folded in, so SPXW contracts report SPX and AMCR1 contracts report AMCR; see root to tell them apart. |  [optional] |



