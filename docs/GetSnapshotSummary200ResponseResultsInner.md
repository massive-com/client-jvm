
# GetSnapshotSummary200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ticker** | **kotlin.String** | Ticker of asset queried. |  |
| **branding** | [**GetSnapshotSummary200ResponseResultsInnerBranding**](GetSnapshotSummary200ResponseResultsInnerBranding.md) |  |  [optional] |
| **error** | **kotlin.String** | The error while looking for this ticker. |  [optional] |
| **lastUpdated** | **kotlin.Long** | The nanosecond timestamp of when this information was updated. |  [optional] |
| **marketStatus** | **kotlin.String** | The market status for the market that trades this ticker. |  [optional] |
| **message** | **kotlin.String** | The error message while looking for this ticker. |  [optional] |
| **name** | **kotlin.String** | Name of ticker, forex, or crypto asset. |  [optional] |
| **options** | [**GetSnapshotSummary200ResponseResultsInnerOptions**](GetSnapshotSummary200ResponseResultsInnerOptions.md) |  |  [optional] |
| **price** | **kotlin.Double** | The most up to date ticker price. |  [optional] |
| **session** | [**GetSnapshotSummary200ResponseResultsInnerSession**](GetSnapshotSummary200ResponseResultsInnerSession.md) |  |  [optional] |
| **type** | [**inline**](#Type) | The market for this ticker of stock, crypto, fx, option. |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | stocks, crypto, options, fx |



