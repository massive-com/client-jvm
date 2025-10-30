
# CryptoLastTradeLast

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conditions** | **kotlin.collections.List&lt;kotlin.Int&gt;** | A list of condition codes.  |  |
| **exchange** | **kotlin.Int** | The exchange that this crypto trade happened on.   See &lt;a href&#x3D;\&quot;https://massive.com/docs/crypto/get_v3_reference_exchanges\&quot;&gt;Exchanges&lt;/a&gt; for a mapping of exchanges to IDs.  |  |
| **price** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole share of this trade. A trade of 100 shares with a price of $2.00 would be worth a total dollar value of $200.00.  |  |
| **propertySize** | **kotlin.Double** | The size of a trade (also known as volume).  |  |
| **timestamp** | **kotlin.Int** | The Unix millisecond timestamp for the start of the aggregate window. |  |



