# AGENTS.md

Guidelines for AI coding agents working on the Massive JVM client (Kotlin, usable from Java; package `com.massive.client`).

## Generated code: read this first

The REST client is generated from the OpenAPI spec at https://api.massive.com/openapi with OpenAPI Generator (`kotlin`). A bot regenerates it every day and opens a PR, so **any hand edit to generated files will be overwritten.**

| Path | Status | Notes |
| --- | --- | --- |
| `src/main/kotlin/com/massive/client/apis/` | Generated | `DefaultApi.kt`, with every REST endpoint. Never edit. |
| `src/main/kotlin/com/massive/client/models/` | Generated | Response models. Never edit. |
| `src/main/kotlin/com/massive/client/infrastructure/` | Generated | HTTP client, serializers, adapters. Never edit, even though these files have no "do not edit" header. |
| `src/test/kotlin/com/massive/client/` | Generated | The whole test tree is deleted on every run. Tests added here will be lost. |
| `docs/` | Generated | Per-model and `DefaultApi` markdown. Deleted on every run. |
| `src/openapi.json` | Generated | The filtered spec the client is built from. Never edit. |
| `src/main/kotlin/com/massive/client/test.kt` | Generated | Copied from `scripts/test.kt`. Edit the template instead. |
| `src/main/kotlin/com/massive/client/websocket/` | Hand-written | The whole WebSocket client. |
| `src/main/kotlin/com/massive/client/ext/` | Hand-written | Java-friendly callbacks. |
| `HttpClientProvider.kt`, `Version.kt`, `WebSocketExample.kt` | Hand-written | Package root files in `com/massive/client/`. |
| `scripts/` | Tooling | The generation pipeline. |

To change generated output, edit the right input instead of the output:

- **Endpoint, parameter, model, or doc changes**: these come from the upstream spec. They can't be fixed in this repo; report them to the Massive team.
- **Public method names**: `scripts/operation-mappings.js`. Renaming an entry renames a public method, which is a breaking change. Don't "fix" or reorder entries, and don't copy this file from another SDK.
- **Spec filtering, tagging, or property-name conflicts**: `scripts/pull_spec.js`.
- **Generator options and post-generation fixes**: `scripts/generate-kotlin-client.sh` and `scripts/fix_kotlin_clashes.js`.
- **Generator version**: `openapitools.json`. Also update the cache key and PR body in `.github/workflows/sync-openapi.yml`, and `scripts/readme.md`.
- **The REST example**: `scripts/test.kt`.

After changing any tooling, regenerate and commit both the tooling change and the regenerated output.

See [`scripts/readme.md`](./scripts/readme.md) for the full pipeline.

## Essential commands

```bash
scripts/generate.sh                    # Regenerate from the live spec (needs Node 22, JDK 17+, openapi-generator-cli)
GENERATOR=docker scripts/generate.sh   # Same, running the generator in Docker (Node still needed on the host)
./gradlew build                        # Compile and test
./gradlew test                         # Tests only
./gradlew spotlessApply                # Format with ktfmt
./gradlew runRestExample               # Run the REST example (needs MASSIVE_API_KEY)
./gradlew runWebSocketExample          # Run the WebSocket example (needs MASSIVE_API_KEY)
```

Use JDK 17+. Gradle 8.7 comes from the wrapper.

## Layout

- `src/main/kotlin/com/massive/client/`: generated `apis/`, `models/`, `infrastructure/`, plus hand-written `websocket/`, `ext/`, and root files.
- `src/test/kotlin/`: generated test stubs only.
- `docs/`: generated API docs.
- `scripts/`: spec pull, operation mappings, generator wrapper, post-processing, Docker image.

`scripts/build.gradle` is an old, unused copy. The real build file is the root `build.gradle`.

## Conventions

- REST uses OkHttp + Moshi. WebSocket uses Ktor, coroutines, and kotlinx.serialization.
- API keys come from the `MASSIVE_API_KEY` env var. Never hardcode a key in code, tests, or examples.
- Tests must not call the live API.

## Pull requests

- Open or link an issue first. PRs not tied to an issue are generally declined. Fill in `.github/PULL_REQUEST_TEMPLATE.md`.
- Don't hand-edit generated paths. Spec-driven updates arrive through the daily `[bot] Sync client-jvm with OpenAPI spec` PRs.
