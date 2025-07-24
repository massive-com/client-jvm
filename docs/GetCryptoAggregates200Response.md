
# GetCryptoAggregates200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ticker** | **kotlin.String** | The exchange symbol that this item is traded under. |  |
| **adjusted** | **kotlin.Boolean** | Whether or not this response was adjusted for splits. |  |
| **queryCount** | **kotlin.Int** | The number of aggregates (minute or day) used to generate the response. |  |
| **requestId** | **kotlin.String** | A request id assigned by the server. |  |
| **resultsCount** | **kotlin.Int** | The total number of results for this request. |  |
| **status** | **kotlin.String** | The status of this request&#39;s response. |  |
| **results** | [**kotlin.collections.List&lt;GetCryptoAggregates200ResponseAllOfResultsInner&gt;**](GetCryptoAggregates200ResponseAllOfResultsInner.md) | An array of results containing the requested data. |  [optional] |



