
# ContentSourceScheduleResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**full** | **kotlin.String** | How often a full data synchronization should be performed, as an ISO-8601 duration |  [optional]
**incremental** | **kotlin.String** | How often to synchronize new changes, as an ISO-8601 duration |  [optional]
**delete** | **kotlin.String** | How often to purge deleted documents, as an ISO-8601 duration |  [optional]
**permissions** | **kotlin.String** | How often to update user permissions, as an ISO-8601 duration |  [optional]
**blockedWindows** | [**kotlin.collections.List&lt;ContentSourceJobTypeWindow&gt;**](ContentSourceJobTypeWindow.md) |  |  [optional]
**estimates** | [**ContentSourceScheduleResponseEstimates**](ContentSourceScheduleResponseEstimates.md) |  |  [optional]



