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
 * @param sort 
 * @param filter 
 */

data class SynonymsListDefinition (

    @Json(name = "page")
    val page: SynonymsPage? = null,

    @Json(name = "sort")
    val sort: SynonymsSort? = null,

    @Json(name = "filter")
    val filter: SynonymsFilter? = null

)

