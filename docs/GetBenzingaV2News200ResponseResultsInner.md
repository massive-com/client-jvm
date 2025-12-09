
# GetBenzingaV2News200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **author** | **kotlin.String** | The name of the journalist or entity that authored the news article. |  |
| **benzingaId** | **kotlin.Long** | The identifer used by Benzinga for this record. |  |
| **lastUpdated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp (formatted as an ISO 8601 timestamp) when the news article was last updated in the system. |  |
| **published** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp (formatted as an ISO 8601 timestamp) when the news article was originally published. |  |
| **title** | **kotlin.String** | The headline of the news article. |  |
| **url** | **kotlin.String** | The direct link to the source of the news article. |  |
| **body** | **kotlin.String** | The full text content of the news article. |  [optional] |
| **channels** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of categories or topics that the article belongs to (e.g., &#39;News&#39;, &#39;Price Target&#39;). |  [optional] |
| **images** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of images associated with the article. |  [optional] |
| **tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of tags that describe the themes or content of the article. |  [optional] |
| **teaser** | **kotlin.String** | A short summary or lead-in to the news article&#39;s content. |  [optional] |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of stock or crypto tickers mentioned in the article. |  [optional] |



