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
 * @param username
 * @param email
 * @param accessToken
 */
data class WhoamiResponse(

    val username: kotlin.String,
    val email: kotlin.String,
    val accessToken: kotlin.String? = null
)