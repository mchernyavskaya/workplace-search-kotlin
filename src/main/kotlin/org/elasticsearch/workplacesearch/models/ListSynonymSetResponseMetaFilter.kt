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

import org.elasticsearch.workplacesearch.models.OneOfLessThanStringCommaArrayGreaterThan

import com.squareup.moshi.Json

/**
 * Filters used for the listing
 *
 * @param terms 
 */

data class ListSynonymSetResponseMetaFilter (

    @Json(name = "terms")
    val terms: OneOfLessThanStringCommaArrayGreaterThan? = null

)

