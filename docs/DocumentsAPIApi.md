# DocumentsAPIApi

All URIs are relative to *http://localhost:3002*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDocuments**](DocumentsAPIApi.md#deleteDocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_destroy | Deletes a list of documents from a custom content source
[**deleteDocumentsByQuery**](DocumentsAPIApi.md#deleteDocumentsByQuery) | **DELETE** /api/ws/v1/sources/{content_source_id}/documents | Deletes documents by query in a custom content source
[**getDocument**](DocumentsAPIApi.md#getDocument) | **GET** /api/ws/v1/sources/{content_source_id}/documents/{document_id} | Retrieves a document by ID from the specified content source
[**indexDocuments**](DocumentsAPIApi.md#indexDocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_create | Indexes one or more new documents into a custom content source, or updates one or more existing documents


<a name="deleteDocuments"></a>
# **deleteDocuments**
> DocumentBulkDeleteResponse deleteDocuments(contentSourceId, documentIds)

Deletes a list of documents from a custom content source

Remove documents from a Custom API Source

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val documentIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
try {
    val result : DocumentBulkDeleteResponse = apiInstance.deleteDocuments(contentSourceId, documentIds)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsAPIApi#deleteDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsAPIApi#deleteDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **documentIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  |

### Return type

[**DocumentBulkDeleteResponse**](DocumentBulkDeleteResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentsByQuery"></a>
# **deleteDocumentsByQuery**
> DeleteDocumentsByQueryResponse deleteDocumentsByQuery(contentSourceId, documentsDeleteDefinition)

Deletes documents by query in a custom content source

Deletes documents by query in a custom content source

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val documentsDeleteDefinition : DocumentsDeleteDefinition =  // DocumentsDeleteDefinition | 
try {
    val result : DeleteDocumentsByQueryResponse = apiInstance.deleteDocumentsByQuery(contentSourceId, documentsDeleteDefinition)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsAPIApi#deleteDocumentsByQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsAPIApi#deleteDocumentsByQuery")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **documentsDeleteDefinition** | [**DocumentsDeleteDefinition**](DocumentsDeleteDefinition.md)|  | [optional]

### Return type

[**DeleteDocumentsByQueryResponse**](DeleteDocumentsByQueryResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> SingleDocumentResponse getDocument(contentSourceId, documentId)

Retrieves a document by ID from the specified content source

Retrieves a document by ID from the specified content source

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val documentId : kotlin.String = documentId_example // kotlin.String | Unique ID for a content source document. Provided upon or returned at creation.
try {
    val result : SingleDocumentResponse = apiInstance.getDocument(contentSourceId, documentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsAPIApi#getDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsAPIApi#getDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **documentId** | **kotlin.String**| Unique ID for a content source document. Provided upon or returned at creation. |

### Return type

[**SingleDocumentResponse**](SingleDocumentResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="indexDocuments"></a>
# **indexDocuments**
> DocumentBulkCreateResponse indexDocuments(contentSourceId, documents)

Indexes one or more new documents into a custom content source, or updates one or more existing documents

Indexes one or more new documents into a custom content source, or updates one or more existing documents

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DocumentsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val documents : kotlin.collections.List<Document> =  // kotlin.collections.List<Document> | 
try {
    val result : DocumentBulkCreateResponse = apiInstance.indexDocuments(contentSourceId, documents)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DocumentsAPIApi#indexDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DocumentsAPIApi#indexDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |
 **documents** | [**kotlin.collections.List&lt;Document&gt;**](Document.md)|  |

### Return type

[**DocumentBulkCreateResponse**](DocumentBulkCreateResponse.md)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

