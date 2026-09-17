
# GetFedV1FundingConditions200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | Calendar date of the observation (YYYY-MM-DD). |  [optional] |
| **effectiveFedFundsRate** | **kotlin.Float** | Federal Funds Effective Rate as a percentage (DFF series from FRED); published daily. |  [optional] |
| **effectiveFedFundsVolume** | **kotlin.Float** | Total transaction volume underlying the effective federal funds rate calculation, in billions of U.S. dollars; reported on business days. |  [optional] |
| **fedFundsTargetLower** | **kotlin.Float** | Lower bound of the federal funds target range as a percentage (DFEDTARL series from FRED); posted every calendar day. |  [optional] |
| **fedFundsTargetUpper** | **kotlin.Float** | Upper bound of the federal funds target range as a percentage (DFEDTARU series from FRED); posted every calendar day. |  [optional] |
| **fedOvernightRepoTreasuryAmount** | **kotlin.Float** | NY Fed overnight repo operation amount against Treasury collateral, in billions of U.S. dollars (RPONTSYD series from FRED); reported on business days. |  [optional] |
| **fedOvernightReverseRepoTreasuryAmount** | **kotlin.Float** | NY Fed overnight reverse repo operation amount against Treasury collateral, in billions of U.S. dollars (RRPONTSYD series from FRED); reported on business days. |  [optional] |
| **financialCommercialPaper90dRate** | **kotlin.Float** | 90-day AA financial commercial paper interest rate as a percentage, quoted on a discount basis (DCPF3M series from FRED); reported on business days, with occasional source-level gaps. |  [optional] |
| **interestOnReserveBalances** | **kotlin.Float** | Interest rate paid on reserve balances as a percentage (IORB series from FRED); posted every calendar day. |  [optional] |
| **nonfinancialCommercialPaper90dRate** | **kotlin.Float** | 90-day AA nonfinancial commercial paper interest rate as a percentage, quoted on a discount basis (DCPN3M series from FRED); reported on business days, with occasional source-level gaps. |  [optional] |
| **obfr25thPercentile** | **kotlin.Float** | 25th percentile transaction rate of the OBFR distribution as a percentage; posted on business days. |  [optional] |
| **obfr75thPercentile** | **kotlin.Float** | 75th percentile transaction rate of the OBFR distribution as a percentage; posted on business days. |  [optional] |
| **obfrVolume** | **kotlin.Float** | Total transaction volume underlying the OBFR calculation, in billions of U.S. dollars; reported on business days. |  [optional] |
| **overnightBankFundingRate** | **kotlin.Float** | Overnight Bank Funding Rate (OBFR) as a percentage; published by the Federal Reserve Bank of New York and reported on business days. |  [optional] |
| **securedOvernightFinancingRate** | **kotlin.Float** | Secured Overnight Financing Rate (SOFR) as a percentage; published by the Federal Reserve Bank of New York and reported on business days. |  [optional] |
| **sofr25thPercentile** | **kotlin.Float** | 25th percentile transaction rate of the SOFR distribution as a percentage; posted on business days. |  [optional] |
| **sofr75thPercentile** | **kotlin.Float** | 75th percentile transaction rate of the SOFR distribution as a percentage; posted on business days. |  [optional] |
| **sofrVolume** | **kotlin.Float** | Total transaction volume underlying the SOFR calculation, in billions of U.S. dollars; reported on business days. |  [optional] |
| **tgcr25thPercentile** | **kotlin.Float** | 25th percentile transaction rate of the TGCR distribution as a percentage; posted on business days. |  [optional] |
| **tgcr75thPercentile** | **kotlin.Float** | 75th percentile transaction rate of the TGCR distribution as a percentage; posted on business days. |  [optional] |
| **triPartyGeneralCollateralRate** | **kotlin.Float** | Tri-Party General Collateral Rate (TGCR) as a percentage; published by the Federal Reserve Bank of New York as a repo reference rate and reported on business days. |  [optional] |
| **triPartyGeneralCollateralVolume** | **kotlin.Float** | Total transaction volume underlying the TGCR calculation, in billions of U.S. dollars; reported on business days. |  [optional] |



