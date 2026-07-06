
# GetFuturesV1Schedules200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **event** | **kotlin.String** | The type of session on the given trading date. |  [optional] |
| **productCode** | **kotlin.String** | The product code of the futures contract. |  [optional] |
| **productName** | **kotlin.String** | The name of the futures product to which this schedule applies. |  [optional] |
| **sessionEndDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The session end date for the schedules (also known as the trading date). This field is optional and can be used to filter results by a specific session end date. If left blank, schedules for all dates will be returned. Note that trading sessions end at 5 PM Central Time, so a session ending at 5 PM CT on January 1st would have a session_end_date of 2025-01-01. |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp for the given market event. |  [optional] |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this schedule&#39;s product trades. |  [optional] |



