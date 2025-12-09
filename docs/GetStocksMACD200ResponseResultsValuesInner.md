
# GetStocksMACD200ResponseResultsValuesInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **histogram** | **kotlin.Float** | The difference between the MACD line (value) and the signal line (signal). Positive histogram values indicate upward (bullish) momentum, while negative histogram values indicate downward (bearish) momentum. |  [optional] |
| **signal** | **kotlin.Float** | The signal line value, calculated as the exponential moving average (EMA) of the MACD line (value) over the signal period defined in the request parameters. Traders typically use crossovers between the MACD and signal lines as trading signals. |  [optional] |
| **timestamp** | **kotlin.Long** | The Unix Msec timestamp from the last aggregate used in this calculation. |  [optional] |
| **&#x60;value&#x60;** | **kotlin.Float** | The MACD line value, calculated as the difference between the short-term and long-term exponential moving averages (EMAs) based on the periods specified in the request parameters. |  [optional] |



