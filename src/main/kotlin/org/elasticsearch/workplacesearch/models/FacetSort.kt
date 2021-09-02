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


import com.squareup.moshi.Json

/**
 * Facet field to sort on and sort by count and/or value
 *
 * @param count 
 * @param `value` 
 */

data class FacetSort (

    @Json(name = "count")
    val count: FacetSort.Count? = null,

    @Json(name = "value")
    val `value`: FacetSort.`Value`? = null

) {

    /**
     * 
     *
     * Values: asc,desc
     */
    enum class Count(val value: kotlin.String) {
        @Json(name = "asc") asc("asc"),
        @Json(name = "desc") desc("desc");
    }
    /**
     * 
     *
     * Values: asc,desc
     */
    enum class `Value`(val value: kotlin.String) {
        @Json(name = "asc") asc("asc"),
        @Json(name = "desc") desc("desc");
    }
}

