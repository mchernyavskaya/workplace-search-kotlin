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
 * @param id 
 * @param source 
 * @param contentSourceId 
 * @param lastUpdated 
 * @param allowPermissions List of permissions
 * @param denyPermissions List of permissions
 */

data class SingleDocumentResponse (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "source")
    val source: kotlin.String,

    @Json(name = "content_source_id")
    val contentSourceId: kotlin.String,

    @Json(name = "last_updated")
    val lastUpdated: java.time.OffsetDateTime,

    /* List of permissions */
    @Json(name = "_allow_permissions")
    val allowPermissions: kotlin.collections.List<kotlin.String>? = null,

    /* List of permissions */
    @Json(name = "_deny_permissions")
    val denyPermissions: kotlin.collections.List<kotlin.String>? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()

