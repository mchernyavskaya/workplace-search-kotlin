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
 *
 * @param total
 * @param deleted
 * @param failures
 */
data class DeleteDocumentsByQueryResponse(

    val total: kotlin.Int,
    val deleted: kotlin.Int,
    val failures: kotlin.Array<kotlin.collections.Map<kotlin.String, kotlin.Any>>
)
