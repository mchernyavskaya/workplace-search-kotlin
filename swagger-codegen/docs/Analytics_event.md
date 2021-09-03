# AnalyticsEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#TypeEnum) |  | 
**queryId** | [**kotlin.String**](.md) | query identifier for the event | 
**page** | [**kotlin.Int**](.md) | page number of the document in the query result set | 
**contentSourceId** | [**kotlin.String**](.md) | content source identifier for the event document | 
**documentId** | [**kotlin.String**](.md) | document identifier for the event | 
**rank** | [**kotlin.Int**](.md) | rank of the document in the overall result set | 
**event** | [**kotlin.String**](.md) | the target identifier for a click event |  [optional]
**score** | [**inline**](#ScoreEnum) | the feedback score, constrained to the values -1 or 1 |  [optional]

<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | click, feedback

<a name="ScoreEnum"></a>
## Enum: score
Name | Value
---- | -----
score | -1, 1
