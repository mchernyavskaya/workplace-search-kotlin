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
package org.elasticsearch.workplace-search.model


/**
 * 
 * @param field 
 * @param enabled 
 * @param queryExpansionPhrases 
 * @param isPerson 
 */
data class ContentSourceAutomaticQueryRefinement (

    val field: kotlin.String,
    val enabled: kotlin.Boolean,
    val queryExpansionPhrases: kotlin.Array<kotlin.String>,
    val isPerson: kotlin.Boolean? = null
) {
}