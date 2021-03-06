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
 * A representation of a synonym set
 *
 * @param id The id of the synonym set
 * @param synonyms The synonym terms for the set
 * @param createdAt The timestamp in ISO format when the set was created
 * @param updatedAt The timestamp in ISO format when the set was last updated
 */

data class SingleSynonymSetResponse (

    /* The id of the synonym set */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* The synonym terms for the set */
    @Json(name = "synonyms")
    val synonyms: kotlin.collections.List<kotlin.String>? = null,

    /* The timestamp in ISO format when the set was created */
    @Json(name = "created_at")
    val createdAt: kotlin.String? = null,

    /* The timestamp in ISO format when the set was last updated */
    @Json(name = "updated_at")
    val updatedAt: kotlin.String? = null

)

