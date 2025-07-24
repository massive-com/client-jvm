
# GetSnapshotSummary200ResponseResultsInnerSession

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **change** | **kotlin.Double** | The value of the price change for the asset from the previous trading day. |  |
| **changePercent** | **kotlin.Double** | The percent of the price change for the asset from the previous trading day. |  |
| **close** | **kotlin.Double** | The closing price of the asset for the day. |  |
| **high** | **kotlin.Double** | The highest price of the asset for the day. |  |
| **low** | **kotlin.Double** | The lowest price of the asset for the day. |  |
| **&#x60;open&#x60;** | **kotlin.Double** | The open price of the asset for the day. |  |
| **previousClose** | **kotlin.Double** | The closing price of the asset for the previous trading day. |  |
| **earlyTradingChange** | **kotlin.Double** | Today&#39;s early trading change amount, difference between price and previous close if in early trading hours, otherwise difference between last price during early trading and previous close. |  [optional] |
| **earlyTradingChangePercent** | **kotlin.Double** | Today&#39;s early trading change as a percentage. |  [optional] |
| **lateTradingChange** | **kotlin.Double** | Today&#39;s late trading change amount, difference between price and today&#39;s close if in late trading hours, otherwise difference between last price during late trading and today&#39;s close. |  [optional] |
| **lateTradingChangePercent** | **kotlin.Double** | Today&#39;s late trading change as a percentage. |  [optional] |
| **price** | **kotlin.Double** | The price of the most recent trade or bid price for this asset. |  [optional] |
| **regularTradingChange** | **kotlin.Double** | Today&#39;s change in regular trading hours, difference between current price and previous trading day&#39;s close, otherwise difference between today&#39;s close and previous day&#39;s close. |  [optional] |
| **regularTradingChangePercent** | **kotlin.Double** | Today&#39;s regular trading change as a percentage. |  [optional] |
| **volume** | **kotlin.Double** | The trading volume for the asset for the day. |  [optional] |



