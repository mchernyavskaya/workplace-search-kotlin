# SyncJobsAPIApi

All URIs are relative to *http://localhost:3002*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commandSyncJobs**](git/workplace-search-kotlin/openapi-generator/docs/SyncJobsAPIApi.md#commandSyncJobs) | **POST** /api/ws/v1/sources/{content_source_id}/sync/jobs | Issue commands to a Content Source&#39;s sync jobs


<a name="commandSyncJobs"></a>
# **commandSyncJobs**
> SyncJobsCommandResponse commandSyncJobs(contentSourceId, syncJobsCommand, jobType)

Issue commands to a Content Source&#39;s sync jobs

Control a content source&#39;s sync jobs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SyncJobsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val syncJobsCommand : SyncJobsCommand =  // SyncJobsCommand | 
val jobType : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | The type of sync job to consider
try {
    val result : SyncJobsCommandResponse = apiInstance.commandSyncJobs(contentSourceId, syncJobsCommand, jobType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncJobsAPIApi#commandSyncJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncJobsAPIApi#commandSyncJobs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **syncJobsCommand** | [**SyncJobsCommand**](git/workplace-search-kotlin/openapi-generator/docs/SyncJobsCommand.md)|  |
 **jobType** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The type of sync job to consider | [optional] [enum: full, incremental, delete, permissions]

### Return type

[**SyncJobsCommandResponse**](git/workplace-search-kotlin/openapi-generator/docs/SyncJobsCommandResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

