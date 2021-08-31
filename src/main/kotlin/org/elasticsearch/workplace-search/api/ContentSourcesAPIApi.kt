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
package org.elasticsearch.workplace-search.api

-search.model.AutomaticQueryRefinementDetailsResponse
-search.model.ContentSource
-search.model.ContentSourceCreateDefinition
-search.model.ContentSourceIconDefinition
-search.model.ContentSourceUpdateDefinition
-search.model.ErrorsResponse
-search.model.InlineResponse400
-search.model.InlineResponse4001
-search.model.ListContentSourcesResponse
-search.model.RecordDeletedResponse
-search.model.UploadIconsResponse

import io.swagger.client.infrastructure.*

class ContentSourcesAPIApi(basePath: kotlin.String = "{schemes}://{host}:{port}") : ApiClient(basePath) {

    /**
     * Create a content source
     * Create a custom content source
     * @param body  
     * @return ContentSource
     */
    @Suppress("UNCHECKED_CAST")
    fun createContentSource(body: ContentSourceCreateDefinition): ContentSource {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/api/ws/v1/sources"
        )
        val response = request<ContentSource>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ContentSource
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Deletes a content source by ID
     * Deletes a content source by ID
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
     * @return RecordDeletedResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun deleteContentSource(contentSourceId: kotlin.String): RecordDeletedResponse {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/api/ws/v1/sources/{content_source_id}".replace("{" + "content_source_id" + "}", "$contentSourceId")
        )
        val response = request<RecordDeletedResponse>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as RecordDeletedResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Retrieves a content source&#x27;s automatic query refinement details
     * Retrieves a content source&#x27;s automatic query refinement details
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
     * @return AutomaticQueryRefinementDetailsResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun getAutoQueryRefinementDetails(contentSourceId: kotlin.String): AutomaticQueryRefinementDetailsResponse {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/ws/v1/sources/{content_source_id}/automatic_query_refinement".replace("{" + "content_source_id" + "}", "$contentSourceId")
        )
        val response = request<AutomaticQueryRefinementDetailsResponse>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as AutomaticQueryRefinementDetailsResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Retrieves a content source by ID
     * Retrieves a content source by ID
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
     * @return ContentSource
     */
    @Suppress("UNCHECKED_CAST")
    fun getContentSource(contentSourceId: kotlin.String): ContentSource {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/ws/v1/sources/{content_source_id}".replace("{" + "content_source_id" + "}", "$contentSourceId")
        )
        val response = request<ContentSource>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ContentSource
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Retrieves all content sources
     * Retrieves all content sources
     * @param currentPage Which page of results to request (optional)
     * @param pageSize The number of results to return in a page (optional)
     * @return ListContentSourcesResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun listContentSources(currentPage: kotlin.Int? = null, pageSize: kotlin.Int? = null): ListContentSourcesResponse {
        val localVariableQuery: MultiValueMap = mapOf("current_page" to listOf("$currentPage"), "page_size" to listOf("$pageSize"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/api/ws/v1/sources", query = localVariableQuery
        )
        val response = request<ListContentSourcesResponse>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ListContentSourcesResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Update a content source
     * Update a content source
     * @param body  
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
     * @return ContentSource
     */
    @Suppress("UNCHECKED_CAST")
    fun putContentSource(body: ContentSourceUpdateDefinition, contentSourceId: kotlin.String): ContentSource {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/ws/v1/sources/{content_source_id}".replace("{" + "content_source_id" + "}", "$contentSourceId")
        )
        val response = request<ContentSource>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ContentSource
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Upload content source icons
     * Upload content source icons
     * @param body  
     * @param contentSourceId Unique ID for a Custom API source, provided upon creation of a Custom API Source 
     * @return UploadIconsResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun putContentSourceIcons(body: ContentSourceIconDefinition, contentSourceId: kotlin.String): UploadIconsResponse {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/api/ws/v1/sources/{content_source_id}/icon".replace("{" + "content_source_id" + "}", "$contentSourceId")
        )
        val response = request<UploadIconsResponse>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UploadIconsResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
