
# GetStocksV1Dividends200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **distributionType** | **kotlin.String** | Classification describing the nature of this dividend&#39;s recurrence pattern: recurring (paid on a regular schedule), special (one-time or commemorative), supplemental (extra beyond the regular schedule), irregular (unpredictable or non-recurring), unknown (cannot be classified from available data) |  |
| **cashAmount** | **kotlin.Double** | Original dividend amount per share in the specified currency |  [optional] |
| **currency** | **kotlin.String** | Currency code for the dividend payment (e.g., USD, CAD) |  [optional] |
| **declarationDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the company officially announced the dividend |  [optional] |
| **exDividendDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the stock begins trading without the dividend value |  [optional] |
| **frequency** | **kotlin.Long** | How many times per year this dividend is expected to occur. A value of 0 means the distribution is non-recurring or irregular (e.g., special, supplemental, or a one-off dividend). Other possible values include 1 (annual), 2 (semi-annual), 3 (trimester), 4 (quarterly), 12 (monthly), 24 (bi-monthly), 26 (bi-weekly), 52 (weekly), and 365 (daily) depending on the issuer&#39;s declared or inferred payout cadence. |  [optional] |
| **historicalAdjustmentFactor** | **kotlin.Double** | Cumulative adjustment factor used to offset dividend effects on historical prices. To adjust a historical price for dividends: for a price on date D, find the first dividend whose &#x60;ex_dividend_date&#x60; is after date D and multiply the price by that dividend&#39;s &#x60;historical_adjustment_factor&#x60;. |  [optional] |
| **id** | **kotlin.String** | Unique identifier for each dividend record |  [optional] |
| **payDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when the dividend payment is distributed to shareholders |  [optional] |
| **recordDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date when shareholders must be on record to be eligible for the dividend payment |  [optional] |
| **splitAdjustedCashAmount** | **kotlin.Double** | Dividend amount adjusted for stock splits that occurred after the dividend was paid, expressed on a current share basis |  [optional] |
| **ticker** | **kotlin.String** | Stock symbol for the company issuing the dividend |  [optional] |



