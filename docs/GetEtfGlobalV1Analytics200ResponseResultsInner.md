
# GetEtfGlobalV1Analytics200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **compositeTicker** | **kotlin.String** | The stock ticker symbol used to identify this ETF product on exchanges. |  [optional] |
| **effectiveDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when the information was accurate or valid; some issuers, such as Vanguard, release their data on a delay, so the effective_date can be several weeks earlier than the processed_date. |  [optional] |
| **processedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date showing when ETF Global received and processed the data. |  [optional] |
| **quantCompositeBehavioral** | **kotlin.Double** | Behavioral analysis score measuring investor psychology and market behavior patterns. |  [optional] |
| **quantCompositeFundamental** | **kotlin.Double** | Overall fundamental analysis score combining P/E, P/CF, P/B, and dividend yield metrics. |  [optional] |
| **quantCompositeGlobal** | **kotlin.Double** | Overall global theme score combining sector and country analysis for macro investment views. |  [optional] |
| **quantCompositeQuality** | **kotlin.Double** | Overall quality assessment score combining liquidity, diversification, and issuing firm factors. |  [optional] |
| **quantCompositeSentiment** | **kotlin.Double** | Overall market sentiment score combining put/call ratios, short interest, and implied volatility. |  [optional] |
| **quantCompositeTechnical** | **kotlin.Double** | Combined technical analysis score aggregating short, intermediate, and long-term technical factors. |  [optional] |
| **quantFundamentalDiv** | **kotlin.Double** | Fundamental analysis score based on dividend yields of the ETF&#39;s underlying securities. |  [optional] |
| **quantFundamentalPb** | **kotlin.Double** | Fundamental analysis score based on price-to-book value ratios of the ETF&#39;s holdings. |  [optional] |
| **quantFundamentalPcf** | **kotlin.Double** | Fundamental analysis score based on price-to-cash-flow ratios of the ETF&#39;s underlying assets. |  [optional] |
| **quantFundamentalPe** | **kotlin.Double** | Fundamental analysis score based on price-to-earnings ratios of the ETF&#39;s underlying holdings. |  [optional] |
| **quantGlobalCountry** | **kotlin.Double** | Quantitative score analyzing global country themes and country-specific market factors. |  [optional] |
| **quantGlobalSector** | **kotlin.Double** | Quantitative score analyzing global sector themes and sector-specific performance factors. |  [optional] |
| **quantGrade** | **kotlin.String** | Letter grade summarizing the ETF&#39;s overall quantitative assessment, where A &#x3D; 71-100, B &#x3D; 56-70, etc. |  [optional] |
| **quantQualityDiversification** | **kotlin.Double** | Quality assessment score evaluating the diversification benefits and risk distribution of the ETF. |  [optional] |
| **quantQualityFirm** | **kotlin.Double** | Quality assessment score evaluating the reputation and capabilities of the ETF&#39;s issuing firm. |  [optional] |
| **quantQualityLiquidity** | **kotlin.Double** | Quality assessment score measuring the liquidity characteristics and trading ease of the ETF. |  [optional] |
| **quantSentimentIv** | **kotlin.Double** | Market sentiment score derived from implied volatility levels in options markets. |  [optional] |
| **quantSentimentPc** | **kotlin.Double** | Market sentiment score derived from put/call option ratios and options activity. |  [optional] |
| **quantSentimentSi** | **kotlin.Double** | Market sentiment score based on short interest levels and short selling activity. |  [optional] |
| **quantTechnicalIt** | **kotlin.Double** | Intermediate-term technical analysis score evaluating medium-term price trends. |  [optional] |
| **quantTechnicalLt** | **kotlin.Double** | Long-term technical analysis score assessing extended price trend patterns. |  [optional] |
| **quantTechnicalSt** | **kotlin.Double** | Short-term technical analysis score based on recent price movements and trading patterns. |  [optional] |
| **quantTotalScore** | **kotlin.Double** | ETF Global&#39;s comprehensive quantitative analysis score combining all quantitative factors. |  [optional] |
| **rewardScore** | **kotlin.Double** | ETF Global&#39;s proprietary Green Diamond score measuring the potential reward and return prospects of the ETF. |  [optional] |
| **riskCountry** | **kotlin.Double** | A component score assessing country-specific risks based on the ETF&#39;s geographic exposure. |  [optional] |
| **riskDeviation** | **kotlin.Double** | A component score measuring how much the ETF deviates from expected performance. |  [optional] |
| **riskEfficiency** | **kotlin.Double** | A component score assessing the operational efficiency and cost-effectiveness of the ETF. |  [optional] |
| **riskLiquidity** | **kotlin.Double** | A component score measuring the liquidity risk and ease of trading the ETF. |  [optional] |
| **riskStructure** | **kotlin.Double** | A component score evaluating risks related to the ETF&#39;s structural design and mechanics. |  [optional] |
| **riskTotalScore** | **kotlin.Double** | ETF Global&#39;s proprietary Red Diamond overall risk assessment score for the ETF. |  [optional] |
| **riskVolatility** | **kotlin.Double** | A component score measuring the volatility risk of the ETF&#39;s price movements. |  [optional] |



