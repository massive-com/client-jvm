
# GetFuturesV1ProductsNew200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about products for the specified day. |  |
| **assetClass** | **kotlin.String** | The asset class to which the product belongs. |  [optional] |
| **assetSubClass** | **kotlin.String** | The asset sub-class to which the product belongs. |  [optional] |
| **clearingSymbol** | **kotlin.String** | The clearing symbol assigned to this product by the exchange&#39;s clearing house. |  [optional] |
| **clearingVenue** | **kotlin.String** | The trading venue (MIC) for the clearing house that clears this product&#39;s contracts. |  [optional] |
| **lastUpdated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time at which this product was last updated. |  [optional] |
| **name** | **kotlin.String** | The full name of the product. |  [optional] |
| **priceQuotation** | **kotlin.String** | The quoted price for this product. |  [optional] |
| **productCode** | **kotlin.String** | The identifier for the product. |  [optional] |
| **providerId** | **kotlin.String** | A unique identifier for the product assigned by the data provider. Can be used to distinguish products that share a product code. |  [optional] |
| **sector** | **kotlin.String** | The sector to which the product belongs. |  [optional] |
| **settlementCurrencyCode** | **kotlin.String** | The currency in which this product settles. |  [optional] |
| **settlementMethod** | **kotlin.String** | The method of settlement for this product (Financially Settled or Deliverable). |  [optional] |
| **settlementType** | **kotlin.String** | The type of settlement for this product. |  [optional] |
| **strategyType** | **kotlin.String** | The strategy type for combo products (e.g. spread, strip, pack). Null for single products. |  [optional] |
| **subSector** | **kotlin.String** | The sub-sector to which the product belongs. |  [optional] |
| **tradeCurrencyCode** | **kotlin.String** | The currency in which this product&#39;s contracts trade. |  [optional] |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this product&#39;s contracts trade. |  [optional] |
| **type** | **kotlin.String** | The type of product, one of &#39;single&#39; or &#39;combo&#39;. Leaving this filter blank will query for both &#39;single&#39; and &#39;combo&#39; types. |  [optional] |
| **unitOfMeasure** | **kotlin.String** | The unit of measure for this product. |  [optional] |
| **unitOfMeasureQty** | **kotlin.Float** | The quantity of the unit of measure for this product. |  [optional] |



