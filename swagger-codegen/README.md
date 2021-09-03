# org.elasticsearch.workplacesearch - Kotlin client library for Workplace Search API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *{schemes}://{host}:{port}*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsAPIApi* | [**createAnalyticsEvent**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/AnalyticsAPIApi.md#createanalyticsevent) | **POST** /api/ws/v1/analytics/event | Capture click and feedback analytic events
*ContentSourcesAPIApi* | [**createContentSource**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ContentSourcesAPIApi.md#createcontentsource) | **POST** /api/ws/v1/sources | Create a content source
*ContentSourcesAPIApi* | [**deleteContentSource**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ContentSourcesAPIApi.md#deletecontentsource) | **DELETE** /api/ws/v1/sources/{content_source_id} | Deletes a content source by ID
*ContentSourcesAPIApi* | [**getAutoQueryRefinementDetails**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ContentSourcesAPIApi.md#getautoqueryrefinementdetails) | **GET** /api/ws/v1/sources/{content_source_id}/automatic_query_refinement | Retrieves a content source's automatic query refinement details
*ContentSourcesAPIApi* | [**getContentSource**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ContentSourcesAPIApi.md#getcontentsource) | **GET** /api/ws/v1/sources/{content_source_id} | Retrieves a content source by ID
*ContentSourcesAPIApi* | [**listContentSources**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ContentSourcesAPIApi.md#listcontentsources) | **GET** /api/ws/v1/sources | Retrieves all content sources
*ContentSourcesAPIApi* | [**putContentSource**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ContentSourcesAPIApi.md#putcontentsource) | **PUT** /api/ws/v1/sources/{content_source_id} | Update a content source
*ContentSourcesAPIApi* | [**putContentSourceIcons**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ContentSourcesAPIApi.md#putcontentsourceicons) | **PUT** /api/ws/v1/sources/{content_source_id}/icon | Upload content source icons
*DefaultApi* | [**getCurrentUser**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/DefaultApi.md#getcurrentuser) | **GET** /api/ws/v1/whoami | Get the authenticated user
*DefaultApi* | [**getTriggersBlocklist**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/DefaultApi.md#gettriggersblocklist) | **GET** /api/ws/v1/automatic_query_refinement | Get current triggers blocklist
*DefaultApi* | [**putTriggersBlocklist**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/DefaultApi.md#puttriggersblocklist) | **PUT** /api/ws/v1/automatic_query_refinement | Update current triggers blocklist
*DocumentsAPIApi* | [**deleteDocuments**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/DocumentsAPIApi.md#deletedocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_destroy | Deletes a list of documents from a custom content source
*DocumentsAPIApi* | [**deleteDocumentsByQuery**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/DocumentsAPIApi.md#deletedocumentsbyquery) | **DELETE** /api/ws/v1/sources/{content_source_id}/documents | Deletes documents by query in a custom content source
*DocumentsAPIApi* | [**getDocument**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/DocumentsAPIApi.md#getdocument) | **GET** /api/ws/v1/sources/{content_source_id}/documents/{document_id} | Retrieves a document by ID from the specified content source
*DocumentsAPIApi* | [**indexDocuments**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/DocumentsAPIApi.md#indexdocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_create | Indexes one or more new documents into a custom content source, or updates one or more existing documents
*ExternalIdentitiesAPIApi* | [**createExternalIdentity**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#createexternalidentity) | **POST** /api/ws/v1/sources/{content_source_id}/external_identities | Adds a new external identity
*ExternalIdentitiesAPIApi* | [**deleteExternalIdentity**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#deleteexternalidentity) | **DELETE** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Deletes an external identity
*ExternalIdentitiesAPIApi* | [**getExternalIdentity**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#getexternalidentity) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Retrieves an external identity
*ExternalIdentitiesAPIApi* | [**listExternalIdentities**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#listexternalidentities) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities | Retrieves all external identities
*ExternalIdentitiesAPIApi* | [**putExternalIdentity**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#putexternalidentity) | **PUT** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Updates an external identity
*PermissionsAPIApi* | [**addUserPermissions**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#adduserpermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/add | Adds one or more new permissions atop existing permissions
*PermissionsAPIApi* | [**getUserPermissions**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#getuserpermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Lists all permissions for one user
*PermissionsAPIApi* | [**listPermissions**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#listpermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions | Lists all permissions for all users
*PermissionsAPIApi* | [**putUserPermissions**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#putuserpermissions) | **PUT** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Creates a new set of permissions or over-writes all existing permissions
*PermissionsAPIApi* | [**removeUserPermissions**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#removeuserpermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/remove | Removes one or more permissions from an existing set of permissions
*SearchAPIApi* | [**search**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/SearchAPIApi.md#search) | **POST** /api/ws/v1/search | Search across available sources with various query tuning options
*SyncJobsAPIApi* | [**commandSyncJobs**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/SyncJobsAPIApi.md#commandsyncjobs) | **POST** /api/ws/v1/sources/{content_source_id}/sync/jobs | Issue commands to a Content Source's sync jobs
*SynonymsAPIApi* | [**createBatchSynonymSets**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/SynonymsAPIApi.md#createbatchsynonymsets) | **POST** /api/ws/v1/synonyms | Create a batch of synonym sets
*SynonymsAPIApi* | [**deleteSynonymSet**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/SynonymsAPIApi.md#deletesynonymset) | **DELETE** /api/ws/v1/synonyms/{synonym_set_id} | Delete a synonym set
*SynonymsAPIApi* | [**getSynonymSet**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/SynonymsAPIApi.md#getsynonymset) | **GET** /api/ws/v1/synonyms/{synonym_set_id} | Retrieve a synonym set by ID
*SynonymsAPIApi* | [**listSynonymSets**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/SynonymsAPIApi.md#listsynonymsets) | **GET** /api/ws/v1/synonyms | Retrieves all synonym sets
*SynonymsAPIApi* | [**putSynonymSet**](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/SynonymsAPIApi.md#putsynonymset) | **PUT** /api/ws/v1/synonyms/{synonym_set_id} | Update a synonym set

<a name="documentation-for-models"></a>
## Documentation for Models

 - [AbstractSyncCommand](git/workplace-search-kotlin/swagger-codegen/docs/AbstractSyncCommand.md)
 - [AnalyticsEvent](git/workplace-search-kotlin/swagger-codegen/docs/AnalyticsEvent.md)
 - [AnyOfboostFunctionalRequirements](git/workplace-search-kotlin/swagger-codegen/docs/AnyOfboostFunctionalRequirements.md)
 - [AnyOfboostItemCenter](git/workplace-search-kotlin/swagger-codegen/docs/AnyOfboostItemCenter.md)
 - [AnyOfboostProximityRequirements](git/workplace-search-kotlin/swagger-codegen/docs/AnyOfboostProximityRequirements.md)
 - [AnyOfboostValueRequirements](git/workplace-search-kotlin/swagger-codegen/docs/AnyOfboostValueRequirements.md)
 - [AnyOfeventClickRequirements](git/workplace-search-kotlin/swagger-codegen/docs/AnyOfeventClickRequirements.md)
 - [AnyOfeventFeedbackRequirements](git/workplace-search-kotlin/swagger-codegen/docs/AnyOfeventFeedbackRequirements.md)
 - [AnyOffacetItem](git/workplace-search-kotlin/swagger-codegen/docs/AnyOffacetItem.md)
 - [AnyOffacetRangeItem](git/workplace-search-kotlin/swagger-codegen/docs/AnyOffacetRangeItem.md)
 - [AnyOfgeoPoint](git/workplace-search-kotlin/swagger-codegen/docs/AnyOfgeoPoint.md)
 - [AnyOfsyncJobsCommand](git/workplace-search-kotlin/swagger-codegen/docs/AnyOfsyncJobsCommand.md)
 - [ArrayOrSingularFilterClausesOrFilter](git/workplace-search-kotlin/swagger-codegen/docs/ArrayOrSingularFilterClausesOrFilter.md)
 - [ArrayOrSingularFilterValue](git/workplace-search-kotlin/swagger-codegen/docs/ArrayOrSingularFilterValue.md)
 - [AutomaticQueryRefinementDetailsResponse](git/workplace-search-kotlin/swagger-codegen/docs/AutomaticQueryRefinementDetailsResponse.md)
 - [BatchSynonymSetsResponse](git/workplace-search-kotlin/swagger-codegen/docs/BatchSynonymSetsResponse.md)
 - [BoostFunctionalRequirements](git/workplace-search-kotlin/swagger-codegen/docs/BoostFunctionalRequirements.md)
 - [BoostIsFunctionalType](git/workplace-search-kotlin/swagger-codegen/docs/BoostIsFunctionalType.md)
 - [BoostIsProximityType](git/workplace-search-kotlin/swagger-codegen/docs/BoostIsProximityType.md)
 - [BoostIsValueType](git/workplace-search-kotlin/swagger-codegen/docs/BoostIsValueType.md)
 - [BoostItem](git/workplace-search-kotlin/swagger-codegen/docs/BoostItem.md)
 - [BoostProximityRequirements](git/workplace-search-kotlin/swagger-codegen/docs/BoostProximityRequirements.md)
 - [BoostValueItemtype](git/workplace-search-kotlin/swagger-codegen/docs/BoostValueItemtype.md)
 - [BoostValueRequirements](git/workplace-search-kotlin/swagger-codegen/docs/BoostValueRequirements.md)
 - [BulkDocuments](git/workplace-search-kotlin/swagger-codegen/docs/BulkDocuments.md)
 - [BulkSynonymSets](git/workplace-search-kotlin/swagger-codegen/docs/BulkSynonymSets.md)
 - [ContentSource](git/workplace-search-kotlin/swagger-codegen/docs/ContentSource.md)
 - [ContentSourceAutomaticQueryRefinement](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceAutomaticQueryRefinement.md)
 - [ContentSourceAutomaticQueryRefinements](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceAutomaticQueryRefinements.md)
 - [ContentSourceCreateDefinition](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceCreateDefinition.md)
 - [ContentSourceDetail](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceDetail.md)
 - [ContentSourceDisplay](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceDisplay.md)
 - [ContentSourceDisplayDetail](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceDisplayDetail.md)
 - [ContentSourceEnabledAutomaticQueryRefinement](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceEnabledAutomaticQueryRefinement.md)
 - [ContentSourceFacet](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceFacet.md)
 - [ContentSourceFacets](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceFacets.md)
 - [ContentSourceIconDefinition](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceIconDefinition.md)
 - [ContentSourceIndexing](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceIndexing.md)
 - [ContentSourceIndexingFeatures](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceIndexingFeatures.md)
 - [ContentSourceIndexingFeaturesThumbnails](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceIndexingFeaturesThumbnails.md)
 - [ContentSourceIndexingResponse](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceIndexingResponse.md)
 - [ContentSourceIndexingRule](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceIndexingRule.md)
 - [ContentSourceJobTypeWindow](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceJobTypeWindow.md)
 - [ContentSourcePartialCreateResponse](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourcePartialCreateResponse.md)
 - [ContentSourcePartialUpdateResponse](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourcePartialUpdateResponse.md)
 - [ContentSourceSchedule](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceSchedule.md)
 - [ContentSourceScheduleEstimates](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceScheduleEstimates.md)
 - [ContentSourceScheduleResponse](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceScheduleResponse.md)
 - [ContentSourceScheduleResponseEstimates](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceScheduleResponseEstimates.md)
 - [ContentSourceSchema](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceSchema.md)
 - [ContentSourceUpdateDefinition](git/workplace-search-kotlin/swagger-codegen/docs/ContentSourceUpdateDefinition.md)
 - [CreatedSynonymSetResponse](git/workplace-search-kotlin/swagger-codegen/docs/CreatedSynonymSetResponse.md)
 - [DeleteDocumentsByQueryResponse](git/workplace-search-kotlin/swagger-codegen/docs/DeleteDocumentsByQueryResponse.md)
 - [DeleteExternalIdentitiesResponse](git/workplace-search-kotlin/swagger-codegen/docs/DeleteExternalIdentitiesResponse.md)
 - [Document](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/Document.md)
 - [DocumentBulkCreateResponse](git/workplace-search-kotlin/swagger-codegen/docs/DocumentBulkCreateResponse.md)
 - [DocumentBulkCreateResponseResults](git/workplace-search-kotlin/swagger-codegen/docs/DocumentBulkCreateResponseResults.md)
 - [DocumentBulkDeleteResponse](git/workplace-search-kotlin/swagger-codegen/docs/DocumentBulkDeleteResponse.md)
 - [DocumentBulkDeleteResponseResults](git/workplace-search-kotlin/swagger-codegen/docs/DocumentBulkDeleteResponseResults.md)
 - [DocumentIds](git/workplace-search-kotlin/swagger-codegen/docs/DocumentIds.md)
 - [DocumentsDeleteDefinition](git/workplace-search-kotlin/swagger-codegen/docs/DocumentsDeleteDefinition.md)
 - [DocumentsDeleteDefinitionFilters](git/workplace-search-kotlin/swagger-codegen/docs/DocumentsDeleteDefinitionFilters.md)
 - [Errors](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/Errors.md)
 - [ErrorsResponse](git/workplace-search-kotlin/swagger-codegen/docs/ErrorsResponse.md)
 - [EventClickRequirements](git/workplace-search-kotlin/swagger-codegen/docs/EventClickRequirements.md)
 - [EventFeedbackRequirements](git/workplace-search-kotlin/swagger-codegen/docs/EventFeedbackRequirements.md)
 - [EventIsClickType](git/workplace-search-kotlin/swagger-codegen/docs/EventIsClickType.md)
 - [EventIsFeedbackType](git/workplace-search-kotlin/swagger-codegen/docs/EventIsFeedbackType.md)
 - [ExternalId](git/workplace-search-kotlin/swagger-codegen/docs/ExternalId.md)
 - [ExternalIdentity](git/workplace-search-kotlin/swagger-codegen/docs/ExternalIdentity.md)
 - [FacetItem](git/workplace-search-kotlin/swagger-codegen/docs/FacetItem.md)
 - [FacetRange](git/workplace-search-kotlin/swagger-codegen/docs/FacetRange.md)
 - [FacetRangeItem](git/workplace-search-kotlin/swagger-codegen/docs/FacetRangeItem.md)
 - [FacetSort](git/workplace-search-kotlin/swagger-codegen/docs/FacetSort.md)
 - [FacetValue](git/workplace-search-kotlin/swagger-codegen/docs/FacetValue.md)
 - [Filter](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/Filter.md)
 - [FilterClauses](git/workplace-search-kotlin/swagger-codegen/docs/FilterClauses.md)
 - [FilterClausesOrFilter](git/workplace-search-kotlin/swagger-codegen/docs/FilterClausesOrFilter.md)
 - [FilterValue](git/workplace-search-kotlin/swagger-codegen/docs/FilterValue.md)
 - [GeoDistanceFilter](git/workplace-search-kotlin/swagger-codegen/docs/GeoDistanceFilter.md)
 - [GeoPoint](git/workplace-search-kotlin/swagger-codegen/docs/GeoPoint.md)
 - [GeoRangeFilter](git/workplace-search-kotlin/swagger-codegen/docs/GeoRangeFilter.md)
 - [GeoUnitEnum](git/workplace-search-kotlin/swagger-codegen/docs/GeoUnitEnum.md)
 - [InlineResponse400](git/workplace-search-kotlin/swagger-codegen/docs/InlineResponse400.md)
 - [InlineResponse4001](git/workplace-search-kotlin/swagger-codegen/docs/InlineResponse4001.md)
 - [InterruptSyncCommand](git/workplace-search-kotlin/swagger-codegen/docs/InterruptSyncCommand.md)
 - [InterruptedSyncJobs](git/workplace-search-kotlin/swagger-codegen/docs/InterruptedSyncJobs.md)
 - [LastUpdated](git/workplace-search-kotlin/swagger-codegen/docs/LastUpdated.md)
 - [ListContentSourcesResponse](git/workplace-search-kotlin/swagger-codegen/docs/ListContentSourcesResponse.md)
 - [ListExternalIdentitiesResponse](git/workplace-search-kotlin/swagger-codegen/docs/ListExternalIdentitiesResponse.md)
 - [ListPermissionsResponse](git/workplace-search-kotlin/swagger-codegen/docs/ListPermissionsResponse.md)
 - [ListSynonymSetResponse](git/workplace-search-kotlin/swagger-codegen/docs/ListSynonymSetResponse.md)
 - [ListSynonymSetResponseMeta](git/workplace-search-kotlin/swagger-codegen/docs/ListSynonymSetResponseMeta.md)
 - [ListSynonymSetResponseMetaFilter](git/workplace-search-kotlin/swagger-codegen/docs/ListSynonymSetResponseMetaFilter.md)
 - [ListSynonymSetResponseMetaSort](git/workplace-search-kotlin/swagger-codegen/docs/ListSynonymSetResponseMetaSort.md)
 - [MetaPage](git/workplace-search-kotlin/swagger-codegen/docs/MetaPage.md)
 - [MetaPagePage](git/workplace-search-kotlin/swagger-codegen/docs/MetaPagePage.md)
 - [OneOfarrayOrSingularFilterClausesOrFilter](git/workplace-search-kotlin/swagger-codegen/docs/OneOfarrayOrSingularFilterClausesOrFilter.md)
 - [OneOfarrayOrSingularFilterValue](git/workplace-search-kotlin/swagger-codegen/docs/OneOfarrayOrSingularFilterValue.md)
 - [OneOfboostValueItemtype](git/workplace-search-kotlin/swagger-codegen/docs/OneOfboostValueItemtype.md)
 - [OneOffacetRangeItemFrom](git/workplace-search-kotlin/swagger-codegen/docs/OneOffacetRangeItemFrom.md)
 - [OneOffacetRangeItemTo](git/workplace-search-kotlin/swagger-codegen/docs/OneOffacetRangeItemTo.md)
 - [OneOffilterClausesOrFilter](git/workplace-search-kotlin/swagger-codegen/docs/OneOffilterClausesOrFilter.md)
 - [OneOffilterValue](git/workplace-search-kotlin/swagger-codegen/docs/OneOffilterValue.md)
 - [OneOfinlineResponse400](git/workplace-search-kotlin/swagger-codegen/docs/OneOfinlineResponse400.md)
 - [OneOfinlineResponse4001](git/workplace-search-kotlin/swagger-codegen/docs/OneOfinlineResponse4001.md)
 - [OneOflistSynonymSetResponseMetaFilterTerms](git/workplace-search-kotlin/swagger-codegen/docs/OneOflistSynonymSetResponseMetaFilterTerms.md)
 - [OneOfsearchApiQuerySort](git/workplace-search-kotlin/swagger-codegen/docs/OneOfsearchApiQuerySort.md)
 - [OneOfsearchFacetResponseItemDataFrom](git/workplace-search-kotlin/swagger-codegen/docs/OneOfsearchFacetResponseItemDataFrom.md)
 - [OneOfsearchFacetResponseItemDataTo](git/workplace-search-kotlin/swagger-codegen/docs/OneOfsearchFacetResponseItemDataTo.md)
 - [OneOfsearchFacetResponseItemDataValue](git/workplace-search-kotlin/swagger-codegen/docs/OneOfsearchFacetResponseItemDataValue.md)
 - [OneOfsearchFacetsResponse](git/workplace-search-kotlin/swagger-codegen/docs/OneOfsearchFacetsResponse.md)
 - [OneOfsyncJobsCommandResponseResults](git/workplace-search-kotlin/swagger-codegen/docs/OneOfsyncJobsCommandResponseResults.md)
 - [OneOfsynonymsCreateDefinition](git/workplace-search-kotlin/swagger-codegen/docs/OneOfsynonymsCreateDefinition.md)
 - [OneOfsynonymsTermsFilter](git/workplace-search-kotlin/swagger-codegen/docs/OneOfsynonymsTermsFilter.md)
 - [Permission](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/Permission.md)
 - [Permissions](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/Permissions.md)
 - [PermissionsUser](git/workplace-search-kotlin/swagger-codegen/docs/PermissionsUser.md)
 - [QueryRefinementItem](git/workplace-search-kotlin/swagger-codegen/docs/QueryRefinementItem.md)
 - [Range](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/Range.md)
 - [RangeFilter](git/workplace-search-kotlin/swagger-codegen/docs/RangeFilter.md)
 - [RecordDeletedResponse](git/workplace-search-kotlin/swagger-codegen/docs/RecordDeletedResponse.md)
 - [SearchApiEndpointResponse](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiEndpointResponse.md)
 - [SearchApiEndpointResponseMeta](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiEndpointResponseMeta.md)
 - [SearchApiMetaContentSource](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiMetaContentSource.md)
 - [SearchApiMetaContentSources](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiMetaContentSources.md)
 - [SearchApiQuery](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiQuery.md)
 - [SearchApiQueryPage](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiQueryPage.md)
 - [SearchApiQueryRaw](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiQueryRaw.md)
 - [SearchApiQueryRefinement](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiQueryRefinement.md)
 - [SearchApiQueryResultFields](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiQueryResultFields.md)
 - [SearchApiQuerySearchFields](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiQuerySearchFields.md)
 - [SearchApiQuerySnippet](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiQuerySnippet.md)
 - [SearchApiResultItem](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiResultItem.md)
 - [SearchApiResultItemMeta](git/workplace-search-kotlin/swagger-codegen/docs/SearchApiResultItemMeta.md)
 - [SearchFacetResponseItem](git/workplace-search-kotlin/swagger-codegen/docs/SearchFacetResponseItem.md)
 - [SearchFacetResponseItemData](git/workplace-search-kotlin/swagger-codegen/docs/SearchFacetResponseItemData.md)
 - [SearchFacetsResponse](git/workplace-search-kotlin/swagger-codegen/docs/SearchFacetsResponse.md)
 - [SearchGroup](git/workplace-search-kotlin/swagger-codegen/docs/SearchGroup.md)
 - [SingleDocumentResponse](git/workplace-search-kotlin/swagger-codegen/docs/SingleDocumentResponse.md)
 - [SingleSynonymSet](git/workplace-search-kotlin/swagger-codegen/docs/SingleSynonymSet.md)
 - [SingleSynonymSetObject](git/workplace-search-kotlin/swagger-codegen/docs/SingleSynonymSetObject.md)
 - [SingleSynonymSetResponse](git/workplace-search-kotlin/swagger-codegen/docs/SingleSynonymSetResponse.md)
 - [Sort](git/workplace-search-kotlin/swagger-codegen/docsworkplace-search-kotlin/swagger-codegen/docs/Sort.md)
 - [StartSyncCommand](git/workplace-search-kotlin/swagger-codegen/docs/StartSyncCommand.md)
 - [StartedSyncJobs](git/workplace-search-kotlin/swagger-codegen/docs/StartedSyncJobs.md)
 - [SyncJobDefinition](git/workplace-search-kotlin/swagger-codegen/docs/SyncJobDefinition.md)
 - [SyncJobsCommand](git/workplace-search-kotlin/swagger-codegen/docs/SyncJobsCommand.md)
 - [SyncJobsCommandResponse](git/workplace-search-kotlin/swagger-codegen/docs/SyncJobsCommandResponse.md)
 - [SynonymsCreateDefinition](git/workplace-search-kotlin/swagger-codegen/docs/SynonymsCreateDefinition.md)
 - [SynonymsFilter](git/workplace-search-kotlin/swagger-codegen/docs/SynonymsFilter.md)
 - [SynonymsListDefinition](git/workplace-search-kotlin/swagger-codegen/docs/SynonymsListDefinition.md)
 - [SynonymsPage](git/workplace-search-kotlin/swagger-codegen/docs/SynonymsPage.md)
 - [SynonymsSort](git/workplace-search-kotlin/swagger-codegen/docs/SynonymsSort.md)
 - [SynonymsTermsFilter](git/workplace-search-kotlin/swagger-codegen/docs/SynonymsTermsFilter.md)
 - [SynonymsUpdateDefinition](git/workplace-search-kotlin/swagger-codegen/docs/SynonymsUpdateDefinition.md)
 - [TriggersBlocklistDefinition](git/workplace-search-kotlin/swagger-codegen/docs/TriggersBlocklistDefinition.md)
 - [TriggersBlocklistWrapperDefinition](git/workplace-search-kotlin/swagger-codegen/docs/TriggersBlocklistWrapperDefinition.md)
 - [UploadIconsResponse](git/workplace-search-kotlin/swagger-codegen/docs/UploadIconsResponse.md)
 - [UploadIconsResponseResults](git/workplace-search-kotlin/swagger-codegen/docs/UploadIconsResponseResults.md)
 - [WhoamiResponse](git/workplace-search-kotlin/swagger-codegen/docs/WhoamiResponse.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basic_auth"></a>
### basic_auth

- **Type**: HTTP basic authentication

<a name="bearer_auth"></a>
### bearer_auth


