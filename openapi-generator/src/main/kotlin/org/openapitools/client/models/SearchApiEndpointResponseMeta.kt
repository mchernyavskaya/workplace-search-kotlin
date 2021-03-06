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

package org.openapitools.client.models

import com.squareup.moshi.Json

/**
 * 
 *
 * @param page 
 * @param requestId Internal request ID for this query instance
 * @param warnings Any warnings that the query generated
 * @param queryRefinements 
 * @param contentSources content sources used in the search query
 * @param timeout Remote source query timeout value used
 */

data class SearchApiEndpointResponseMeta (

    @Json(name = "page")
    val page: MetaPagePage,

    /* Internal request ID for this query instance */
    @Json(name = "request_id")
    val requestId: kotlin.String,

    /* Any warnings that the query generated */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "query_refinements")
    val queryRefinements: SearchApiQueryRefinement? = null,

    /* content sources used in the search query */
    @Json(name = "content_sources")
    val contentSources: kotlin.collections.Map<kotlin.String, SearchApiMetaContentSource>? = null,

    /* Remote source query timeout value used */
    @Json(name = "timeout")
    val timeout: kotlin.Int? = null

)

