
# ContentSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The Content Source Identifier. | 
**serviceType** | **kotlin.String** | The Content Source&#39;s Service Type. For example, for Google Drive the Service Type is \&quot;google_drive\&quot;. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date/time at which this Content Source was originally created. | 
**lastUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date/time at which this Content Source was last updated. | 
**isRemote** | **kotlin.Boolean** | Whether or not this Content Source is a \&quot;remote\&quot; content source. See https://www.elastic.co/guide/en/workplace-search/current/workplace-search-content-sources.html#remote | 
**details** | **kotlin.collections.List&lt;kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;&gt;** | A list of key/value metadata for the Content Source and the account which authenticated/connected it. | 
**groups** | [**kotlin.collections.List&lt;SearchGroup&gt;**](git/workplace-search-kotlin/openapi-generator/docs/SearchGroup.md) | A list of Workplace Search Group names and IDs which have access to this Content Source. | 
**name** | **kotlin.String** | The human readable display name of this Content Source. | 
**context** | [**inline**](#ContextEnum) | Can be either \&quot;organization\&quot; or \&quot;private.\&quot; This specifies whether this Content Source is available to groups of users, or a single user. | 
**isSearchable** | **kotlin.Boolean** | Whether or not this Content Source can currently be searched over on the search page. | 
**schema** | [**inline**](#kotlin.collections.Map&lt;kotlin.String, &#x60;inner&#x60;Enum&gt;) |  |  [optional]
**display** | [**ContentSourceDisplay**](git/workplace-search-kotlin/openapi-generator/docs/ContentSourceDisplay.md) |  |  [optional]
**indexing** | [**ContentSourceIndexingResponse**](git/workplace-search-kotlin/openapi-generator/docs/ContentSourceIndexingResponse.md) |  |  [optional]
**facets** | [**ContentSourceFacets**](git/workplace-search-kotlin/openapi-generator/docs/ContentSourceFacets.md) |  |  [optional]
**automaticQueryRefinement** | [**ContentSourceAutomaticQueryRefinements**](git/workplace-search-kotlin/openapi-generator/docs/ContentSourceAutomaticQueryRefinements.md) |  |  [optional]
**documentCount** | **kotlin.Int** | How many documents are currently indexed in this Content Source. Note, this field is not applicable to Remote Content Sources. |  [optional]
**lastIndexedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date/time when documents were last indexed into this Content Source. This may be \&quot;null\&quot; if documents have not yet been indexed. Note, this field is not applicable to Remote Content Sources. |  [optional]


<a name="ContextEnum"></a>
## Enum: context
Name | Value
---- | -----
context | organization, private


<a name="kotlin.collections.Map<kotlin.String, `inner`Enum>"></a>
## Enum: schema
Name | Value
---- | -----
schema | text, geolocation, number, date



