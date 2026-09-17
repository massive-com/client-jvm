
# GetStocksFinancialsV1CashFlowStatements200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cashFromOperatingActivitiesContinuingOperations** | **kotlin.Double** | Cash generated from continuing business operations before discontinued operations. |  [optional] |
| **changeInCashAndEquivalents** | **kotlin.Double** | Net change in cash and cash equivalents during the period, representing the sum of operating, investing, and financing cash flows plus currency effects. |  [optional] |
| **changeInOtherOperatingAssetsAndLiabilitiesNet** | **kotlin.Double** | Net change in working capital components including accounts receivable, inventory, accounts payable, and other operating items. |  [optional] |
| **cik** | **kotlin.String** | The company&#39;s Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company’s CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup). |  [optional] |
| **depreciationDepletionAndAmortization** | **kotlin.Double** | Non-cash charges for the reduction in value of tangible and intangible assets over time. |  [optional] |
| **dividends** | **kotlin.Double** | Cash payments to shareholders in the form of dividends, typically reported as negative values. |  [optional] |
| **effectOfCurrencyExchangeRate** | **kotlin.Double** | Impact of foreign exchange rate changes on cash and cash equivalents denominated in foreign currencies. |  [optional] |
| **filingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date of the most recent SEC filing that included this period&#39;s data. This is not necessarily the date this period was originally filed. Because SEC filings restate comparative data for prior periods, multiple records can share the same filing_date. For example, an annual 10-K reports three years of results, and a 10-Q includes prior period comparatives. To find the original filing date for a specific 10-K or 10-Q, use the SEC EDGAR filings index endpoint (/stocks/filings/vX/index). |  [optional] |
| **fiscalQuarter** | **kotlin.Int** | The fiscal quarter number (1, 2, 3, or 4) for the reporting period. |  [optional] |
| **fiscalYear** | **kotlin.Int** | The fiscal year for the reporting period. |  [optional] |
| **incomeLossFromDiscontinuedOperations** | **kotlin.Double** | After-tax income or loss from business operations that have been discontinued. |  [optional] |
| **longTermDebtIssuancesRepayments** | **kotlin.Double** | Net cash flows from issuing or repaying long-term debt obligations. |  [optional] |
| **netCashFromFinancingActivities** | **kotlin.Double** | Total cash generated or used by financing activities, including debt issuance, debt repayment, dividends, and share transactions. |  [optional] |
| **netCashFromFinancingActivitiesContinuingOperations** | **kotlin.Double** | Cash flows from financing activities of continuing operations before discontinued operations. |  [optional] |
| **netCashFromFinancingActivitiesDiscontinuedOperations** | **kotlin.Double** | Cash flows from financing activities of discontinued business segments. |  [optional] |
| **netCashFromInvestingActivities** | **kotlin.Double** | Total cash generated or used by investing activities, including capital expenditures, acquisitions, and asset sales. |  [optional] |
| **netCashFromInvestingActivitiesContinuingOperations** | **kotlin.Double** | Cash flows from investing activities of continuing operations before discontinued operations. |  [optional] |
| **netCashFromInvestingActivitiesDiscontinuedOperations** | **kotlin.Double** | Cash flows from investing activities of discontinued business segments. |  [optional] |
| **netCashFromOperatingActivities** | **kotlin.Double** | Total cash generated or used by operating activities, representing cash flow from core business operations. |  [optional] |
| **netCashFromOperatingActivitiesDiscontinuedOperations** | **kotlin.Double** | Cash flows from operating activities of discontinued business segments. |  [optional] |
| **netIncome** | **kotlin.Double** | Net income used as the starting point for operating cash flow calculations. |  [optional] |
| **noncontrollingInterests** | **kotlin.Double** | Cash flows related to minority shareholders in consolidated subsidiaries. |  [optional] |
| **otherCashAdjustments** | **kotlin.Double** | Other miscellaneous adjustments to cash flows not classified elsewhere. |  [optional] |
| **otherFinancingActivities** | **kotlin.Double** | Cash flows from financing activities not classified elsewhere, including share repurchases and other equity transactions. |  [optional] |
| **otherInvestingActivities** | **kotlin.Double** | Cash flows from investing activities not classified elsewhere, including acquisitions, divestitures, and investments. |  [optional] |
| **otherOperatingActivities** | **kotlin.Double** | Other adjustments to reconcile net income to operating cash flow not classified elsewhere. |  [optional] |
| **periodEnd** | [**java.time.LocalDate**](java.time.LocalDate.md) | The last date of the reporting period (formatted as YYYY-MM-DD). |  [optional] |
| **purchaseOfPropertyPlantAndEquipment** | **kotlin.Double** | Cash outflows for capital expenditures on fixed assets, typically reported as negative values. |  [optional] |
| **saleOfPropertyPlantAndEquipment** | **kotlin.Double** | Cash inflows from disposing of fixed assets, typically reported as positive values. |  [optional] |
| **shortTermDebtIssuancesRepayments** | **kotlin.Double** | Net cash flows from issuing or repaying short-term debt obligations. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of ticker symbols under which the company is listed. Multiple symbols may indicate different share classes for the same company. |  [optional] |
| **timeframe** | **kotlin.String** | The reporting period type. Possible values include: quarterly, annual, trailing_twelve_months. |  [optional] |



