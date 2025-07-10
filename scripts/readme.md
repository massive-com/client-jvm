# Polygon.io Kotlin Client Generator

This directory contains tools and scripts to generate a Kotlin/JVM client SDK for the [Polygon.io](https://polygon.io/) API using the OpenAPI specification generator. The process involves building a Docker image for the generator, pulling the OpenAPI spec, generating the client code, building the project with Gradle, and running tests.

## Prerequisites

- Docker installed on your system.
- Node.js installed (for running `pull_spec.js`).
- A working directory with the necessary files:
  - Dockerfile for building the generator image.
  - `pull_spec.js` script in the project root or appropriate subdirectory.
  - Directories like `src/` and `project/` set up as needed.

## Usage

Follow these steps to generate, build, and test the Polygon.io Kotlin client SDK.

### 1. Build the Docker Image

Build the Docker image for the OpenAPI client generator:

```
docker build -t polygon-kotlin-client-generator .
```

### 2. Run the Generator Container (Initial Setup)

Run the Docker container to prepare the environment (this may perform initial setup or generation):

```
docker run --rm -v $(pwd):/app polygon-kotlin-client-generator
```

### 3. Pull the OpenAPI Specification

Use the Node.js script to fetch the latest OpenAPI spec from Polygon.io:

```
node pull_spec.js
```

This script downloads the spec and saves it as `src/openapi.json`.

### 4. Generate the Client Code

Run the Docker container again to generate the Kotlin client code using the pulled OpenAPI spec:

```
docker run --rm \
  -v $(pwd)/src/openapi.json:/app/src/openapi.json \
  -v $(pwd)/src/rest:/app/src/rest \
  polygon-kotlin-client-generator
```

The generated code will be placed in `src/rest`.

### 5. Copy Generated Files to Project Directory

Copy the generated source files to the project directory for building:

```
cp -a src project
```

### 6. Build the Project with Gradle

Use a Gradle Docker image to build the project:

```
docker run --rm -v $(pwd)/project/rest:/home/gradle/project -w /home/gradle/project gradle:jdk17 gradle build
```

This compiles the generated client code.

### 7. Copy Additional Scripts and Test Files

Copy the build script and test file to the appropriate locations in the project (adjust paths as needed if running on the host):

```
cp project/rest/scripts/build.gradle project/rest/
cp project/rest/scripts/test.kt project/rest/src/main/kotlin/org/openapitools/client/test.kt
```

**Note:** The original commands use container-internal paths (`/home/gradle/project`). If running these on the host, replace with host-equivalent paths like `project/rest/` as shown above.

### 8. Run the Test

Launch the application or test using Gradle in an interactive Docker session:

```
docker run -it --rm -v $(pwd)/src/rest:/app -w /app gradle:jdk17 gradle run
```

This will execute the test code (e.g., `test.kt`) and verify the client functionality.

## Troubleshooting

- Ensure all volumes are correctly mounted to avoid file not found errors.
- If the `pull_spec.js` script fails, verify your Node.js environment and internet connection.
- For Gradle build issues, check the Docker logs or run with `--debug` for more details.
- Customize the OpenAPI generator configuration in the Dockerfile or generator scripts as needed for Polygon.io specifics.

## Contributing

Contributions are welcome! Feel free to open issues or pull requests for improvements to the generation process, additional features, or bug fixes.
