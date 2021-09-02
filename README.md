# org.elasticsearch.workplacesearch - Kotlin client library for Workplace Search API

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
*AnalyticsAPIApi* | [**createAnalyticsEvent**](docs/AnalyticsAPIApi.md#createanalyticsevent) | **POST** /api/ws/v1/analytics/event | Capture click and feedback analytic events
*ContentSourcesAPIApi* | [**createContentSource**](docs/ContentSourcesAPIApi.md#createcontentsource) | **POST** /api/ws/v1/sources | Create a content source
*ContentSourcesAPIApi* | [**deleteContentSource**](docs/ContentSourcesAPIApi.md#deletecontentsource) | **DELETE** /api/ws/v1/sources/{content_source_id} | Deletes a content source by ID
*ContentSourcesAPIApi* | [**getAutoQueryRefinementDetails**](docs/ContentSourcesAPIApi.md#getautoqueryrefinementdetails) | **GET** /api/ws/v1/sources/{content_source_id}/automatic_query_refinement | Retrieves a content source's automatic query refinement details
*ContentSourcesAPIApi* | [**getContentSource**](docs/ContentSourcesAPIApi.md#getcontentsource) | **GET** /api/ws/v1/sources/{content_source_id} | Retrieves a content source by ID
*ContentSourcesAPIApi* | [**listContentSources**](docs/ContentSourcesAPIApi.md#listcontentsources) | **GET** /api/ws/v1/sources | Retrieves all content sources
*ContentSourcesAPIApi* | [**putContentSource**](docs/ContentSourcesAPIApi.md#putcontentsource) | **PUT** /api/ws/v1/sources/{content_source_id} | Update a content source
*ContentSourcesAPIApi* | [**putContentSourceIcons**](docs/ContentSourcesAPIApi.md#putcontentsourceicons) | **PUT** /api/ws/v1/sources/{content_source_id}/icon | Upload content source icons
*DefaultApi* | [**getCurrentUser**](docs/DefaultApi.md#getcurrentuser) | **GET** /api/ws/v1/whoami | Get the authenticated user
*DefaultApi* | [**getTriggersBlocklist**](docs/DefaultApi.md#gettriggersblocklist) | **GET** /api/ws/v1/automatic_query_refinement | Get current triggers blocklist
*DefaultApi* | [**updateTriggersBlocklist**](docs/DefaultApi.md#updatetriggersblocklist) | **PUT** /api/ws/v1/automatic_query_refinement | Update current triggers blocklist
*DocumentsAPIApi* | [**deleteDocuments**](docs/DocumentsAPIApi.md#deletedocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_destroy | Deletes a list of documents from a custom content source
*DocumentsAPIApi* | [**deleteDocumentsByQuery**](docs/DocumentsAPIApi.md#deletedocumentsbyquery) | **DELETE** /api/ws/v1/sources/{content_source_id}/documents | Deletes documents by query in a custom content source
*DocumentsAPIApi* | [**getDocument**](docs/DocumentsAPIApi.md#getdocument) | **GET** /api/ws/v1/sources/{content_source_id}/documents/{document_id} | Retrieves a document by ID from the specified content source
*DocumentsAPIApi* | [**indexDocuments**](docs/DocumentsAPIApi.md#indexdocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_create | Indexes one or more new documents into a custom content source, or updates one or more existing documents
*ExternalIdentitiesAPIApi* | [**createExternalIdentity**](docs/ExternalIdentitiesAPIApi.md#createexternalidentity) | **POST** /api/ws/v1/sources/{content_source_id}/external_identities | Adds a new external identity
*ExternalIdentitiesAPIApi* | [**deleteExternalIdentity**](docs/ExternalIdentitiesAPIApi.md#deleteexternalidentity) | **DELETE** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Deletes an external identity
*ExternalIdentitiesAPIApi* | [**getExternalIdentity**](docs/ExternalIdentitiesAPIApi.md#getexternalidentity) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Retrieves an external identity
*ExternalIdentitiesAPIApi* | [**listExternalIdentities**](docs/ExternalIdentitiesAPIApi.md#listexternalidentities) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities | Retrieves all external identities
*ExternalIdentitiesAPIApi* | [**putExternalIdentity**](docs/ExternalIdentitiesAPIApi.md#putexternalidentity) | **PUT** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Updates an external identity
*PermissionsAPIApi* | [**addUserPermissions**](docs/PermissionsAPIApi.md#adduserpermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/add | Adds one or more new permissions atop existing permissions
*PermissionsAPIApi* | [**getUserPermissions**](docs/PermissionsAPIApi.md#getuserpermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Lists all permissions for one user
*PermissionsAPIApi* | [**listPermissions**](docs/PermissionsAPIApi.md#listpermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions | Lists all permissions for all users
*PermissionsAPIApi* | [**putUserPermissions**](docs/PermissionsAPIApi.md#putuserpermissions) | **PUT** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Creates a new set of permissions or over-writes all existing permissions
*PermissionsAPIApi* | [**removeUserPermissions**](docs/PermissionsAPIApi.md#removeuserpermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/remove | Removes one or more permissions from an existing set of permissions
*SearchAPIApi* | [**search**](docs/SearchAPIApi.md#search) | **POST** /api/ws/v1/search | Search across available sources with various query tuning options
*SyncJobsAPIApi* | [**commandSyncJobs**](docs/SyncJobsAPIApi.md#commandsyncjobs) | **POST** /api/ws/v1/sources/{content_source_id}/sync/jobs | Issue commands to a Content Source's sync jobs
*SynonymsAPIApi* | [**createBatchSynonymSets**](docs/SynonymsAPIApi.md#createbatchsynonymsets) | **POST** /api/ws/v1/synonyms | Create a batch of synonym sets
*SynonymsAPIApi* | [**deleteSynonymSet**](docs/SynonymsAPIApi.md#deletesynonymset) | **DELETE** /api/ws/v1/synonyms/{synonym_set_id} | Delete a synonym set
*SynonymsAPIApi* | [**getSynonymSet**](docs/SynonymsAPIApi.md#getsynonymset) | **GET** /api/ws/v1/synonyms/{synonym_set_id} | Retrieve a synonym set by ID
*SynonymsAPIApi* | [**listSynonymSets**](docs/SynonymsAPIApi.md#listsynonymsets) | **GET** /api/ws/v1/synonyms | Retrieves all synonym sets
*SynonymsAPIApi* | [**putSynonymSet**](docs/SynonymsAPIApi.md#putsynonymset) | **PUT** /api/ws/v1/synonyms/{synonym_set_id} | Update a synonym set


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.elasticsearch.workplacesearch.models.AnalyticsEvent](docs/AnalyticsEvent.md)
 - [org.elasticsearch.workplacesearch.models.ArrayOrSingularFilterClausesOrFilter](docs/ArrayOrSingularFilterClausesOrFilter.md)
 - [org.elasticsearch.workplacesearch.models.ArrayOrSingularFilterValue](docs/ArrayOrSingularFilterValue.md)
 - [org.elasticsearch.workplacesearch.models.AutomaticQueryRefinementDetailsResponse](docs/AutomaticQueryRefinementDetailsResponse.md)
 - [org.elasticsearch.workplacesearch.models.BatchSynonymSetsResponse](docs/BatchSynonymSetsResponse.md)
 - [org.elasticsearch.workplacesearch.models.BoostFunctionalRequirements](docs/BoostFunctionalRequirements.md)
 - [org.elasticsearch.workplacesearch.models.BoostFunctionalRequirementsAnyOf](docs/BoostFunctionalRequirementsAnyOf.md)
 - [org.elasticsearch.workplacesearch.models.BoostIsFunctionalType](docs/BoostIsFunctionalType.md)
 - [org.elasticsearch.workplacesearch.models.BoostIsProximityType](docs/BoostIsProximityType.md)
 - [org.elasticsearch.workplacesearch.models.BoostIsValueType](docs/BoostIsValueType.md)
 - [org.elasticsearch.workplacesearch.models.BoostItem](docs/BoostItem.md)
 - [org.elasticsearch.workplacesearch.models.BoostProximityRequirements](docs/BoostProximityRequirements.md)
 - [org.elasticsearch.workplacesearch.models.BoostProximityRequirementsAnyOf](docs/BoostProximityRequirementsAnyOf.md)
 - [org.elasticsearch.workplacesearch.models.BoostValueItemtype](docs/BoostValueItemtype.md)
 - [org.elasticsearch.workplacesearch.models.BoostValueRequirements](docs/BoostValueRequirements.md)
 - [org.elasticsearch.workplacesearch.models.ContentSource](docs/ContentSource.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceAutomaticQueryRefinement](docs/ContentSourceAutomaticQueryRefinement.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceAutomaticQueryRefinements](docs/ContentSourceAutomaticQueryRefinements.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceCreateDefinition](docs/ContentSourceCreateDefinition.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceDisplay](docs/ContentSourceDisplay.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceDisplayDetail](docs/ContentSourceDisplayDetail.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceEnabledAutomaticQueryRefinement](docs/ContentSourceEnabledAutomaticQueryRefinement.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceFacet](docs/ContentSourceFacet.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceFacets](docs/ContentSourceFacets.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceIconDefinition](docs/ContentSourceIconDefinition.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceIndexing](docs/ContentSourceIndexing.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceIndexingFeatures](docs/ContentSourceIndexingFeatures.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceIndexingFeaturesThumbnails](docs/ContentSourceIndexingFeaturesThumbnails.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceIndexingResponse](docs/ContentSourceIndexingResponse.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceIndexingRule](docs/ContentSourceIndexingRule.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceJobTypeWindow](docs/ContentSourceJobTypeWindow.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourcePartialCreateResponse](docs/ContentSourcePartialCreateResponse.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourcePartialUpdateResponse](docs/ContentSourcePartialUpdateResponse.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceSchedule](docs/ContentSourceSchedule.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceScheduleEstimates](docs/ContentSourceScheduleEstimates.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceScheduleResponse](docs/ContentSourceScheduleResponse.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceScheduleResponseEstimates](docs/ContentSourceScheduleResponseEstimates.md)
 - [org.elasticsearch.workplacesearch.models.ContentSourceUpdateDefinition](docs/ContentSourceUpdateDefinition.md)
 - [org.elasticsearch.workplacesearch.models.CreatedSynonymSetResponse](docs/CreatedSynonymSetResponse.md)
 - [org.elasticsearch.workplacesearch.models.DeleteDocumentsByQueryResponse](docs/DeleteDocumentsByQueryResponse.md)
 - [org.elasticsearch.workplacesearch.models.DeleteExternalIdentitiesResponse](docs/DeleteExternalIdentitiesResponse.md)
 - [org.elasticsearch.workplacesearch.models.Document](docs/Document.md)
 - [org.elasticsearch.workplacesearch.models.DocumentBulkCreateResponse](docs/DocumentBulkCreateResponse.md)
 - [org.elasticsearch.workplacesearch.models.DocumentBulkCreateResponseResults](docs/DocumentBulkCreateResponseResults.md)
 - [org.elasticsearch.workplacesearch.models.DocumentBulkDeleteResponse](docs/DocumentBulkDeleteResponse.md)
 - [org.elasticsearch.workplacesearch.models.DocumentBulkDeleteResponseResults](docs/DocumentBulkDeleteResponseResults.md)
 - [org.elasticsearch.workplacesearch.models.DocumentsDeleteDefinition](docs/DocumentsDeleteDefinition.md)
 - [org.elasticsearch.workplacesearch.models.DocumentsDeleteDefinitionFilters](docs/DocumentsDeleteDefinitionFilters.md)
 - [org.elasticsearch.workplacesearch.models.ErrorsResponse](docs/ErrorsResponse.md)
 - [org.elasticsearch.workplacesearch.models.EventClickRequirements](docs/EventClickRequirements.md)
 - [org.elasticsearch.workplacesearch.models.EventFeedbackRequirements](docs/EventFeedbackRequirements.md)
 - [org.elasticsearch.workplacesearch.models.EventIsClickType](docs/EventIsClickType.md)
 - [org.elasticsearch.workplacesearch.models.EventIsFeedbackType](docs/EventIsFeedbackType.md)
 - [org.elasticsearch.workplacesearch.models.ExternalIdentity](docs/ExternalIdentity.md)
 - [org.elasticsearch.workplacesearch.models.FacetItem](docs/FacetItem.md)
 - [org.elasticsearch.workplacesearch.models.FacetRange](docs/FacetRange.md)
 - [org.elasticsearch.workplacesearch.models.FacetRangeItem](docs/FacetRangeItem.md)
 - [org.elasticsearch.workplacesearch.models.FacetSort](docs/FacetSort.md)
 - [org.elasticsearch.workplacesearch.models.FacetValue](docs/FacetValue.md)
 - [org.elasticsearch.workplacesearch.models.FilterClauses](docs/FilterClauses.md)
 - [org.elasticsearch.workplacesearch.models.FilterClausesOrFilter](docs/FilterClausesOrFilter.md)
 - [org.elasticsearch.workplacesearch.models.FilterValue](docs/FilterValue.md)
 - [org.elasticsearch.workplacesearch.models.GeoDistanceFilter](docs/GeoDistanceFilter.md)
 - [org.elasticsearch.workplacesearch.models.GeoPoint](docs/GeoPoint.md)
 - [org.elasticsearch.workplacesearch.models.GeoRangeFilter](docs/GeoRangeFilter.md)
 - [org.elasticsearch.workplacesearch.models.GeoUnitEnum](docs/GeoUnitEnum.md)
 - [org.elasticsearch.workplacesearch.models.InterruptSyncCommand](docs/InterruptSyncCommand.md)
 - [org.elasticsearch.workplacesearch.models.InterruptSyncCommandAllOf](docs/InterruptSyncCommandAllOf.md)
 - [org.elasticsearch.workplacesearch.models.InterruptedSyncJobs](docs/InterruptedSyncJobs.md)
 - [org.elasticsearch.workplacesearch.models.ListContentSourcesResponse](docs/ListContentSourcesResponse.md)
 - [org.elasticsearch.workplacesearch.models.ListExternalIdentitiesResponse](docs/ListExternalIdentitiesResponse.md)
 - [org.elasticsearch.workplacesearch.models.ListPermissionsResponse](docs/ListPermissionsResponse.md)
 - [org.elasticsearch.workplacesearch.models.ListSynonymSetResponse](docs/ListSynonymSetResponse.md)
 - [org.elasticsearch.workplacesearch.models.ListSynonymSetResponseMeta](docs/ListSynonymSetResponseMeta.md)
 - [org.elasticsearch.workplacesearch.models.ListSynonymSetResponseMetaFilter](docs/ListSynonymSetResponseMetaFilter.md)
 - [org.elasticsearch.workplacesearch.models.ListSynonymSetResponseMetaSort](docs/ListSynonymSetResponseMetaSort.md)
 - [org.elasticsearch.workplacesearch.models.MetaPage](docs/MetaPage.md)
 - [org.elasticsearch.workplacesearch.models.MetaPagePage](docs/MetaPagePage.md)
 - [org.elasticsearch.workplacesearch.models.PermissionsUser](docs/PermissionsUser.md)
 - [org.elasticsearch.workplacesearch.models.QueryRefinementItem](docs/QueryRefinementItem.md)
 - [org.elasticsearch.workplacesearch.models.Range](docs/Range.md)
 - [org.elasticsearch.workplacesearch.models.RangeFilter](docs/RangeFilter.md)
 - [org.elasticsearch.workplacesearch.models.RecordDeletedResponse](docs/RecordDeletedResponse.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiEndpointResponse](docs/SearchApiEndpointResponse.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiEndpointResponseMeta](docs/SearchApiEndpointResponseMeta.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiMetaContentSource](docs/SearchApiMetaContentSource.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiQuery](docs/SearchApiQuery.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiQueryPage](docs/SearchApiQueryPage.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiQueryRaw](docs/SearchApiQueryRaw.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiQueryRefinement](docs/SearchApiQueryRefinement.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiQueryResultFields](docs/SearchApiQueryResultFields.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiQuerySearchFields](docs/SearchApiQuerySearchFields.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiQuerySnippet](docs/SearchApiQuerySnippet.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiResultItem](docs/SearchApiResultItem.md)
 - [org.elasticsearch.workplacesearch.models.SearchApiResultItemMeta](docs/SearchApiResultItemMeta.md)
 - [org.elasticsearch.workplacesearch.models.SearchFacetResponseItem](docs/SearchFacetResponseItem.md)
 - [org.elasticsearch.workplacesearch.models.SearchFacetResponseItemData](docs/SearchFacetResponseItemData.md)
 - [org.elasticsearch.workplacesearch.models.SearchFacetsResponse](docs/SearchFacetsResponse.md)
 - [org.elasticsearch.workplacesearch.models.SearchGroup](docs/SearchGroup.md)
 - [org.elasticsearch.workplacesearch.models.SingleDocumentResponse](docs/SingleDocumentResponse.md)
 - [org.elasticsearch.workplacesearch.models.SingleSynonymSetObject](docs/SingleSynonymSetObject.md)
 - [org.elasticsearch.workplacesearch.models.SingleSynonymSetResponse](docs/SingleSynonymSetResponse.md)
 - [org.elasticsearch.workplacesearch.models.StartSyncCommand](docs/StartSyncCommand.md)
 - [org.elasticsearch.workplacesearch.models.StartSyncCommandAllOf](docs/StartSyncCommandAllOf.md)
 - [org.elasticsearch.workplacesearch.models.StartedSyncJobs](docs/StartedSyncJobs.md)
 - [org.elasticsearch.workplacesearch.models.SyncJobDefinition](docs/SyncJobDefinition.md)
 - [org.elasticsearch.workplacesearch.models.SyncJobsCommand](docs/SyncJobsCommand.md)
 - [org.elasticsearch.workplacesearch.models.SyncJobsCommandResponse](docs/SyncJobsCommandResponse.md)
 - [org.elasticsearch.workplacesearch.models.SynonymsCreateDefinition](docs/SynonymsCreateDefinition.md)
 - [org.elasticsearch.workplacesearch.models.SynonymsFilter](docs/SynonymsFilter.md)
 - [org.elasticsearch.workplacesearch.models.SynonymsListDefinition](docs/SynonymsListDefinition.md)
 - [org.elasticsearch.workplacesearch.models.SynonymsPage](docs/SynonymsPage.md)
 - [org.elasticsearch.workplacesearch.models.SynonymsSort](docs/SynonymsSort.md)
 - [org.elasticsearch.workplacesearch.models.SynonymsTermsFilter](docs/SynonymsTermsFilter.md)
 - [org.elasticsearch.workplacesearch.models.SynonymsUpdateDefinition](docs/SynonymsUpdateDefinition.md)
 - [org.elasticsearch.workplacesearch.models.TriggersBlocklistWrapperDefinition](docs/TriggersBlocklistWrapperDefinition.md)
 - [org.elasticsearch.workplacesearch.models.UploadIconsResponse](docs/UploadIconsResponse.md)
 - [org.elasticsearch.workplacesearch.models.UploadIconsResponseResults](docs/UploadIconsResponseResults.md)
 - [org.elasticsearch.workplacesearch.models.WhoamiResponse](docs/WhoamiResponse.md)


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

