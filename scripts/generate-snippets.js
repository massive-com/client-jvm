const fs = require('fs');
const path = require('path');
const spec = require('./openapi.json');

const CLIENT_DIRECTORY = 'out';

const examplesDir = path.join(__dirname, 'examples');
const tokenizedDir = path.join(__dirname, 'examples-tokenized');

if (!fs.existsSync(examplesDir)) fs.mkdirSync(examplesDir);
if (!fs.existsSync(tokenizedDir)) fs.mkdirSync(tokenizedDir);

function capitalize(str) {
  return str.charAt(0).toUpperCase() + str.slice(1);
}

function getEnumClassName(paramName, operationId) {
  return `${capitalize(paramName)}${capitalize(operationId)}`;
}

function toMassiveToken(name) {
  let result = '';
  for (let i = 0; i < name.length; i++) {
    const c = name[i];
    if (c === '_') {
      result += '__';
    } else if (c.toUpperCase() === c && i > 0 && /^[A-Z]$/.test(c)) {
      result += '_' + c;
    } else {
      result += c;
    }
  }
  return 'MASSIVE_' + result.toUpperCase();
}

function toSnakeCase(str) {
  return str.replace(/([a-z\d])([A-Z])/g, '$1_$2').toLowerCase();
}

function getPlaceholder(param, useTokens, operationId) {
  if (useTokens) {
    return `"${toMassiveToken(param.name)}"`;
  }
  if (param.schema && param.schema.enum) {
    const enumClass = getEnumClassName(param.name, operationId);
    const firstValue = param.schema.enum[0];
    return `${enumClass}.${firstValue}`;
  }
  const type = param.schema ? param.schema.type : 'string';
  switch (type) {
    case 'string':
      return param.example ? `"${param.example}"` : `"<${param.name}>"`;
    case 'integer':
      return param.example || 0;
    case 'number':
      return param.example || 0.0;
    case 'boolean':
      return false;
    default:
      return `"<${param.name}>"`;
  }
}

function getRequestBodyType(requestBody) {
  if (requestBody && requestBody.content && requestBody.content['application/json']) {
    const schema = requestBody.content['application/json'].schema;
    if (schema.$ref) {
      return schema.$ref.split('/').pop();
    }
  }
  return null;
}

Object.entries(spec.paths).forEach(([route, methods]) => {
  Object.entries(methods).forEach(([method, details]) => {
    const operationId = details.operationId || `${method}_${route.replace(/[\/{}]/g, '_')}`;
    const funcName = operationId;

    const generateSnippet = (dir, useTokens = false) => {
      const imports = new Set([
        'org.openapitools.client.apis.DefaultApi',
        'org.openapitools.client.apis.DefaultApi.*',
        'org.openapitools.client.infrastructure.*',
        'org.openapitools.client.models.*'
      ]);
      
      const paramLines = [];
      const enumImports = new Set();

      if (details.parameters) {
        details.parameters.forEach(param => {
          if (param.in === 'query' || param.in === 'path') {
            const placeholder = getPlaceholder(param, useTokens, operationId);
            if (param.schema && param.schema.enum) {
              const enumClass = getEnumClassName(param.name, operationId);
              enumImports.add(`org.openapitools.client.apis.DefaultApi.${enumClass}`);
            }
            paramLines.push(`            ${param.name} = ${placeholder}`);
          }
        });
      }
      
      let requestBodyLines = [];
      const requestBodyType = getRequestBodyType(details.requestBody);
      if (requestBodyType) {
        imports.add(`org.openapitools.client.models.${requestBodyType}`);
        const jsonContent = details.requestBody.content['application/json'];
        const requestBodyJson = useTokens 
          ? `"""{"key": "MASSIVE_VALUE"}"""`
          : `"""${JSON.stringify(jsonContent.example || {"key": "value"}, null, 2)}"""`;
        requestBodyLines.push(`    val requestBodyJson = ${requestBodyJson}`);
        requestBodyLines.push(`    val requestBody = Serializer.moshi.adapter(${requestBodyType}::class.java).fromJson(requestBodyJson)`);
        paramLines.push(`            requestBody = requestBody`);
      }

      const snippetLines = [];
      snippetLines.push(`package org.openapitools.client`);
      snippetLines.push(``);
      Array.from(imports).forEach(importStmt => snippetLines.push(`import ${importStmt}`));
      //Array.from(enumImports).forEach(importStmt => snippetLines.push(`import ${importStmt}`));
      snippetLines.push(``);
      snippetLines.push(`fun main() {`);
      snippetLines.push(`    ApiClient.apiKey["apiKey"] = "GLOBAL_MASSIVE_API_KEY"`);
      snippetLines.push(``);
      if (requestBodyLines.length > 0) {
        requestBodyLines.forEach(line => snippetLines.push(line));
        snippetLines.push(``);
      }
      snippetLines.push(`    val api = DefaultApi()`);
      snippetLines.push(`    try {`);
      snippetLines.push(`        val result = api.${funcName}(`);
      if (paramLines.length > 0) {
        snippetLines.push(paramLines.join(',\n'));
        snippetLines.push(`        )`);
      } else {
        snippetLines.push(`        )`);
      }
      snippetLines.push(`        println(result)`);
      snippetLines.push(`    } catch (e: Exception) {`);
      snippetLines.push(`        println("Error calling ${funcName}: \${e.message}")`);
      snippetLines.push(`        e.printStackTrace()`);
      snippetLines.push(`    }`);
      snippetLines.push(`}`);

      let snakeOp = toSnakeCase(funcName);
      const snippetPath = path.join(dir, `${snakeOp}.kt`);
      fs.writeFileSync(snippetPath, snippetLines.join('\n'));
      console.log(`✅ Generated snippet: ${path.relative('.', snippetPath)}`);
    };

    generateSnippet(examplesDir, false);
    generateSnippet(tokenizedDir, true);
  });
});
