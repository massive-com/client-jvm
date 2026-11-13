
# ListOptionsContracts200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **additionalUnderlyings** | [**kotlin.collections.List&lt;ListOptionsContracts200ResponseResultsInnerAdditionalUnderlyingsInner&gt;**](ListOptionsContracts200ResponseResultsInnerAdditionalUnderlyingsInner.md) | If an option contract has additional underlyings or deliverables associated with it, they will appear here. See &lt;a rel&#x3D;\&quot;noopener noreferrer nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.optionseducation.org/referencelibrary/faq/splits-mergers-spinoffs-bankruptcies\&quot;&gt;here&lt;/a&gt; for some examples of what might cause a contract to have additional underlyings. |  [optional] |
| **cfi** | **kotlin.String** | The 6 letter CFI code of the contract (defined in &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_10962\&quot;&gt;ISO 10962&lt;/a&gt;) |  [optional] |
| **companyTicker** | **kotlin.String** | KPI binary options only. The ticker of the company the KPI belongs to, like NFLX. |  [optional] |
| **contractType** | **kotlin.String** | The type of contract. Can be \&quot;put\&quot;, \&quot;call\&quot;, or in some rare cases, \&quot;other\&quot;. |  [optional] |
| **correction** | **kotlin.Int** | The correction number for this option contract. |  [optional] |
| **exerciseStyle** | [**inline**](#ExerciseStyle) | The exercise style of this contract. See &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://en.wikipedia.org/wiki/Option_style\&quot;&gt;this link&lt;/a&gt; for more details on exercise styles. |  [optional] |
| **expirationDate** | **kotlin.String** | The contract&#39;s expiration date in YYYY-MM-DD format. |  [optional] |
| **metric** | **kotlin.String** | KPI binary options only. The KPI the contract settles on, like \&quot;Earnings Per Share ($/share)\&quot;. |  [optional] |
| **primaryExchange** | **kotlin.String** | The MIC code of the primary exchange that this contract is listed on. |  [optional] |
| **reportTime** | [**inline**](#ReportTime) | KPI binary options only. AM if the company reports before the market opens, PM if after it closes. |  [optional] |
| **reportingPeriod** | **kotlin.String** | KPI binary options only. The fiscal period the KPI is for, like 2026Q3. |  [optional] |
| **scale** | **kotlin.Int** | KPI binary options only. The KPI value divided by scale gives the strike price, like 1000000000 for a KPI in billions. A negative scale means an inverted KPI, like Loss Per Share. |  [optional] |
| **sharesPerContract** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of shares per contract for this contract. |  [optional] |
| **strikePrice** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The strike price of the option contract. |  [optional] |
| **ticker** | **kotlin.String** | The ticker for the option contract. |  [optional] |
| **type** | [**inline**](#Type) | The type of option contract: standard or binary. It can be missing, for example on contracts listed before this field was added, so a missing type says nothing about the contract. |  [optional] |
| **underlyingTicker** | **kotlin.String** | The underlying ticker that the option contract relates to. |  [optional] |
| **underlyingType** | [**inline**](#UnderlyingType) | What the contract is based on: kpi on Cboe KPI binary options, equity on NYSE American equity binary options (roots that start with B1). Missing on other contracts for now. |  [optional] |


<a id="ExerciseStyle"></a>
## Enum: exercise_style
| Name | Value |
| ---- | ----- |
| exerciseStyle | american, european, bermudan |


<a id="ReportTime"></a>
## Enum: report_time
| Name | Value |
| ---- | ----- |
| reportTime | AM, PM |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | standard, binary |


<a id="UnderlyingType"></a>
## Enum: underlying_type
| Name | Value |
| ---- | ----- |
| underlyingType | kpi, equity |



