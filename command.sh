#!/bin/sh
openapi-generator generate -i swagger/v1/workplace-search.json -g kotlin -o ~/git/workplace-search-kotlin --group-id org.elasticsearch.workplace-search --artifact-id kotlin-api --invoker-package org.elasticsearch.workplacesearch --remove-operation-id-prefix --skip-validate-spec
