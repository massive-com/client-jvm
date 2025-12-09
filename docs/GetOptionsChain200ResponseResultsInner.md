
# GetOptionsChain200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **breakEvenPrice** | **kotlin.Double** | The price of the underlying asset for the contract to break even. For a call, this value is (strike price + premium paid). For a put, this value is (strike price - premium paid). |  |
| **day** | [**GetOptionsChain200ResponseResultsInnerDay**](GetOptionsChain200ResponseResultsInnerDay.md) |  |  |
| **details** | [**GetOptionsChain200ResponseResultsInnerDetails**](GetOptionsChain200ResponseResultsInnerDetails.md) |  |  |
| **lastQuote** | [**GetOptionsChain200ResponseResultsInnerLastQuote**](GetOptionsChain200ResponseResultsInnerLastQuote.md) |  |  |
| **openInterest** | **kotlin.Double** | The quantity of this contract held at the end of the last trading day. |  |
| **underlyingAsset** | [**GetSnapshots200ResponseResultsInnerUnderlyingAsset**](GetSnapshots200ResponseResultsInnerUnderlyingAsset.md) |  |  |
| **fmv** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Fair Market Value is only available on Business plans. It is our proprietary algorithm to generate a real-time, accurate, fair market value of a tradable security. For more information, &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://massive.com/contact\&quot;&gt;contact us&lt;/a&gt;. |  [optional] |
| **fmvLastUpdated** | **kotlin.Long** | If Fair Market Value (FMV) is available, this field is the nanosecond timestamp of the last FMV calculation. |  [optional] |
| **greeks** | [**GetSnapshots200ResponseResultsInnerGreeks**](GetSnapshots200ResponseResultsInnerGreeks.md) |  |  [optional] |
| **impliedVolatility** | **kotlin.Double** | The market&#39;s forecast for the volatility of the underlying asset, based on this option&#39;s current price. |  [optional] |
| **lastTrade** | [**GetOptionsChain200ResponseResultsInnerLastTrade**](GetOptionsChain200ResponseResultsInnerLastTrade.md) |  |  [optional] |



