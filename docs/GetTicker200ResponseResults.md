
# GetTicker200ResponseResults

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **active** | **kotlin.Boolean** | Whether or not the asset is actively traded. False means the asset has been delisted. |  |
| **currencyName** | **kotlin.String** | The name of the currency that this asset is traded with. |  |
| **locale** | [**inline**](#Locale) | The locale of the asset. |  |
| **market** | [**inline**](#Market) | The market type of the asset. |  |
| **name** | **kotlin.String** | The name of the asset. For stocks/equities this will be the companies registered name. For crypto/fx this will be the name of the currency or coin pair. |  |
| **ticker** | **kotlin.String** | The exchange symbol that this item is traded under. |  |
| **address** | [**GetTicker200ResponseResultsAddress**](GetTicker200ResponseResultsAddress.md) |  |  [optional] |
| **branding** | [**GetTicker200ResponseResultsBranding**](GetTicker200ResponseResultsBranding.md) |  |  [optional] |
| **cik** | **kotlin.String** | The CIK number for this ticker. Find more information [here](https://en.wikipedia.org/wiki/Central_Index_Key). |  [optional] |
| **compositeFigi** | **kotlin.String** | The composite OpenFIGI number for this ticker. Find more information [here](https://www.openfigi.com/about/figi) |  [optional] |
| **delistedUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The last date that the asset was traded. |  [optional] |
| **description** | **kotlin.String** | A description of the company and what they do/offer. |  [optional] |
| **homepageUrl** | **kotlin.String** | The URL of the company&#39;s website homepage. |  [optional] |
| **listDate** | **kotlin.String** | The date that the symbol was first publicly listed in the format YYYY-MM-DD. |  [optional] |
| **marketCap** | **kotlin.Double** | The most recent close price of the ticker multiplied by weighted outstanding shares. |  [optional] |
| **phoneNumber** | **kotlin.String** | The phone number for the company behind this ticker. |  [optional] |
| **primaryExchange** | **kotlin.String** | The ISO code of the primary listing exchange for this asset. |  [optional] |
| **roundLot** | **kotlin.Double** | Round lot size of this security. |  [optional] |
| **shareClassFigi** | **kotlin.String** | The share Class OpenFIGI number for this ticker. Find more information [here](https://www.openfigi.com/about/figi) |  [optional] |
| **shareClassSharesOutstanding** | **kotlin.Double** | The recorded number of outstanding shares for this particular share class. |  [optional] |
| **sicCode** | **kotlin.String** | The standard industrial classification code for this ticker.  For a list of SIC Codes, see the SEC&#39;s &lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.sec.gov/info/edgar/siccodes.htm\&quot;&gt;SIC Code List&lt;/a&gt;. |  [optional] |
| **sicDescription** | **kotlin.String** | A description of this ticker&#39;s SIC code. |  [optional] |
| **tickerRoot** | **kotlin.String** | The root of a specified ticker. For example, the root of BRK.A is BRK. |  [optional] |
| **tickerSuffix** | **kotlin.String** | The suffix of a specified ticker. For example, the suffix of BRK.A is A. |  [optional] |
| **totalEmployees** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The approximate number of employees for the company. |  [optional] |
| **type** | **kotlin.String** | The type of the asset. Find the types that we support via our [Ticker Types API](https://massive.com/docs/rest/stocks/tickers/ticker-types). |  [optional] |
| **weightedSharesOutstanding** | **kotlin.Double** | The shares outstanding calculated assuming all shares of other share classes are converted to this share class. |  [optional] |


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



