
# Company

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **active** | **kotlin.Boolean** | Indicates if the security is actively listed.  If false, this means the company is no longer listed and cannot be traded. |  [optional] |
| **bloomberg** | **kotlin.String** | The Bloomberg guid for the symbol. |  [optional] |
| **ceo** | **kotlin.String** | The name of the company&#39;s current CEO. |  [optional] |
| **cik** | **kotlin.String** | The official CIK guid used for SEC database/filings. |  [optional] |
| **country** | **kotlin.String** | The country in which the company is registered. |  [optional] |
| **description** | **kotlin.String** | A description of the company and what they do/offer. |  [optional] |
| **employees** | **kotlin.Int** | The approximate number of employees for the company. |  [optional] |
| **exchange** | **kotlin.String** | The symbol&#39;s primary exchange. |  [optional] |
| **exchangeSymbol** | **kotlin.String** | The exchange code (id) of the symbol&#39;s primary exchange. |  [optional] |
| **figi** | **kotlin.String** | The OpenFigi project guid for the symbol. (&lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://openfigi.com/\&quot;&gt;https://openfigi.com/&lt;/a&gt;) |  [optional] |
| **hqAddress** | **kotlin.String** | The street address for the company&#39;s headquarters. |  [optional] |
| **hqCountry** | **kotlin.String** | The country in which the company&#39;s headquarters is located. |  [optional] |
| **hqState** | **kotlin.String** | The state in which the company&#39;s headquarters is located. |  [optional] |
| **industry** | **kotlin.String** | The industry in which the company operates. |  [optional] |
| **lei** | **kotlin.String** | The Legal Entity Identifier (LEI) guid for the symbol. (&lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://en.wikipedia.org/wiki/Legal_Entity_Identifier\&quot;&gt;https://en.wikipedia.org/wiki/Legal_Entity_Identifier&lt;/a&gt;) |  [optional] |
| **listdate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The date that the symbol was listed on the exchange. |  [optional] |
| **logo** | **kotlin.String** | The URL of the entity&#39;s logo. |  [optional] |
| **marketcap** | **kotlin.Int** | The current market cap for the company. |  [optional] |
| **name** | **kotlin.String** | The name of the company/entity. |  [optional] |
| **phone** | **kotlin.String** | The phone number for the company. This is usually a corporate contact number. |  [optional] |
| **sector** | **kotlin.String** | The sector of the indsutry in which the symbol operates. |  [optional] |
| **sic** | **kotlin.Int** | Standard Industrial Classification (SIC) id for the symbol. (&lt;a rel&#x3D;\&quot;nofollow\&quot; target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://en.wikipedia.org/wiki/Standard_Industrial_Classification\&quot;&gt;https://en.wikipedia.org/wiki/Legal_Entity_Identifier&lt;/a&gt;) |  [optional] |
| **similar** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of ticker symbols for similar companies. |  [optional] |
| **symbol** | **kotlin.String** | The exchange symbol that this item is traded under. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **type** | **kotlin.String** | The type or class of the security.  (&lt;a alt&#x3D;\&quot;Full List of Ticker Types\&quot; href&#x3D;\&quot;https://massive.com/docs/rest/stocks/tickers/ticker-types\&quot;&gt;Full List of Ticker Types&lt;/a&gt;) |  [optional] |
| **updated** | [**java.time.LocalDate**](java.time.LocalDate.md) | The last time this company record was updated. |  [optional] |
| **url** | **kotlin.String** | The URL of the company&#39;s website |  [optional] |



