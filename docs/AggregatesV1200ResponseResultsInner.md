
# AggregatesV1200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **close** | **kotlin.Double** | The last price within the timeframe. |  |
| **dollarVolume** | **kotlin.Double** | The sum of price × size across all trades in the window, expressed in the contract&#39;s quoted price units, which are the same units as the bar&#39;s open, high, low, and close. Despite the field name, no contract multiplier is applied, so this is not a notional dollar value. See the &lt;a href&#x3D;\&quot;/docs/rest/futures/products\&quot;&gt;Products endpoint&lt;/a&gt; for contract multiplier details. Because dollar_volume is a raw sum, you can use it to compute a volume-weighted average price (VWAP) over any span of bars: sum dollar_volume across the bars in the window and divide by the summed volume. |  |
| **high** | **kotlin.Double** | The highest price within the timeframe. |  |
| **low** | **kotlin.Double** | The lowest price within the timeframe. |  |
| **&#x60;open&#x60;** | **kotlin.Double** | The opening price within the timeframe. |  |
| **sessionEndDate** | **kotlin.String** | Also known as the trading date, the date of the end of the trading session, in YYYY-MM-DD format. Sessions are named by this end date, while window_start holds the session&#39;s start date, which for session candles is the day before. |  |
| **ticker** | **kotlin.String** | The ticker for the contract. |  |
| **transactions** | **kotlin.Long** | The number of transactions that occurred within the timeframe. |  |
| **volume** | **kotlin.Long** | The number of contracts that traded within the timeframe. |  |
| **windowStart** | **kotlin.Long** | The timestamp of the beginning of the candlestick’s aggregation window. |  |
| **settlementPrice** | **kotlin.Double** | The price the contract settled at for this session. Included for session, week, month, quarter, and year candles; for multi-session candles it is the settlement of the final session in the period. Not returned for intraday candles (sec, min, hour). |  [optional] |



