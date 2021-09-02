
# SearchApiQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **kotlin.String** | A string or number used to find related documents |  [optional]
**automaticQueryRefinement** | **kotlin.Boolean** | Set to false to not automatically refine the query by keywords |  [optional]
**page** | [**SearchApiQueryPage**](SearchApiQueryPage.md) |  |  [optional]
**searchFields** | [**kotlin.collections.Map&lt;kotlin.String, SearchApiQuerySearchFields&gt;**](SearchApiQuerySearchFields.md) | Restrict the fulltext search to only specific fields |  [optional]
**resultFields** | [**kotlin.collections.Map&lt;kotlin.String, SearchApiQueryResultFields&gt;**](SearchApiQueryResultFields.md) | Restrict the result fields for each item to the specified fields |  [optional]
**filters** | [**FilterClausesOrFilter**](FilterClausesOrFilter.md) |  |  [optional]
**sort** | [**OneOfLessThanMapCommaArrayGreaterThan**](OneOfLessThanMapCommaArrayGreaterThan.md) |  |  [optional]
**facets** | [**kotlin.collections.Map&lt;kotlin.String, OneOfLessThanArrayCommaFacetItemGreaterThan&gt;**](OneOfLessThanArrayCommaFacetItemGreaterThan.md) |  |  [optional]
**boosts** | [**kotlin.collections.Map&lt;kotlin.String, OneOfLessThanArrayCommaBoostItemGreaterThan&gt;**](OneOfLessThanArrayCommaBoostItemGreaterThan.md) |  |  [optional]
**sourceType** | [**inline**](#SourceTypeEnum) | Optional parameter to search standard, remote only, or all available sources |  [optional]
**timeout** | **kotlin.Int** | Optional timeout in ms for searching remote sources |  [optional]


<a name="SourceTypeEnum"></a>
## Enum: source_type
Name | Value
---- | -----
sourceType | standard, remote, all



