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
 * Metadata regarding automatic refinements made to the query
 *
 * @param submittedQuery 
 * @param decoratedQueryHtml 
 * @param refinements 
 */

data class SearchApiQueryRefinement (

    @Json(name = "submitted_query")
    val submittedQuery: kotlin.String,

    @Json(name = "decorated_query_html")
    val decoratedQueryHtml: kotlin.String,

    @Json(name = "refinements")
    val refinements: kotlin.collections.List<QueryRefinementItem>

)
