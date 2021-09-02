/**
 * Workplace Search API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.elasticsearch.workplacesearch.apis

import org.elasticsearch.workplacesearch.models.DeleteDocumentsByQueryResponse
import org.elasticsearch.workplacesearch.models.Document
import org.elasticsearch.workplacesearch.models.DocumentBulkCreateResponse
import org.elasticsearch.workplacesearch.models.DocumentBulkDeleteResponse
import org.elasticsearch.workplacesearch.models.DocumentsDeleteDefinition
import org.elasticsearch.workplacesearch.models.ErrorsResponse
import org.elasticsearch.workplacesearch.models.SingleDocumentResponse

import org.elasticsearch.workplacesearch.infrastructure.ApiClient
import org.elasticsearch.workplacesearch.infrastructure.ClientException
import org.elasticsearch.workplacesearch.infrastructure.ClientError
import org.elasticsearch.workplacesearch.infrastructure.ServerException
import org.elasticsearch.workplacesearch.infrastructure.ServerError
import org.elasticsearch.workplacesearch.infrastructure.MultiValueMap
import org.elasticsearch.workplacesearch.infrastructure.RequestConfig
import org.elasticsearch.workplacesearch.infrastructure.RequestMethod
import org.elasticsearch.workplacesearch.infrastructure.ResponseType
import org.elasticsearch.workplacesearch.infrastructure.Success
import org.elasticsearch.workplacesearch.infrastructure.toMultiValue

class DocumentsAPIApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.elasticsearch.workplacesearch.baseUrl", "http://localhost:3002")
        }
    }

    /**
    * Deletes a list of documents from a custom content source
    * Remove documents from a Custom API Source
    * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
    * @param documentIds  
    * @return DocumentBulkDeleteResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteDocuments(contentSourceId: kotlin.String, documentIds: kotlin.collections.List<kotlin.String>) : DocumentBulkDeleteResponse {
        val localVariableConfig = deleteDocumentsRequestConfig(contentSourceId = contentSourceId, documentIds = documentIds)

        val localVarResponse = request<kotlin.collections.List<kotlin.String>, DocumentBulkDeleteResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DocumentBulkDeleteResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation deleteDocuments
    *
    * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
    * @param documentIds  
    * @return RequestConfig
    */
    fun deleteDocumentsRequestConfig(contentSourceId: kotlin.String, documentIds: kotlin.collections.List<kotlin.String>) : RequestConfig<kotlin.collections.List<kotlin.String>> {
        val localVariableBody = documentIds
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/ws/v1/sources/{content_source_id}/documents/bulk_destroy".replace("{"+"content_source_id"+"}", "$contentSourceId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Deletes documents by query in a custom content source
    * Deletes documents by query in a custom content source
    * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
    * @param documentsDeleteDefinition  (optional)
    * @return DeleteDocumentsByQueryResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deleteDocumentsByQuery(contentSourceId: kotlin.String, documentsDeleteDefinition: DocumentsDeleteDefinition?) : DeleteDocumentsByQueryResponse {
        val localVariableConfig = deleteDocumentsByQueryRequestConfig(contentSourceId = contentSourceId, documentsDeleteDefinition = documentsDeleteDefinition)

        val localVarResponse = request<DocumentsDeleteDefinition, DeleteDocumentsByQueryResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DeleteDocumentsByQueryResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation deleteDocumentsByQuery
    *
    * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
    * @param documentsDeleteDefinition  (optional)
    * @return RequestConfig
    */
    fun deleteDocumentsByQueryRequestConfig(contentSourceId: kotlin.String, documentsDeleteDefinition: DocumentsDeleteDefinition?) : RequestConfig<DocumentsDeleteDefinition> {
        val localVariableBody = documentsDeleteDefinition
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/api/ws/v1/sources/{content_source_id}/documents".replace("{"+"content_source_id"+"}", "$contentSourceId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieves a document by ID from the specified content source
    * Retrieves a document by ID from the specified content source
    * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
    * @param documentId Unique ID for a content source document. Provided upon or returned at creation. 
    * @return SingleDocumentResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getDocument(contentSourceId: kotlin.String, documentId: kotlin.String) : SingleDocumentResponse {
        val localVariableConfig = getDocumentRequestConfig(contentSourceId = contentSourceId, documentId = documentId)

        val localVarResponse = request<Unit, SingleDocumentResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SingleDocumentResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation getDocument
    *
    * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
    * @param documentId Unique ID for a content source document. Provided upon or returned at creation. 
    * @return RequestConfig
    */
    fun getDocumentRequestConfig(contentSourceId: kotlin.String, documentId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/ws/v1/sources/{content_source_id}/documents/{document_id}".replace("{"+"content_source_id"+"}", "$contentSourceId").replace("{"+"document_id"+"}", "$documentId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Indexes one or more new documents into a custom content source, or updates one or more existing documents
    * Indexes one or more new documents into a custom content source, or updates one or more existing documents
    * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
    * @param documents  
    * @return DocumentBulkCreateResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun indexDocuments(contentSourceId: kotlin.String, documents: kotlin.collections.List<Document>) : DocumentBulkCreateResponse {
        val localVariableConfig = indexDocumentsRequestConfig(contentSourceId = contentSourceId, documents = documents)

        val localVarResponse = request<kotlin.collections.List<Document>, DocumentBulkCreateResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as DocumentBulkCreateResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation indexDocuments
    *
    * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
    * @param documents  
    * @return RequestConfig
    */
    fun indexDocumentsRequestConfig(contentSourceId: kotlin.String, documents: kotlin.collections.List<Document>) : RequestConfig<kotlin.collections.List<Document>> {
        val localVariableBody = documents
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/ws/v1/sources/{content_source_id}/documents/bulk_create".replace("{"+"content_source_id"+"}", "$contentSourceId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
