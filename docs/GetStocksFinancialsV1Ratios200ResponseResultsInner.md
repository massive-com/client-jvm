
# GetStocksFinancialsV1Ratios200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | **kotlin.String** | Date for which the ratios are calculated, representing the trading date with available price data. |  |
| **price** | **kotlin.Double** | Stock price used in ratio calculations, typically the closing price for the given date. |  |
| **ticker** | **kotlin.String** | Stock ticker symbol for the company. |  |
| **averageVolume** | **kotlin.Double** | Average trading volume over the last 30 trading days, providing context for liquidity. |  [optional] |
| **cash** | **kotlin.Double** | Cash ratio, calculated as cash and cash equivalents divided by current liabilities, measuring the most liquid form of liquidity coverage. |  [optional] |
| **cik** | **kotlin.String** | Central Index Key (CIK) number assigned by the SEC to identify the company. |  [optional] |
| **current** | **kotlin.Double** | Current ratio, calculated as total current assets divided by total current liabilities, measuring short-term liquidity. |  [optional] |
| **debtToEquity** | **kotlin.Double** | Debt-to-equity ratio, calculated as total debt (current debt plus long-term debt) divided by total shareholders&#39; equity, measuring financial leverage. |  [optional] |
| **dividendYield** | **kotlin.Double** | Dividend yield, calculated as annual dividends per share divided by stock price, measuring the income return on investment. |  [optional] |
| **earningsPerShare** | **kotlin.Double** | Earnings per share, calculated as net income available to common shareholders divided by weighted shares outstanding. |  [optional] |
| **enterpriseValue** | **kotlin.Double** | Enterprise value, calculated as market capitalization plus total debt minus cash and cash equivalents, representing total company value. |  [optional] |
| **evToEbitda** | **kotlin.Double** | Enterprise value to EBITDA ratio, calculated as enterprise value divided by EBITDA, measuring company valuation relative to earnings before interest, taxes, depreciation, and amortization. |  [optional] |
| **evToSales** | **kotlin.Double** | Enterprise value to sales ratio, calculated as enterprise value divided by revenue, measuring company valuation relative to sales. |  [optional] |
| **freeCashFlow** | **kotlin.Double** | Free cash flow, calculated as operating cash flow minus capital expenditures (purchase of property, plant, and equipment). |  [optional] |
| **marketCap** | **kotlin.Double** | Market capitalization, calculated as stock price multiplied by total shares outstanding. |  [optional] |
| **priceToBook** | **kotlin.Double** | Price-to-book ratio, calculated as stock price divided by book value per share, comparing market value to book value. |  [optional] |
| **priceToCashFlow** | **kotlin.Double** | Price-to-cash-flow ratio, calculated as stock price divided by operating cash flow per share. Only calculated when operating cash flow per share is positive. |  [optional] |
| **priceToEarnings** | **kotlin.Double** | Price-to-earnings ratio, calculated as stock price divided by earnings per share. Only calculated when earnings per share is positive. |  [optional] |
| **priceToFreeCashFlow** | **kotlin.Double** | Price-to-free-cash-flow ratio, calculated as stock price divided by free cash flow per share. Only calculated when free cash flow per share is positive. |  [optional] |
| **priceToSales** | **kotlin.Double** | Price-to-sales ratio, calculated as stock price divided by revenue per share, measuring valuation relative to sales. |  [optional] |
| **quick** | **kotlin.Double** | Quick ratio (acid-test ratio), calculated as (current assets minus inventories) divided by current liabilities, measuring immediate liquidity. |  [optional] |
| **returnOnAssets** | **kotlin.Double** | Return on assets ratio, calculated as net income divided by total assets, measuring how efficiently a company uses its assets to generate profit. |  [optional] |
| **returnOnEquity** | **kotlin.Double** | Return on equity ratio, calculated as net income divided by total shareholders&#39; equity, measuring profitability relative to shareholders&#39; equity. |  [optional] |



