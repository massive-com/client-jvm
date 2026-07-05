
# GetFuturesV1TradesTicker200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **channel** | **kotlin.Int** | The CME multicast channel this event was sourced from. |  |
| **reportSequence** | **kotlin.Long** | The reporting sequence number. |  |
| **sequenceNumber** | **kotlin.Long** | The unique sequence number assigned to this trade. |  |
| **ticker** | **kotlin.String** | The futures contract identifier, including the base symbol and contract expiration (e.g., GCJ5 for the April 2025 gold contract). |  |
| **timestamp** | **kotlin.Long** | The time when the trade was generated at the exchange to nanosecond precision. |  |
| **price** | **kotlin.Double** | The price of the trade. This is the actual dollar value per whole contract of this trade. A trade of 100 contracts with a price of $2.00 would be worth a total dollar value of $200.00. |  [optional] |
| **sessionEndDate** | **kotlin.String** | Also known as the trading date, the date of the end of the trading session, in YYYY-MM-DD format. |  [optional] |
| **propertySize** | **kotlin.Long** | The total number of contracts exchanged between buyers and sellers on a given trade. |  [optional] |



