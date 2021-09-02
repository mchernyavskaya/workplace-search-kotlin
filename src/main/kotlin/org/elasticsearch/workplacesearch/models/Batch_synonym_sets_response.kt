/**
 * Workplace Search API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package org.elasticsearch.workplacesearch.models

/**
 * Response from a request to create a batch of synonym sets
 * @param hasErrors True if any of the requested synonym sets have errors
 * @param synonymSets The synonym sets requested to be created
 */
data class BatchSynonymSetsResponse(

    /* True if any of the requested synonym sets have errors */
    val hasErrors: kotlin.Boolean? = null,
    /* The synonym sets requested to be created */
    val synonymSets: kotlin.Array<CreatedSynonymSetResponse>? = null
)
