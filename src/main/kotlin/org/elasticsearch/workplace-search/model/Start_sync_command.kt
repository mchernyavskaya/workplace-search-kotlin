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

import org.elasticsearch.workplace-search.model.AbstractSyncCommand

/**
 * 
 * @param forceInterrupt 
 * @param command 
 */
data class StartSyncCommand (

    val forceInterrupt: kotlin.Boolean? = null,
    val command: StartSyncCommand.Command
) {
    /**
    * 
    * Values: START
    */
    enum class Command(val value: kotlin.String){
        START("start");
    }
}