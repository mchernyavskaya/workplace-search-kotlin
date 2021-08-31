# SyncJobsAPIApi

All URIs are relative to *{schemes}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commandSyncJobs**](git/workplace-search-kotlin/docs/SyncJobsAPIApi.md#commandSyncJobs) | **POST** /api/ws/v1/sources/{content_source_id}/sync/jobs | Issue commands to a Content Source&#x27;s sync jobs

<a name="commandSyncJobs"></a>
# **commandSyncJobs**
> SyncJobsCommandResponse commandSyncJobs(body, contentSourceId, jobType)

Issue commands to a Content Source&#x27;s sync jobs

Control a content source&#x27;s sync jobs

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import org.elasticsearch.workplace-search.model.*;

val apiInstance = SyncJobsAPIApi()
val body : SyncJobsCommand =  // SyncJobsCommand | 
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val jobType : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | The type of sync job to consider
try {
    val result : SyncJobsCommandResponse = apiInstance.commandSyncJobs(body, contentSourceId, jobType)
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
 **body** | [**SyncJobsCommand**](SyncJobsCommand.md)|  |
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **jobType** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| The type of sync job to consider | [optional]

### Return type

[**SyncJobsCommandResponse**](SyncJobsCommandResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

