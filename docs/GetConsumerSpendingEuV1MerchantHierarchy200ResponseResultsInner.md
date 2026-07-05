
# GetConsumerSpendingEuV1MerchantHierarchy200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **listingStatus** | **kotlin.String** | Whether the merchant is a publicly listed company or private. Possible values: public, private. |  |
| **activeFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date this merchant hierarchy mapping became applicable. A value of 0001-01-01 indicates no known start date. Use with active_to to match against transaction_date from the merchant-aggregates endpoint to perform point-in-time queries. |  [optional] |
| **activeTo** | [**java.time.LocalDate**](java.time.LocalDate.md) | Date after which this merchant hierarchy mapping is no longer applicable due to a corporate action. A value of 9999-12-31 indicates the mapping is currently active. |  [optional] |
| **category** | **kotlin.String** | Merchant category assigned by the data provider (Title Case, e.g., &#39;Groceries&#39;, &#39;General Merchandise&#39;, &#39;Travel&#39;). Values are managed by the data provider and may expand over time. |  [optional] |
| **grandparentName** | **kotlin.String** | Merchant&#39;s grandparent business name (Title Case). |  [optional] |
| **grandparentTicker** | **kotlin.String** | Stock ticker of the merchant&#39;s grandparent company. Uses Bloomberg standard. |  [optional] |
| **greatGrandparentName** | **kotlin.String** | Merchant&#39;s great-grandparent business name (Title Case, top-level corporate entity). |  [optional] |
| **greatGrandparentTicker** | **kotlin.String** | Stock ticker of the merchant&#39;s great-grandparent company (top-level corporate entity). Uses Bloomberg standard. |  [optional] |
| **industry** | **kotlin.String** | Industry classification based on GICS/BICS/ICB standards. |  [optional] |
| **industryGroup** | **kotlin.String** | Industry group classification based on GICS/BICS/ICB standards. |  [optional] |
| **lookupName** | **kotlin.String** | Lowercase merchant tag used for joining with the merchant-aggregates endpoint name field (e.g., &#39;asda&#39;, &#39;amazon&#39;). |  [optional] |
| **normalizedName** | **kotlin.String** | Cleaned, standardized merchant display name (Title Case, e.g., &#39;Asda&#39;, &#39;Amazon&#39;). |  [optional] |
| **parentName** | **kotlin.String** | Merchant&#39;s parent business name (Title Case). Useful for aggregating transactions across subsidiary brands. |  [optional] |
| **parentTicker** | **kotlin.String** | Stock ticker of the merchant&#39;s parent company. Uses Bloomberg standard. |  [optional] |
| **sector** | **kotlin.String** | Sector classification based on GICS/BICS/ICB standards. |  [optional] |
| **subIndustry** | **kotlin.String** | Sub-industry classification based on GICS/BICS/ICB standards. |  [optional] |
| **ticker** | **kotlin.String** | Stock ticker associated with the merchant (~250 US public companies mapped). Uses Bloomberg standard. |  [optional] |



