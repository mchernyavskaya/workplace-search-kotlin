
# BoostItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#TypeEnum) |  | 
**center** | [**AnyOfLessThanFilterValueCommaGeoPointGreaterThan**](AnyOfLessThanFilterValueCommaGeoPointGreaterThan.md) |  | 
**&#x60;value&#x60;** | [**BoostValueItemtype**](git/workplace-search-kotlin/openapi-generator/docs/BoostValueItemtype.md) |  |  [optional]
**function** | [**inline**](#FunctionEnum) |  |  [optional]
**operation** | [**inline**](#OperationEnum) |  |  [optional]
**factor** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: type
Name | Value
---- | -----
type | value, functional, proximity


<a name="FunctionEnum"></a>
## Enum: function
Name | Value
---- | -----
function | linear, exponential, logarithmic, gaussian


<a name="OperationEnum"></a>
## Enum: operation
Name | Value
---- | -----
operation | add, multiply



