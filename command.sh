#!/bin/sh

openapi-generator generate -i workplace-search.json -g kotlin --group-id org.elasticsearch.workplace-search --artifact-id java-api --invoker-package org.elasticsearch.workplacesearch --remove-operation-id-prefix --log-to-stderr -v
