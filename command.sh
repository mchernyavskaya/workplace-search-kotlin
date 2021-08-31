#!/bin/sh

swagger-codegen generate -i swagger/v1/workplace-search.json -l kotlin-client -o ~/git/workplace-search-kotlin --group-id org.elasticsearch.workplace-search --artifact-id kotlin-client --model-package org.elasticsearch.workplace-search.model --api-package org.elasticsearch.workplace-search.api
