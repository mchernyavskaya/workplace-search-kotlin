# PermissionsAPIApi

All URIs are relative to *{schemes}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserPermissions**](git/workplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#addUserPermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/add | Adds one or more new permissions atop existing permissions
[**getUserPermissions**](git/workplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#getUserPermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Lists all permissions for one user
[**listPermissions**](git/workplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#listPermissions) | **GET** /api/ws/v1/sources/{content_source_id}/permissions | Lists all permissions for all users
[**putUserPermissions**](git/workplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#putUserPermissions) | **PUT** /api/ws/v1/sources/{content_source_id}/permissions/{user} | Creates a new set of permissions or over-writes all existing permissions
[**removeUserPermissions**](git/workplace-search-kotlin/swagger-codegen/docs/PermissionsAPIApi.md#removeUserPermissions) | **POST** /api/ws/v1/sources/{content_source_id}/permissions/{user}/remove | Removes one or more permissions from an existing set of permissions

<a name="addUserPermissions"></a>
# **addUserPermissions**
> PermissionsUser addUserPermissions(body, contentSourceId, user)

Adds one or more new permissions atop existing permissions

Add one or more permission for a given user. Permissions are added atop the existing

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = PermissionsAPIApi()
val body : kotlin.Array<Permission> =  // kotlin.Array<Permission> | 
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val user : kotlin.String = user_example // kotlin.String | The username in context
try {
    val result : PermissionsUser = apiInstance.addUserPermissions(body, contentSourceId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsAPIApi#addUserPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsAPIApi#addUserPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;Permission&gt;**](git/workplace-search-kotlin/swagger-codegen/docs/Permission.md)|  |
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **user** | **kotlin.String**| The username in context |

### Return type

[**PermissionsUser**](PermissionsUser.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserPermissions"></a>
# **getUserPermissions**
> PermissionsUser getUserPermissions(contentSourceId, user)

Lists all permissions for one user

List permissions for a user

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = PermissionsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val user : kotlin.String = user_example // kotlin.String | The username in context
try {
    val result : PermissionsUser = apiInstance.getUserPermissions(contentSourceId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsAPIApi#getUserPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsAPIApi#getUserPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **user** | **kotlin.String**| The username in context |

### Return type

[**PermissionsUser**](PermissionsUser.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPermissions"></a>
# **listPermissions**
> ListPermissionsResponse listPermissions(contentSourceId, currentPage, pageSize)

Lists all permissions for all users

List all permissions for all users

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = PermissionsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val currentPage : kotlin.Int = 56 // kotlin.Int | Which page of results to request
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of results to return in a page
try {
    val result : ListPermissionsResponse = apiInstance.listPermissions(contentSourceId, currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsAPIApi#listPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsAPIApi#listPermissions")
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

[**ListPermissionsResponse**](ListPermissionsResponse.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putUserPermissions"></a>
# **putUserPermissions**
> PermissionsUser putUserPermissions(body, contentSourceId, user)

Creates a new set of permissions or over-writes all existing permissions

Create a set of permissions or overwrite existing permissions

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = PermissionsAPIApi()
val body : kotlin.Array<Permission> =  // kotlin.Array<Permission> | 
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val user : kotlin.String = user_example // kotlin.String | The username in context
try {
    val result : PermissionsUser = apiInstance.putUserPermissions(body, contentSourceId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsAPIApi#putUserPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsAPIApi#putUserPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;Permission&gt;**](git/workplace-search-kotlin/swagger-codegen/docs/Permission.md)|  |
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **user** | **kotlin.String**| The username in context |

### Return type

[**PermissionsUser**](PermissionsUser.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeUserPermissions"></a>
# **removeUserPermissions**
> PermissionsUser removeUserPermissions(body, contentSourceId, user)

Removes one or more permissions from an existing set of permissions

Remove one or more permission for a given user

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = PermissionsAPIApi()
val body : kotlin.Array<Permission> =  // kotlin.Array<Permission> | 
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val user : kotlin.String = user_example // kotlin.String | The username in context
try {
    val result : PermissionsUser = apiInstance.removeUserPermissions(body, contentSourceId, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsAPIApi#removeUserPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsAPIApi#removeUserPermissions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**kotlin.Array&lt;Permission&gt;**](git/workplace-search-kotlin/swagger-codegen/docs/Permission.md)|  |
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **user** | **kotlin.String**| The username in context |

### Return type

[**PermissionsUser**](PermissionsUser.md)

### Authorization

[bearer_auth](git/workplace-search-kotlin/swagger-codegen/README.mde-search-kotlin/swagger-codegen/README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

