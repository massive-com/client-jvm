
# GetTmxV1CorporateEvents200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **companyName** | **kotlin.String** | Full name of the company. |  [optional] |
| **date** | **kotlin.String** | Scheduled date of the corporate event, formatted as YYYY-MM-DD. |  [optional] |
| **isin** | **kotlin.String** | Standard international identifier for the company&#39;s common stock. |  [optional] |
| **name** | **kotlin.String** | Name or title of the event. |  [optional] |
| **status** | **kotlin.String** | The current status of the event. Possible values include: approved, canceled, confirmed, historical, pending_approval, postponed, and unconfirmed. |  [optional] |
| **ticker** | **kotlin.String** | The company&#39;s stock symbol. |  [optional] |
| **tmxCompanyId** | **kotlin.Long** | Unique numeric identifier for the company used by TMX. |  [optional] |
| **tmxRecordId** | **kotlin.String** | The unique alphanumeric identifier for the event record used by TMX. |  [optional] |
| **tradingVenue** | **kotlin.String** | MIC (Market Identifier Code) of the exchange where the company&#39;s stock is listed. |  [optional] |
| **type** | **kotlin.String** | The normalized type of corporate event. Possible values include: analyst_day, business_update, capital_markets_day, conference, dividend, earnings_announcement_date, earnings_conference_call, earnings_results_announcement, forum, interim_statement, other_interim_announcement, production_update, research_and_development_day, seminar, shareholder_meeting, sales_update, stock_split, summit, service_level_update, tradeshow, company_travel, and workshop. |  [optional] |
| **url** | **kotlin.String** | URL linking to the primary public source of the event announcement, if available. |  [optional] |



