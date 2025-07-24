
# GetSnapshotSummary200ResponseResultsInnerOptions

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contractType** | [**inline**](#ContractType) | The type of contract. Can be \&quot;put\&quot;, \&quot;call\&quot;, or in some rare cases, \&quot;other\&quot;. |  |
| **exerciseStyle** | [**inline**](#ExerciseStyle) | The exercise style of this contract. See &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://en.wikipedia.org/wiki/Option_style\&quot;&gt;this link&lt;/a&gt; for more details on exercise styles. |  |
| **expirationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The contract&#39;s expiration date in YYYY-MM-DD format. |  |
| **sharesPerContract** | **kotlin.Double** | The number of shares per contract for this contract. |  |
| **strikePrice** | **kotlin.Double** | The strike price of the option contract. |  |
| **underlyingTicker** | **kotlin.String** | The ticker for the option contract. |  |


<a id="ContractType"></a>
## Enum: contract_type
| Name | Value |
| ---- | ----- |
| contractType | put, call, other |


<a id="ExerciseStyle"></a>
## Enum: exercise_style
| Name | Value |
| ---- | ----- |
| exerciseStyle | american, european, bermudan |



