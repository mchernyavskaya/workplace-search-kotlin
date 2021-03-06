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
 * Workplace Search analytics event
 * @param type
 * @param queryId query identifier for the event
 * @param page page number of the document in the query result set
 * @param contentSourceId content source identifier for the event document
 * @param documentId document identifier for the event
 * @param rank rank of the document in the overall result set
 * @param event the target identifier for a click event
 * @param score the feedback score, constrained to the values -1 or 1
 */
data class AnalyticsEvent(

    val type: AnalyticsEvent.Type,
    /* query identifier for the event */
    val queryId: kotlin.String,
    /* page number of the document in the query result set */
    val page: kotlin.Int,
    /* content source identifier for the event document */
    val contentSourceId: kotlin.String,
    /* document identifier for the event */
    val documentId: kotlin.String,
    /* rank of the document in the overall result set */
    val rank: kotlin.Int,
    /* the target identifier for a click event */
    val event: kotlin.String? = null,
    /* the feedback score, constrained to the values -1 or 1 */
    val score: AnalyticsEvent.Score? = null
) {
    /**
     *
     * Values: CLICK,FEEDBACK
     */
    enum class Type(val value: kotlin.String) {
        CLICK("click"),
        FEEDBACK("feedback");
    }
    /**
     * the feedback score, constrained to the values -1 or 1
     * Values: _1,_1_1
     */
    enum class Score(val value: kotlin.Int) {
        _1(-1),
        _1_1(1);
    }
}
