# org.openapitools.client - Kotlin client library for Workplace Search API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:3002*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.ArrayOrSingularFilterValue](docs/ArrayOrSingularFilterValue.md)
 - [org.openapitools.client.models.FilterValue](docs/FilterValue.md)
 - [org.openapitools.client.models.GeoDistanceFilter](docs/GeoDistanceFilter.md)
 - [org.openapitools.client.models.GeoPoint](docs/GeoPoint.md)
 - [org.openapitools.client.models.GeoRangeFilter](docs/GeoRangeFilter.md)
 - [org.openapitools.client.models.GeoUnitEnum](docs/GeoUnitEnum.md)
 - [org.openapitools.client.models.QueryRefinementItem](docs/QueryRefinementItem.md)
 - [org.openapitools.client.models.RangeFilter](docs/RangeFilter.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basic_auth"></a>
### basic_auth

- **Type**: HTTP basic authentication

<a name="bearer_auth"></a>
### bearer_auth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

