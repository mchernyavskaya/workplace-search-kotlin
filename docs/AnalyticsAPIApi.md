# AnalyticsAPIApi

All URIs are relative to *http://localhost:3002*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnalyticsEvent**](AnalyticsAPIApi.md#createAnalyticsEvent) | **POST** /api/ws/v1/analytics/event | Capture click and feedback analytic events


<a name="createAnalyticsEvent"></a>
# **createAnalyticsEvent**
> createAnalyticsEvent(analyticsEvent)

Capture click and feedback analytic events

Capture Analytic events for click and feedback

### Example
```kotlin
// Import classes:
//import org.elasticsearch.workplacesearch.infrastructure.*
//import org.elasticsearch.workplacesearch.models.*

val apiInstance = AnalyticsAPIApi()
val analyticsEvent : AnalyticsEvent =  // AnalyticsEvent | 
try {
    apiInstance.createAnalyticsEvent(analyticsEvent)
} catch (e: ClientException) {
    println("4xx response calling AnalyticsAPIApi#createAnalyticsEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnalyticsAPIApi#createAnalyticsEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticsEvent** | [**AnalyticsEvent**](AnalyticsEvent.md)|  |

### Return type

null (empty response body)

### Authorization


Configure bearer_auth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

