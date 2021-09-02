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
 * @param id
 * @param jobType
 * @param status
 * @param createdAt
 * @param lastUpdatedAt
 */
data class SyncJobDefinition(

    val id: kotlin.String,
    val jobType: SyncJobDefinition.JobType,
    val status: SyncJobDefinition.Status,
    val createdAt: java.time.LocalDateTime,
    val lastUpdatedAt: java.time.LocalDateTime
) {
    /**
     *
     * Values: FULL,INCREMENTAL,DELETE,PERMISSIONS
     */
    enum class JobType(val value: kotlin.String) {
        FULL("full"),
        INCREMENTAL("incremental"),
        DELETE("delete"),
        PERMISSIONS("permissions");
    }
    /**
     *
     * Values: ENQUEUED,RUNNING,SUSPENDED,FAILED,COMPLETE
     */
    enum class Status(val value: kotlin.String) {
        ENQUEUED("enqueued"),
        RUNNING("running"),
        SUSPENDED("suspended"),
        FAILED("failed"),
        COMPLETE("complete");
    }
}
