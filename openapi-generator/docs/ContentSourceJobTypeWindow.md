
# ContentSourceJobTypeWindow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobType** | [**inline**](#JobTypeEnum) |  |  [optional]
**day** | [**inline**](#DayEnum) |  |  [optional]
**start** | **kotlin.String** | The start of the time window, as an ISO-8601 duration |  [optional]
**end** | **kotlin.String** | The end of the time window, as an ISO-8601 duration |  [optional]


<a name="JobTypeEnum"></a>
## Enum: job_type
Name | Value
---- | -----
jobType | full, incremental, delete, permissions, all


<a name="DayEnum"></a>
## Enum: day
Name | Value
---- | -----
day | sunday, monday, tuesday, wednesday, thursday, friday, saturday, all



