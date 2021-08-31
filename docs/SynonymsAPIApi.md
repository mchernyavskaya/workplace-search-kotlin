# SynonymsAPIApi

All URIs are relative to *{schemes}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBatchSynonymSets**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#createBatchSynonymSets) | **POST** /api/ws/v1/synonyms | Create a batch of synonym sets
[**deleteSynonymSet**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#deleteSynonymSet) | **DELETE** /api/ws/v1/synonyms/{synonym_set_id} | Delete a synonym set
[**getSynonymSet**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#getSynonymSet) | **GET** /api/ws/v1/synonyms/{synonym_set_id} | Retrieve a synonym set by ID
[**listSynonymSets**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#listSynonymSets) | **GET** /api/ws/v1/synonyms | Retrieves all synonym sets
[**putSynonymSet**](git/workplace-search-kotlin/docs/SynonymsAPIApi.md#putSynonymSet) | **PUT** /api/ws/v1/synonyms/{synonym_set_id} | Update a synonym set

<a name="createBatchSynonymSets"></a>
# **createBatchSynonymSets**
> BatchSynonymSetsResponse createBatchSynonymSets(body)

Create a batch of synonym sets

Create batched synonym sets

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import org.elasticsearch.workplace-search.model.*;

val apiInstance = SynonymsAPIApi()
val body : SynonymsCreateDefinition =  // SynonymsCreateDefinition | 
try {
    val result : BatchSynonymSetsResponse = apiInstance.createBatchSynonymSets(body)
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
 **body** | [**SynonymsCreateDefinition**](SynonymsCreateDefinition.md)|  |

### Return type

[**BatchSynonymSetsResponse**](BatchSynonymSetsResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSynonymSet"></a>
# **deleteSynonymSet**
> RecordDeletedResponse deleteSynonymSet(externalId)

Delete a synonym set

Delete a synonym set

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import org.elasticsearch.workplace-search.model.*;

val apiInstance = SynonymsAPIApi()
val externalId : kotlin.String = externalId_example // kotlin.String | Unique ID for a content source document. Provided upon or returned at creation.
try {
    val result : RecordDeletedResponse = apiInstance.deleteSynonymSet(externalId)
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
 **externalId** | **kotlin.String**| Unique ID for a content source document. Provided upon or returned at creation. |

### Return type

[**RecordDeletedResponse**](RecordDeletedResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSynonymSet"></a>
# **getSynonymSet**
> SingleSynonymSetResponse getSynonymSet(externalId)

Retrieve a synonym set by ID

Retrieve a synonym set by ID

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import org.elasticsearch.workplace-search.model.*;

val apiInstance = SynonymsAPIApi()
val externalId : kotlin.String = externalId_example // kotlin.String | Unique ID for a content source document. Provided upon or returned at creation.
try {
    val result : SingleSynonymSetResponse = apiInstance.getSynonymSet(externalId)
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
 **externalId** | **kotlin.String**| Unique ID for a content source document. Provided upon or returned at creation. |

### Return type

[**SingleSynonymSetResponse**](SingleSynonymSetResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSynonymSets"></a>
# **listSynonymSets**
> ListSynonymSetResponse listSynonymSets(body)

Retrieves all synonym sets

Retrieve a list of synonym sets

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import org.elasticsearch.workplace-search.model.*;

val apiInstance = SynonymsAPIApi()
val body : SynonymsListDefinition =  // SynonymsListDefinition | 
try {
    val result : ListSynonymSetResponse = apiInstance.listSynonymSets(body)
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
 **body** | [**SynonymsListDefinition**](SynonymsListDefinition.md)|  | [optional]

### Return type

[**ListSynonymSetResponse**](ListSynonymSetResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putSynonymSet"></a>
# **putSynonymSet**
> SingleSynonymSetResponse putSynonymSet(body, externalId)

Update a synonym set

Update a synonym set

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import org.elasticsearch.workplace-search.model.*;

val apiInstance = SynonymsAPIApi()
val body : SynonymsUpdateDefinition =  // SynonymsUpdateDefinition | 
val externalId : kotlin.String = externalId_example // kotlin.String | Unique ID for a content source document. Provided upon or returned at creation.
try {
    val result : SingleSynonymSetResponse = apiInstance.putSynonymSet(body, externalId)
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
 **body** | [**SynonymsUpdateDefinition**](SynonymsUpdateDefinition.md)|  |
 **externalId** | **kotlin.String**| Unique ID for a content source document. Provided upon or returned at creation. |

### Return type

[**SingleSynonymSetResponse**](SingleSynonymSetResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

