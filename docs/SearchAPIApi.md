# SearchAPIApi

All URIs are relative to *{schemes}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchAPIApi.md#search) | **POST** /api/ws/v1/search | Search across available sources with various query tuning options

<a name="search"></a>
# **search**
> SearchApiEndpointResponse search(body)

Search across available sources with various query tuning options

Issue a Search Query

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = SearchAPIApi()
val body : SearchApiQuery =  // SearchApiQuery | 
try {
    val result : SearchApiEndpointResponse = apiInstance.search(body)
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
 **body** | [**SearchApiQuery**](SearchApiQuery.md)|  |

### Return type

[**SearchApiEndpointResponse**](SearchApiEndpointResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

