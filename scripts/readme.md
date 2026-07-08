# Massive.com Kotlin Client Generator

Tooling that generates the Kotlin/JVM REST client SDK for the [Massive.com](https://massive.com/)
API from its OpenAPI specification.

The OpenAPI generator only understands the **REST** endpoints. The **WebSocket**
client under `com.massive.client.websocket` is hand-written and is never touched
by regeneration.

## Automated daily sync (recommended)

`.github/workflows/sync-openapi.yml` runs every day (and on manual dispatch). It:

1. Pulls the latest spec from `https://api.massive.com/openapi`.
2. Regenerates the client with `scripts/generate.sh`.
3. Opens (or updates) a **PR** — `bot/openapi-sync` → `master` — only when the
   regenerated output differs from what's committed. The commit is authored by
   the GitHub App's bot identity and a Slack notification is posted to
   `SLACK_CLIENT_LIBRARY_WEBHOOK`.

Required repo secrets: `SLACK_CLIENT_LIBRARY_WEBHOOK`
(`GITHUB_TOKEN` is provided automatically).

## Manual regeneration

Everything is wrapped in a single script. From the **repo root**:

```bash
# Uses openapi-generator-cli + a JDK already on your PATH.
scripts/generate.sh

# No local JDK? Generate inside the pinned Docker image instead:
GENERATOR=docker scripts/generate.sh

# Re-run only the assembly step against an already-generated ./src/rest:
GENERATOR=skip scripts/generate.sh
```

`generate.sh` performs the whole pipeline:

1. `pull_spec.js` → downloads + filters the spec to `src/openapi.json`.
2. `generate-kotlin-client.sh` → generates the Kotlin client into the scratch
   dir `src/rest` and applies the json/java clash fixes.
3. **Assembly** → replaces only the generated pieces
   (`src/main/kotlin/com/massive/client/{apis,models,infrastructure}`,
   `src/test/kotlin/com/massive/client`, `docs/`) and re-copies the sample
   `test.kt`. Hand-written code (`websocket/`) and curated files
   (`README.md`, `build.gradle`, `settings.gradle`, `gradlew`) are preserved.

The generator version is pinned in `openapitools.json` (currently **7.23.0**) so
diffs reflect spec changes, not generator upgrades.

## Building / testing the generated client

The library requires a JDK 17+. To build with a throwaway Gradle image:

```bash
docker run --rm -v "$(pwd)":/home/gradle/project -w /home/gradle/project gradle:jdk17 gradle build
docker run --rm -v "$(pwd)":/home/gradle/project -w /home/gradle/project gradle:jdk17 gradle run
```

## Files

| File | Purpose |
|------|---------|
| `generate.sh` | One-command orchestration (pull → generate → assemble). |
| `pull_spec.js` | Download + filter the OpenAPI spec. |
| `generate-kotlin-client.sh` | Invoke openapi-generator + clash fixes. |
| `fix_kotlin_clashes.js` | Rename single-letter property clashes (P/S/X). |
| `operation-mappings.js` | Rename selected operationIds. |
| `generate-snippets.js` | Generate per-endpoint example snippets. |
| `test.kt` | Sample `main()` copied into the client as `test.kt`. |
| `Dockerfile` | JDK 17 (Temurin) + Node + openapi-generator-cli image. |

## Troubleshooting

- **Generation produced no output** — `generate.sh` aborts if the expected
  package tree is missing, so the committed client is never clobbered by an
  empty result. Check the openapi-generator logs above the failure.
- **`pull_spec.js` fails** — verify network access to `api.massive.com`.
- **Gradle build issues** — the hand-written `websocket/` client depends on ktor,
  kotlinx-coroutines and kotlinx-serialization (declared in `build.gradle`, with the
  `org.jetbrains.kotlin.plugin.serialization` plugin applied). Its support classes
  (`HttpClientProvider`, `DefaultJvmHttpClientProvider`, `Version`, `ext/`) live at
  the package root — outside the three regenerated subpackages — so they survive syncs.
