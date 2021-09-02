# Kotlin client library for Workplace Search API - Investigation

## Considered tools

 - [swagger-codegen](https://github.com/swagger-api/swagger-codegen)
 - [openapi-generator](https://github.com/openapitools/openapi-generator)

[Comparison](https://www.githubcompare.com/swagger-api/swagger-codegen+openapitools/openapi-generator) of the repos shows that they both are heavily starred, regularly updated and widely used. The `openapi-generator` has actually been forked from `swagger-codegen` in 2018 for reasons explained [here](https://github.com/OpenAPITools/openapi-generator/blob/master/docs/qna.md), so they have a lot in common.

The underside of that is, both seem to have a staggering number of open issues (some of them very, very moldy).

## Questions to ask

 - Is the code generated without errors from unchanged json?
 - Does the generated code compile?
 - Are file names looking right?
 - Are folder paths looking right?
 - Is the tool easily configured? (As in: do we have enough configuration options provided to generate the code in the shape we want)
 - Are the tool templates customizable?
 - List the problems you found. For each, specify if it could be fixed by either of:
   - changing the input JSON
   - post-processing generated files
   - anything else
 - Is the code clean and idiomatic?


## Answers

| Q 	| swagger-codegen 	| openapi-generator 	|
|---|-----------------|-------------------|
| Is the code generated without errors from unchanged json?|yes|no|
|Does the generated code compile?|no|no|
|Are file names looking right?|no|yes|
|Are folder paths looking right?|yes|yes|
|Is the tool easily configured? (As in: do we have enough configuration options provided to generate the code in the shape we want)|yes|yes|
|Are the tool templates customizable?|yes|yes|
|Is the code clean and idiomatic?|no|no|

### Problems

#### swagger-codegen

| Description | Fixable? |
|-------------|----------|
| 1. Model file names are `snake_case` | Perhaps, by post-processing or getting a newer tool revision, or just fixing the tool code itself |
| 2.  ||
