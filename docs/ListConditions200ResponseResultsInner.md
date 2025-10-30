
# ListConditions200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assetClass** | [**inline**](#AssetClass) | An identifier for a group of similar financial instruments. |  |
| **dataTypes** | [**inline**](#kotlin.collections.List&lt;DataTypes&gt;) | Data types that this condition applies to. |  |
| **id** | **kotlin.Int** | An identifier used by Massive.com for this condition. Unique per data type. |  |
| **name** | **kotlin.String** | The name of this condition. |  |
| **sipMapping** | [**ListConditions200ResponseResultsInnerSipMapping**](ListConditions200ResponseResultsInnerSipMapping.md) |  |  |
| **type** | [**inline**](#Type) | An identifier for a collection of related conditions. |  |
| **abbreviation** | **kotlin.String** | A commonly-used abbreviation for this condition. |  [optional] |
| **description** | **kotlin.String** | A short description of the semantics of this condition. |  [optional] |
| **exchange** | **kotlin.Int** | If present, mapping this condition from a Massive.com code to a SIP symbol depends on this attribute. In other words, data with this condition attached comes exclusively from the given exchange. |  [optional] |
| **legacy** | **kotlin.Boolean** | If true, this condition is from an old version of the SIPs&#39; specs and no longer is used. Other conditions may or may not reuse the same symbol as this one. |  [optional] |
| **updateRules** | [**ListConditions200ResponseResultsInnerUpdateRules**](ListConditions200ResponseResultsInnerUpdateRules.md) |  |  [optional] |


<a id="AssetClass"></a>
## Enum: asset_class
| Name | Value |
| ---- | ----- |
| assetClass | stocks, options, crypto, fx |


<a id="kotlin.collections.List<DataTypes>"></a>
## Enum: data_types
| Name | Value |
| ---- | ----- |
| dataTypes | trade, bbo, nbbo |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | sale_condition, quote_condition, sip_generated_flag, financial_status_indicator, short_sale_restriction_indicator, settlement_condition, market_condition, trade_thru_exempt |



