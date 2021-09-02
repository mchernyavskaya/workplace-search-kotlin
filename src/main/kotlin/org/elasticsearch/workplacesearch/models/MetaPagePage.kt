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
 * 
 *
 * @param current 
 * @param totalPages 
 * @param totalResults 
 * @param propertySize 
 */

data class MetaPagePage (

    @Json(name = "current")
    val current: kotlin.Int,

    @Json(name = "total_pages")
    val totalPages: kotlin.Int,

    @Json(name = "total_results")
    val totalResults: kotlin.Int,

    @Json(name = "size")
    val propertySize: kotlin.Int

)

