# workplace-search-kotlin

Testing options for client APIs for Workplace Search

Investigated options:

 * [swagger-codegen](https://swagger.io/tools/swagger-codegen/)
   * [github](https://github.com/swagger-api/swagger-codegen)
   * [problems](openapi-generator/problems.md)
 * [https://openapi-generator.tech/](https://openapi-generator.tech/)
   * [github](https://github.com/openapitools/openapi-generator) 
   * [problems](swagger-codegen/problems.md)
 
Two folders in the project root correspond to the code, generated by these tools.

See also a repo with [manually created code](https://github.com/mchernyavskaya/workplace-kotlin-experiment) (only a few classes for now).

# Investigation

## Considered tools

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

A great example of analyzing code can also be found [here (and it contains many more considerations)](https://github.com/elastic/clients-team/issues/121#issuecomment-582768217).

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

- Model file names are `snake_case`
   - Might be fixable by post-processing or getting a newer tool revision, or just fixing the tool code itself
- API file names have duplicated suffix (xxAPIApi)
   - probably fixable by changing source json or post-processing
- AnyOf/OneOf don't seem to be handled correctly
   - this is a bad one - it produces empty unused classes
- Unused imports
- Obsolete fully-qualified names
- Wrong class mappings
   - `org.elasticsearch.workplacesearch.models.ByteArray` instead of `ByteArray`
- Kotlin and Gradle versions are not very current
- 2 Deprecated methods
- Warning about extension function being shadowed by a member
- `ktlint` isn't used
- When `ktlintCheck` is applied, it shows a huge list of warnings. Common are:
   - File must end with a newline (\n)
   - Trailing space(s)
   - Needless blank line(s)
   - Unexpected spacing before "("
   - Unnecessary block ("{}")
   - etc etc
- When `ktlintFormat` is applied, some issues are left which aren't correctable. They're mostly file name related (see `snake_case` issue above). Example:

```text
/Users/marynacherniavska/git/workplace-search-kotlin/src/main/kotlin/org/elasticsearch/workplacesearch/models/Abstract_sync_command.kt:1:1: class AbstractSyncCommand should be declared in a file named AbstractSyncCommand.kt
```

- Other non-fixable things include wildcard imports (but those can be overridden in `ktlink` config)
- TODOs in code
- doesn't generate any tests
- there's not many dependencies, but they're opinionated (`okhttp` for REST, `moshi-adapters` for JSON) and **not** configurable (they are for java - java generators allow to change some libraries)

#### openapi-generator

- API file names have duplicated suffix (xxAPIApi)
   - same as above
- OneOf isn't processed correctly
   - Probably could be fixed by own templates, or using `Any`, or a workaround with generics, but needs looking into
   - any fix would probably be *ugly* - I'd say we need to look into reorganizing the APIs to mane them more compliant with good practices. **As is, they're a living hell for any strongly typed programming language.**
- A lot of model classes generated as data classes with empty primary constructor (and therefore do not compile)
   - in swagger-codegen, such classes were simply `class` not `data class`
   - can probably be fixed by own templating or fixing source JSON
- Same data classes with empty constructors actually do have properties in source JSON, so they're generated incorrectly
   - IDK if there's a fix - needs investigating
- Some other code that doesn't compile (for example, with reserved-word props and constructor params with the same names as props)
- Some TODOs in the code - but not as many
- suppresses warnings about unused imports, qualified names and some others
- `ktlint` isn't used
- doesn't generate any tests
- there's not many dependencies, but they're opinionated (`okhttp` for REST, `moshi-adapters` for JSON) and **not** configurable (they are for java - java generators allow to change some libraries)
   - this is the same as in `swagger-codegen`

