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
 * A created synonym set with possible error information
 *
 * @param id The id of the created set, or null if invalid
 * @param synonyms The synonym terms for the set
 * @param errors An optional array of error messages, if any
 */

data class CreatedSynonymSetResponse (

    /* The id of the created set, or null if invalid */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The synonym terms for the set */
    @Json(name = "synonyms")
    val synonyms: kotlin.collections.List<kotlin.String>? = null,

    /* An optional array of error messages, if any */
    @Json(name = "errors")
    val errors: kotlin.collections.List<kotlin.String>? = null

)

