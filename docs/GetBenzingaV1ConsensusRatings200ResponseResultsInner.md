
# GetBenzingaV1ConsensusRatings200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **buyRatings** | **kotlin.Long** | The count of &#39;Buy&#39; ratings from contributing analysts. |  |
| **holdRatings** | **kotlin.Long** | The count of &#39;Hold&#39; ratings from contributing analysts. |  |
| **priceTargetContributors** | **kotlin.Long** | The number of unique analysts contributing price targets. |  |
| **ratingsContributors** | **kotlin.Long** | The number of unique analysts contributing to the overall ratings consensus. |  |
| **sellRatings** | **kotlin.Long** | The count of &#39;Sell&#39; ratings from contributing analysts. |  |
| **strongBuyRatings** | **kotlin.Long** | The count of &#39;Strong Buy&#39; ratings from contributing analysts. |  |
| **strongSellRatings** | **kotlin.Long** | The count of &#39;Strong Sell&#39; ratings from contributing analysts. |  |
| **consensusPriceTarget** | **kotlin.Double** | The average price target across all analysts, rounded to 2 decimal places. |  [optional] |
| **consensusRating** | **kotlin.String** | The overall rating category determined by the average consensus weight. Possible values: &#39;strong_buy&#39;, &#39;buy&#39;, &#39;hold&#39;, &#39;sell&#39;, &#39;strong_sell&#39;. |  [optional] |
| **consensusRatingValue** | **kotlin.Double** | The numerical average of all consensus weights, rounded to 2 decimal places. Scale ranges from 1 (Strong Sell) to 5 (Strong Buy). |  [optional] |
| **highPriceTarget** | **kotlin.Float** | The highest price target among all contributing analysts. |  [optional] |
| **lowPriceTarget** | **kotlin.Float** | The lowest price target among all contributing analysts. |  [optional] |
| **ticker** | **kotlin.String** | The requested ticker. |  [optional] |



