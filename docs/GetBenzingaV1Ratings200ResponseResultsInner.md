
# GetBenzingaV1Ratings200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adjustedPriceTarget** | **kotlin.Double** | The current price target adjusted for stock splits and dividends. |  [optional] |
| **analyst** | **kotlin.String** | The name of the individual analyst who issued the rating. |  [optional] |
| **benzingaAnalystId** | **kotlin.String** | The identifer used by Benzinga for this analyst. |  [optional] |
| **benzingaCalendarUrl** | **kotlin.String** | A link to the Benzinga calendar page for this ticker |  [optional] |
| **benzingaFirmId** | **kotlin.String** | The identifer used by Benzinga for this firm. |  [optional] |
| **benzingaId** | **kotlin.String** | The identifer used by Benzinga for this record. |  [optional] |
| **benzingaNewsUrl** | **kotlin.String** | A link to the Benzinga articles page for this ticker |  [optional] |
| **companyName** | **kotlin.String** | The name of the company being rated. |  [optional] |
| **currency** | **kotlin.String** | The ISO 4217 currency code in which the price target is denominated. |  [optional] |
| **date** | **kotlin.String** | The calendar date (formatted as YYYY-MM-DD) when the rating was issued. |  [optional] |
| **firm** | **kotlin.String** | The name of the research firm or investment bank issuing the rating. |  [optional] |
| **importance** | **kotlin.Long** | A subjective indicator of the importance of the earnings event, on a scale from 0 (lowest) to 5 (highest). |  [optional] |
| **lastUpdated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp (formatted as an ISO 8601 timestamp) when the rating was last updated in the system. |  [optional] |
| **notes** | **kotlin.String** | Additional context or commentary. |  [optional] |
| **previousAdjustedPriceTarget** | **kotlin.Double** | The previous price target adjusted for stock splits and dividends. |  [optional] |
| **previousPriceTarget** | **kotlin.Double** | The previous price target set by the analyst. |  [optional] |
| **previousRating** | **kotlin.String** | The previous rating set by the analyst. |  [optional] |
| **pricePercentChange** | **kotlin.Double** | The percentage change in price target if price target and previous price target exists |  [optional] |
| **priceTarget** | **kotlin.Double** | The current price target set by the analyst. |  [optional] |
| **priceTargetAction** | **kotlin.String** | The description of the directional change in price target. Possible values include: raises, lowers, maintains, announces, sets. |  [optional] |
| **rating** | **kotlin.String** | The current rating set by the analyst. |  [optional] |
| **ratingAction** | **kotlin.String** | The description of the change in rating from the firm&#39;s last rating. Possible values include: downgrades, maintains, reinstates, reiterates, upgrades, assumes, initiates_coverage_on, terminates_coverage_on, removes, suspends, firm_dissolved. |  [optional] |
| **ticker** | **kotlin.String** | The stock symbol of the company being rated. |  [optional] |
| **time** | **kotlin.String** | The time (formatted as 24-hour HH:MM:SS UTC) when the rating was issued. |  [optional] |



