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
 * @param value
 * @param count
 * @param key
 * @param from
 * @param to
 */
data class SearchFacetResponseItemData(

    val value: OneOfsearchFacetResponseItemDataValue? = null,
    val count: kotlin.Int,
    val key: kotlin.String? = null,
    val from: OneOfsearchFacetResponseItemDataFrom? = null,
    val to: OneOfsearchFacetResponseItemDataTo? = null
)
