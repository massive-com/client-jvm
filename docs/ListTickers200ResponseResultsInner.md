
# ListTickers200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **locale** | [**inline**](#Locale) | The locale of the asset. |  |
| **market** | [**inline**](#Market) | The market type of the asset. |  |
| **name** | **kotlin.String** | The name of the asset. For stocks/equities this will be the companies registered name. For crypto/fx this will be the name of the currency or coin pair. |  |
| **ticker** | **kotlin.String** | The exchange symbol that this item is traded under. |  |
| **active** | **kotlin.Boolean** | Whether or not the asset is actively traded. False means the asset has been delisted. |  [optional] |
| **cik** | **kotlin.String** | The CIK number for this ticker. Find more information [here](https://en.wikipedia.org/wiki/Central_Index_Key). |  [optional] |
| **compositeFigi** | **kotlin.String** | The composite OpenFIGI number for this ticker. Find more information [here](https://www.openfigi.com/about/figi) |  [optional] |
| **currencyName** | **kotlin.String** | The name of the currency that this asset is traded with. |  [optional] |
| **delistedUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The last date that the asset was traded. |  [optional] |
| **lastUpdatedUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The information is accurate up to this time. |  [optional] |
| **primaryExchange** | **kotlin.String** | The ISO code of the primary listing exchange for this asset. |  [optional] |
| **shareClassFigi** | **kotlin.String** | The share Class OpenFIGI number for this ticker. Find more information [here](https://www.openfigi.com/about/figi) |  [optional] |
| **type** | **kotlin.String** | The type of the asset. Find the types that we support via our [Ticker Types API](https://massive.com/docs/stocks/get_v3_reference_tickers_types). |  [optional] |


<a id="Locale"></a>
## Enum: locale
| Name | Value |
| ---- | ----- |
| locale | us, global |


<a id="Market"></a>
## Enum: market
| Name | Value |
| ---- | ----- |
| market | stocks, crypto, fx, otc, indices |



