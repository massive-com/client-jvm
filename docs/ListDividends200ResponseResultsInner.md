
# ListDividends200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cashAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The cash amount of the dividend per share owned. |  |
| **dividendType** | [**inline**](#DividendType) | The type of dividend. Dividends that have been paid and/or are expected to be paid on consistent schedules are denoted as CD. Special Cash dividends that have been paid that are infrequent or unusual, and/or can not be expected to occur in the future are denoted as SC. Long-Term and Short-Term capital gain distributions are denoted as LT and ST, respectively. |  |
| **exDividendDate** | **kotlin.String** | The date that the stock first trades without the dividend, determined by the exchange. |  |
| **frequency** | **kotlin.Int** | The number of times per year the dividend is paid out. Possible values are 0 (one-time), 1 (annually), 2 (bi-annually), 4 (quarterly), 12 (monthly), 24 (bi-monthly), and 52 (weekly). |  |
| **id** | **kotlin.String** | The unique identifier of the dividend. |  |
| **ticker** | **kotlin.String** | The ticker symbol of the dividend. |  |
| **currency** | **kotlin.String** | The currency in which the dividend is paid. |  [optional] |
| **declarationDate** | **kotlin.String** | The date that the dividend was announced. |  [optional] |
| **payDate** | **kotlin.String** | The date that the dividend is paid out. |  [optional] |
| **recordDate** | **kotlin.String** | The date that the stock must be held to receive the dividend, set by the company. |  [optional] |


<a id="DividendType"></a>
## Enum: dividend_type
| Name | Value |
| ---- | ----- |
| dividendType | CD, SC, LT, ST |



