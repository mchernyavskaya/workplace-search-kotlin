# org.openapitools.client - Kotlin client library for Workplace Search API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

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
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:3002*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalyticsAPIApi* | [**createAnalyticsEvent**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/AnalyticsAPIApi.md#createanalyticsevent) | **POST** /api/ws/v1/analytics/event | Capture click and feedback analytic events
*ContentSourcesAPIApi* | [**createContentSource**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcesAPIApi.md#createcontentsource) | **POST** /api/ws/v1/sources | Create a content source
*ContentSourcesAPIApi* | [**deleteContentSource**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcesAPIApi.md#deletecontentsource) | **DELETE** /api/ws/v1/sources/{content_source_id} | Deletes a content source by ID
*ContentSourcesAPIApi* | [**getAutoQueryRefinementDetails**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcesAPIApi.md#getautoqueryrefinementdetails) | **GET** /api/ws/v1/sources/{content_source_id}/automatic_query_refinement | Retrieves a content source's automatic query refinement details
*ContentSourcesAPIApi* | [**getContentSource**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcesAPIApi.md#getcontentsource) | **GET** /api/ws/v1/sources/{content_source_id} | Retrieves a content source by ID
*ContentSourcesAPIApi* | [**listContentSources**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcesAPIApi.md#listcontentsources) | **GET** /api/ws/v1/sources | Retrieves all content sources
*ContentSourcesAPIApi* | [**putContentSource**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcesAPIApi.md#putcontentsource) | **PUT** /api/ws/v1/sources/{content_source_id} | Update a content source
*ContentSourcesAPIApi* | [**putContentSourceIcons**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcesAPIApi.md#putcontentsourceicons) | **PUT** /api/ws/v1/sources/{content_source_id}/icon | Upload content source icons
*DefaultApi* | [**getCurrentUser**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DefaultApi.md#getcurrentuser) | **GET** /api/ws/v1/whoami | Get the authenticated user
*DefaultApi* | [**getTriggersBlocklist**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DefaultApi.md#gettriggersblocklist) | **GET** /api/ws/v1/automatic_query_refinement | Get current triggers blocklist
*DefaultApi* | [**updateTriggersBlocklist**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DefaultApi.md#updatetriggersblocklist) | **PUT** /api/ws/v1/automatic_query_refinement | Update current triggers blocklist
*DocumentsAPIApi* | [**deleteDocuments**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentsAPIApi.md#deletedocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_destroy | Deletes a list of documents from a custom content source
*DocumentsAPIApi* | [**deleteDocumentsByQuery**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentsAPIApi.md#deletedocumentsbyquery) | **DELETE** /api/ws/v1/sources/{content_source_id}/documents | Deletes documents by query in a custom content source
*DocumentsAPIApi* | [**getDocument**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentsAPIApi.md#getdocument) | **GET** /api/ws/v1/sources/{content_source_id}/documents/{document_id} | Retrieves a document by ID from the specified content source
*DocumentsAPIApi* | [**indexDocuments**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentsAPIApi.md#indexdocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_create | Indexes one or more new documents into a custom content source, or updates one or more existing documents
*ExternalIdentitiesAPIApi* | [**createExternalIdentity**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ExternalIdentitiesAPIApi.md#createexternalidentity) | **POST** /api/ws/v1/sources/{content_source_id}/external_identities | Adds a new external identity
*ExternalIdentitiesAPIApi* | [**deleteExternalIdentity**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ExternalIdentitiesAPIApi.md#deleteexternalidentity) | **DELETE** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Deletes an external identity
*ExternalIdentitiesAPIApi* | [**getExternalIdentity**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ExternalIdentitiesAPIApi.md#getexternalidentity) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Retrieves an external identity
*ExternalIdentitiesAPIApi* | [**listExternalIdentities**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ExternalIdentitiesAPIApi.md#listexternalidentities) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities | Retrieves all external identities
*ExternalIdentitiesAPIApi* | [**putExternalIdentity**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ExternalIdentitiesAPIApi.md#putexternalidentity) | **PUT** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Updates an external identity
*PermissionsAPIApi* | [**addUserPermissions**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/PermissionsAPIApi.md#adduserpermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/add | Adds one or more new permissions atop existing permissions
*PermissionsAPIApi* | [**getUserPermissions**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/PermissionsAPIApi.md#getuserpermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Lists all permissions for one user
*PermissionsAPIApi* | [**listPermissions**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/PermissionsAPIApi.md#listpermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions | Lists all permissions for all users
*PermissionsAPIApi* | [**putUserPermissions**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/PermissionsAPIApi.md#putuserpermissions) | **PUT** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Creates a new set of permissions or over-writes all existing permissions
*PermissionsAPIApi* | [**removeUserPermissions**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/PermissionsAPIApi.md#removeuserpermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/remove | Removes one or more permissions from an existing set of permissions
*SearchAPIApi* | [**search**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchAPIApi.md#search) | **POST** /api/ws/v1/search | Search across available sources with various query tuning options
*SyncJobsAPIApi* | [**commandSyncJobs**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SyncJobsAPIApi.md#commandsyncjobs) | **POST** /api/ws/v1/sources/{content_source_id}/sync/jobs | Issue commands to a Content Source's sync jobs
*SynonymsAPIApi* | [**createBatchSynonymSets**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#createbatchsynonymsets) | **POST** /api/ws/v1/synonyms | Create a batch of synonym sets
*SynonymsAPIApi* | [**deleteSynonymSet**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#deletesynonymset) | **DELETE** /api/ws/v1/synonyms/{synonym_set_id} | Delete a synonym set
*SynonymsAPIApi* | [**getSynonymSet**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#getsynonymset) | **GET** /api/ws/v1/synonyms/{synonym_set_id} | Retrieve a synonym set by ID
*SynonymsAPIApi* | [**listSynonymSets**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#listsynonymsets) | **GET** /api/ws/v1/synonyms | Retrieves all synonym sets
*SynonymsAPIApi* | [**putSynonymSet**](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#putsynonymset) | **PUT** /api/ws/v1/synonyms/{synonym_set_id} | Update a synonym set


<a name="documentation-for-models"></a>
## Documentation for Models

 - [AnalyticsEvent](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/AnalyticsEvent.md)
 - [ArrayOrSingularFilterClausesOrFilter](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ArrayOrSingularFilterClausesOrFilter.md)
 - [ArrayOrSingularFilterValue](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ArrayOrSingularFilterValue.md)
 - [AutomaticQueryRefinementDetailsResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/AutomaticQueryRefinementDetailsResponse.md)
 - [BatchSynonymSetsResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BatchSynonymSetsResponse.md)
 - [BoostFunctionalRequirements](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostFunctionalRequirements.md)
 - [BoostFunctionalRequirementsAnyOf](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostFunctionalRequirementsAnyOf.md)
 - [BoostIsFunctionalType](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostIsFunctionalType.md)
 - [BoostIsProximityType](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostIsProximityType.md)
 - [BoostIsValueType](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostIsValueType.md)
 - [BoostItem](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostItem.md)
 - [BoostProximityRequirements](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostProximityRequirements.md)
 - [BoostProximityRequirementsAnyOf](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostProximityRequirementsAnyOf.md)
 - [BoostValueItemtype](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostValueItemtype.md)
 - [BoostValueRequirements](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/BoostValueRequirements.md)
 - [ContentSource](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSource.md)
 - [ContentSourceAutomaticQueryRefinement](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceAutomaticQueryRefinement.md)
 - [ContentSourceAutomaticQueryRefinements](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceAutomaticQueryRefinements.md)
 - [ContentSourceCreateDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceCreateDefinition.md)
 - [ContentSourceDisplay](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceDisplay.md)
 - [ContentSourceDisplayDetail](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceDisplayDetail.md)
 - [ContentSourceEnabledAutomaticQueryRefinement](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceEnabledAutomaticQueryRefinement.md)
 - [ContentSourceFacet](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceFacet.md)
 - [ContentSourceFacets](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceFacets.md)
 - [ContentSourceIconDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceIconDefinition.md)
 - [ContentSourceIndexing](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceIndexing.md)
 - [ContentSourceIndexingFeatures](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceIndexingFeatures.md)
 - [ContentSourceIndexingFeaturesThumbnails](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceIndexingFeaturesThumbnails.md)
 - [ContentSourceIndexingResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceIndexingResponse.md)
 - [ContentSourceIndexingRule](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceIndexingRule.md)
 - [ContentSourceJobTypeWindow](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceJobTypeWindow.md)
 - [ContentSourcePartialCreateResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcePartialCreateResponse.md)
 - [ContentSourcePartialUpdateResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourcePartialUpdateResponse.md)
 - [ContentSourceSchedule](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceSchedule.md)
 - [ContentSourceScheduleEstimates](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceScheduleEstimates.md)
 - [ContentSourceScheduleResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceScheduleResponse.md)
 - [ContentSourceScheduleResponseEstimates](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceScheduleResponseEstimates.md)
 - [ContentSourceUpdateDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ContentSourceUpdateDefinition.md)
 - [CreatedSynonymSetResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/CreatedSynonymSetResponse.md)
 - [DeleteDocumentsByQueryResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DeleteDocumentsByQueryResponse.md)
 - [DeleteExternalIdentitiesResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DeleteExternalIdentitiesResponse.md)
 - [Document](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/Document.md)
 - [DocumentBulkCreateResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentBulkCreateResponse.md)
 - [DocumentBulkCreateResponseResults](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentBulkCreateResponseResults.md)
 - [DocumentBulkDeleteResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentBulkDeleteResponse.md)
 - [DocumentBulkDeleteResponseResults](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentBulkDeleteResponseResults.md)
 - [DocumentsDeleteDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentsDeleteDefinition.md)
 - [DocumentsDeleteDefinitionFilters](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/DocumentsDeleteDefinitionFilters.md)
 - [ErrorsResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ErrorsResponse.md)
 - [EventClickRequirements](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/EventClickRequirements.md)
 - [EventFeedbackRequirements](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/EventFeedbackRequirements.md)
 - [EventIsClickType](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/EventIsClickType.md)
 - [EventIsFeedbackType](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/EventIsFeedbackType.md)
 - [ExternalIdentity](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ExternalIdentity.md)
 - [FacetItem](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/FacetItem.md)
 - [FacetRange](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/FacetRange.md)
 - [FacetRangeItem](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/FacetRangeItem.md)
 - [FacetSort](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/FacetSort.md)
 - [FacetValue](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/FacetValue.md)
 - [FilterClauses](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/FilterClauses.md)
 - [FilterClausesOrFilter](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/FilterClausesOrFilter.md)
 - [FilterValue](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/FilterValue.md)
 - [GeoDistanceFilter](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/GeoDistanceFilter.md)
 - [GeoPoint](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/GeoPoint.md)
 - [GeoRangeFilter](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/GeoRangeFilter.md)
 - [GeoUnitEnum](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/GeoUnitEnum.md)
 - [InterruptSyncCommand](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/InterruptSyncCommand.md)
 - [InterruptSyncCommandAllOf](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/InterruptSyncCommandAllOf.md)
 - [InterruptedSyncJobs](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/InterruptedSyncJobs.md)
 - [ListContentSourcesResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ListContentSourcesResponse.md)
 - [ListExternalIdentitiesResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ListExternalIdentitiesResponse.md)
 - [ListPermissionsResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ListPermissionsResponse.md)
 - [ListSynonymSetResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ListSynonymSetResponse.md)
 - [ListSynonymSetResponseMeta](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ListSynonymSetResponseMeta.md)
 - [ListSynonymSetResponseMetaFilter](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ListSynonymSetResponseMetaFilter.md)
 - [ListSynonymSetResponseMetaSort](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/ListSynonymSetResponseMetaSort.md)
 - [MetaPage](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/MetaPage.md)
 - [MetaPagePage](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/MetaPagePage.md)
 - [PermissionsUser](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/PermissionsUser.md)
 - [QueryRefinementItem](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/QueryRefinementItem.md)
 - [Range](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/Range.md)
 - [RangeFilter](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/RangeFilter.md)
 - [RecordDeletedResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/RecordDeletedResponse.md)
 - [SearchApiEndpointResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiEndpointResponse.md)
 - [SearchApiEndpointResponseMeta](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiEndpointResponseMeta.md)
 - [SearchApiMetaContentSource](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiMetaContentSource.md)
 - [SearchApiQuery](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiQuery.md)
 - [SearchApiQueryPage](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiQueryPage.md)
 - [SearchApiQueryRaw](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiQueryRaw.md)
 - [SearchApiQueryRefinement](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiQueryRefinement.md)
 - [SearchApiQueryResultFields](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiQueryResultFields.md)
 - [SearchApiQuerySearchFields](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiQuerySearchFields.md)
 - [SearchApiQuerySnippet](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiQuerySnippet.md)
 - [SearchApiResultItem](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiResultItem.md)
 - [SearchApiResultItemMeta](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchApiResultItemMeta.md)
 - [SearchFacetResponseItem](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchFacetResponseItem.md)
 - [SearchFacetResponseItemData](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchFacetResponseItemData.md)
 - [SearchFacetsResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchFacetsResponse.md)
 - [SearchGroup](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SearchGroup.md)
 - [SingleDocumentResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SingleDocumentResponse.md)
 - [SingleSynonymSetObject](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SingleSynonymSetObject.md)
 - [SingleSynonymSetResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SingleSynonymSetResponse.md)
 - [StartSyncCommand](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/StartSyncCommand.md)
 - [StartSyncCommandAllOf](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/StartSyncCommandAllOf.md)
 - [StartedSyncJobs](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/StartedSyncJobs.md)
 - [SyncJobDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SyncJobDefinition.md)
 - [SyncJobsCommand](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SyncJobsCommand.md)
 - [SyncJobsCommandResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SyncJobsCommandResponse.md)
 - [SynonymsCreateDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsCreateDefinition.md)
 - [SynonymsFilter](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsFilter.md)
 - [SynonymsListDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsListDefinition.md)
 - [SynonymsPage](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsPage.md)
 - [SynonymsSort](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsSort.md)
 - [SynonymsTermsFilter](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsTermsFilter.md)
 - [SynonymsUpdateDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/SynonymsUpdateDefinition.md)
 - [TriggersBlocklistWrapperDefinition](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/TriggersBlocklistWrapperDefinition.md)
 - [UploadIconsResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/UploadIconsResponse.md)
 - [UploadIconsResponseResults](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/UploadIconsResponseResults.md)
 - [WhoamiResponse](git/workplace-search-kotlin/openapi-generator/docsworkplace-search-kotlin/openapi-generator/docs/WhoamiResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basic_auth"></a>
### basic_auth

- **Type**: HTTP basic authentication

<a name="bearer_auth"></a>
### bearer_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

