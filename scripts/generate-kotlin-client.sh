#!/bin/bash

# Resolve this script's own directory so it works both inside the Docker image
# (cwd == /app, scripts alongside) and when invoked natively from the repo root
# (e.g. `bash scripts/generate-kotlin-client.sh`).
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

echo "Regenerating Kotlin client"
CLIENT_DIRECTORY="./src/rest"

echo "Deleting contents of $CLIENT_DIRECTORY"
rm -rf $CLIENT_DIRECTORY

echo "Generating Kotlin client..."
openapi-generator-cli generate -g kotlin -o $CLIENT_DIRECTORY -i ./src/openapi.json --additional-properties=useTags=true,enumPropertyNaming=camelCase,packageName=com.massive.client

echo "Fixing json clashes"
sed -i 's/@Json(name = "name") name(/@Json(name = "name") nameEnum(/g' ./src/rest/src/main/kotlin/com/massive/client/apis/DefaultApi.kt

echo "Fixing java clashes"
node "$SCRIPT_DIR/fix_kotlin_clashes.js"

echo "Remove unnecessary generator file"
rm -f ./src/rest/src/main/kotlin/com/massive/client/models/java.time.LocalDate.kt
# The generator also emits a test for that bogus model whose class name is the
# illegal `class java.time.LocalDateTest`. Remove it (and any similarly malformed
# test) so the project's test sources compile.
rm -f ./src/rest/src/test/kotlin/com/massive/client/models/DateTest.kt
grep -rl "class java\.time" ./src/rest/src/test/kotlin 2>/dev/null | xargs -r rm -f

echo "Done!"
