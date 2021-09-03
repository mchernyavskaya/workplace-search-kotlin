
# ContentSourceUpdateDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | The human readable display name for this Content Source. | 
**isSearchable** | **kotlin.Boolean** | Whether or not this Content Source will be searchable on the search page. | 
**schema** | [**inline**](#kotlin.collections.Map&lt;kotlin.String, &#x60;inner&#x60;Enum&gt;) |  |  [optional]
**display** | [**ContentSourceDisplay**](git/workplace-search-kotlin/openapi-generator/docs/ContentSourceDisplay.md) |  |  [optional]
**indexing** | [**ContentSourceIndexing**](git/workplace-search-kotlin/openapi-generator/docs/ContentSourceIndexing.md) |  |  [optional]
**facets** | [**ContentSourceFacets**](git/workplace-search-kotlin/openapi-generator/docs/ContentSourceFacets.md) |  |  [optional]
**automaticQueryRefinement** | [**ContentSourceAutomaticQueryRefinements**](git/workplace-search-kotlin/openapi-generator/docs/ContentSourceAutomaticQueryRefinements.md) |  |  [optional]


<a name="kotlin.collections.Map<kotlin.String, `inner`Enum>"></a>
## Enum: schema
Name | Value
---- | -----
schema | text, geolocation, number, date



