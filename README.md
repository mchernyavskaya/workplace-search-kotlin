# io.swagger.client - Kotlin client library for Workplace Search API

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
*DefaultApi* | [**putTriggersBlocklist**](docs/DefaultApi.md#puttriggersblocklist) | **PUT** /api/ws/v1/automatic_query_refinement | Update current triggers blocklist
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

 - [org.elasticsearch.workplace-search.model.AbstractSyncCommand](docs/AbstractSyncCommand.md)
 - [org.elasticsearch.workplace-search.model.AnalyticsEvent](docs/AnalyticsEvent.md)
 - [org.elasticsearch.workplace-search.model.AnyOfboostFunctionalRequirements](docs/AnyOfboostFunctionalRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOfboostItemCenter](docs/AnyOfboostItemCenter.md)
 - [org.elasticsearch.workplace-search.model.AnyOfboostProximityRequirements](docs/AnyOfboostProximityRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOfboostValueRequirements](docs/AnyOfboostValueRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOfeventClickRequirements](docs/AnyOfeventClickRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOfeventFeedbackRequirements](docs/AnyOfeventFeedbackRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOffacetItem](docs/AnyOffacetItem.md)
 - [org.elasticsearch.workplace-search.model.AnyOffacetRangeItem](docs/AnyOffacetRangeItem.md)
 - [org.elasticsearch.workplace-search.model.AnyOfgeoPoint](docs/AnyOfgeoPoint.md)
 - [org.elasticsearch.workplace-search.model.AnyOfsyncJobsCommand](docs/AnyOfsyncJobsCommand.md)
 - [org.elasticsearch.workplace-search.model.ArrayOrSingularFilterClausesOrFilter](docs/ArrayOrSingularFilterClausesOrFilter.md)
 - [org.elasticsearch.workplace-search.model.ArrayOrSingularFilterValue](docs/ArrayOrSingularFilterValue.md)
 - [org.elasticsearch.workplace-search.model.AutomaticQueryRefinementDetailsResponse](docs/AutomaticQueryRefinementDetailsResponse.md)
 - [org.elasticsearch.workplace-search.model.BatchSynonymSetsResponse](docs/BatchSynonymSetsResponse.md)
 - [org.elasticsearch.workplace-search.model.BoostFunctionalRequirements](docs/BoostFunctionalRequirements.md)
 - [org.elasticsearch.workplace-search.model.BoostIsFunctionalType](docs/BoostIsFunctionalType.md)
 - [org.elasticsearch.workplace-search.model.BoostIsProximityType](docs/BoostIsProximityType.md)
 - [org.elasticsearch.workplace-search.model.BoostIsValueType](docs/BoostIsValueType.md)
 - [org.elasticsearch.workplace-search.model.BoostItem](docs/BoostItem.md)
 - [org.elasticsearch.workplace-search.model.BoostProximityRequirements](docs/BoostProximityRequirements.md)
 - [org.elasticsearch.workplace-search.model.BoostValueItemtype](docs/BoostValueItemtype.md)
 - [org.elasticsearch.workplace-search.model.BoostValueRequirements](docs/BoostValueRequirements.md)
 - [org.elasticsearch.workplace-search.model.BulkDocuments](docs/BulkDocuments.md)
 - [org.elasticsearch.workplace-search.model.BulkSynonymSets](docs/BulkSynonymSets.md)
 - [org.elasticsearch.workplace-search.model.ContentSource](docs/ContentSource.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceAutomaticQueryRefinement](docs/ContentSourceAutomaticQueryRefinement.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceAutomaticQueryRefinements](docs/ContentSourceAutomaticQueryRefinements.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceCreateDefinition](docs/ContentSourceCreateDefinition.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceDetail](docs/ContentSourceDetail.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceDisplay](docs/ContentSourceDisplay.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceDisplayDetail](docs/ContentSourceDisplayDetail.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceEnabledAutomaticQueryRefinement](docs/ContentSourceEnabledAutomaticQueryRefinement.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceFacet](docs/ContentSourceFacet.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceFacets](docs/ContentSourceFacets.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIconDefinition](docs/ContentSourceIconDefinition.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexing](docs/ContentSourceIndexing.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexingFeatures](docs/ContentSourceIndexingFeatures.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexingFeaturesThumbnails](docs/ContentSourceIndexingFeaturesThumbnails.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexingResponse](docs/ContentSourceIndexingResponse.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexingRule](docs/ContentSourceIndexingRule.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceJobTypeWindow](docs/ContentSourceJobTypeWindow.md)
 - [org.elasticsearch.workplace-search.model.ContentSourcePartialCreateResponse](docs/ContentSourcePartialCreateResponse.md)
 - [org.elasticsearch.workplace-search.model.ContentSourcePartialUpdateResponse](docs/ContentSourcePartialUpdateResponse.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceSchedule](docs/ContentSourceSchedule.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceScheduleEstimates](docs/ContentSourceScheduleEstimates.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceScheduleResponse](docs/ContentSourceScheduleResponse.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceScheduleResponseEstimates](docs/ContentSourceScheduleResponseEstimates.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceSchema](docs/ContentSourceSchema.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceUpdateDefinition](docs/ContentSourceUpdateDefinition.md)
 - [org.elasticsearch.workplace-search.model.CreatedSynonymSetResponse](docs/CreatedSynonymSetResponse.md)
 - [org.elasticsearch.workplace-search.model.DeleteDocumentsByQueryResponse](docs/DeleteDocumentsByQueryResponse.md)
 - [org.elasticsearch.workplace-search.model.DeleteExternalIdentitiesResponse](docs/DeleteExternalIdentitiesResponse.md)
 - [org.elasticsearch.workplace-search.model.Document](docs/Document.md)
 - [org.elasticsearch.workplace-search.model.DocumentBulkCreateResponse](docs/DocumentBulkCreateResponse.md)
 - [org.elasticsearch.workplace-search.model.DocumentBulkCreateResponseResults](docs/DocumentBulkCreateResponseResults.md)
 - [org.elasticsearch.workplace-search.model.DocumentBulkDeleteResponse](docs/DocumentBulkDeleteResponse.md)
 - [org.elasticsearch.workplace-search.model.DocumentBulkDeleteResponseResults](docs/DocumentBulkDeleteResponseResults.md)
 - [org.elasticsearch.workplace-search.model.DocumentIds](docs/DocumentIds.md)
 - [org.elasticsearch.workplace-search.model.DocumentsDeleteDefinition](docs/DocumentsDeleteDefinition.md)
 - [org.elasticsearch.workplace-search.model.DocumentsDeleteDefinitionFilters](docs/DocumentsDeleteDefinitionFilters.md)
 - [org.elasticsearch.workplace-search.model.Errors](docs/Errors.md)
 - [org.elasticsearch.workplace-search.model.ErrorsResponse](docs/ErrorsResponse.md)
 - [org.elasticsearch.workplace-search.model.EventClickRequirements](docs/EventClickRequirements.md)
 - [org.elasticsearch.workplace-search.model.EventFeedbackRequirements](docs/EventFeedbackRequirements.md)
 - [org.elasticsearch.workplace-search.model.EventIsClickType](docs/EventIsClickType.md)
 - [org.elasticsearch.workplace-search.model.EventIsFeedbackType](docs/EventIsFeedbackType.md)
 - [org.elasticsearch.workplace-search.model.ExternalId](docs/ExternalId.md)
 - [org.elasticsearch.workplace-search.model.ExternalIdentity](docs/ExternalIdentity.md)
 - [org.elasticsearch.workplace-search.model.FacetItem](docs/FacetItem.md)
 - [org.elasticsearch.workplace-search.model.FacetRange](docs/FacetRange.md)
 - [org.elasticsearch.workplace-search.model.FacetRangeItem](docs/FacetRangeItem.md)
 - [org.elasticsearch.workplace-search.model.FacetSort](docs/FacetSort.md)
 - [org.elasticsearch.workplace-search.model.FacetValue](docs/FacetValue.md)
 - [org.elasticsearch.workplace-search.model.Filter](docs/Filter.md)
 - [org.elasticsearch.workplace-search.model.FilterClauses](docs/FilterClauses.md)
 - [org.elasticsearch.workplace-search.model.FilterClausesOrFilter](docs/FilterClausesOrFilter.md)
 - [org.elasticsearch.workplace-search.model.FilterValue](docs/FilterValue.md)
 - [org.elasticsearch.workplace-search.model.GeoDistanceFilter](docs/GeoDistanceFilter.md)
 - [org.elasticsearch.workplace-search.model.GeoPoint](docs/GeoPoint.md)
 - [org.elasticsearch.workplace-search.model.GeoRangeFilter](docs/GeoRangeFilter.md)
 - [org.elasticsearch.workplace-search.model.GeoUnitEnum](docs/GeoUnitEnum.md)
 - [org.elasticsearch.workplace-search.model.InlineResponse400](docs/InlineResponse400.md)
 - [org.elasticsearch.workplace-search.model.InlineResponse4001](docs/InlineResponse4001.md)
 - [org.elasticsearch.workplace-search.model.InterruptSyncCommand](docs/InterruptSyncCommand.md)
 - [org.elasticsearch.workplace-search.model.InterruptedSyncJobs](docs/InterruptedSyncJobs.md)
 - [org.elasticsearch.workplace-search.model.LastUpdated](docs/LastUpdated.md)
 - [org.elasticsearch.workplace-search.model.ListContentSourcesResponse](docs/ListContentSourcesResponse.md)
 - [org.elasticsearch.workplace-search.model.ListExternalIdentitiesResponse](docs/ListExternalIdentitiesResponse.md)
 - [org.elasticsearch.workplace-search.model.ListPermissionsResponse](docs/ListPermissionsResponse.md)
 - [org.elasticsearch.workplace-search.model.ListSynonymSetResponse](docs/ListSynonymSetResponse.md)
 - [org.elasticsearch.workplace-search.model.ListSynonymSetResponseMeta](docs/ListSynonymSetResponseMeta.md)
 - [org.elasticsearch.workplace-search.model.ListSynonymSetResponseMetaFilter](docs/ListSynonymSetResponseMetaFilter.md)
 - [org.elasticsearch.workplace-search.model.ListSynonymSetResponseMetaSort](docs/ListSynonymSetResponseMetaSort.md)
 - [org.elasticsearch.workplace-search.model.MetaPage](docs/MetaPage.md)
 - [org.elasticsearch.workplace-search.model.MetaPagePage](docs/MetaPagePage.md)
 - [org.elasticsearch.workplace-search.model.OneOfarrayOrSingularFilterClausesOrFilter](docs/OneOfarrayOrSingularFilterClausesOrFilter.md)
 - [org.elasticsearch.workplace-search.model.OneOfarrayOrSingularFilterValue](docs/OneOfarrayOrSingularFilterValue.md)
 - [org.elasticsearch.workplace-search.model.OneOfboostValueItemtype](docs/OneOfboostValueItemtype.md)
 - [org.elasticsearch.workplace-search.model.OneOffacetRangeItemFrom](docs/OneOffacetRangeItemFrom.md)
 - [org.elasticsearch.workplace-search.model.OneOffacetRangeItemTo](docs/OneOffacetRangeItemTo.md)
 - [org.elasticsearch.workplace-search.model.OneOffilterClausesOrFilter](docs/OneOffilterClausesOrFilter.md)
 - [org.elasticsearch.workplace-search.model.OneOffilterValue](docs/OneOffilterValue.md)
 - [org.elasticsearch.workplace-search.model.OneOfinlineResponse400](docs/OneOfinlineResponse400.md)
 - [org.elasticsearch.workplace-search.model.OneOfinlineResponse4001](docs/OneOfinlineResponse4001.md)
 - [org.elasticsearch.workplace-search.model.OneOflistSynonymSetResponseMetaFilterTerms](docs/OneOflistSynonymSetResponseMetaFilterTerms.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchApiQuerySort](docs/OneOfsearchApiQuerySort.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchFacetResponseItemDataFrom](docs/OneOfsearchFacetResponseItemDataFrom.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchFacetResponseItemDataTo](docs/OneOfsearchFacetResponseItemDataTo.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchFacetResponseItemDataValue](docs/OneOfsearchFacetResponseItemDataValue.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchFacetsResponse](docs/OneOfsearchFacetsResponse.md)
 - [org.elasticsearch.workplace-search.model.OneOfsyncJobsCommandResponseResults](docs/OneOfsyncJobsCommandResponseResults.md)
 - [org.elasticsearch.workplace-search.model.OneOfsynonymsCreateDefinition](docs/OneOfsynonymsCreateDefinition.md)
 - [org.elasticsearch.workplace-search.model.OneOfsynonymsTermsFilter](docs/OneOfsynonymsTermsFilter.md)
 - [org.elasticsearch.workplace-search.model.Permission](docs/Permission.md)
 - [org.elasticsearch.workplace-search.model.Permissions](docs/Permissions.md)
 - [org.elasticsearch.workplace-search.model.PermissionsUser](docs/PermissionsUser.md)
 - [org.elasticsearch.workplace-search.model.QueryRefinementItem](docs/QueryRefinementItem.md)
 - [org.elasticsearch.workplace-search.model.Range](docs/Range.md)
 - [org.elasticsearch.workplace-search.model.RangeFilter](docs/RangeFilter.md)
 - [org.elasticsearch.workplace-search.model.RecordDeletedResponse](docs/RecordDeletedResponse.md)
 - [org.elasticsearch.workplace-search.model.SearchApiEndpointResponse](docs/SearchApiEndpointResponse.md)
 - [org.elasticsearch.workplace-search.model.SearchApiEndpointResponseMeta](docs/SearchApiEndpointResponseMeta.md)
 - [org.elasticsearch.workplace-search.model.SearchApiMetaContentSource](docs/SearchApiMetaContentSource.md)
 - [org.elasticsearch.workplace-search.model.SearchApiMetaContentSources](docs/SearchApiMetaContentSources.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQuery](docs/SearchApiQuery.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQueryPage](docs/SearchApiQueryPage.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQueryRaw](docs/SearchApiQueryRaw.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQueryRefinement](docs/SearchApiQueryRefinement.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQueryResultFields](docs/SearchApiQueryResultFields.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQuerySearchFields](docs/SearchApiQuerySearchFields.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQuerySnippet](docs/SearchApiQuerySnippet.md)
 - [org.elasticsearch.workplace-search.model.SearchApiResultItem](docs/SearchApiResultItem.md)
 - [org.elasticsearch.workplace-search.model.SearchApiResultItemMeta](docs/SearchApiResultItemMeta.md)
 - [org.elasticsearch.workplace-search.model.SearchFacetResponseItem](docs/SearchFacetResponseItem.md)
 - [org.elasticsearch.workplace-search.model.SearchFacetResponseItemData](docs/SearchFacetResponseItemData.md)
 - [org.elasticsearch.workplace-search.model.SearchFacetsResponse](docs/SearchFacetsResponse.md)
 - [org.elasticsearch.workplace-search.model.SearchGroup](docs/SearchGroup.md)
 - [org.elasticsearch.workplace-search.model.SingleDocumentResponse](docs/SingleDocumentResponse.md)
 - [org.elasticsearch.workplace-search.model.SingleSynonymSet](docs/SingleSynonymSet.md)
 - [org.elasticsearch.workplace-search.model.SingleSynonymSetObject](docs/SingleSynonymSetObject.md)
 - [org.elasticsearch.workplace-search.model.SingleSynonymSetResponse](docs/SingleSynonymSetResponse.md)
 - [org.elasticsearch.workplace-search.model.Sort](docs/Sort.md)
 - [org.elasticsearch.workplace-search.model.StartSyncCommand](docs/StartSyncCommand.md)
 - [org.elasticsearch.workplace-search.model.StartedSyncJobs](docs/StartedSyncJobs.md)
 - [org.elasticsearch.workplace-search.model.SyncJobDefinition](docs/SyncJobDefinition.md)
 - [org.elasticsearch.workplace-search.model.SyncJobsCommand](docs/SyncJobsCommand.md)
 - [org.elasticsearch.workplace-search.model.SyncJobsCommandResponse](docs/SyncJobsCommandResponse.md)
 - [org.elasticsearch.workplace-search.model.SynonymsCreateDefinition](docs/SynonymsCreateDefinition.md)
 - [org.elasticsearch.workplace-search.model.SynonymsFilter](docs/SynonymsFilter.md)
 - [org.elasticsearch.workplace-search.model.SynonymsListDefinition](docs/SynonymsListDefinition.md)
 - [org.elasticsearch.workplace-search.model.SynonymsPage](docs/SynonymsPage.md)
 - [org.elasticsearch.workplace-search.model.SynonymsSort](docs/SynonymsSort.md)
 - [org.elasticsearch.workplace-search.model.SynonymsTermsFilter](docs/SynonymsTermsFilter.md)
 - [org.elasticsearch.workplace-search.model.SynonymsUpdateDefinition](docs/SynonymsUpdateDefinition.md)
 - [org.elasticsearch.workplace-search.model.TriggersBlocklistDefinition](docs/TriggersBlocklistDefinition.md)
 - [org.elasticsearch.workplace-search.model.TriggersBlocklistWrapperDefinition](docs/TriggersBlocklistWrapperDefinition.md)
 - [org.elasticsearch.workplace-search.model.UploadIconsResponse](docs/UploadIconsResponse.md)
 - [org.elasticsearch.workplace-search.model.UploadIconsResponseResults](docs/UploadIconsResponseResults.md)
 - [org.elasticsearch.workplace-search.model.WhoamiResponse](docs/WhoamiResponse.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basic_auth"></a>
### basic_auth

- **Type**: HTTP basic authentication

<a name="bearer_auth"></a>
### bearer_auth


# workplace-search-kotlin
