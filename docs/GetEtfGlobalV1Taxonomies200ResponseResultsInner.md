
# GetEtfGlobalV1Taxonomies200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **leverageStyle** | **kotlin.String** | Indicates whether the ETF uses leverage to amplify returns (&#39;leveraged&#39;), or does not use leverage (&#39;unleveraged&#39;). |  |
| **managementClassification** | **kotlin.String** | Defines whether an ETF is considered active under SEC rules, with managers making investment decisions, or passive, tracking an index. |  |
| **productType** | **kotlin.String** | Indicates whether the product is an Exchange-Traded Note (&#39;etn&#39;) or an Exchange-Traded Fund (&#39;etf&#39;). |  |
| **assetClass** | **kotlin.String** | The primary type of assets held by the ETF, such as equities, bonds, commodities, or other securities. |  [optional] |
| **category** | **kotlin.String** | The broad investment category that describes the ETF&#39;s investment focus and strategy. |  [optional] |
| **compositeTicker** | **kotlin.String** | The stock ticker symbol used to identify this ETF product on exchanges. |  [optional] |
| **country** | **kotlin.String** | The specific country focus of the ETF, if applicable. |  [optional] |
| **creditQualityRating** | **kotlin.String** | Credit quality rating for fixed income ETFs. |  [optional] |
| **description** | **kotlin.String** | The official name and description of the ETF product. |  [optional] |
| **developmentClass** | **kotlin.String** | The economic development classification of the markets the ETF invests in, such as developed, emerging, or frontier markets. |  [optional] |
| **duration** | **kotlin.String** | The duration characteristics for fixed income ETFs. |  [optional] |
| **effectiveDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. |  [optional] |
| **esg** | **kotlin.String** | Environmental, Social, and Governance characteristics. |  [optional] |
| **exposureMechanism** | **kotlin.String** | The mechanism used to achieve exposure. |  [optional] |
| **factor** | **kotlin.String** | Factor exposure characteristics of the ETF. |  [optional] |
| **focus** | **kotlin.String** | The specific investment focus or exposure that the ETF provides, such as sector, geography, or investment style. |  [optional] |
| **hedgeReset** | **kotlin.String** | The frequency of hedge reset, if applicable. |  [optional] |
| **holdingsDisclosureFrequency** | **kotlin.String** | How frequently holdings are disclosed. |  [optional] |
| **inceptionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date when this ETF was first launched and became available for trading. |  [optional] |
| **isin** | **kotlin.String** | The International Securities Identification Number, a global standard code for uniquely identifying this ETF worldwide. |  [optional] |
| **issuer** | **kotlin.String** | The financial institution or fund company that created and sponsors this ETF. |  [optional] |
| **leverageReset** | **kotlin.String** | The frequency of leverage reset, if applicable. |  [optional] |
| **leveredAmount** | **kotlin.Double** | The leverage multiplier applied by the ETF, where positive numbers indicate leveraged exposure and negative numbers indicate inverse exposure. |  [optional] |
| **managementStyle** | **kotlin.String** | Indicates whether an ETF is managed actively or passively, and the level of transparency or replication method used. |  [optional] |
| **maturity** | **kotlin.String** | The maturity profile for fixed income ETFs. |  [optional] |
| **objective** | **kotlin.String** | The primary investment objective of the ETF. |  [optional] |
| **primaryBenchmark** | **kotlin.String** | The main index or benchmark that this ETF is designed to track or replicate. |  [optional] |
| **processedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when ETF Global received and processed the data. |  [optional] |
| **rebalanceFrequency** | **kotlin.String** | How frequently the ETF rebalances its holdings. |  [optional] |
| **reconstitutionFrequency** | **kotlin.String** | How frequently the index is reconstituted. |  [optional] |
| **region** | **kotlin.String** | The geographic region or area of the world where the ETF concentrates its investments. |  [optional] |
| **secondaryObjective** | **kotlin.String** | The secondary investment objective, if applicable. |  [optional] |
| **selectionMethodology** | **kotlin.String** | The methodology used to select securities. |  [optional] |
| **selectionUniverse** | **kotlin.String** | The universe from which securities are selected. |  [optional] |
| **strategicFocus** | **kotlin.String** | The strategic investment focus of the ETF. |  [optional] |
| **targetedFocus** | **kotlin.String** | The targeted investment focus of the ETF. |  [optional] |
| **taxClassification** | **kotlin.String** | The tax structure of the ETF, determining whether investors receive 1099 or K1 tax forms (RIC, Partnership, or UIT). |  [optional] |
| **usCode** | **kotlin.String** | A unique identifier code that identifies this ETF in US markets. |  [optional] |
| **weightingMethodology** | **kotlin.String** | The methodology used to weight holdings. |  [optional] |



