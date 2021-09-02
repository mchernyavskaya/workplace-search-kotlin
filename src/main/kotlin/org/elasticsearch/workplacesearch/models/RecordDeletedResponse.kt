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
 * @param deleted 
 */

data class RecordDeletedResponse (

    @Json(name = "deleted")
    val deleted: RecordDeletedResponse.Deleted

) {

    /**
     * 
     *
     * Values: `true`
     */
    enum class Deleted(val value: kotlin.Boolean) {
        @Json(name = ""true"") `true`("true");
    }
}

