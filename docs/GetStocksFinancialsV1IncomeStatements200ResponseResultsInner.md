
# GetStocksFinancialsV1IncomeStatements200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **basicEarningsPerShare** | **kotlin.Double** | Earnings per share calculated using the weighted average number of basic shares outstanding. For TTM records, recalculated as TTM net income divided by average basic shares outstanding over the four quarters. |  [optional] |
| **basicSharesOutstanding** | **kotlin.Double** | Weighted average number of common shares outstanding during the period, used in basic EPS calculation. For TTM records, represents the average over the four most recent quarters. |  [optional] |
| **cik** | **kotlin.String** | The company&#39;s Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company’s CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup). |  [optional] |
| **consolidatedNetIncomeLoss** | **kotlin.Double** | Total net income or loss for the consolidated entity including all subsidiaries. |  [optional] |
| **costOfRevenue** | **kotlin.Double** | Direct costs attributable to the production of goods or services sold, also known as cost of goods sold (COGS). |  [optional] |
| **depreciationDepletionAmortization** | **kotlin.Double** | Non-cash expenses representing the allocation of asset costs over their useful lives. |  [optional] |
| **dilutedEarningsPerShare** | **kotlin.Double** | Earnings per share calculated using diluted shares outstanding, including the effect of potentially dilutive securities. For TTM records, recalculated as TTM net income divided by average diluted shares outstanding over the four quarters. |  [optional] |
| **dilutedSharesOutstanding** | **kotlin.Double** | Weighted average number of shares outstanding including the dilutive effect of stock options, warrants, and convertible securities. For TTM records, represents the average over the four most recent quarters. |  [optional] |
| **discontinuedOperations** | **kotlin.Double** | After-tax results from business segments that have been or will be disposed of. |  [optional] |
| **ebitda** | **kotlin.Double** | Earnings before interest, taxes, depreciation, and amortization, a measure of operating performance. |  [optional] |
| **equityInAffiliates** | **kotlin.Double** | The company&#39;s share of income or losses from equity method investments in affiliated companies. |  [optional] |
| **extraordinaryItems** | **kotlin.Double** | Unusual and infrequent gains or losses that are both unusual in nature and infrequent in occurrence. |  [optional] |
| **filingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date when the financial statement was filed with the SEC. |  [optional] |
| **fiscalQuarter** | **kotlin.Double** | The fiscal quarter number (1, 2, 3, or 4) for the reporting period. |  [optional] |
| **fiscalYear** | **kotlin.Double** | The fiscal year for the reporting period. |  [optional] |
| **grossProfit** | **kotlin.Double** | Revenue minus cost of revenue, representing profit before operating expenses. |  [optional] |
| **incomeBeforeIncomeTaxes** | **kotlin.Double** | Pre-tax income calculated as operating income plus total other income/expense. |  [optional] |
| **incomeTaxes** | **kotlin.Double** | Income tax expense or benefit for the period. |  [optional] |
| **interestExpense** | **kotlin.Double** | Cost of borrowed funds, including interest on debt and other financing obligations. |  [optional] |
| **interestIncome** | **kotlin.Double** | Income earned from interest-bearing investments and cash equivalents. |  [optional] |
| **netIncomeLossAttributableCommonShareholders** | **kotlin.Double** | Net income or loss available to common shareholders after preferred dividends and noncontrolling interests. |  [optional] |
| **noncontrollingInterest** | **kotlin.Double** | The portion of net income attributable to minority shareholders in consolidated subsidiaries. |  [optional] |
| **operatingIncome** | **kotlin.Double** | Income from operations calculated as gross profit minus total operating expenses, excluding non-operating items. |  [optional] |
| **otherIncomeExpense** | **kotlin.Double** | Non-operating income and expenses not related to the company&#39;s core business operations. |  [optional] |
| **otherOperatingExpenses** | **kotlin.Double** | Operating expenses not classified in the main expense categories. |  [optional] |
| **periodEnd** | [**java.time.LocalDate**](java.time.LocalDate.md) | The last date of the reporting period (formatted as YYYY-MM-DD). |  [optional] |
| **preferredStockDividendsDeclared** | **kotlin.Double** | Dividends declared on preferred stock during the period. |  [optional] |
| **researchDevelopment** | **kotlin.Double** | Expenses incurred for research and development activities to create new products or improve existing ones. |  [optional] |
| **revenue** | **kotlin.Double** | Total revenue or net sales for the period, representing the company&#39;s gross income from operations. |  [optional] |
| **sellingGeneralAdministrative** | **kotlin.Double** | Expenses related to selling products and general administrative costs not directly tied to production. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of ticker symbols under which the company is listed. Multiple symbols may indicate different share classes for the same company. |  [optional] |
| **timeframe** | **kotlin.String** | The reporting period type. Possible values include: quarterly, annual, trailing_twelve_months. |  [optional] |
| **totalOperatingExpenses** | **kotlin.Double** | Sum of all operating expenses including cost of revenue, SG&amp;A, R&amp;D, depreciation, and other operating expenses. |  [optional] |
| **totalOtherIncomeExpense** | **kotlin.Double** | Net total of all non-operating income and expenses including interest income, interest expense, and other items. |  [optional] |



