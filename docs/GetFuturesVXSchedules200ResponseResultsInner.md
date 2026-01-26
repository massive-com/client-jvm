
# GetFuturesVXSchedules200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **event** | **kotlin.String** | The type of session on the given trading date. |  [optional] |
| **productCode** | **kotlin.String** | The product code of the futures contract. |  [optional] |
| **productName** | **kotlin.String** | The name of the futures product to which this schedule applies. |  [optional] |
| **sessionEndDate** | **kotlin.String** | The session end date for the schedules (also known as the trading date). This is the day in CT for which the user wants to retrieve data. If left blank, this value defaults to &#39;today&#39; in Central Time. e.g. If a request is made from Pacific Time on &#39;2025-01-01&#39; at 11:00 pm with no &#39;session_end_date&#39; a default value of &#x60;2025-01-02&#x60; will be used. |  [optional] |
| **timestamp** | **kotlin.String** | The timestamp for the given market event. |  [optional] |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this schedule&#39;s product trades. |  [optional] |



