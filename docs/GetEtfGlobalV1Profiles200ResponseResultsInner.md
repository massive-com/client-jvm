
# GetEtfGlobalV1Profiles200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **leverageStyle** | **kotlin.String** | Indicates whether the ETF uses leverage to amplify returns (&#39;leveraged&#39;), or does not use leverage (&#39;unleveraged&#39;). |  |
| **managementClassification** | **kotlin.String** | Defines whether an ETF is considered active under SEC rules, with managers making investment decisions, or passive, tracking an index. |  |
| **productType** | **kotlin.String** | Indicates whether the product is an Exchange-Traded Note (&#39;etn&#39;) or an Exchange-Traded Fund (&#39;etf&#39;). |  |
| **administrator** | **kotlin.String** | The administrator of the ETF. |  [optional] |
| **advisor** | **kotlin.String** | The investment advisor of the ETF. |  [optional] |
| **assetClass** | **kotlin.String** | The primary type of assets held by the ETF, such as equities, bonds, commodities, or other securities. |  [optional] |
| **aum** | **kotlin.Double** | The total assets under management, representing the current market value of all assets held by the ETF. |  [optional] |
| **avgDailyTradingVolume** | **kotlin.Double** | The average number of shares traded daily over the past month, indicating liquidity and investor interest. |  [optional] |
| **bidAskSpread** | **kotlin.Double** | The average intraday bid-ask spread as a percentage, calculated by dividing the spread by the lowest ask price sampled during the day. |  [optional] |
| **callVolume** | **kotlin.Double** | Call options volume. |  [optional] |
| **category** | **kotlin.String** | The broad investment category that describes the ETF&#39;s investment focus and strategy. |  [optional] |
| **compositeTicker** | **kotlin.String** | The stock ticker symbol used to identify this ETF product on exchanges. |  [optional] |
| **couponExposure** | [**kotlin.collections.List&lt;GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner&gt;**](GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner.md) | Coupon exposure breakdown for fixed income ETFs. |  [optional] |
| **creationFee** | **kotlin.Double** | The fee for creating new shares of the ETF. |  [optional] |
| **creationUnitSize** | **kotlin.Double** | The size of creation units for the ETF. |  [optional] |
| **currencyExposure** | [**kotlin.collections.List&lt;GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner&gt;**](GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner.md) | Currency exposure breakdown of the ETF. |  [optional] |
| **custodian** | **kotlin.String** | The custodian of the ETF assets. |  [optional] |
| **description** | **kotlin.String** | The official name and description of the ETF product. |  [optional] |
| **developmentClass** | **kotlin.String** | The economic development classification of the markets the ETF invests in, such as developed, emerging, or frontier markets. |  [optional] |
| **discountPremium** | **kotlin.Double** | Discount or premium to net asset value. |  [optional] |
| **distributionFrequency** | **kotlin.String** | How frequently the ETF makes distributions. |  [optional] |
| **distributor** | **kotlin.String** | The distributor of the ETF. |  [optional] |
| **effectiveDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. |  [optional] |
| **feeWaivers** | **kotlin.Double** | Any fee waivers applied to the ETF. |  [optional] |
| **fiscalYearEnd** | **kotlin.String** | The fiscal year end date for the ETF. |  [optional] |
| **focus** | **kotlin.String** | The specific investment focus or exposure that the ETF provides, such as sector, geography, or investment style. |  [optional] |
| **futuresCommissionMerchant** | **kotlin.String** | The futures commission merchant, if applicable. |  [optional] |
| **geographicExposure** | [**kotlin.collections.List&lt;GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner&gt;**](GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner.md) | Geographic exposure breakdown of the ETF. |  [optional] |
| **inceptionDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date when this ETF was first launched and became available for trading. |  [optional] |
| **industryExposure** | [**kotlin.collections.List&lt;GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner&gt;**](GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner.md) | Industry exposure breakdown of the ETF. |  [optional] |
| **industryGroupExposure** | [**kotlin.collections.List&lt;GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner&gt;**](GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner.md) | Industry group exposure breakdown of the ETF. |  [optional] |
| **issuer** | **kotlin.String** | The financial institution or fund company that created and sponsors this ETF. |  [optional] |
| **leadMarketMaker** | **kotlin.String** | The lead market maker for the ETF. |  [optional] |
| **leveredAmount** | **kotlin.Double** | The leverage multiplier applied by the ETF, where positive numbers indicate leveraged exposure and negative numbers indicate inverse exposure. |  [optional] |
| **listingExchange** | **kotlin.String** | The primary exchange where the ETF is listed. |  [optional] |
| **managementFee** | **kotlin.Double** | The annual fee charged by the fund manager for managing the ETF&#39;s portfolio and operations. |  [optional] |
| **maturityExposure** | [**kotlin.collections.List&lt;GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner&gt;**](GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner.md) | Maturity exposure breakdown for fixed income ETFs. |  [optional] |
| **netExpenses** | **kotlin.Double** | Net expenses after waivers. |  [optional] |
| **numHoldings** | **kotlin.Double** | Number of holdings in the ETF. |  [optional] |
| **optionsAvailable** | **kotlin.Int** | Availability of options on the ETF. |  [optional] |
| **optionsVolume** | **kotlin.Double** | Options trading volume for the ETF. |  [optional] |
| **otherExpenses** | **kotlin.Double** | Other expenses charged by the ETF. |  [optional] |
| **portfolioManager** | **kotlin.String** | The portfolio manager of the ETF. |  [optional] |
| **primaryBenchmark** | **kotlin.String** | The main index or benchmark that this ETF is designed to track or replicate. |  [optional] |
| **processedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when ETF Global received and processed the data. |  [optional] |
| **putCallRatio** | **kotlin.Double** | Put/call ratio for options on the ETF. |  [optional] |
| **putVolume** | **kotlin.Double** | Put options volume. |  [optional] |
| **region** | **kotlin.String** | The geographic region or area of the world where the ETF concentrates its investments. |  [optional] |
| **sectorExposure** | [**kotlin.collections.List&lt;GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner&gt;**](GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner.md) | Sector exposure breakdown of the ETF. |  [optional] |
| **shortInterest** | **kotlin.Double** | Short interest in the ETF. |  [optional] |
| **subadvisor** | **kotlin.String** | The subadvisor of the ETF, if applicable. |  [optional] |
| **subindustryExposure** | [**kotlin.collections.List&lt;GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner&gt;**](GetEtfGlobalV1Profiles200ResponseResultsInnerCouponExposureInner.md) | Sub-industry exposure breakdown of the ETF. |  [optional] |
| **taxClassification** | **kotlin.String** | The tax structure of the ETF, determining whether investors receive 1099 or K1 tax forms (RIC, Partnership, or UIT). |  [optional] |
| **totalExpenses** | **kotlin.Double** | The total annual expense ratio of the ETF, including all fees and costs passed on to investors. |  [optional] |
| **transferAgent** | **kotlin.String** | The transfer agent for the ETF. |  [optional] |
| **trustee** | **kotlin.String** | The trustee of the ETF. |  [optional] |



