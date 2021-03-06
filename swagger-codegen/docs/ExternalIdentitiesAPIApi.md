# ExternalIdentitiesAPIApi

All URIs are relative to *{schemes}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExternalIdentity**](git/workplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#createExternalIdentity) | **POST** /api/ws/v1/sources/{content_source_id}/external_identities | Adds a new external identity
[**deleteExternalIdentity**](git/workplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#deleteExternalIdentity) | **DELETE** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Deletes an external identity
[**getExternalIdentity**](git/workplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#getExternalIdentity) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Retrieves an external identity
[**listExternalIdentities**](git/workplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#listExternalIdentities) | **GET** /api/ws/v1/sources/{content_source_id}/external_identities | Retrieves all external identities
[**putExternalIdentity**](git/workplace-search-kotlin/swagger-codegen/docs/ExternalIdentitiesAPIApi.md#putExternalIdentity) | **PUT** /api/ws/v1/sources/{content_source_id}/external_identities/{user} | Updates an external identity

<a name="createExternalIdentity"></a>
# **createExternalIdentity**
> ExternalIdentity createExternalIdentity(body, contentSourceId)

Adds a new external identity

Adds a new external identity

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = ExternalIdentitiesAPIApi()
val body : ExternalIdentity =  // ExternalIdentity | 
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
try {
    val result : ExternalIdentity = apiInstance.createExternalIdentity(body, contentSourceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalIdentitiesAPIApi#createExternalIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalIdentitiesAPIApi#createExternalIdentity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalIdentity**](ExternalIdentity.md)|  |
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |

### Return type

[**ExternalIdentity**](ExternalIdentity.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExternalIdentity"></a>
# **deleteExternalIdentity**
> DeleteExternalIdentitiesResponse deleteExternalIdentity(contentSourceId, user)

Deletes an external identity

Deletes an external identity

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = ExternalIdentitiesAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val user : kotlin.String = user_example // kotlin.String | The username in context
try {
    val result : DeleteExternalIdentitiesResponse = apiInstance.deleteExternalIdentity(contentSourceId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalIdentitiesAPIApi#deleteExternalIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalIdentitiesAPIApi#deleteExternalIdentity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **user** | **kotlin.String**| The username in context |

### Return type

[**DeleteExternalIdentitiesResponse**](DeleteExternalIdentitiesResponse.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExternalIdentity"></a>
# **getExternalIdentity**
> ExternalIdentity getExternalIdentity(contentSourceId, user)

Retrieves an external identity

Retrieves an external identity

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = ExternalIdentitiesAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val user : kotlin.String = user_example // kotlin.String | The username in context
try {
    val result : ExternalIdentity = apiInstance.getExternalIdentity(contentSourceId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalIdentitiesAPIApi#getExternalIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalIdentitiesAPIApi#getExternalIdentity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **user** | **kotlin.String**| The username in context |

### Return type

[**ExternalIdentity**](ExternalIdentity.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listExternalIdentities"></a>
# **listExternalIdentities**
> ListExternalIdentitiesResponse listExternalIdentities(contentSourceId, currentPage, pageSize)

Retrieves all external identities

Retrieves all external identities

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = ExternalIdentitiesAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val currentPage : kotlin.Int = 56 // kotlin.Int | Which page of results to request
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of results to return in a page
try {
    val result : ListExternalIdentitiesResponse = apiInstance.listExternalIdentities(contentSourceId, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalIdentitiesAPIApi#listExternalIdentities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalIdentitiesAPIApi#listExternalIdentities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **currentPage** | **kotlin.Int**| Which page of results to request | [optional]
 **pageSize** | **kotlin.Int**| The number of results to return in a page | [optional]

### Return type

[**ListExternalIdentitiesResponse**](ListExternalIdentitiesResponse.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putExternalIdentity"></a>
# **putExternalIdentity**
> ExternalIdentity putExternalIdentity(body, contentSourceId, user)

Updates an external identity

Updates an external identity

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = ExternalIdentitiesAPIApi()
val body : ExternalIdentity =  // ExternalIdentity | 
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val user : kotlin.String = user_example // kotlin.String | The username in context
try {
    val result : ExternalIdentity = apiInstance.putExternalIdentity(body, contentSourceId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExternalIdentitiesAPIApi#putExternalIdentity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExternalIdentitiesAPIApi#putExternalIdentity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExternalIdentity**](ExternalIdentity.md)|  |
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **user** | **kotlin.String**| The username in context |

### Return type

[**ExternalIdentity**](ExternalIdentity.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

