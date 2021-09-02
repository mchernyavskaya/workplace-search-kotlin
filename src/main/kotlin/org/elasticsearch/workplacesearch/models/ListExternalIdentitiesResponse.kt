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

import org.elasticsearch.workplacesearch.models.ExternalIdentity
import org.elasticsearch.workplacesearch.models.MetaPage

import com.squareup.moshi.Json

/**
 * 
 *
 * @param meta 
 * @param results 
 */

data class ListExternalIdentitiesResponse (

    @Json(name = "meta")
    val meta: MetaPage,

    @Json(name = "results")
    val results: kotlin.collections.List<ExternalIdentity>

)

