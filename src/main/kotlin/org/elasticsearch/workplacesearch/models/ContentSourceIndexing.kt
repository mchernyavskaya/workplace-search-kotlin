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

import org.elasticsearch.workplacesearch.models.ContentSourceIndexingFeatures
import org.elasticsearch.workplacesearch.models.ContentSourceIndexingRule
import org.elasticsearch.workplacesearch.models.ContentSourceSchedule

import com.squareup.moshi.Json

/**
 * Rules for indexing the content for this Content Source
 *
 * @param defaultAction 
 * @param enabled 
 * @param features 
 * @param rules 
 * @param schedule 
 */

data class ContentSourceIndexing (

    @Json(name = "default_action")
    val defaultAction: ContentSourceIndexing.DefaultAction,

    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    @Json(name = "features")
    val features: ContentSourceIndexingFeatures? = null,

    @Json(name = "rules")
    val rules: kotlin.collections.List<ContentSourceIndexingRule>? = null,

    @Json(name = "schedule")
    val schedule: ContentSourceSchedule? = null

) {

    /**
     * 
     *
     * Values: include,exclude
     */
    enum class DefaultAction(val value: kotlin.String) {
        @Json(name = "include") include("include"),
        @Json(name = "exclude") exclude("exclude");
    }
}

