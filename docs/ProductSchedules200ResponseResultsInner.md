
# ProductSchedules200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **productCode** | **kotlin.String** | The product code for the futures product to which this schedule applies. |  |
| **schedule** | [**kotlin.collections.List&lt;ProductSchedules200ResponseResultsInnerScheduleInner&gt;**](ProductSchedules200ResponseResultsInnerScheduleInner.md) |  |  |
| **sessionEndDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date on which the schedule&#39;s trading day ended (sometimes referred to as trading date) formatted as &#x60;YYYY-MM-DD&#x60;. Note that although there is no time component on this attribute, the day refers to Central Time. |  |
| **productName** | **kotlin.String** | The name of the futures product to which this schedule applies. |  [optional] |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this schedule&#39;s product trades. |  [optional] |



