
# ListProducts200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **productCode** | **kotlin.String** | The unique identifier for the product. |  |
| **asOf** | [**java.time.LocalDate**](java.time.LocalDate.md) | The point-in-time date for the given product - e.g. if &#39;as_of&#39; is set to 2024-11-05, then these were the details for this product on that day. |  [optional] |
| **assetClass** | **kotlin.String** | The asset class to which the product belongs. |  [optional] |
| **assetSubClass** | **kotlin.String** | The asset sub-class to which the product belongs. |  [optional] |
| **clearingChannel** | [**inline**](#ClearingChannel) | The clearing channel for this product. Indicates whether the product can be cleared only through exchanges or through both exchanges and over-the-counter. |  [optional] |
| **lastUpdated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time at which this product was last updated. |  [optional] |
| **name** | **kotlin.String** | The full name of the product. |  [optional] |
| **priceQuotation** | **kotlin.String** | The quoted price for this product. |  [optional] |
| **sector** | **kotlin.String** | The sector to which the product belongs. |  [optional] |
| **settlementCurrencyCode** | **kotlin.String** | The currency in which this product settles. |  [optional] |
| **settlementMethod** | **kotlin.String** | The method of settlement for this product (Financially Settled or Deliverable). |  [optional] |
| **settlementType** | **kotlin.String** | The type of settlement for this product. |  [optional] |
| **subSector** | **kotlin.String** | The sub-sector to which the product belongs. |  [optional] |
| **tradeCurrencyCode** | **kotlin.String** | The currency in which this product trades. |  [optional] |
| **tradingVenue** | **kotlin.String** | The trading venue (MIC) for the exchange on which this contract trades. |  [optional] |
| **type** | **kotlin.String** | The type of product, one of \&quot;single\&quot; or \&quot;combo\&quot;. |  [optional] |
| **unitOfMeasure** | **kotlin.String** | The unit of measure for this product. |  [optional] |
| **unitOfMeasureQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The quantity of the unit of measure for this product. |  [optional] |


<a id="ClearingChannel"></a>
## Enum: clearing_channel
| Name | Value |
| ---- | ----- |
| clearingChannel | exchange_only, exchange_and_otc |



