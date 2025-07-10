
# ListFinancials200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cik** | **kotlin.String** | The CIK number for the company. |  |
| **companyName** | **kotlin.String** | The company name. |  |
| **financials** | [**ListFinancials200ResponseResultsInnerFinancials**](ListFinancials200ResponseResultsInnerFinancials.md) |  |  |
| **fiscalPeriod** | **kotlin.String** | Fiscal period of the report according to the company (Q1, Q2, Q3, Q4, or FY). |  |
| **timeframe** | **kotlin.String** | The timeframe of the report (quarterly, annual or ttm). |  |
| **acceptanceDatetime** | **kotlin.String** | The datetime (EST timezone) the filing was accepted by EDGAR in YYYYMMDDHHMMSS format. |  [optional] |
| **endDate** | **kotlin.String** | The end date of the period that these financials cover in YYYYMMDD format. |  [optional] |
| **filingDate** | **kotlin.String** | The date that the SEC filing which these financials were derived from was made available. Note that this is not necessarily the date when this information became public, as some companies may publish a press release before filing with the SEC. |  [optional] |
| **fiscalYear** | **kotlin.String** | Fiscal year of the report according to the company. |  [optional] |
| **sic** | **kotlin.String** | The Standard Industrial Classification (SIC) code for the company. |  [optional] |
| **sourceFilingFileUrl** | **kotlin.String** | The URL of the specific XBRL instance document within the SEC filing that these financials were derived from. |  [optional] |
| **sourceFilingUrl** | **kotlin.String** | The URL of the SEC filing that these financials were derived from. |  [optional] |
| **startDate** | **kotlin.String** | The start date of the period that these financials cover in YYYYMMDD format. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | The list of ticker symbols for the company. |  [optional] |



