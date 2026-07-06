#!/usr/bin/env bash
#
# generate.sh — one-command regeneration of the Massive JVM (Kotlin) REST client.
#
# Reproduces the committed repo layout deterministically:
#   1. Pull the OpenAPI spec         -> src/openapi.json
#   2. Generate the Kotlin REST client into a scratch dir (src/rest) and
#      post-process it (json/java clashes, stray generator file).
#   3. Assemble the generated output into the committed layout, REPLACING only
#      the generated pieces and PRESERVING hand-written code (websocket/) and
#      curated files (root README.md, build.gradle, settings.gradle, gradlew).
#
# The OpenAPI generator only understands the REST endpoints; the WebSocket
# client under com/massive/client/websocket is hand-written and never touched.
#
# Runtime is selectable so the same script works in CI and locally:
#   GENERATOR=native   (default) use openapi-generator-cli + java already on PATH
#   GENERATOR=docker             build & run scripts/Dockerfile (no local JDK needed)
#   GENERATOR=skip               reuse an existing src/rest (for testing assembly)
#
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
cd "$ROOT"

PKG_PATH="com/massive/client"          # generated package (org path)
GEN_OUT="src/rest"                     # scratch dir the generator writes to
GENERATED_SUBPKGS=(apis models infrastructure)
GENERATOR="${GENERATOR:-native}"
IMAGE="massive-kotlin-client-generator"

echo "==> [1/4] Pulling OpenAPI spec"
node "$SCRIPT_DIR/pull_spec.js"

echo "==> [2/4] Generating Kotlin REST client (GENERATOR=$GENERATOR)"
case "$GENERATOR" in
  native)
    bash "$SCRIPT_DIR/generate-kotlin-client.sh"
    ;;
  docker)
    docker build -t "$IMAGE" "$SCRIPT_DIR"
    rm -rf "$GEN_OUT" && mkdir -p "$GEN_OUT"
    docker run --rm \
      -v "$ROOT/src/openapi.json:/app/src/openapi.json" \
      -v "$ROOT/$GEN_OUT:/app/src/rest" \
      -v "$ROOT/openapitools.json:/app/openapitools.json" \
      "$IMAGE"
    ;;
  skip)
    echo "    (skipping generation; reusing existing $GEN_OUT)"
    ;;
  *)
    echo "Unknown GENERATOR=$GENERATOR (expected native|docker|skip)" >&2
    exit 1
    ;;
esac

# Fail loudly if generation did not produce the expected tree, so we never
# clobber the committed client with an empty/partial result.
if [[ ! -d "$GEN_OUT/src/main/kotlin/$PKG_PATH/models" ]]; then
  echo "ERROR: generation output missing at $GEN_OUT/src/main/kotlin/$PKG_PATH" >&2
  exit 1
fi

echo "==> [3/4] Assembling into committed layout"

# 3a. Generated main sources — replace ONLY the generated subpackages so any
#     hand-written package (e.g. websocket/) living alongside is preserved.
for sub in "${GENERATED_SUBPKGS[@]}"; do
  rm -rf "src/main/kotlin/$PKG_PATH/$sub"
  mkdir -p "src/main/kotlin/$PKG_PATH/$sub"
  cp -a "$GEN_OUT/src/main/kotlin/$PKG_PATH/$sub/." "src/main/kotlin/$PKG_PATH/$sub/"
done

# 3b. Generated tests (apis + models). No hand-written tests live here.
rm -rf "src/test/kotlin/$PKG_PATH"
mkdir -p "src/test/kotlin/$PKG_PATH"
cp -a "$GEN_OUT/src/test/kotlin/$PKG_PATH/." "src/test/kotlin/$PKG_PATH/"

# 3c. Generated markdown docs.
rm -rf docs
mkdir -p docs
cp -a "$GEN_OUT/docs/." docs/

# 3d. Sample entrypoint (curated template, com.massive.client).
cp "$SCRIPT_DIR/test.kt" "src/main/kotlin/$PKG_PATH/test.kt"

echo "==> [4/4] Cleaning scratch output"
rm -rf "$GEN_OUT"

echo "Done. Regenerated com.massive.client from src/openapi.json."
