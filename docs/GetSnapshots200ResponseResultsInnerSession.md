
# GetSnapshots200ResponseResultsInnerSession

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **change** | **kotlin.Double** | The value of the price change for the asset from the previous trading day. |  [optional] |
| **changePercent** | **kotlin.Double** | The percent of the price change for the asset from the previous trading day. |  [optional] |
| **close** | **kotlin.Double** | The closing price of the asset for the day. |  [optional] |
| **decimalVolume** | **kotlin.String** | The trading volume for the asset for the day with decimal precision. This field provides support for fractional shares, representing volume as a decimal string. This field is only returned for stocks snapshots. |  [optional] |
| **earlyTradingChange** | **kotlin.Double** | Today&#39;s early trading change amount, difference between price and previous close if in early trading hours, otherwise difference between last price during early trading and previous close. For options, this is the price of the contract&#39;s last early trading trade today (7:30 to 9:30 AM ET, with the EXHT condition) minus &#x60;previous_close&#x60;. |  [optional] |
| **earlyTradingChangePercent** | **kotlin.Double** | Today&#39;s early trading change as a percentage of &#x60;previous_close&#x60;. |  [optional] |
| **high** | **kotlin.Double** | The highest price of the asset for the day. |  [optional] |
| **lastUpdated** | **kotlin.Long** | The nanosecond timestamp of the last update to the session data. For stocks, it&#39;s set when the session resets at the start of each trading session and then advances with each trade; quotes don&#39;t update it. Returned for stocks, crypto, and forex snapshots, though it may be absent for inactive tickers. |  [optional] |
| **lateTradingChange** | **kotlin.Double** | Today&#39;s late trading change amount, difference between price and today&#39;s close if in late trading hours, otherwise difference between last price during late trading and today&#39;s close. For options, this is the price of the contract&#39;s last late trading trade today (after the regular session and before 5:00 PM ET, with the EXHT condition) minus today&#39;s &#x60;close&#x60;. |  [optional] |
| **lateTradingChangePercent** | **kotlin.Double** | Today&#39;s late trading change as a percentage of today&#39;s &#x60;close&#x60;. |  [optional] |
| **low** | **kotlin.Double** | The lowest price of the asset for the day. |  [optional] |
| **&#x60;open&#x60;** | **kotlin.Double** | The open price of the asset for the day. |  [optional] |
| **previousClose** | **kotlin.Double** | The closing price of the asset for the previous trading day. This is the correct field for the prior session&#39;s reference price, and it is retained across the daily session rollover. It is absent only for an asset with no completed prior session, such as a newly listed ticker or option contract. |  [optional] |
| **price** | **kotlin.Double** | The price of the most recent trade or bid price for this asset. |  [optional] |
| **regularTradingChange** | **kotlin.Double** | Today&#39;s change in regular trading hours, difference between current price and previous trading day&#39;s close, otherwise difference between today&#39;s close and previous day&#39;s close. For options, while &#x60;market_status&#x60; is &#x60;open&#x60; this is the price of the contract&#39;s last regular session trade today minus &#x60;previous_close&#x60;. During late trading and after the close, it is today&#39;s &#x60;close&#x60; minus &#x60;previous_close&#x60;. It is omitted during early trading. |  [optional] |
| **regularTradingChangePercent** | **kotlin.Double** | Today&#39;s regular trading change as a percentage of &#x60;previous_close&#x60;. |  [optional] |
| **volume** | **kotlin.Double** | The trading volume for the asset for the day. A value of 0 means no trades have occurred yet in the current session. |  [optional] |
| **vwap** | **kotlin.Double** | The volume weighted average price of the asset for the day. Only returned for stocks, crypto, and forex snapshots, and omitted when there&#39;s no day bar yet, such as for stocks before the regular market open or for tickers that haven&#39;t traded today. |  [optional] |



