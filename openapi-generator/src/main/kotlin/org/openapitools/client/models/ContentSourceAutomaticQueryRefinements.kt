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
 * Automatic query refinement customizations
 *
 * @param overrides 
 */

data class ContentSourceAutomaticQueryRefinements (

    @Json(name = "overrides")
    val overrides: kotlin.collections.List<ContentSourceAutomaticQueryRefinement>

)

