
# ListOptionsContracts200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **additionalUnderlyings** | [**kotlin.collections.List&lt;ListOptionsContracts200ResponseResultsInnerAdditionalUnderlyingsInner&gt;**](ListOptionsContracts200ResponseResultsInnerAdditionalUnderlyingsInner.md) | If an option contract has additional underlyings or deliverables associated with it, they will appear here. See &lt;a rel&#x3D;\&quot;noopener noreferrer nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.optionseducation.org/referencelibrary/faq/splits-mergers-spinoffs-bankruptcies\&quot;&gt;here&lt;/a&gt; for some examples of what might cause a contract to have additional underlyings. |  [optional] |
| **cfi** | **kotlin.String** | The 6 letter CFI code of the contract (defined in &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_10962\&quot;&gt;ISO 10962&lt;/a&gt;) |  [optional] |
| **contractType** | **kotlin.String** | The type of contract. Can be \&quot;put\&quot;, \&quot;call\&quot;, or in some rare cases, \&quot;other\&quot;. |  [optional] |
| **correction** | **kotlin.Int** | The correction number for this option contract. |  [optional] |
| **exerciseStyle** | [**inline**](#ExerciseStyle) | The exercise style of this contract. See &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://en.wikipedia.org/wiki/Option_style\&quot;&gt;this link&lt;/a&gt; for more details on exercise styles. |  [optional] |
| **expirationDate** | **kotlin.String** | The contract&#39;s expiration date in YYYY-MM-DD format. |  [optional] |
| **primaryExchange** | **kotlin.String** | The MIC code of the primary exchange that this contract is listed on. |  [optional] |
| **sharesPerContract** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of shares per contract for this contract. |  [optional] |
| **strikePrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The strike price of the option contract. |  [optional] |
| **ticker** | **kotlin.String** | The ticker for the option contract. |  [optional] |
| **underlyingTicker** | **kotlin.String** | The underlying ticker that the option contract relates to. |  [optional] |


<a id="ExerciseStyle"></a>
## Enum: exercise_style
| Name | Value |
| ---- | ----- |
| exerciseStyle | american, european, bermudan |



