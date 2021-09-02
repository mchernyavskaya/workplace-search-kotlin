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

 - [org.openapitools.client.models.AnalyticsEvent](docs/AnalyticsEvent.md)
 - [org.openapitools.client.models.ArrayOrSingularFilterClausesOrFilter](docs/ArrayOrSingularFilterClausesOrFilter.md)
 - [org.openapitools.client.models.ArrayOrSingularFilterValue](docs/ArrayOrSingularFilterValue.md)
 - [org.openapitools.client.models.AutomaticQueryRefinementDetailsResponse](docs/AutomaticQueryRefinementDetailsResponse.md)
 - [org.openapitools.client.models.BatchSynonymSetsResponse](docs/BatchSynonymSetsResponse.md)
 - [org.openapitools.client.models.BoostFunctionalRequirements](docs/BoostFunctionalRequirements.md)
 - [org.openapitools.client.models.BoostFunctionalRequirementsAnyOf](docs/BoostFunctionalRequirementsAnyOf.md)
 - [org.openapitools.client.models.BoostIsFunctionalType](docs/BoostIsFunctionalType.md)
 - [org.openapitools.client.models.BoostIsProximityType](docs/BoostIsProximityType.md)
 - [org.openapitools.client.models.BoostIsValueType](docs/BoostIsValueType.md)
 - [org.openapitools.client.models.BoostItem](docs/BoostItem.md)
 - [org.openapitools.client.models.BoostProximityRequirements](docs/BoostProximityRequirements.md)
 - [org.openapitools.client.models.BoostProximityRequirementsAnyOf](docs/BoostProximityRequirementsAnyOf.md)
 - [org.openapitools.client.models.BoostValueItemtype](docs/BoostValueItemtype.md)
 - [org.openapitools.client.models.BoostValueRequirements](docs/BoostValueRequirements.md)
 - [org.openapitools.client.models.ContentSource](docs/ContentSource.md)
 - [org.openapitools.client.models.ContentSourceAutomaticQueryRefinement](docs/ContentSourceAutomaticQueryRefinement.md)
 - [org.openapitools.client.models.ContentSourceAutomaticQueryRefinements](docs/ContentSourceAutomaticQueryRefinements.md)
 - [org.openapitools.client.models.ContentSourceCreateDefinition](docs/ContentSourceCreateDefinition.md)
 - [org.openapitools.client.models.ContentSourceDisplay](docs/ContentSourceDisplay.md)
 - [org.openapitools.client.models.ContentSourceDisplayDetail](docs/ContentSourceDisplayDetail.md)
 - [org.openapitools.client.models.ContentSourceEnabledAutomaticQueryRefinement](docs/ContentSourceEnabledAutomaticQueryRefinement.md)
 - [org.openapitools.client.models.ContentSourceFacet](docs/ContentSourceFacet.md)
 - [org.openapitools.client.models.ContentSourceFacets](docs/ContentSourceFacets.md)
 - [org.openapitools.client.models.ContentSourceIconDefinition](docs/ContentSourceIconDefinition.md)
 - [org.openapitools.client.models.ContentSourceIndexing](docs/ContentSourceIndexing.md)
 - [org.openapitools.client.models.ContentSourceIndexingFeatures](docs/ContentSourceIndexingFeatures.md)
 - [org.openapitools.client.models.ContentSourceIndexingFeaturesThumbnails](docs/ContentSourceIndexingFeaturesThumbnails.md)
 - [org.openapitools.client.models.ContentSourceIndexingResponse](docs/ContentSourceIndexingResponse.md)
 - [org.openapitools.client.models.ContentSourceIndexingRule](docs/ContentSourceIndexingRule.md)
 - [org.openapitools.client.models.ContentSourceJobTypeWindow](docs/ContentSourceJobTypeWindow.md)
 - [org.openapitools.client.models.ContentSourcePartialCreateResponse](docs/ContentSourcePartialCreateResponse.md)
 - [org.openapitools.client.models.ContentSourcePartialUpdateResponse](docs/ContentSourcePartialUpdateResponse.md)
 - [org.openapitools.client.models.ContentSourceSchedule](docs/ContentSourceSchedule.md)
 - [org.openapitools.client.models.ContentSourceScheduleEstimates](docs/ContentSourceScheduleEstimates.md)
 - [org.openapitools.client.models.ContentSourceScheduleResponse](docs/ContentSourceScheduleResponse.md)
 - [org.openapitools.client.models.ContentSourceScheduleResponseEstimates](docs/ContentSourceScheduleResponseEstimates.md)
 - [org.openapitools.client.models.ContentSourceUpdateDefinition](docs/ContentSourceUpdateDefinition.md)
 - [org.openapitools.client.models.CreatedSynonymSetResponse](docs/CreatedSynonymSetResponse.md)
 - [org.openapitools.client.models.DeleteDocumentsByQueryResponse](docs/DeleteDocumentsByQueryResponse.md)
 - [org.openapitools.client.models.DeleteExternalIdentitiesResponse](docs/DeleteExternalIdentitiesResponse.md)
 - [org.openapitools.client.models.Document](docs/Document.md)
 - [org.openapitools.client.models.DocumentBulkCreateResponse](docs/DocumentBulkCreateResponse.md)
 - [org.openapitools.client.models.DocumentBulkCreateResponseResults](docs/DocumentBulkCreateResponseResults.md)
 - [org.openapitools.client.models.DocumentBulkDeleteResponse](docs/DocumentBulkDeleteResponse.md)
 - [org.openapitools.client.models.DocumentBulkDeleteResponseResults](docs/DocumentBulkDeleteResponseResults.md)
 - [org.openapitools.client.models.DocumentsDeleteDefinition](docs/DocumentsDeleteDefinition.md)
 - [org.openapitools.client.models.DocumentsDeleteDefinitionFilters](docs/DocumentsDeleteDefinitionFilters.md)
 - [org.openapitools.client.models.ErrorsResponse](docs/ErrorsResponse.md)
 - [org.openapitools.client.models.EventClickRequirements](docs/EventClickRequirements.md)
 - [org.openapitools.client.models.EventFeedbackRequirements](docs/EventFeedbackRequirements.md)
 - [org.openapitools.client.models.EventIsClickType](docs/EventIsClickType.md)
 - [org.openapitools.client.models.EventIsFeedbackType](docs/EventIsFeedbackType.md)
 - [org.openapitools.client.models.ExternalIdentity](docs/ExternalIdentity.md)
 - [org.openapitools.client.models.FacetItem](docs/FacetItem.md)
 - [org.openapitools.client.models.FacetRange](docs/FacetRange.md)
 - [org.openapitools.client.models.FacetRangeItem](docs/FacetRangeItem.md)
 - [org.openapitools.client.models.FacetSort](docs/FacetSort.md)
 - [org.openapitools.client.models.FacetValue](docs/FacetValue.md)
 - [org.openapitools.client.models.FilterClauses](docs/FilterClauses.md)
 - [org.openapitools.client.models.FilterClausesOrFilter](docs/FilterClausesOrFilter.md)
 - [org.openapitools.client.models.FilterValue](docs/FilterValue.md)
 - [org.openapitools.client.models.GeoDistanceFilter](docs/GeoDistanceFilter.md)
 - [org.openapitools.client.models.GeoPoint](docs/GeoPoint.md)
 - [org.openapitools.client.models.GeoRangeFilter](docs/GeoRangeFilter.md)
 - [org.openapitools.client.models.GeoUnitEnum](docs/GeoUnitEnum.md)
 - [org.openapitools.client.models.InterruptSyncCommand](docs/InterruptSyncCommand.md)
 - [org.openapitools.client.models.InterruptSyncCommandAllOf](docs/InterruptSyncCommandAllOf.md)
 - [org.openapitools.client.models.InterruptedSyncJobs](docs/InterruptedSyncJobs.md)
 - [org.openapitools.client.models.ListContentSourcesResponse](docs/ListContentSourcesResponse.md)
 - [org.openapitools.client.models.ListExternalIdentitiesResponse](docs/ListExternalIdentitiesResponse.md)
 - [org.openapitools.client.models.ListPermissionsResponse](docs/ListPermissionsResponse.md)
 - [org.openapitools.client.models.ListSynonymSetResponse](docs/ListSynonymSetResponse.md)
 - [org.openapitools.client.models.ListSynonymSetResponseMeta](docs/ListSynonymSetResponseMeta.md)
 - [org.openapitools.client.models.ListSynonymSetResponseMetaFilter](docs/ListSynonymSetResponseMetaFilter.md)
 - [org.openapitools.client.models.ListSynonymSetResponseMetaSort](docs/ListSynonymSetResponseMetaSort.md)
 - [org.openapitools.client.models.MetaPage](docs/MetaPage.md)
 - [org.openapitools.client.models.MetaPagePage](docs/MetaPagePage.md)
 - [org.openapitools.client.models.PermissionsUser](docs/PermissionsUser.md)
 - [org.openapitools.client.models.QueryRefinementItem](docs/QueryRefinementItem.md)
 - [org.openapitools.client.models.Range](docs/Range.md)
 - [org.openapitools.client.models.RangeFilter](docs/RangeFilter.md)
 - [org.openapitools.client.models.RecordDeletedResponse](docs/RecordDeletedResponse.md)
 - [org.openapitools.client.models.SearchApiEndpointResponse](docs/SearchApiEndpointResponse.md)
 - [org.openapitools.client.models.SearchApiEndpointResponseMeta](docs/SearchApiEndpointResponseMeta.md)
 - [org.openapitools.client.models.SearchApiMetaContentSource](docs/SearchApiMetaContentSource.md)
 - [org.openapitools.client.models.SearchApiQuery](docs/SearchApiQuery.md)
 - [org.openapitools.client.models.SearchApiQueryPage](docs/SearchApiQueryPage.md)
 - [org.openapitools.client.models.SearchApiQueryRaw](docs/SearchApiQueryRaw.md)
 - [org.openapitools.client.models.SearchApiQueryRefinement](docs/SearchApiQueryRefinement.md)
 - [org.openapitools.client.models.SearchApiQueryResultFields](docs/SearchApiQueryResultFields.md)
 - [org.openapitools.client.models.SearchApiQuerySearchFields](docs/SearchApiQuerySearchFields.md)
 - [org.openapitools.client.models.SearchApiQuerySnippet](docs/SearchApiQuerySnippet.md)
 - [org.openapitools.client.models.SearchApiResultItem](docs/SearchApiResultItem.md)
 - [org.openapitools.client.models.SearchApiResultItemMeta](docs/SearchApiResultItemMeta.md)
 - [org.openapitools.client.models.SearchFacetResponseItem](docs/SearchFacetResponseItem.md)
 - [org.openapitools.client.models.SearchFacetResponseItemData](docs/SearchFacetResponseItemData.md)
 - [org.openapitools.client.models.SearchFacetsResponse](docs/SearchFacetsResponse.md)
 - [org.openapitools.client.models.SearchGroup](docs/SearchGroup.md)
 - [org.openapitools.client.models.SingleDocumentResponse](docs/SingleDocumentResponse.md)
 - [org.openapitools.client.models.SingleSynonymSetObject](docs/SingleSynonymSetObject.md)
 - [org.openapitools.client.models.SingleSynonymSetResponse](docs/SingleSynonymSetResponse.md)
 - [org.openapitools.client.models.StartSyncCommand](docs/StartSyncCommand.md)
 - [org.openapitools.client.models.StartSyncCommandAllOf](docs/StartSyncCommandAllOf.md)
 - [org.openapitools.client.models.StartedSyncJobs](docs/StartedSyncJobs.md)
 - [org.openapitools.client.models.SyncJobDefinition](docs/SyncJobDefinition.md)
 - [org.openapitools.client.models.SyncJobsCommand](docs/SyncJobsCommand.md)
 - [org.openapitools.client.models.SyncJobsCommandResponse](docs/SyncJobsCommandResponse.md)
 - [org.openapitools.client.models.SynonymsCreateDefinition](docs/SynonymsCreateDefinition.md)
 - [org.openapitools.client.models.SynonymsFilter](docs/SynonymsFilter.md)
 - [org.openapitools.client.models.SynonymsListDefinition](docs/SynonymsListDefinition.md)
 - [org.openapitools.client.models.SynonymsPage](docs/SynonymsPage.md)
 - [org.openapitools.client.models.SynonymsSort](docs/SynonymsSort.md)
 - [org.openapitools.client.models.SynonymsTermsFilter](docs/SynonymsTermsFilter.md)
 - [org.openapitools.client.models.SynonymsUpdateDefinition](docs/SynonymsUpdateDefinition.md)
 - [org.openapitools.client.models.TriggersBlocklistWrapperDefinition](docs/TriggersBlocklistWrapperDefinition.md)
 - [org.openapitools.client.models.UploadIconsResponse](docs/UploadIconsResponse.md)
 - [org.openapitools.client.models.UploadIconsResponseResults](docs/UploadIconsResponseResults.md)
 - [org.openapitools.client.models.WhoamiResponse](docs/WhoamiResponse.md)


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

