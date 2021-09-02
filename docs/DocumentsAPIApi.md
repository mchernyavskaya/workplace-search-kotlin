# DocumentsAPIApi

All URIs are relative to *{schemes}://{host}:{port}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDocuments**](DocumentsAPIApi.md#deleteDocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_destroy | Deletes a list of documents from a custom content source
[**deleteDocumentsByQuery**](DocumentsAPIApi.md#deleteDocumentsByQuery) | **DELETE** /api/ws/v1/sources/{content_source_id}/documents | Deletes documents by query in a custom content source
[**getDocument**](DocumentsAPIApi.md#getDocument) | **GET** /api/ws/v1/sources/{content_source_id}/documents/{document_id} | Retrieves a document by ID from the specified content source
[**indexDocuments**](DocumentsAPIApi.md#indexDocuments) | **POST** /api/ws/v1/sources/{content_source_id}/documents/bulk_create | Indexes one or more new documents into a custom content source, or updates one or more existing documents

<a name="deleteDocuments"></a>
# **deleteDocuments**
> DocumentBulkDeleteResponse deleteDocuments(body, contentSourceId)

Deletes a list of documents from a custom content source

Remove documents from a Custom API Source

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = DocumentsAPIApi()
val body : kotlin.Array<ExternalId> =  // kotlin.Array<ExternalId> | 
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
try {
    val result : DocumentBulkDeleteResponse = apiInstance.deleteDocuments(body, contentSourceId)
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
 **body** | [**kotlin.Array&lt;ExternalId&gt;**](ExternalId.md)|  |
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |

### Return type

[**DocumentBulkDeleteResponse**](DocumentBulkDeleteResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDocumentsByQuery"></a>
# **deleteDocumentsByQuery**
> DeleteDocumentsByQueryResponse deleteDocumentsByQuery(contentSourceId, body)

Deletes documents by query in a custom content source

Deletes documents by query in a custom content source

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = DocumentsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val body : DocumentsDeleteDefinition =  // DocumentsDeleteDefinition | 
try {
    val result : DeleteDocumentsByQueryResponse = apiInstance.deleteDocumentsByQuery(contentSourceId, body)
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
 **body** | [**DocumentsDeleteDefinition**](DocumentsDeleteDefinition.md)|  | [optional]

### Return type

[**DeleteDocumentsByQueryResponse**](DeleteDocumentsByQueryResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocument"></a>
# **getDocument**
> SingleDocumentResponse getDocument(contentSourceId, externalId)

Retrieves a document by ID from the specified content source

Retrieves a document by ID from the specified content source

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = DocumentsAPIApi()
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
val externalId : kotlin.String = externalId_example // kotlin.String | Unique ID for a content source document. Provided upon or returned at creation.
try {
    val result : SingleDocumentResponse = apiInstance.getDocument(contentSourceId, externalId)
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
 **externalId** | **kotlin.String**| Unique ID for a content source document. Provided upon or returned at creation. |

### Return type

[**SingleDocumentResponse**](SingleDocumentResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="indexDocuments"></a>
# **indexDocuments**
> DocumentBulkCreateResponse indexDocuments(body, contentSourceId)

Indexes one or more new documents into a custom content source, or updates one or more existing documents

Indexes one or more new documents into a custom content source, or updates one or more existing documents

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*;

val apiInstance = DocumentsAPIApi()
val body : kotlin.Array<Document> =  // kotlin.Array<Document> | 
val contentSourceId : kotlin.String = contentSourceId_example // kotlin.String | Unique ID for a Custom API source, provided upon creation of a Custom API Source
try {
    val result : DocumentBulkCreateResponse = apiInstance.indexDocuments(body, contentSourceId)
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
 **body** | [**kotlin.Array&lt;Document&gt;**](Document.md)|  |
 **contentSourceId** | **kotlin.String**| Unique ID for a Custom API source, provided upon creation of a Custom API Source |

### Return type

[**DocumentBulkCreateResponse**](DocumentBulkCreateResponse.md)

### Authorization

[bearer_auth](../README.md#bearer_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

