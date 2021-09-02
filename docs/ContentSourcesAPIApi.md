# ContentSourcesAPIApi

All URIs are relative to *http://localhost:3002*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContentSource**](ContentSourcesAPIApi.md#createContentSource) | **POST** /api/ws/v1/sources | Create a content source
[**deleteContentSource**](ContentSourcesAPIApi.md#deleteContentSource) | **DELETE** /api/ws/v1/sources/{content_source_id} | Deletes a content source by ID
[**getAutoQueryRefinementDetails**](ContentSourcesAPIApi.md#getAutoQueryRefinementDetails) | **GET** /api/ws/v1/sources/{content_source_id}/automatic_query_refinement | Retrieves a content source&#39;s automatic query refinement details
[**getContentSource**](ContentSourcesAPIApi.md#getContentSource) | **GET** /api/ws/v1/sources/{content_source_id} | Retrieves a content source by ID
[**listContentSources**](ContentSourcesAPIApi.md#listContentSources) | **GET** /api/ws/v1/sources | Retrieves all content sources
[**putContentSource**](ContentSourcesAPIApi.md#putContentSource) | **PUT** /api/ws/v1/sources/{content_source_id} | Update a content source
[**putContentSourceIcons**](ContentSourcesAPIApi.md#putContentSourceIcons) | **PUT** /api/ws/v1/sources/{content_source_id}/icon | Upload content source icons


<a name="createContentSource"></a>
# **createContentSource**
> ContentSource createContentSource(contentSourceCreateDefinition)

Create a content source

Create a custom content source

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = ContentSourcesAPIApi()
val contentSourceCreateDefinition : ContentSourceCreateDefinition =  // ContentSourceCreateDefinition | 
try {
    val result : ContentSource = apiInstance.createContentSource(contentSourceCreateDefinition)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentSourcesAPIApi#createContentSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentSourcesAPIApi#createContentSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceCreateDefinition** | [**ContentSourceCreateDefinition**](ContentSourceCreateDefinition.md)|  |

### Return type

[**ContentSource**](ContentSource.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContentSource"></a>
# **deleteContentSource**
> RecordDeletedResponse deleteContentSource(contentSourceId)

Deletes a content source by ID

Deletes a content source by ID

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = ContentSourcesAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
try {
    val result : RecordDeletedResponse = apiInstance.deleteContentSource(contentSourceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentSourcesAPIApi#deleteContentSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentSourcesAPIApi#deleteContentSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |

### Return type

[**RecordDeletedResponse**](RecordDeletedResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAutoQueryRefinementDetails"></a>
# **getAutoQueryRefinementDetails**
> AutomaticQueryRefinementDetailsResponse getAutoQueryRefinementDetails(contentSourceId)

Retrieves a content source&#39;s automatic query refinement details

Retrieves a content source&#39;s automatic query refinement details

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = ContentSourcesAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
try {
    val result : AutomaticQueryRefinementDetailsResponse = apiInstance.getAutoQueryRefinementDetails(contentSourceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentSourcesAPIApi#getAutoQueryRefinementDetails")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentSourcesAPIApi#getAutoQueryRefinementDetails")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |

### Return type

[**AutomaticQueryRefinementDetailsResponse**](AutomaticQueryRefinementDetailsResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContentSource"></a>
# **getContentSource**
> ContentSource getContentSource(contentSourceId)

Retrieves a content source by ID

Retrieves a content source by ID

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = ContentSourcesAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
try {
    val result : ContentSource = apiInstance.getContentSource(contentSourceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentSourcesAPIApi#getContentSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentSourcesAPIApi#getContentSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |

### Return type

[**ContentSource**](ContentSource.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listContentSources"></a>
# **listContentSources**
> ListContentSourcesResponse listContentSources(currentPage, pageSize)

Retrieves all content sources

Retrieves all content sources

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = ContentSourcesAPIApi()
val currentPage : kotlin.Int = 56 // kotlin.Int | Which page of results to request
val pageSize : kotlin.Int = 56 // kotlin.Int | The number of results to return in a page
try {
    val result : ListContentSourcesResponse = apiInstance.listContentSources(currentPage, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentSourcesAPIApi#listContentSources")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentSourcesAPIApi#listContentSources")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currentPage** | **kotlin.Int**| Which page of results to request | [optional]
 **pageSize** | **kotlin.Int**| The number of results to return in a page | [optional]

### Return type

[**ListContentSourcesResponse**](ListContentSourcesResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putContentSource"></a>
# **putContentSource**
> ContentSource putContentSource(contentSourceId, contentSourceUpdateDefinition)

Update a content source

Update a content source

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = ContentSourcesAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val contentSourceUpdateDefinition : ContentSourceUpdateDefinition =  // ContentSourceUpdateDefinition | 
try {
    val result : ContentSource = apiInstance.putContentSource(contentSourceId, contentSourceUpdateDefinition)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentSourcesAPIApi#putContentSource")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentSourcesAPIApi#putContentSource")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **contentSourceUpdateDefinition** | [**ContentSourceUpdateDefinition**](ContentSourceUpdateDefinition.md)|  |

### Return type

[**ContentSource**](ContentSource.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putContentSourceIcons"></a>
# **putContentSourceIcons**
> UploadIconsResponse putContentSourceIcons(contentSourceId, contentSourceIconDefinition)

Upload content source icons

Upload content source icons

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = ContentSourcesAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val contentSourceIconDefinition : ContentSourceIconDefinition =  // ContentSourceIconDefinition | 
try {
    val result : UploadIconsResponse = apiInstance.putContentSourceIcons(contentSourceId, contentSourceIconDefinition)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentSourcesAPIApi#putContentSourceIcons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentSourcesAPIApi#putContentSourceIcons")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **contentSourceIconDefinition** | [**ContentSourceIconDefinition**](ContentSourceIconDefinition.md)|  |

### Return type

[**UploadIconsResponse**](UploadIconsResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

