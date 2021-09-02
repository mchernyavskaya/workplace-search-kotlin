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

import org.elasticsearch.workplacesearch.models.AnalyticsEvent
import org.elasticsearch.workplacesearch.models.ErrorsResponse

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

class AnalyticsAPIApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("org.elasticsearch.workplacesearch.baseUrl", "http://localhost:3002")
        }
    }

    /**
    * Capture click and feedback analytic events
    * Capture Analytic events for click and feedback
    * @param analyticsEvent  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createAnalyticsEvent(analyticsEvent: AnalyticsEvent) : Unit {
        val localVariableConfig = createAnalyticsEventRequestConfig(analyticsEvent = analyticsEvent)

        val localVarResponse = request<AnalyticsEvent, Unit>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
    * To obtain the request config of the operation createAnalyticsEvent
    *
    * @param analyticsEvent  
    * @return RequestConfig
    */
    fun createAnalyticsEventRequestConfig(analyticsEvent: AnalyticsEvent) : RequestConfig<AnalyticsEvent> {
        val localVariableBody = analyticsEvent
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/api/ws/v1/analytics/event",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}