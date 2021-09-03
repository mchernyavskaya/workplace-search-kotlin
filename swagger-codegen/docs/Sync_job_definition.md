# SyncJobDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.String**](.md) |  | 
**jobType** | [**inline**](#JobTypeEnum) |  | 
**status** | [**inline**](#StatusEnum) |  | 
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**lastUpdatedAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 

<a name="JobTypeEnum"></a>
## Enum: job_type
Name | Value
---- | -----
jobType | full, incremental, delete, permissions

<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | enqueued, running, suspended, failed, complete
