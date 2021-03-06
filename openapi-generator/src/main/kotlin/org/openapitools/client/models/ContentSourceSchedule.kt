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
 * Schedule defining when and how often the content source should be synchronized
 *
 * @param full How often a full data synchronization should be performed, as an ISO-8601 duration
 * @param incremental How often to synchronize new changes, as an ISO-8601 duration
 * @param delete How often to purge deleted documents, as an ISO-8601 duration
 * @param permissions How often to update user permissions, as an ISO-8601 duration
 * @param blockedWindows 
 */

data class ContentSourceSchedule (

    /* How often a full data synchronization should be performed, as an ISO-8601 duration */
    @Json(name = "full")
    val full: kotlin.String? = null,

    /* How often to synchronize new changes, as an ISO-8601 duration */
    @Json(name = "incremental")
    val incremental: kotlin.String? = null,

    /* How often to purge deleted documents, as an ISO-8601 duration */
    @Json(name = "delete")
    val delete: kotlin.String? = null,

    /* How often to update user permissions, as an ISO-8601 duration */
    @Json(name = "permissions")
    val permissions: kotlin.String? = null,

    @Json(name = "blocked_windows")
    val blockedWindows: kotlin.collections.List<ContentSourceJobTypeWindow>? = null

)

