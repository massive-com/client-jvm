
# GetStocksV1ShortVolume200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | **kotlin.String** | The date of trade activity reported in the format YYYY-MM-DD |  |
| **adfShortVolume** | **kotlin.Long** | Short volume reported via the Alternative Display Facility (ADF), excluding exempt volume. |  [optional] |
| **adfShortVolumeExempt** | **kotlin.Long** | Short volume reported via ADF that was marked as exempt. |  [optional] |
| **exemptVolume** | **kotlin.Long** | Portion of short volume that was marked as exempt from regulation SHO. |  [optional] |
| **nasdaqCarteretShortVolume** | **kotlin.Long** | Short volume reported from Nasdaq&#39;s Carteret facility, excluding exempt volume. |  [optional] |
| **nasdaqCarteretShortVolumeExempt** | **kotlin.Long** | Short volume from Nasdaq Carteret that was marked as exempt. |  [optional] |
| **nasdaqChicagoShortVolume** | **kotlin.Long** | Short volume reported from Nasdaq&#39;s Chicago facility, excluding exempt volume. |  [optional] |
| **nasdaqChicagoShortVolumeExempt** | **kotlin.Long** | Short volume from Nasdaq Chicago that was marked as exempt. |  [optional] |
| **nonExemptVolume** | **kotlin.Long** | Portion of short volume that was not exempt from regulation SHO (i.e., short_volume - exempt_volume). |  [optional] |
| **nyseShortVolume** | **kotlin.Long** | Short volume reported from NYSE facilities, excluding exempt volume. |  [optional] |
| **nyseShortVolumeExempt** | **kotlin.Long** | Short volume from NYSE facilities that was marked as exempt. |  [optional] |
| **shortVolume** | **kotlin.Long** | Total number of shares sold short across all venues for the ticker on the given date. |  [optional] |
| **shortVolumeRatio** | **kotlin.Float** | The percentage of total volume that was sold short. Calculated as (short_volume / total_volume) * 100. |  [optional] |
| **ticker** | **kotlin.String** | The primary ticker symbol for the stock. |  [optional] |
| **totalVolume** | **kotlin.Long** | Total reported volume across all venues for the ticker on the given date. |  [optional] |



