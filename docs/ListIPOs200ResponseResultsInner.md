
# ListIPOs200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ipoStatus** | [**inline**](#IpoStatus) | The status of the IPO event. IPO events start out as status \&quot;rumor\&quot; or \&quot;pending\&quot;. On listing day, the status changes to \&quot;new\&quot;. After the listing day, the status changes to \&quot;history\&quot;.  The status \&quot;direct_listing_process\&quot; corresponds to a type of offering where, instead of going through all the IPO processes, the company decides to list its shares directly on an exchange, without using an investment bank or other intermediaries. This is called a direct listing, direct placement, or direct public offering (DPO). |  |
| **issuerName** | **kotlin.String** | Name of issuer. |  |
| **lastUpdated** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date when the IPO event was last modified. |  |
| **securityType** | **kotlin.String** | The classification of the stock. For example, \&quot;CS\&quot; stands for Common Stock. |  |
| **ticker** | **kotlin.String** | The ticker symbol of the IPO event. |  |
| **announcedDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date when the IPO event was announced. |  [optional] |
| **currencyCode** | **kotlin.String** | Underlying currency of the security. |  [optional] |
| **finalIssuePrice** | **kotlin.Float** | The price set by the company and its underwriters before the IPO goes live. |  [optional] |
| **highestOfferPrice** | **kotlin.Float** | The highest price within the IPO price range that the company might use to price the shares. |  [optional] |
| **isin** | **kotlin.String** | International Securities Identification Number. This is a unique twelve-digit code that is assigned to every security issuance in the world. |  [optional] |
| **listingDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | First trading date for the newly listed entity. |  [optional] |
| **lotSize** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The minimum number of shares that can be bought or sold in a single transaction. |  [optional] |
| **lowestOfferPrice** | **kotlin.Float** | The lowest price within the IPO price range that the company is willing to offer its shares to investors. |  [optional] |
| **maxSharesOffered** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The upper limit of the shares that the company is offering to investors. |  [optional] |
| **minSharesOffered** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The lower limit of shares that the company is willing to sell in the IPO. |  [optional] |
| **primaryExchange** | **kotlin.String** | Market Identifier Code (MIC) of the primary exchange where the security is listed. The Market Identifier Code (MIC) (ISO 10383) is a unique identification code used to identify securities trading exchanges, regulated and non-regulated trading markets. |  [optional] |
| **securityDescription** | **kotlin.String** | Description of the security. |  [optional] |
| **sharesOutstanding** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The total number of shares that the company has issued and are held by investors. |  [optional] |
| **totalOfferSize** | **kotlin.Float** | The total amount raised by the company for IPO. |  [optional] |
| **usCode** | **kotlin.String** | This is a unique nine-character alphanumeric code that identifies a North American financial security for the purposes of facilitating clearing and settlement of trades. |  [optional] |


<a id="IpoStatus"></a>
## Enum: ipo_status
| Name | Value |
| ---- | ----- |
| ipoStatus | direct_listing_process, history, new, pending, postponed, rumor, withdrawn |



