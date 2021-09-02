
# SyncJobDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  | 
**jobType** | [**inline**](#JobTypeEnum) |  | 
**status** | [**inline**](#StatusEnum) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 
**lastUpdatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  | 


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



