
# GetConsumerSpendingEuV1MerchantAggregates200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userCountry** | **kotlin.String** | Country of consumer&#39;s residence (ISO codes). Available countries: UK, DE, FR, ES, IT, AT. Values outside these are mapped to &#39;unknown&#39;. |  |
| **channel** | **kotlin.String** | Transaction channel. Possible values: online, offline, bnpl (buy now pay later platforms such as Scala, Klarna, Zilch). |  [optional] |
| **consumerType** | **kotlin.String** | The panel the account is sourced from. Possible values: consumer_credit, consumer_debit, open_banking. |  [optional] |
| **eightDayRollingCategoryAccounts** | **kotlin.Long** | The count of unique consumer accounts active for a given country, consumer type, and that transacted in this merchant category (MCC Group) over the prior 8 days. Used for short-term normalization calculations (e.g., spend per 1000 panelists &#x3D; (total_spend / eight_day_rolling_category_accounts) * 1000). |  [optional] |
| **eightDayRollingTotalAccounts** | **kotlin.Long** | The count of unique consumer accounts active for a given country and consumer type that had any transaction activity (across all categories) over the prior 8 days. Provides a baseline for total panel size. |  [optional] |
| **mccGroup** | **kotlin.String** | Merchant category code group associated with the merchant or payment processor. |  [optional] |
| **merchantIndustry** | **kotlin.String** | Industry name based on GICS/BICS/ICB data classification for the merchant. |  [optional] |
| **merchantTicker** | **kotlin.String** | Stock ticker associated with the merchant (~250 US public companies mapped). Uses Bloomberg tickers and they are point in time. |  [optional] |
| **name** | **kotlin.String** | The merchant or entity name for this aggregate (lowercase). When type is &#39;merchant&#39;, this value can be used as the lookup_name in the merchant-hierarchy endpoint to retrieve full corporate hierarchy details. |  [optional] |
| **parentName** | **kotlin.String** | Merchant&#39;s parent business name (Title Case). Useful for aggregating transactions across subsidiary brands. Also available in the merchant-hierarchy endpoint for full corporate structure. |  [optional] |
| **publishedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date when this data version was published. For original data, this is approximately 7 days after transaction_date. |  [optional] |
| **spendInDistinctAccountKeyCount** | **kotlin.Long** | The count of distinct account keys (unique consumer accounts) with inbound transactions. |  [optional] |
| **spendInSpend** | **kotlin.Double** | The total inbound transaction amount (refunds, returns, credits) in the specified currency for this aggregation. Values are positive, representing money flowing back into consumer accounts. |  [optional] |
| **spendInTransactionCount** | **kotlin.Long** | The count of inbound transactions (refunds, returns). |  [optional] |
| **spendOutDistinctAccountKeyCount** | **kotlin.Long** | The count of distinct account keys (unique consumer accounts) with outbound transactions. |  [optional] |
| **spendOutSpend** | **kotlin.Double** | The total outbound transaction amount (money spent by consumers) in the specified currency for this aggregation. Values are negative, representing money flowing out of consumer accounts. |  [optional] |
| **spendOutTransactionCount** | **kotlin.Long** | The count of outbound transactions (purchases, payments). |  [optional] |
| **totalAccounts** | **kotlin.Long** | The total count of distinct consumer accounts with any transaction activity for this aggregation. |  [optional] |
| **totalSpend** | **kotlin.Double** | Sum of spend_out_spend and spend_in_spend. Typically negative (net outflow). A positive value indicates refunds exceeded new spending for this aggregation. |  [optional] |
| **totalTransactions** | **kotlin.Long** | The total count of all transactions (outbound + inbound). |  [optional] |
| **transactionCurrency** | **kotlin.String** | ISO currency code for the transaction (base card/account currency). Always EUR or GBP in this dataset. All spend amounts are denominated in this currency. |  [optional] |
| **transactionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The calendar date when the consumer transactions occurred. |  [optional] |
| **twentyEightDayRollingCategoryAccounts** | **kotlin.Long** | The count of unique consumer accounts active for a given country, consumer type, and that transacted in this merchant category (MCC Group) over the prior 28 days. Used for longer-term normalization calculations. |  [optional] |
| **twentyEightDayRollingTotalAccounts** | **kotlin.Long** | The count of unique consumer accounts active for a given country and consumer type that had any transaction activity (across all categories) over the prior 28 days. Provides a longer-term baseline for total panel size. |  [optional] |
| **type** | **kotlin.String** | The type of aggregation. Can be &#39;merchant&#39; or &#39;payment_processor&#39;. |  [optional] |



