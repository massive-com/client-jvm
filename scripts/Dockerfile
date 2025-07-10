# Use an official OpenJDK base image with Node.js for openapi-generator-cli
FROM openjdk:17-jdk-slim

# Install Node.js and npm
RUN apt-get update && \
    apt-get install -y curl && \
    curl -sL https://deb.nodesource.com/setup_18.x | bash - && \
    apt-get install -y nodejs && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Install openapi-generator-cli globally
RUN npm install -g @openapitools/openapi-generator-cli

# Set working directory
WORKDIR /app

# Copy the generation script into the container
COPY generate-kotlin-client.sh .

# Copy the clashes fix script into the container
COPY fix_kotlin_clashes.js .

# Ensure the script is executable
RUN chmod +x generate-kotlin-client.sh

# Default command to run the generation script
CMD ["./generate-kotlin-client.sh"]
