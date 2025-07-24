
# ListNews200ResponseResultsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **articleUrl** | **kotlin.String** | A link to the news article. |  |
| **author** | **kotlin.String** | The article&#39;s author. |  |
| **id** | **kotlin.String** | Unique identifier for the article. |  |
| **publishedUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The UTC date and time when the article was published, formatted in RFC3339 standard (e.g. YYYY-MM-DDTHH:MM:SSZ). |  |
| **publisher** | [**ListNews200ResponseResultsInnerPublisher**](ListNews200ResponseResultsInnerPublisher.md) |  |  |
| **tickers** | **kotlin.collections.List&lt;kotlin.String&gt;** | The ticker symbols associated with the article. |  |
| **title** | **kotlin.String** | The title of the news article. |  |
| **ampUrl** | **kotlin.String** | The mobile friendly Accelerated Mobile Page (AMP) URL. |  [optional] |
| **description** | **kotlin.String** | A description of the article. |  [optional] |
| **imageUrl** | **kotlin.String** | The article&#39;s image URL. |  [optional] |
| **insights** | [**kotlin.collections.List&lt;ListNews200ResponseResultsInnerInsightsInner&gt;**](ListNews200ResponseResultsInnerInsightsInner.md) | The insights related to the article. |  [optional] |
| **keywords** | **kotlin.collections.List&lt;kotlin.String&gt;** | The keywords associated with the article (which will vary depending on the publishing source). |  [optional] |



