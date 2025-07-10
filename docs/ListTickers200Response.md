
# ListTickers200Response

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **count** | **kotlin.Int** | The total number of results for this request. |  [optional] |
| **nextUrl** | **kotlin.String** | If present, this value can be used to fetch the next page of data. |  [optional] |
| **requestId** | **kotlin.String** | A request id assigned by the server. |  [optional] |
| **results** | [**kotlin.collections.List&lt;ListTickers200ResponseResultsInner&gt;**](ListTickers200ResponseResultsInner.md) | An array of tickers that match your query.  Note: Although you can query by CUSIP, due to legal reasons we do not return the CUSIP in the response. |  [optional] |
| **status** | **kotlin.String** | The status of this request&#39;s response. |  [optional] |



