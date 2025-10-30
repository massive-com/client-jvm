
# GetSnapshots200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ticker** | **kotlin.String** | The ticker symbol for the asset. |  |
| **breakEvenPrice** | **kotlin.Double** | The price of the underlying asset for the contract to break even. For a call, this value is (strike price + premium paid). For a put, this value is (strike price - premium paid). |  [optional] |
| **details** | [**GetSnapshots200ResponseResultsInnerDetails**](GetSnapshots200ResponseResultsInnerDetails.md) |  |  [optional] |
| **error** | **kotlin.String** | The error while looking for this ticker. |  [optional] |
| **fmv** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Fair market value is only available on Business plans. It&#39;s it our proprietary algorithm to generate a real-time, accurate, fair market value of a tradable security. For more information, &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://massive.com/contact\&quot;&gt;contact us&lt;/a&gt;. |  [optional] |
| **greeks** | [**GetSnapshots200ResponseResultsInnerGreeks**](GetSnapshots200ResponseResultsInnerGreeks.md) |  |  [optional] |
| **impliedVolatility** | **kotlin.Double** | The market&#39;s forecast for the volatility of the underlying asset, based on this option&#39;s current price. |  [optional] |
| **lastQuote** | [**GetSnapshots200ResponseResultsInnerLastQuote**](GetSnapshots200ResponseResultsInnerLastQuote.md) |  |  [optional] |
| **lastTrade** | [**GetSnapshots200ResponseResultsInnerLastTrade**](GetSnapshots200ResponseResultsInnerLastTrade.md) |  |  [optional] |
| **marketStatus** | **kotlin.String** | The market status for the market that trades this ticker. Possible values for stocks, options, crypto, and forex snapshots are open, closed, early_trading, or late_trading. Possible values for indices snapshots are regular_trading, closed, early_trading, and late_trading. |  [optional] |
| **message** | **kotlin.String** | The error message while looking for this ticker. |  [optional] |
| **name** | **kotlin.String** | The name of this contract. |  [optional] |
| **openInterest** | **kotlin.Double** | The quantity of this contract held at the end of the last trading day. |  [optional] |
| **session** | [**GetSnapshotSummary200ResponseResultsInnerSession**](GetSnapshotSummary200ResponseResultsInnerSession.md) |  |  [optional] |
| **type** | [**inline**](#Type) | The asset class for this ticker. |  [optional] |
| **underlyingAsset** | [**GetSnapshots200ResponseResultsInnerUnderlyingAsset**](GetSnapshots200ResponseResultsInnerUnderlyingAsset.md) |  |  [optional] |
| **&#x60;value&#x60;** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Value of Index. |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | stocks, options, fx, crypto, indices |



