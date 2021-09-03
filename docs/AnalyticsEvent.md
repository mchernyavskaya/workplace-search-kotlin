
# AnalyticsEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#TypeEnum) |  | 
**queryId** | **kotlin.String** | query identifier for the event | 
**page** | **kotlin.Int** | page number of the document in the query result set | 
**contentSourceId** | **kotlin.String** | content source identifier for the event document | 
**documentId** | **kotlin.String** | document identifier for the event | 
**rank** | **kotlin.Int** | rank of the document in the overall result set | 
**event** | **kotlin.String** | the target identifier for a click event |  [optional]
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



