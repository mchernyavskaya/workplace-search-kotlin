
# SearchApiEndpointResponseMeta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**page** | [**MetaPagePage**](git/workplace-search-kotlin/openapi-generator/docs/MetaPagePage.md) |  | 
**requestId** | **kotlin.String** | Internal request ID for this query instance | 
**warnings** | **kotlin.collections.List&lt;kotlin.String&gt;** | Any warnings that the query generated |  [optional]
**queryRefinements** | [**SearchApiQueryRefinement**](git/workplace-search-kotlin/openapi-generator/docs/SearchApiQueryRefinement.md) |  |  [optional]
**contentSources** | [**kotlin.collections.Map&lt;kotlin.String, SearchApiMetaContentSource&gt;**](git/workplace-search-kotlin/openapi-generator/docs/SearchApiMetaContentSource.md) | content sources used in the search query |  [optional]
**timeout** | **kotlin.Int** | Remote source query timeout value used |  [optional]



