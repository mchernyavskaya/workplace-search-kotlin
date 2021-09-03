/**
 * Workplace Search API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package org.elasticsearch.workplacesearch.api

import org.elasticsearch.workplacesearch.infrastructure.*
import org.elasticsearch.workplacesearch.models.DeleteExternalIdentitiesResponse
import org.elasticsearch.workplacesearch.models.ExternalIdentity
import org.elasticsearch.workplacesearch.models.ListExternalIdentitiesResponse

class ExternalIdentitiesAPIApi(basePath: kotlin.String = "{schemes}://{host}:{port}") : ApiClient(basePath) {

    /**
     * Adds a new external identity
     * Adds a new external identity
     * @param body
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source
     * @return ExternalIdentity
     */
    @Suppress("UNCHECKED_CAST")
    fun createExternalIdentity(body: ExternalIdentity, contentSourceId: kotlin.String): ExternalIdentity {
        val localVariableBody: kotlin.Any? = body

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/api/ws/v1/sources/{content_source_id}/external_identities".replace("{" + "content_source_id" + "}", "$contentSourceId")
        )
        val response = request<ExternalIdentity>(
            localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ExternalIdentity
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Deletes an external identity
     * Deletes an external identity
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source
     * @param user The username in context
     * @return DeleteExternalIdentitiesResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun deleteExternalIdentity(contentSourceId: kotlin.String, user: kotlin.String): DeleteExternalIdentitiesResponse {

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/api/ws/v1/sources/{content_source_id}/external_identities/{user}".replace("{" + "content_source_id" + "}", "$contentSourceId").replace("{" + "user" + "}", "$user")
        )
        val response = request<DeleteExternalIdentitiesResponse>(
            localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as DeleteExternalIdentitiesResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Retrieves an external identity
     * Retrieves an external identity
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source
     * @param user The username in context
     * @return ExternalIdentity
     */
    @Suppress("UNCHECKED_CAST")
    fun getExternalIdentity(contentSourceId: kotlin.String, user: kotlin.String): ExternalIdentity {

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/ws/v1/sources/{content_source_id}/external_identities/{user}".replace("{" + "content_source_id" + "}", "$contentSourceId").replace("{" + "user" + "}", "$user")
        )
        val response = request<ExternalIdentity>(
            localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ExternalIdentity
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Retrieves all external identities
     * Retrieves all external identities
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source
     * @param currentPage Which page of results to request (optional)
     * @param pageSize The number of results to return in a page (optional)
     * @return ListExternalIdentitiesResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun listExternalIdentities(contentSourceId: kotlin.String, currentPage: kotlin.Int? = null, pageSize: kotlin.Int? = null): ListExternalIdentitiesResponse {
        val localVariableQuery: MultiValueMap = mapOf("current_page" to listOf("$currentPage"), "page_size" to listOf("$pageSize"))
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/api/ws/v1/sources/{content_source_id}/external_identities".replace("{" + "content_source_id" + "}", "$contentSourceId"), query = localVariableQuery
        )
        val response = request<ListExternalIdentitiesResponse>(
            localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ListExternalIdentitiesResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Updates an external identity
     * Updates an external identity
     * @param body
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source
     * @param user The username in context
     * @return ExternalIdentity
     */
    @Suppress("UNCHECKED_CAST")
    fun putExternalIdentity(body: ExternalIdentity, contentSourceId: kotlin.String, user: kotlin.String): ExternalIdentity {
        val localVariableBody: kotlin.Any? = body

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/api/ws/v1/sources/{content_source_id}/external_identities/{user}".replace("{" + "content_source_id" + "}", "$contentSourceId").replace("{" + "user" + "}", "$user")
        )
        val response = request<ExternalIdentity>(
            localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ExternalIdentity
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}