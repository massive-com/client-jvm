
# ListExchanges200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **assetClass** | [**inline**](#AssetClass) | An identifier for a group of similar financial instruments. |  |
| **id** | **kotlin.Int** | A unique identifier used by Massive for this exchange. |  |
| **locale** | [**inline**](#Locale) | An identifier for a geographical location. |  |
| **name** | **kotlin.String** | Name of this exchange. |  |
| **type** | [**inline**](#Type) | Represents the type of exchange. |  |
| **acronym** | **kotlin.String** | A commonly used abbreviation for this exchange. |  [optional] |
| **mic** | **kotlin.String** | The Market Identifier Code of this exchange (see ISO 10383). |  [optional] |
| **operatingMic** | **kotlin.String** | The MIC of the entity that operates this exchange. |  [optional] |
| **participantId** | **kotlin.String** | The ID used by SIP&#39;s to represent this exchange. |  [optional] |
| **url** | **kotlin.String** | A link to this exchange&#39;s website, if one exists. |  [optional] |


<a id="AssetClass"></a>
## Enum: asset_class
| Name | Value |
| ---- | ----- |
| assetClass | stocks, options, crypto, fx, futures |


<a id="Locale"></a>
## Enum: locale
| Name | Value |
| ---- | ----- |
| locale | us, global |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | exchange, TRF, SIP |



