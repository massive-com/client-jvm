
# GetStocksFinancialsV1BalanceSheets200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeframe** | **kotlin.String** | The reporting period type. Possible values include: quarterly, annual. |  |
| **accountsPayable** | **kotlin.Double** | Amounts owed to suppliers and vendors for goods and services purchased on credit. |  [optional] |
| **accruedAndOtherCurrentLiabilities** | **kotlin.Double** | Current liabilities not classified elsewhere, including accrued expenses, taxes payable, and other obligations due within one year. |  [optional] |
| **accumulatedOtherComprehensiveIncome** | **kotlin.Double** | Cumulative gains and losses that bypass the income statement, including foreign currency translation adjustments and unrealized gains/losses on securities. |  [optional] |
| **additionalPaidInCapital** | **kotlin.Double** | Amount received from shareholders in excess of the par or stated value of shares issued. |  [optional] |
| **cashAndEquivalents** | **kotlin.Double** | Cash on hand and short-term, highly liquid investments that are readily convertible to known amounts of cash. |  [optional] |
| **cik** | **kotlin.String** | The company&#39;s Central Index Key (CIK), a unique identifier assigned by the U.S. Securities and Exchange Commission (SEC). You can look up a company&#39;s CIK using the [SEC CIK Lookup tool](https://www.sec.gov/search-filings/cik-lookup). |  [optional] |
| **commitmentsAndContingencies** | **kotlin.Double** | Disclosed amount related to contractual commitments and potential liabilities that may arise from uncertain future events. |  [optional] |
| **commonStock** | **kotlin.Double** | Par or stated value of common shares outstanding representing basic ownership in the company. |  [optional] |
| **debtCurrent** | **kotlin.Double** | Short-term borrowings and the current portion of long-term debt due within one year. |  [optional] |
| **deferredRevenueCurrent** | **kotlin.Double** | Customer payments received in advance for goods or services to be delivered within one year. |  [optional] |
| **filingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date when the financial statement was filed with the SEC. |  [optional] |
| **fiscalQuarter** | **kotlin.Double** | The fiscal quarter number (1, 2, 3, or 4) for the reporting period. |  [optional] |
| **fiscalYear** | **kotlin.Double** | The fiscal year for the reporting period. |  [optional] |
| **goodwill** | **kotlin.Double** | Intangible asset representing the excess of purchase price over fair value of net assets acquired in business combinations. |  [optional] |
| **intangibleAssetsNet** | **kotlin.Double** | Intangible assets other than goodwill, including patents, trademarks, and customer relationships, net of accumulated amortization. |  [optional] |
| **inventories** | **kotlin.Double** | Raw materials, work-in-process, and finished goods held for sale in the ordinary course of business. |  [optional] |
| **longTermDebtAndCapitalLeaseObligations** | **kotlin.Double** | Long-term borrowings and capital lease obligations with maturities greater than one year. |  [optional] |
| **noncontrollingInterest** | **kotlin.Double** | Equity in consolidated subsidiaries not owned by the parent company, representing minority shareholders&#39; ownership. |  [optional] |
| **otherAssets** | **kotlin.Double** | Non-current assets not classified elsewhere, including long-term investments, deferred tax assets, and other long-term assets. |  [optional] |
| **otherCurrentAssets** | **kotlin.Double** | Current assets not classified elsewhere, including prepaid expenses, taxes receivable, and other assets expected to be converted to cash within one year. |  [optional] |
| **otherEquity** | **kotlin.Double** | Equity components not classified elsewhere in shareholders&#39; equity. |  [optional] |
| **otherNoncurrentLiabilities** | **kotlin.Double** | Non-current liabilities not classified elsewhere, including deferred tax liabilities, pension obligations, and other long-term liabilities. |  [optional] |
| **periodEnd** | [**java.time.LocalDate**](java.time.LocalDate.md) | The last date of the reporting period, representing the specific point in time when the balance sheet snapshot was taken. |  [optional] |
| **preferredStock** | **kotlin.Double** | Par or stated value of preferred shares outstanding with preferential rights over common stock. |  [optional] |
| **propertyPlantEquipmentNet** | **kotlin.Double** | Tangible fixed assets used in operations, reported net of accumulated depreciation. |  [optional] |
| **receivables** | **kotlin.Double** | Amounts owed to the company by customers and other parties, primarily accounts receivable, net of allowances for doubtful accounts. |  [optional] |
| **retainedEarningsDeficit** | **kotlin.Double** | Cumulative net income earned by the company less dividends paid to shareholders since inception. |  [optional] |
| **shortTermInvestments** | **kotlin.Double** | Marketable securities and other investments with maturities of one year or less that are not classified as cash equivalents. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of ticker symbols under which the company is listed. Multiple symbols may indicate different share classes for the same company. |  [optional] |
| **totalAssets** | **kotlin.Double** | Sum of all current and non-current assets representing everything the company owns or controls. |  [optional] |
| **totalCurrentAssets** | **kotlin.Double** | Sum of all current assets expected to be converted to cash, sold, or consumed within one year. |  [optional] |
| **totalCurrentLiabilities** | **kotlin.Double** | Sum of all liabilities expected to be settled within one year. |  [optional] |
| **totalEquity** | **kotlin.Double** | Sum of all equity components representing shareholders&#39; total ownership interest in the company. |  [optional] |
| **totalEquityAttributableToParent** | **kotlin.Double** | Total shareholders&#39; equity attributable to the parent company, excluding noncontrolling interests. |  [optional] |
| **totalLiabilities** | **kotlin.Double** | Sum of all current and non-current liabilities representing everything the company owes. |  [optional] |
| **totalLiabilitiesAndEquity** | **kotlin.Double** | Sum of total liabilities and total equity, which should equal total assets per the fundamental accounting equation. |  [optional] |
| **treasuryStock** | **kotlin.Double** | Cost of the company&#39;s own shares that have been repurchased and are held in treasury, typically reported as a negative value. |  [optional] |



