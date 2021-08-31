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
 * @param type 
 */

data class BoostIsValueType (

    @Json(name = "type")
    val type: BoostIsValueType.Type? = null

) {

    /**
     * 
     *
     * Values: `value`
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "value") `value`("value");
    }
}

