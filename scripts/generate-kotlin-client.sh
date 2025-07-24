#!/bin/bash

echo "Regenerating Kotlin client"
CLIENT_DIRECTORY="./src/rest"

echo "Deleting contents of $CLIENT_DIRECTORY"
rm -rf $CLIENT_DIRECTORY

echo "Generating Kotlin client..."
openapi-generator-cli generate -g kotlin -o $CLIENT_DIRECTORY -i ./src/openapi.json --additional-properties=useTags=true,enumPropertyNaming=camelCase

echo "Fixing json clashes"
sed -i 's/@Json(name = "name") name(/@Json(name = "name") nameEnum(/g' ./src/rest/src/main/kotlin/org/openapitools/client/apis/DefaultApi.kt

echo "Fixing java clashes"
node fix_kotlin_clashes.js

echo "Remove unnecessary generator file"
rm ./src/rest/src/main/kotlin/org/openapitools/client/models/java.time.LocalDate.kt

echo "Done!"
