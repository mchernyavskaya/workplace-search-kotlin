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

package org.elasticsearch.workplacesearch.models

import org.elasticsearch.workplacesearch.models.FilterClausesOrFilter
import org.elasticsearch.workplacesearch.models.OneOfLessThanArrayCommaBoostItemGreaterThan
import org.elasticsearch.workplacesearch.models.OneOfLessThanArrayCommaFacetItemGreaterThan
import org.elasticsearch.workplacesearch.models.OneOfLessThanMapCommaArrayGreaterThan
import org.elasticsearch.workplacesearch.models.SearchApiQueryPage
import org.elasticsearch.workplacesearch.models.SearchApiQueryResultFields
import org.elasticsearch.workplacesearch.models.SearchApiQuerySearchFields

import com.squareup.moshi.Json

/**
 * 
 *
 * @param query A string or number used to find related documents
 * @param automaticQueryRefinement Set to false to not automatically refine the query by keywords
 * @param page 
 * @param searchFields Restrict the fulltext search to only specific fields
 * @param resultFields Restrict the result fields for each item to the specified fields
 * @param filters 
 * @param sort 
 * @param facets 
 * @param boosts 
 * @param sourceType Optional parameter to search standard, remote only, or all available sources
 * @param timeout Optional timeout in ms for searching remote sources
 */

data class SearchApiQuery (

    /* A string or number used to find related documents */
    @Json(name = "query")
    val query: kotlin.String? = null,

    /* Set to false to not automatically refine the query by keywords */
    @Json(name = "automatic_query_refinement")
    val automaticQueryRefinement: kotlin.Boolean? = null,

    @Json(name = "page")
    val page: SearchApiQueryPage? = null,

    /* Restrict the fulltext search to only specific fields */
    @Json(name = "search_fields")
    val searchFields: kotlin.collections.Map<kotlin.String, SearchApiQuerySearchFields>? = null,

    /* Restrict the result fields for each item to the specified fields */
    @Json(name = "result_fields")
    val resultFields: kotlin.collections.Map<kotlin.String, SearchApiQueryResultFields>? = null,

    @Json(name = "filters")
    val filters: FilterClausesOrFilter? = null,

    @Json(name = "sort")
    val sort: OneOfLessThanMapCommaArrayGreaterThan? = null,

    @Json(name = "facets")
    val facets: kotlin.collections.Map<kotlin.String, OneOfLessThanArrayCommaFacetItemGreaterThan>? = null,

    @Json(name = "boosts")
    val boosts: kotlin.collections.Map<kotlin.String, OneOfLessThanArrayCommaBoostItemGreaterThan>? = null,

    /* Optional parameter to search standard, remote only, or all available sources */
    @Json(name = "source_type")
    val sourceType: SearchApiQuery.SourceType? = null,

    /* Optional timeout in ms for searching remote sources */
    @Json(name = "timeout")
    val timeout: kotlin.Int? = null

) {

    /**
     * Optional parameter to search standard, remote only, or all available sources
     *
     * Values: standard,remote,all
     */
    enum class SourceType(val value: kotlin.String) {
        @Json(name = "standard") standard("standard"),
        @Json(name = "remote") remote("remote"),
        @Json(name = "all") all("all");
    }
}

