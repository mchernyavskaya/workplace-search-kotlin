# Unmappable OpenAPI code
## anyOf

15 entries

- object schemas:
    - `geo_point`
    - `facet_item`
    - `boost_value_requirements`
    - `boost_functional_requirements`
    - `boost_proximity_requirements`
    - `event_click_requirements`
    - `event_feedback_requirements`
    - `sync_jobs_command`
- properties/conditions (?):
    - `facet_range_item.from`, `facet_range_item.to`
    - `boost_value_requirements.function`, `boost_value_requirements.center`
    - `boost_functional_requirements.value`, `boost_functional_requirements.center`
    - `boost_proximity_requirements.center`
    - `boost_item.center`
    - `event_click_requirements.score`
    - `event_feedback_requirements.event`

## allOf

5 entries (but those are mainly different schema limitations)

- `boost_proximity_requirements.value`
- in `boost_item`
- in `analytics_event`
- in `start_sync_command`
- in `interrupt_sync_command`

## oneOf

22 entries

- `sync_jobs_command_response.results` (different types)
- `filter_value` (string OR number)
- `array_or_singular_filter_value` (single OR array)
- `filter` (different types)
- `array_or_singular_filter_clauses_or_filter` (single OR array)
- `filter_clauses_or_filter` (different types)
- `facet_range_item.from`, `facet_range_item.to` (string OR number)
- `boost_value_itemtype` (single OR array)
- `search_api_query.sort`, `search_api_query.facets`, `search_api_query.boosts` (single OR array)
- `search_api_result_item.raw` (string OR number)
- `search_facet_response_item.data.value`, `search_facet_response_item.data.from`, `search_facet_response_item.data.to` (string OR number)
- `search_facets_response` (single OR array)
- `synonyms_terms_filter` (single OR array)
- `synonyms_create_definition.synonyms`, `synonyms_create_definition.synonym_sets` (either prop is required)
- `list_synonym_set_response.meta.page.filter` (single OR array)
- `post` and `put` responses (bad_request or partially_created)

### Possible solutions

The oneOf entries mostly fall into just a few categories: different possible types of objects, single OR array, string OR number. How we could deal with these:

- `string OR number` - could be solved with a specific data type that always serializes to string but has 2 constructors, or serializes to number if it's a number (more hassle but possible). Classes having these types would always be manually created though (added to generator's `ignore`)
  - an alternative would be to scrape the numbers and leave just the string type; we could deal with the numbers internally in the code but the client APIs would be **only** generated with string parameters
- `single OR array` - [I understand the reason behind this is that any field type in Elastic can be either a value or an array](https://www.elastic.co/guide/en/elasticsearch/reference/master/array.html). However, for the client APIs like this, I would **not** expose a single-value option at all. Any typed language client will have a huge headache trying to work around that. For the typed languages, I would replace any such endpoints with an array-only.
- different types of objects. They'd have most probably be created manually, using generics and programming to interfaces. It could probably be solved with improving the generator, but that would require a deep, deep dive into its code.
- for the `POST` and `PUT` responses
  - could use different http response codes for the partial create/update - `422 UNPROCESSABLE ENTITY` for example (not a great fit but...)
  - could also use a response class that would have a required field `errors` (as both response types now do) and an _optional_ field for the entity state (as the partial response type does)
