# SynonymsAPIApi

All URIs are relative to *http://localhost:3002*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBatchSynonymSets**](git/workplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#createBatchSynonymSets) | **POST** /api/ws/v1/synonyms | Create a batch of synonym sets
[**deleteSynonymSet**](git/workplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#deleteSynonymSet) | **DELETE** /api/ws/v1/synonyms/{synonym_set_id} | Delete a synonym set
[**getSynonymSet**](git/workplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#getSynonymSet) | **GET** /api/ws/v1/synonyms/{synonym_set_id} | Retrieve a synonym set by ID
[**listSynonymSets**](git/workplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#listSynonymSets) | **GET** /api/ws/v1/synonyms | Retrieves all synonym sets
[**putSynonymSet**](git/workplace-search-kotlin/openapi-generator/docs/SynonymsAPIApi.md#putSynonymSet) | **PUT** /api/ws/v1/synonyms/{synonym_set_id} | Update a synonym set


<a name="createBatchSynonymSets"></a>
# **createBatchSynonymSets**
> BatchSynonymSetsResponse createBatchSynonymSets(synonymsCreateDefinition)

Create a batch of synonym sets

Create batched synonym sets

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SynonymsAPIApi()
val synonymsCreateDefinition : SynonymsCreateDefinition =  // SynonymsCreateDefinition | 
try {
    val result : BatchSynonymSetsResponse = apiInstance.createBatchSynonymSets(synonymsCreateDefinition)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SynonymsAPIApi#createBatchSynonymSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SynonymsAPIApi#createBatchSynonymSets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **synonymsCreateDefinition** | [**SynonymsCreateDefinition**](git/workplace-search-kotlin/openapi-generator/docs/SynonymsCreateDefinition.md)|  |

### Return type

[**BatchSynonymSetsResponse**](git/workplace-search-kotlin/openapi-generator/docs/BatchSynonymSetsResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSynonymSet"></a>
# **deleteSynonymSet**
> RecordDeletedResponse deleteSynonymSet(synonymSetId)

Delete a synonym set

Delete a synonym set

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SynonymsAPIApi()
val synonymSetId : kotlin.String = synonymSetId_example // kotlin.String | Unique ID for a synonym set. Provided upon or returned at creation.
try {
    val result : RecordDeletedResponse = apiInstance.deleteSynonymSet(synonymSetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SynonymsAPIApi#deleteSynonymSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SynonymsAPIApi#deleteSynonymSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **synonymSetId** | **kotlin.String**| Unique ID for a synonym set. Provided upon or returned at creation. |

### Return type

[**RecordDeletedResponse**](git/workplace-search-kotlin/openapi-generator/docs/RecordDeletedResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSynonymSet"></a>
# **getSynonymSet**
> SingleSynonymSetResponse getSynonymSet(synonymSetId)

Retrieve a synonym set by ID

Retrieve a synonym set by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SynonymsAPIApi()
val synonymSetId : kotlin.String = synonymSetId_example // kotlin.String | Unique ID for a synonym set. Provided upon or returned at creation.
try {
    val result : SingleSynonymSetResponse = apiInstance.getSynonymSet(synonymSetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SynonymsAPIApi#getSynonymSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SynonymsAPIApi#getSynonymSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **synonymSetId** | **kotlin.String**| Unique ID for a synonym set. Provided upon or returned at creation. |

### Return type

[**SingleSynonymSetResponse**](git/workplace-search-kotlin/openapi-generator/docs/SingleSynonymSetResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSynonymSets"></a>
# **listSynonymSets**
> ListSynonymSetResponse listSynonymSets(synonymsListDefinition)

Retrieves all synonym sets

Retrieve a list of synonym sets

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SynonymsAPIApi()
val synonymsListDefinition : SynonymsListDefinition =  // SynonymsListDefinition | 
try {
    val result : ListSynonymSetResponse = apiInstance.listSynonymSets(synonymsListDefinition)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SynonymsAPIApi#listSynonymSets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SynonymsAPIApi#listSynonymSets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **synonymsListDefinition** | [**SynonymsListDefinition**](git/workplace-search-kotlin/openapi-generator/docs/SynonymsListDefinition.md)|  | [optional]

### Return type

[**ListSynonymSetResponse**](git/workplace-search-kotlin/openapi-generator/docs/ListSynonymSetResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSynonymSet"></a>
# **putSynonymSet**
> SingleSynonymSetResponse putSynonymSet(synonymSetId, synonymsUpdateDefinition)

Update a synonym set

Update a synonym set

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SynonymsAPIApi()
val synonymSetId : kotlin.String = synonymSetId_example // kotlin.String | Unique ID for a synonym set. Provided upon or returned at creation.
val synonymsUpdateDefinition : SynonymsUpdateDefinition =  // SynonymsUpdateDefinition | 
try {
    val result : SingleSynonymSetResponse = apiInstance.putSynonymSet(synonymSetId, synonymsUpdateDefinition)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SynonymsAPIApi#putSynonymSet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SynonymsAPIApi#putSynonymSet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **synonymSetId** | **kotlin.String**| Unique ID for a synonym set. Provided upon or returned at creation. |
 **synonymsUpdateDefinition** | [**SynonymsUpdateDefinition**](git/workplace-search-kotlin/openapi-generator/docs/SynonymsUpdateDefinition.md)|  |

### Return type

[**SingleSynonymSetResponse**](git/workplace-search-kotlin/openapi-generator/docs/SingleSynonymSetResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

