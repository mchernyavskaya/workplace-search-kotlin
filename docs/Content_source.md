# ContentSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.String**](.md) | The Content Source Identifier. | 
**serviceType** | [**kotlin.String**](.md) | The Content Source&#x27;s Service Type. For example, for Google Drive the Service Type is \&quot;google_drive\&quot;. | 
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date/time at which this Content Source was originally created. | 
**lastUpdatedAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date/time at which this Content Source was last updated. | 
**isRemote** | [**kotlin.Boolean**](.md) | Whether or not this Content Source is a \&quot;remote\&quot; content source. See https://www.elastic.co/guide/en/workplace-search/current/workplace-search-content-sources.html#remote | 
**details** | [**kotlin.Array&lt;ContentSourceDetail&gt;**](ContentSourceDetail.md) | A list of key/value metadata for the Content Source and the account which authenticated/connected it. | 
**groups** | [**kotlin.Array&lt;SearchGroup&gt;**](SearchGroup.md) | A list of Workplace Search Group names and IDs which have access to this Content Source. | 
**name** | [**kotlin.String**](.md) | The human readable display name of this Content Source. | 
**schema** | [**ContentSourceSchema**](ContentSourceSchema.md) |  |  [optional]
**display** | [**ContentSourceDisplay**](ContentSourceDisplay.md) |  |  [optional]
**context** | [**inline**](#ContextEnum) | Can be either \&quot;organization\&quot; or \&quot;private.\&quot; This specifies whether this Content Source is available to groups of users, or a single user. | 
**isSearchable** | [**kotlin.Boolean**](.md) | Whether or not this Content Source can currently be searched over on the search page. | 
**indexing** | [**ContentSourceIndexingResponse**](ContentSourceIndexingResponse.md) |  |  [optional]
**facets** | [**ContentSourceFacets**](ContentSourceFacets.md) |  |  [optional]
**automaticQueryRefinement** | [**ContentSourceAutomaticQueryRefinements**](ContentSourceAutomaticQueryRefinements.md) |  |  [optional]
**documentCount** | [**kotlin.Int**](.md) | How many documents are currently indexed in this Content Source. Note, this field is not applicable to Remote Content Sources. |  [optional]
**lastIndexedAt** | [**kotlin.Any**](.md) | The date/time when documents were last indexed into this Content Source. This may be \&quot;null\&quot; if documents have not yet been indexed. Note, this field is not applicable to Remote Content Sources. |  [optional]

<a name="ContextEnum"></a>
## Enum: context
Name | Value
---- | -----
context | organization, private
