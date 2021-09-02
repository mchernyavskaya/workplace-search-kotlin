# SearchAPIApi

All URIs are relative to *http://localhost:3002*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchAPIApi.md#search) | **POST** /api/ws/v1/search | Search across available sources with various query tuning options


<a name="search"></a>
# **search**
> SearchApiEndpointResponse search(searchApiQuery)

Search across available sources with various query tuning options

Issue a Search Query

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = SearchAPIApi()
val searchApiQuery : SearchApiQuery =  // SearchApiQuery | 
try {
    val result : SearchApiEndpointResponse = apiInstance.search(searchApiQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchAPIApi#search")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchAPIApi#search")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchApiQuery** | [**SearchApiQuery**](SearchApiQuery.md)|  |

### Return type

[**SearchApiEndpointResponse**](SearchApiEndpointResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
