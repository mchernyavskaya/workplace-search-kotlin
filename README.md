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
*AnalyticsAPIApi* | [**createAnalyticsEvent**](git/workplace-search-kotlin/docs/AnalyticsAPIApi.md#createanalyticsevent) | **POST** /api/ws/v1/analytics/event | Capture click and feedback analytic events
*ContentSourcesAPIApi* | [**createContentSource**](git/workplace-search-kotlin/docs/ContentSourcesAPIApi.md#createcontentsource) | **POST** /api/ws/v1/sources | Create a content source
*ContentSourcesAPIApi* | [**deleteContentSource**](git/workplace-search-kotlin/docs/ContentSourcesAPIApi.md#deletecontentsource) | **DELETE** /api/ws/v1/sources/{content_source_id} | Deletes a content source by ID
*ContentSourcesAPIApi* | [**getAutoQueryRefinementDetails**](git/workplace-search-kotlin/docs/ContentSourcesAPIApi.md#getautoqueryrefinementdetails) | **GET** /api/ws/v1/sources/{content_source_id}/automatic_query_refinement | Retrieves a content source's automatic query refinement details
*ContentSourcesAPIApi* | [**getContentSource**](git/workplace-search-kotlin/docs/ContentSourcesAPIApi.md#getcontentsource) | **GET** /api/ws/v1/sources/{content_source_id} | Retrieves a content source by ID
*ContentSourcesAPIApi* | [**listContentSources**](git/workplace-search-kotlin/docs/ContentSourcesAPIApi.md#listcontentsources) | **GET** /api/ws/v1/sources | Retrieves all content sources
*ContentSourcesAPIApi* | [**putContentSource**](git/workplace-search-kotlin/docs/ContentSourcesAPIApi.md#putcontentsource) | **PUT** /api/ws/v1/sources/{content_source_id} | Update a content source
*ContentSourcesAPIApi* | [**putContentSourceIcons**](git/workplace-search-kotlin/docs/ContentSourcesAPIApi.md#putcontentsourceicons) | **PUT** /api/ws/v1/sources/{content_source_id}/icon | Upload content source icons
*DefaultApi* | [**getCurrentUser**](git/workplace-search-kotlin/docs/DefaultApi.md#getcurrentuser) | **GET** /api/ws/v1/whoami | Get the authenticated user
*DefaultApi* | [**getTriggersBlocklist**](git/workplace-search-kotlin/docs/DefaultApi.md#gettriggersblocklist) | **GET** /api/ws/v1/automatic_query_refinement | Get current triggers blocklist
*DefaultApi* | [**putTriggersBlocklist**](git/workplace-search-kotlin/docs/DefaultApi.md#puttriggersblocklist) | **PUT** /api/ws/v1/automatic_query_refinement | Update current triggers blocklist
*DocumentsAPIApi* | [**deleteDocuments**](git/workplace-search-kotlin/docs/DocumentsAPIApi.md#deletedocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_destroy | Deletes a list of documents from a custom content source
*DocumentsAPIApi* | [**deleteDocumentsByQuery**](git/workplace-search-kotlin/docs/DocumentsAPIApi.md#deletedocumentsbyquery) | **DELETE** /api/ws/v1/sources/{content_source_id}/documents | Deletes documents by query in a custom content source
*DocumentsAPIApi* | [**getDocument**](git/workplace-search-kotlin/docs/DocumentsAPIApi.md#getdocument) | **GET** /api/ws/v1/sources/{content_source_id}/documents/{document_id} | Retrieves a document by ID from the specified content source
*DocumentsAPIApi* | [**indexDocuments**](git/workplace-search-kotlin/docs/DocumentsAPIApi.md#indexdocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_create | Indexes one or more new documents into a custom content source, or updates one or more existing documents
*ExternalIdentitiesAPIApi* | [**createExternalIdentity**](git/workplace-search-kotlin/docs/ExternalIdentitiesAPIApi.md#createexternalidentity) | **POST** /api/ws/v1/sources/{content_source_id}/external_identities | Adds a new external identity
*ExternalIdentitiesAPIApi* | [**deleteExternalIdentity**](git/workplace-search-kotlin/docs/ExternalIdentitiesAPIApi.md#deleteexternalidentity) | **DELETE** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Deletes an external identity
*ExternalIdentitiesAPIApi* | [**getExternalIdentity**](git/workplace-search-kotlin/docs/ExternalIdentitiesAPIApi.md#getexternalidentity) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Retrieves an external identity
*ExternalIdentitiesAPIApi* | [**listExternalIdentities**](git/workplace-search-kotlin/docs/ExternalIdentitiesAPIApi.md#listexternalidentities) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities | Retrieves all external identities
*ExternalIdentitiesAPIApi* | [**putExternalIdentity**](git/workplace-search-kotlin/docs/ExternalIdentitiesAPIApi.md#putexternalidentity) | **PUT** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Updates an external identity
*PermissionsAPIApi* | [**addUserPermissions**](git/workplace-search-kotlin/docs/PermissionsAPIApi.md#adduserpermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/add | Adds one or more new permissions atop existing permissions
*PermissionsAPIApi* | [**getUserPermissions**](git/workplace-search-kotlin/docs/PermissionsAPIApi.md#getuserpermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Lists all permissions for one user
*PermissionsAPIApi* | [**listPermissions**](git/workplace-search-kotlin/docs/PermissionsAPIApi.md#listpermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions | Lists all permissions for all users
*PermissionsAPIApi* | [**putUserPermissions**](git/workplace-search-kotlin/docs/PermissionsAPIApi.md#putuserpermissions) | **PUT** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Creates a new set of permissions or over-writes all existing permissions
*PermissionsAPIApi* | [**removeUserPermissions**](git/workplace-search-kotlin/docs/PermissionsAPIApi.md#removeuserpermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/remove | Removes one or more permissions from an existing set of permissions
*SearchAPIApi* | [**search**](git/workplace-search-kotlin/docs/SearchAPIApi.md#search) | **POST** /api/ws/v1/search | Search across available sources with various query tuning options
*SyncJobsAPIApi* | [**commandSyncJobs**](git/workplace-search-kotlin/docs/SyncJobsAPIApi.md#commandsyncjobs) | **POST** /api/ws/v1/sources/{content_source_id}/sync/jobs | Issue commands to a Content Source's sync jobs
*SynonymsAPIApi* | [**createBatchSynonymSets**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#createbatchsynonymsets) | **POST** /api/ws/v1/synonyms | Create a batch of synonym sets
*SynonymsAPIApi* | [**deleteSynonymSet**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#deletesynonymset) | **DELETE** /api/ws/v1/synonyms/{synonym_set_id} | Delete a synonym set
*SynonymsAPIApi* | [**getSynonymSet**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#getsynonymset) | **GET** /api/ws/v1/synonyms/{synonym_set_id} | Retrieve a synonym set by ID
*SynonymsAPIApi* | [**listSynonymSets**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#listsynonymsets) | **GET** /api/ws/v1/synonyms | Retrieves all synonym sets
*SynonymsAPIApi* | [**putSynonymSet**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#putsynonymset) | **PUT** /api/ws/v1/synonyms/{synonym_set_id} | Update a synonym set

<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.elasticsearch.workplace-search.model.AbstractSyncCommand](git/workplace-search-kotlin/docs/AbstractSyncCommand.md)
 - [org.elasticsearch.workplace-search.model.AnalyticsEvent](git/workplace-search-kotlin/docs/AnalyticsEvent.md)
 - [org.elasticsearch.workplace-search.model.AnyOfboostFunctionalRequirements](git/workplace-search-kotlin/docs/AnyOfboostFunctionalRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOfboostItemCenter](git/workplace-search-kotlin/docs/AnyOfboostItemCenter.md)
 - [org.elasticsearch.workplace-search.model.AnyOfboostProximityRequirements](git/workplace-search-kotlin/docs/AnyOfboostProximityRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOfboostValueRequirements](git/workplace-search-kotlin/docs/AnyOfboostValueRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOfeventClickRequirements](git/workplace-search-kotlin/docs/AnyOfeventClickRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOfeventFeedbackRequirements](git/workplace-search-kotlin/docs/AnyOfeventFeedbackRequirements.md)
 - [org.elasticsearch.workplace-search.model.AnyOffacetItem](git/workplace-search-kotlin/docs/AnyOffacetItem.md)
 - [org.elasticsearch.workplace-search.model.AnyOffacetRangeItem](git/workplace-search-kotlin/docs/AnyOffacetRangeItem.md)
 - [org.elasticsearch.workplace-search.model.AnyOfgeoPoint](git/workplace-search-kotlin/docs/AnyOfgeoPoint.md)
 - [org.elasticsearch.workplace-search.model.AnyOfsyncJobsCommand](git/workplace-search-kotlin/docs/AnyOfsyncJobsCommand.md)
 - [org.elasticsearch.workplace-search.model.ArrayOrSingularFilterClausesOrFilter](git/workplace-search-kotlin/docs/ArrayOrSingularFilterClausesOrFilter.md)
 - [org.elasticsearch.workplace-search.model.ArrayOrSingularFilterValue](git/workplace-search-kotlin/docs/ArrayOrSingularFilterValue.md)
 - [org.elasticsearch.workplace-search.model.AutomaticQueryRefinementDetailsResponse](git/workplace-search-kotlin/docs/AutomaticQueryRefinementDetailsResponse.md)
 - [org.elasticsearch.workplace-search.model.BatchSynonymSetsResponse](git/workplace-search-kotlin/docs/BatchSynonymSetsResponse.md)
 - [org.elasticsearch.workplace-search.model.BoostFunctionalRequirements](git/workplace-search-kotlin/docs/BoostFunctionalRequirements.md)
 - [org.elasticsearch.workplace-search.model.BoostIsFunctionalType](git/workplace-search-kotlin/docs/BoostIsFunctionalType.md)
 - [org.elasticsearch.workplace-search.model.BoostIsProximityType](git/workplace-search-kotlin/docs/BoostIsProximityType.md)
 - [org.elasticsearch.workplace-search.model.BoostIsValueType](git/workplace-search-kotlin/docs/BoostIsValueType.md)
 - [org.elasticsearch.workplace-search.model.BoostItem](git/workplace-search-kotlin/docs/BoostItem.md)
 - [org.elasticsearch.workplace-search.model.BoostProximityRequirements](git/workplace-search-kotlin/docs/BoostProximityRequirements.md)
 - [org.elasticsearch.workplace-search.model.BoostValueItemtype](git/workplace-search-kotlin/docs/BoostValueItemtype.md)
 - [org.elasticsearch.workplace-search.model.BoostValueRequirements](git/workplace-search-kotlin/docs/BoostValueRequirements.md)
 - [org.elasticsearch.workplace-search.model.BulkDocuments](git/workplace-search-kotlin/docs/BulkDocuments.md)
 - [org.elasticsearch.workplace-search.model.BulkSynonymSets](git/workplace-search-kotlin/docs/BulkSynonymSets.md)
 - [org.elasticsearch.workplace-search.model.ContentSource](git/workplace-search-kotlin/docs/ContentSource.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceAutomaticQueryRefinement](git/workplace-search-kotlin/docs/ContentSourceAutomaticQueryRefinement.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceAutomaticQueryRefinements](git/workplace-search-kotlin/docs/ContentSourceAutomaticQueryRefinements.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceCreateDefinition](git/workplace-search-kotlin/docs/ContentSourceCreateDefinition.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceDetail](git/workplace-search-kotlin/docs/ContentSourceDetail.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceDisplay](git/workplace-search-kotlin/docs/ContentSourceDisplay.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceDisplayDetail](git/workplace-search-kotlin/docs/ContentSourceDisplayDetail.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceEnabledAutomaticQueryRefinement](git/workplace-search-kotlin/docs/ContentSourceEnabledAutomaticQueryRefinement.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceFacet](git/workplace-search-kotlin/docs/ContentSourceFacet.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceFacets](git/workplace-search-kotlin/docs/ContentSourceFacets.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIconDefinition](git/workplace-search-kotlin/docs/ContentSourceIconDefinition.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexing](git/workplace-search-kotlin/docs/ContentSourceIndexing.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexingFeatures](git/workplace-search-kotlin/docs/ContentSourceIndexingFeatures.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexingFeaturesThumbnails](git/workplace-search-kotlin/docs/ContentSourceIndexingFeaturesThumbnails.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexingResponse](git/workplace-search-kotlin/docs/ContentSourceIndexingResponse.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceIndexingRule](git/workplace-search-kotlin/docs/ContentSourceIndexingRule.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceJobTypeWindow](git/workplace-search-kotlin/docs/ContentSourceJobTypeWindow.md)
 - [org.elasticsearch.workplace-search.model.ContentSourcePartialCreateResponse](git/workplace-search-kotlin/docs/ContentSourcePartialCreateResponse.md)
 - [org.elasticsearch.workplace-search.model.ContentSourcePartialUpdateResponse](git/workplace-search-kotlin/docs/ContentSourcePartialUpdateResponse.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceSchedule](git/workplace-search-kotlin/docs/ContentSourceSchedule.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceScheduleEstimates](git/workplace-search-kotlin/docs/ContentSourceScheduleEstimates.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceScheduleResponse](git/workplace-search-kotlin/docs/ContentSourceScheduleResponse.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceScheduleResponseEstimates](git/workplace-search-kotlin/docs/ContentSourceScheduleResponseEstimates.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceSchema](git/workplace-search-kotlin/docs/ContentSourceSchema.md)
 - [org.elasticsearch.workplace-search.model.ContentSourceUpdateDefinition](git/workplace-search-kotlin/docs/ContentSourceUpdateDefinition.md)
 - [org.elasticsearch.workplace-search.model.CreatedSynonymSetResponse](git/workplace-search-kotlin/docs/CreatedSynonymSetResponse.md)
 - [org.elasticsearch.workplace-search.model.DeleteDocumentsByQueryResponse](git/workplace-search-kotlin/docs/DeleteDocumentsByQueryResponse.md)
 - [org.elasticsearch.workplace-search.model.DeleteExternalIdentitiesResponse](git/workplace-search-kotlin/docs/DeleteExternalIdentitiesResponse.md)
 - [org.elasticsearch.workplace-search.model.Document](git/workplace-search-kotlin/docs/Document.md)
 - [org.elasticsearch.workplace-search.model.DocumentBulkCreateResponse](git/workplace-search-kotlin/docs/DocumentBulkCreateResponse.md)
 - [org.elasticsearch.workplace-search.model.DocumentBulkCreateResponseResults](git/workplace-search-kotlin/docs/DocumentBulkCreateResponseResults.md)
 - [org.elasticsearch.workplace-search.model.DocumentBulkDeleteResponse](git/workplace-search-kotlin/docs/DocumentBulkDeleteResponse.md)
 - [org.elasticsearch.workplace-search.model.DocumentBulkDeleteResponseResults](git/workplace-search-kotlin/docs/DocumentBulkDeleteResponseResults.md)
 - [org.elasticsearch.workplace-search.model.DocumentIds](git/workplace-search-kotlin/docs/DocumentIds.md)
 - [org.elasticsearch.workplace-search.model.DocumentsDeleteDefinition](git/workplace-search-kotlin/docs/DocumentsDeleteDefinition.md)
 - [org.elasticsearch.workplace-search.model.DocumentsDeleteDefinitionFilters](git/workplace-search-kotlin/docs/DocumentsDeleteDefinitionFilters.md)
 - [org.elasticsearch.workplace-search.model.Errors](git/workplace-search-kotlin/docs/Errors.md)
 - [org.elasticsearch.workplace-search.model.ErrorsResponse](git/workplace-search-kotlin/docs/ErrorsResponse.md)
 - [org.elasticsearch.workplace-search.model.EventClickRequirements](git/workplace-search-kotlin/docs/EventClickRequirements.md)
 - [org.elasticsearch.workplace-search.model.EventFeedbackRequirements](git/workplace-search-kotlin/docs/EventFeedbackRequirements.md)
 - [org.elasticsearch.workplace-search.model.EventIsClickType](git/workplace-search-kotlin/docs/EventIsClickType.md)
 - [org.elasticsearch.workplace-search.model.EventIsFeedbackType](git/workplace-search-kotlin/docs/EventIsFeedbackType.md)
 - [org.elasticsearch.workplace-search.model.ExternalId](git/workplace-search-kotlin/docs/ExternalId.md)
 - [org.elasticsearch.workplace-search.model.ExternalIdentity](git/workplace-search-kotlin/docs/ExternalIdentity.md)
 - [org.elasticsearch.workplace-search.model.FacetItem](git/workplace-search-kotlin/docs/FacetItem.md)
 - [org.elasticsearch.workplace-search.model.FacetRange](git/workplace-search-kotlin/docs/FacetRange.md)
 - [org.elasticsearch.workplace-search.model.FacetRangeItem](git/workplace-search-kotlin/docs/FacetRangeItem.md)
 - [org.elasticsearch.workplace-search.model.FacetSort](git/workplace-search-kotlin/docs/FacetSort.md)
 - [org.elasticsearch.workplace-search.model.FacetValue](git/workplace-search-kotlin/docs/FacetValue.md)
 - [org.elasticsearch.workplace-search.model.Filter](git/workplace-search-kotlin/docs/Filter.md)
 - [org.elasticsearch.workplace-search.model.FilterClauses](git/workplace-search-kotlin/docs/FilterClauses.md)
 - [org.elasticsearch.workplace-search.model.FilterClausesOrFilter](git/workplace-search-kotlin/docs/FilterClausesOrFilter.md)
 - [org.elasticsearch.workplace-search.model.FilterValue](git/workplace-search-kotlin/docs/FilterValue.md)
 - [org.elasticsearch.workplace-search.model.GeoDistanceFilter](git/workplace-search-kotlin/docs/GeoDistanceFilter.md)
 - [org.elasticsearch.workplace-search.model.GeoPoint](git/workplace-search-kotlin/docs/GeoPoint.md)
 - [org.elasticsearch.workplace-search.model.GeoRangeFilter](git/workplace-search-kotlin/docs/GeoRangeFilter.md)
 - [org.elasticsearch.workplace-search.model.GeoUnitEnum](git/workplace-search-kotlin/docs/GeoUnitEnum.md)
 - [org.elasticsearch.workplace-search.model.InlineResponse400](git/workplace-search-kotlin/docs/InlineResponse400.md)
 - [org.elasticsearch.workplace-search.model.InlineResponse4001](git/workplace-search-kotlin/docs/InlineResponse4001.md)
 - [org.elasticsearch.workplace-search.model.InterruptSyncCommand](git/workplace-search-kotlin/docs/InterruptSyncCommand.md)
 - [org.elasticsearch.workplace-search.model.InterruptedSyncJobs](git/workplace-search-kotlin/docs/InterruptedSyncJobs.md)
 - [org.elasticsearch.workplace-search.model.LastUpdated](git/workplace-search-kotlin/docs/LastUpdated.md)
 - [org.elasticsearch.workplace-search.model.ListContentSourcesResponse](git/workplace-search-kotlin/docs/ListContentSourcesResponse.md)
 - [org.elasticsearch.workplace-search.model.ListExternalIdentitiesResponse](git/workplace-search-kotlin/docs/ListExternalIdentitiesResponse.md)
 - [org.elasticsearch.workplace-search.model.ListPermissionsResponse](git/workplace-search-kotlin/docs/ListPermissionsResponse.md)
 - [org.elasticsearch.workplace-search.model.ListSynonymSetResponse](git/workplace-search-kotlin/docs/ListSynonymSetResponse.md)
 - [org.elasticsearch.workplace-search.model.ListSynonymSetResponseMeta](git/workplace-search-kotlin/docs/ListSynonymSetResponseMeta.md)
 - [org.elasticsearch.workplace-search.model.ListSynonymSetResponseMetaFilter](git/workplace-search-kotlin/docs/ListSynonymSetResponseMetaFilter.md)
 - [org.elasticsearch.workplace-search.model.ListSynonymSetResponseMetaSort](git/workplace-search-kotlin/docs/ListSynonymSetResponseMetaSort.md)
 - [org.elasticsearch.workplace-search.model.MetaPage](git/workplace-search-kotlin/docs/MetaPage.md)
 - [org.elasticsearch.workplace-search.model.MetaPagePage](git/workplace-search-kotlin/docs/MetaPagePage.md)
 - [org.elasticsearch.workplace-search.model.OneOfarrayOrSingularFilterClausesOrFilter](git/workplace-search-kotlin/docs/OneOfarrayOrSingularFilterClausesOrFilter.md)
 - [org.elasticsearch.workplace-search.model.OneOfarrayOrSingularFilterValue](git/workplace-search-kotlin/docs/OneOfarrayOrSingularFilterValue.md)
 - [org.elasticsearch.workplace-search.model.OneOfboostValueItemtype](git/workplace-search-kotlin/docs/OneOfboostValueItemtype.md)
 - [org.elasticsearch.workplace-search.model.OneOffacetRangeItemFrom](git/workplace-search-kotlin/docs/OneOffacetRangeItemFrom.md)
 - [org.elasticsearch.workplace-search.model.OneOffacetRangeItemTo](git/workplace-search-kotlin/docs/OneOffacetRangeItemTo.md)
 - [org.elasticsearch.workplace-search.model.OneOffilterClausesOrFilter](git/workplace-search-kotlin/docs/OneOffilterClausesOrFilter.md)
 - [org.elasticsearch.workplace-search.model.OneOffilterValue](git/workplace-search-kotlin/docs/OneOffilterValue.md)
 - [org.elasticsearch.workplace-search.model.OneOfinlineResponse400](git/workplace-search-kotlin/docs/OneOfinlineResponse400.md)
 - [org.elasticsearch.workplace-search.model.OneOfinlineResponse4001](git/workplace-search-kotlin/docs/OneOfinlineResponse4001.md)
 - [org.elasticsearch.workplace-search.model.OneOflistSynonymSetResponseMetaFilterTerms](git/workplace-search-kotlin/docs/OneOflistSynonymSetResponseMetaFilterTerms.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchApiQuerySort](git/workplace-search-kotlin/docs/OneOfsearchApiQuerySort.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchFacetResponseItemDataFrom](git/workplace-search-kotlin/docs/OneOfsearchFacetResponseItemDataFrom.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchFacetResponseItemDataTo](git/workplace-search-kotlin/docs/OneOfsearchFacetResponseItemDataTo.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchFacetResponseItemDataValue](git/workplace-search-kotlin/docs/OneOfsearchFacetResponseItemDataValue.md)
 - [org.elasticsearch.workplace-search.model.OneOfsearchFacetsResponse](git/workplace-search-kotlin/docs/OneOfsearchFacetsResponse.md)
 - [org.elasticsearch.workplace-search.model.OneOfsyncJobsCommandResponseResults](git/workplace-search-kotlin/docs/OneOfsyncJobsCommandResponseResults.md)
 - [org.elasticsearch.workplace-search.model.OneOfsynonymsCreateDefinition](git/workplace-search-kotlin/docs/OneOfsynonymsCreateDefinition.md)
 - [org.elasticsearch.workplace-search.model.OneOfsynonymsTermsFilter](git/workplace-search-kotlin/docs/OneOfsynonymsTermsFilter.md)
 - [org.elasticsearch.workplace-search.model.Permission](git/workplace-search-kotlin/docs/Permission.md)
 - [org.elasticsearch.workplace-search.model.Permissions](git/workplace-search-kotlin/docs/Permissions.md)
 - [org.elasticsearch.workplace-search.model.PermissionsUser](git/workplace-search-kotlin/docs/PermissionsUser.md)
 - [org.elasticsearch.workplace-search.model.QueryRefinementItem](git/workplace-search-kotlin/docs/QueryRefinementItem.md)
 - [org.elasticsearch.workplace-search.model.Range](git/workplace-search-kotlin/docs/Range.md)
 - [org.elasticsearch.workplace-search.model.RangeFilter](git/workplace-search-kotlin/docs/RangeFilter.md)
 - [org.elasticsearch.workplace-search.model.RecordDeletedResponse](git/workplace-search-kotlin/docs/RecordDeletedResponse.md)
 - [org.elasticsearch.workplace-search.model.SearchApiEndpointResponse](git/workplace-search-kotlin/docs/SearchApiEndpointResponse.md)
 - [org.elasticsearch.workplace-search.model.SearchApiEndpointResponseMeta](git/workplace-search-kotlin/docs/SearchApiEndpointResponseMeta.md)
 - [org.elasticsearch.workplace-search.model.SearchApiMetaContentSource](git/workplace-search-kotlin/docs/SearchApiMetaContentSource.md)
 - [org.elasticsearch.workplace-search.model.SearchApiMetaContentSources](git/workplace-search-kotlin/docs/SearchApiMetaContentSources.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQuery](git/workplace-search-kotlin/docs/SearchApiQuery.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQueryPage](git/workplace-search-kotlin/docs/SearchApiQueryPage.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQueryRaw](git/workplace-search-kotlin/docs/SearchApiQueryRaw.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQueryRefinement](git/workplace-search-kotlin/docs/SearchApiQueryRefinement.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQueryResultFields](git/workplace-search-kotlin/docs/SearchApiQueryResultFields.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQuerySearchFields](git/workplace-search-kotlin/docs/SearchApiQuerySearchFields.md)
 - [org.elasticsearch.workplace-search.model.SearchApiQuerySnippet](git/workplace-search-kotlin/docs/SearchApiQuerySnippet.md)
 - [org.elasticsearch.workplace-search.model.SearchApiResultItem](git/workplace-search-kotlin/docs/SearchApiResultItem.md)
 - [org.elasticsearch.workplace-search.model.SearchApiResultItemMeta](git/workplace-search-kotlin/docs/SearchApiResultItemMeta.md)
 - [org.elasticsearch.workplace-search.model.SearchFacetResponseItem](git/workplace-search-kotlin/docs/SearchFacetResponseItem.md)
 - [org.elasticsearch.workplace-search.model.SearchFacetResponseItemData](git/workplace-search-kotlin/docs/SearchFacetResponseItemData.md)
 - [org.elasticsearch.workplace-search.model.SearchFacetsResponse](git/workplace-search-kotlin/docs/SearchFacetsResponse.md)
 - [org.elasticsearch.workplace-search.model.SearchGroup](git/workplace-search-kotlin/docs/SearchGroup.md)
 - [org.elasticsearch.workplace-search.model.SingleDocumentResponse](git/workplace-search-kotlin/docs/SingleDocumentResponse.md)
 - [org.elasticsearch.workplace-search.model.SingleSynonymSet](git/workplace-search-kotlin/docs/SingleSynonymSet.md)
 - [org.elasticsearch.workplace-search.model.SingleSynonymSetObject](git/workplace-search-kotlin/docs/SingleSynonymSetObject.md)
 - [org.elasticsearch.workplace-search.model.SingleSynonymSetResponse](git/workplace-search-kotlin/docs/SingleSynonymSetResponse.md)
 - [org.elasticsearch.workplace-search.model.Sort](git/workplace-search-kotlin/docs/Sort.md)
 - [org.elasticsearch.workplace-search.model.StartSyncCommand](git/workplace-search-kotlin/docs/StartSyncCommand.md)
 - [org.elasticsearch.workplace-search.model.StartedSyncJobs](git/workplace-search-kotlin/docs/StartedSyncJobs.md)
 - [org.elasticsearch.workplace-search.model.SyncJobDefinition](git/workplace-search-kotlin/docs/SyncJobDefinition.md)
 - [org.elasticsearch.workplace-search.model.SyncJobsCommand](git/workplace-search-kotlin/docs/SyncJobsCommand.md)
 - [org.elasticsearch.workplace-search.model.SyncJobsCommandResponse](git/workplace-search-kotlin/docs/SyncJobsCommandResponse.md)
 - [org.elasticsearch.workplace-search.model.SynonymsCreateDefinition](git/workplace-search-kotlin/docs/SynonymsCreateDefinition.md)
 - [org.elasticsearch.workplace-search.model.SynonymsFilter](git/workplace-search-kotlin/docs/SynonymsFilter.md)
 - [org.elasticsearch.workplace-search.model.SynonymsListDefinition](git/workplace-search-kotlin/docs/SynonymsListDefinition.md)
 - [org.elasticsearch.workplace-search.model.SynonymsPage](git/workplace-search-kotlin/docs/SynonymsPage.md)
 - [org.elasticsearch.workplace-search.model.SynonymsSort](git/workplace-search-kotlin/docs/SynonymsSort.md)
 - [org.elasticsearch.workplace-search.model.SynonymsTermsFilter](git/workplace-search-kotlin/docs/SynonymsTermsFilter.md)
 - [org.elasticsearch.workplace-search.model.SynonymsUpdateDefinition](git/workplace-search-kotlin/docs/SynonymsUpdateDefinition.md)
 - [org.elasticsearch.workplace-search.model.TriggersBlocklistDefinition](git/workplace-search-kotlin/docs/TriggersBlocklistDefinition.md)
 - [org.elasticsearch.workplace-search.model.TriggersBlocklistWrapperDefinition](git/workplace-search-kotlin/docs/TriggersBlocklistWrapperDefinition.md)
 - [org.elasticsearch.workplace-search.model.UploadIconsResponse](git/workplace-search-kotlin/docs/UploadIconsResponse.md)
 - [org.elasticsearch.workplace-search.model.UploadIconsResponseResults](git/workplace-search-kotlin/docs/UploadIconsResponseResults.md)
 - [org.elasticsearch.workplace-search.model.WhoamiResponse](git/workplace-search-kotlin/docs/WhoamiResponse.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basic_auth"></a>
### basic_auth

- **Type**: HTTP basic authentication

<a name="bearer_auth"></a>
### bearer_auth


# workplace-search-kotlin
