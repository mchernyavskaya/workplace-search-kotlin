# ContentSourceJobTypeWindow

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobType** | [**inline**](#JobTypeEnum) |  | 
**day** | [**inline**](#DayEnum) |  | 
**start** | [**kotlin.String**](.md) | The start of the time window, in the format of HH:mm:ssZ |  [optional]
**end** | [**kotlin.String**](.md) | The end of the time window, in the format of HH:mm:ssZ |  [optional]

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
