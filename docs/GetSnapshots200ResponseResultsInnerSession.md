
# GetSnapshots200ResponseResultsInnerSession

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **change** | **kotlin.Double** | The value of the price change for the asset from the previous trading day. |  [optional] |
| **changePercent** | **kotlin.Double** | The percent of the price change for the asset from the previous trading day. |  [optional] |
| **close** | **kotlin.Double** | The closing price of the asset for the day. |  [optional] |
| **decimalVolume** | **kotlin.String** | The trading volume for the asset for the day with decimal precision. This field provides support for fractional shares, representing volume as a decimal string. This field is only returned for stocks snapshots. |  [optional] |
| **earlyTradingChange** | **kotlin.Double** | Today&#39;s early trading change amount, difference between price and previous close if in early trading hours, otherwise difference between last price during early trading and previous close. |  [optional] |
| **earlyTradingChangePercent** | **kotlin.Double** | Today&#39;s early trading change as a percentage. |  [optional] |
| **high** | **kotlin.Double** | The highest price of the asset for the day. |  [optional] |
| **lateTradingChange** | **kotlin.Double** | Today&#39;s late trading change amount, difference between price and today&#39;s close if in late trading hours, otherwise difference between last price during late trading and today&#39;s close. |  [optional] |
| **lateTradingChangePercent** | **kotlin.Double** | Today&#39;s late trading change as a percentage. |  [optional] |
| **low** | **kotlin.Double** | The lowest price of the asset for the day. |  [optional] |
| **&#x60;open&#x60;** | **kotlin.Double** | The open price of the asset for the day. |  [optional] |
| **previousClose** | **kotlin.Double** | The closing price of the asset for the previous trading day. This is the correct field for the prior session&#39;s reference price, and it is retained across the daily session rollover. It is absent only for an asset with no completed prior session, such as a newly listed ticker or option contract. |  [optional] |
| **price** | **kotlin.Double** | The price of the most recent trade or bid price for this asset. |  [optional] |
| **regularTradingChange** | **kotlin.Double** | Today&#39;s change in regular trading hours, difference between current price and previous trading day&#39;s close, otherwise difference between today&#39;s close and previous day&#39;s close. |  [optional] |
| **regularTradingChangePercent** | **kotlin.Double** | Today&#39;s regular trading change as a percentage. |  [optional] |
| **volume** | **kotlin.Double** | The trading volume for the asset for the day. A value of 0 means no trades have occurred yet in the current session. |  [optional] |



