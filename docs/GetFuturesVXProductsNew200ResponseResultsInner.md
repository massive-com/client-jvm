
# GetFuturesVXProductsNew200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**java.time.LocalDate**](java.time.LocalDate.md) | A date string in the format YYYY-MM-DD. This parameter will return point-in-time information about products for the specified day. |  |
| **assetClass** | **kotlin.String** | The asset class to which the product belongs. |  [optional] |
| **assetSubClass** | **kotlin.String** | The asset sub-class to which the product belongs. |  [optional] |
| **displayFactor** | **kotlin.Long** |  |  [optional] |
| **groupCode** | **kotlin.String** |  |  [optional] |
| **lastUpdated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time at which this product was last updated. |  [optional] |
| **name** | **kotlin.String** | The full name of the product. |  [optional] |
| **priceQuotation** | **kotlin.String** | The quoted price for this product. |  [optional] |
| **productCode** | **kotlin.String** | The identifier for the product. |  [optional] |
| **sector** | **kotlin.String** | The sector to which the product belongs. |  [optional] |
| **settlementCurrencyCode** | **kotlin.String** | The currency in which this product settles. |  [optional] |
| **settlementMethod** | **kotlin.String** | The method of settlement for this product (Financially Settled or Deliverable). |  [optional] |
| **settlementType** | **kotlin.String** | The type of settlement for this product. |  [optional] |
| **subSector** | **kotlin.String** | The sub-sector to which the product belongs. |  [optional] |
| **tradeCurrencyCode** | **kotlin.String** | The currency in which this product&#39;s contracts trade. |  [optional] |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this product&#39;s contracts trade. |  [optional] |
| **type** | **kotlin.String** | The type of product, one of &#39;single&#39; or &#39;combo&#39;. |  [optional] |
| **unitOfMeasure** | **kotlin.String** | The unit of measure for this product. |  [optional] |
| **unitOfMeasureQty** | **kotlin.Double** | The quantity of the unit of measure for this product. |  [optional] |



