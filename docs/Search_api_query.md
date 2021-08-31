# SearchApiQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | [**kotlin.String**](.md) | A string or number used to find related documents |  [optional]
**automaticQueryRefinement** | [**kotlin.Boolean**](.md) | Set to false to not automatically refine the query by keywords |  [optional]
**page** | [**SearchApiQueryPage**](SearchApiQueryPage.md) |  |  [optional]
**searchFields** | [**kotlin.collections.Map&lt;kotlin.String, SearchApiQuerySearchFields&gt;**](SearchApiQuerySearchFields.md) | Restrict the fulltext search to only specific fields |  [optional]
**resultFields** | [**kotlin.collections.Map&lt;kotlin.String, SearchApiQueryResultFields&gt;**](SearchApiQueryResultFields.md) | Restrict the result fields for each item to the specified fields |  [optional]
**filters** | [**FilterClausesOrFilter**](FilterClausesOrFilter.md) |  |  [optional]
**sort** | [**OneOfsearchApiQuerySort**](OneOfsearchApiQuerySort.md) |  |  [optional]
**facets** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](.md) |  |  [optional]
**boosts** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](.md) |  |  [optional]
**sourceType** | [**kotlin.String**](.md) | Optional parameter to search standard, remote only, or all available sources |  [optional]
**timeout** | [**kotlin.Int**](.md) | Optional timeout in ms for searching remote sources |  [optional]
**contentSources** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | Optional list of content source ids to only return results from |  [optional]
