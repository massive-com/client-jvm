
# GetOptionsV1Analytics200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contractType** | **kotlin.String** | call or put |  |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | The trading date the values reflect |  |
| **dividendYield** | **kotlin.Double** | The most recent regular dividend by ex-date times its yearly frequency, divided by underlying_price, as a decimal. 0 if none |  |
| **exerciseStyle** | **kotlin.String** | american or european |  |
| **expirationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Contract expiration date |  |
| **model** | **kotlin.String** | Pricing model: binomial |  |
| **strikePrice** | **kotlin.Double** | Contract strike price |  |
| **ticker** | **kotlin.String** | Options contract ticker in Massive format (e.g. O:AMD261121C00220000) |  |
| **volume** | **kotlin.Long** | Contracts traded on date |  |
| **ask** | **kotlin.Double** | NBBO ask 15 minutes before the close |  [optional] |
| **bid** | **kotlin.Double** | NBBO bid 15 minutes before the close |  [optional] |
| **delta** | **kotlin.Double** | Change in option price per $1 move in the underlying |  [optional] |
| **gamma** | **kotlin.Double** | Change in delta per $1 move in the underlying |  [optional] |
| **impliedVolatility** | **kotlin.Double** | Annualized implied volatility solved against option_price, as a decimal (0.48 means 48%). Null when the solver cannot produce a value |  [optional] |
| **openInterest** | **kotlin.Long** | Open interest as published the morning of date, for the prior trading day&#39;s close |  [optional] |
| **optionPrice** | **kotlin.Double** | The option price the solver used: the NBBO midpoint 15 minutes before the close |  [optional] |
| **quoteTimestamp** | **kotlin.Long** | Nanosecond timestamp of the NBBO used |  [optional] |
| **rho** | **kotlin.Double** | Change in option price per 1 percentage point move in the risk-free rate |  [optional] |
| **riskFreeRate** | **kotlin.Double** | Annualized Treasury yield at the option&#39;s maturity, interpolated on the curve published before date, as a decimal |  [optional] |
| **root** | **kotlin.String** | Option root symbol |  [optional] |
| **theta** | **kotlin.Double** | Change in option price per calendar day |  [optional] |
| **underlyingPrice** | **kotlin.Double** | Underlying price used by the solver: the last SIP trade, or the last published index value, at or before 15 minutes before the close |  [optional] |
| **underlyingTicker** | **kotlin.String** | Underlying symbol |  [optional] |
| **underlyingTimestamp** | **kotlin.Long** | Nanosecond timestamp of the underlying price used |  [optional] |
| **vega** | **kotlin.Double** | Change in option price per 1 point move in implied volatility |  [optional] |



