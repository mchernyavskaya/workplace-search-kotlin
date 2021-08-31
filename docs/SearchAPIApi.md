# SearchAPIApi

All URIs are relative to *{schemes}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](git/workplace-search-kotlin/docs/SearchAPIApi.md#search) | **POST** /api/ws/v1/search | Search across available sources with various query tuning options

<a name="search"></a>
# **search**
> SearchApiEndpointResponse search(body)

Search across available sources with various query tuning options

Issue a Search Query

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import org.elasticsearch.workplace-search.model.*;

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

