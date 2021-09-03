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
 * Values: m,mi,`in`,ft,yd,km,cm,mm
 */

enum class GeoUnitEnum(val value: kotlin.String) {

    @Json(name = "m")
    m("m"),

    @Json(name = "mi")
    mi("mi"),

    @Json(name = "in")
    `in`("in"),

    @Json(name = "ft")
    ft("ft"),

    @Json(name = "yd")
    yd("yd"),

    @Json(name = "km")
    km("km"),

    @Json(name = "cm")
    cm("cm"),

    @Json(name = "mm")
    mm("mm");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): kotlin.String? = if (data is GeoUnitEnum) "$data" else null

        /**
         * Returns a valid [GeoUnitEnum] for [data], null otherwise.
         */
        fun decode(data: Any?): GeoUnitEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

