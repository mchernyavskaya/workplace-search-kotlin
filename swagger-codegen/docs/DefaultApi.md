# DefaultApi

All URIs are relative to *{schemes}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](git/workplace-search-kotlin/swagger-codegen/docs/DefaultApi.md#getCurrentUser) | **GET** /api/ws/v1/whoami | Get the authenticated user
[**getTriggersBlocklist**](git/workplace-search-kotlin/swagger-codegen/docs/DefaultApi.md#getTriggersBlocklist) | **GET** /api/ws/v1/automatic_query_refinement | Get current triggers blocklist
[**putTriggersBlocklist**](git/workplace-search-kotlin/swagger-codegen/docs/DefaultApi.md#putTriggersBlocklist) | **PUT** /api/ws/v1/automatic_query_refinement | Update current triggers blocklist

<a name="getCurrentUser"></a>
# **getCurrentUser**
> WhoamiResponse getCurrentUser(getToken)

Get the authenticated user

Get the authenticated user

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = DefaultApi()
val getToken : kotlin.Boolean = true // kotlin.Boolean | Whether or not to include an access token in the response.
try {
    val result : WhoamiResponse = apiInstance.getCurrentUser(getToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getCurrentUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getCurrentUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getToken** | **kotlin.Boolean**| Whether or not to include an access token in the response. | [optional] [default to false]

### Return type

[**WhoamiResponse**](WhoamiResponse.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTriggersBlocklist"></a>
# **getTriggersBlocklist**
> TriggersBlocklistWrapperDefinition getTriggersBlocklist()

Get current triggers blocklist

Get current triggers blocklist

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = DefaultApi()
try {
    val result : TriggersBlocklistWrapperDefinition = apiInstance.getTriggersBlocklist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getTriggersBlocklist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getTriggersBlocklist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TriggersBlocklistWrapperDefinition**](TriggersBlocklistWrapperDefinition.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putTriggersBlocklist"></a>
# **putTriggersBlocklist**
> TriggersBlocklistWrapperDefinition putTriggersBlocklist()

Update current triggers blocklist

Update current triggers blocklist

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = DefaultApi()
try {
    val result : TriggersBlocklistWrapperDefinition = apiInstance.putTriggersBlocklist()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#putTriggersBlocklist")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#putTriggersBlocklist")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TriggersBlocklistWrapperDefinition**](TriggersBlocklistWrapperDefinition.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

