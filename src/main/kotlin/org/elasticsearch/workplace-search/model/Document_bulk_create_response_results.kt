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

import org.elasticsearch.workplace-search.model.Errors
import org.elasticsearch.workplace-search.model.ExternalId

/**
 * 
 * @param id 
 * @param errors 
 */
data class DocumentBulkCreateResponseResults (

    val id: ExternalId,
    val errors: Errors
) {
}