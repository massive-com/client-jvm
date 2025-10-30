import path from 'path';
import fs from 'fs';
import mappings from './operation-mappings.js'; // Import the operationId mappings

const fetchSpec = async (url) => {
  const response = await fetch(url);
  if (!response.ok) {
    throw new Error(`Failed to fetch spec: ${response.statusText}`);
  }
  return response.json();
};

const saveSpec = (spec, filename) => {
  const dir = path.dirname(filename);
  if (!fs.existsSync(dir)) {
    fs.mkdirSync(dir, { recursive: true });
  }
  fs.writeFileSync(filename, JSON.stringify(spec, null, 2));
};

// Function to resolve property name conflicts by adding x-kotlin-property-name
const resolvePropertyNameConflicts = (spec) => {
  const schemas = spec.components?.schemas || {};
  for (const schemaName in schemas) {
    const schema = schemas[schemaName];
    if (schema.properties) {
      const propertyNames = Object.keys(schema.properties);
      const lowerCaseMap = new Map();

      // Group properties by their lowercase names to find conflicts
      propertyNames.forEach(prop => {
        const lower = prop.toLowerCase();
        if (!lowerCaseMap.has(lower)) {
          lowerCaseMap.set(lower, []);
        }
        lowerCaseMap.get(lower).push(prop);
      });

      // Resolve conflicts by adding x-kotlin-property-name
      lowerCaseMap.forEach((props, lower) => {
        if (props.length > 1) {
          // Conflict detected (e.g., P and p)
          props.forEach((prop, index) => {
            if (index > 0) {
              // Keep the first property name as is, modify subsequent ones
              const uniqueName = `${prop.toLowerCase()}_${prop === prop.toUpperCase() ? 'upper' : 'lower'}`;
              schema.properties[prop]['x-kotlin-property-name'] = uniqueName;
            }
          });
        }
      });
    }
  }
  return spec;
};

const main = async () => {
  const specUrl = 'https://api.massive.com/openapi';
  const specFilename = path.join('./', 'src', 'openapi.json');

  try {
    const spec = await fetchSpec(specUrl);

    const paths = {};
    for (const [path, pathObj] of Object.entries(spec.paths)) {
      // Skip paths marked as drafts
      if (pathObj["x-massive-draft"]) continue;

      // Since all endpoints use GET, process the 'get' method
      const operation = pathObj.get;
      const key = `${path}+${operation.operationId}`; // e.g., "/fed/vX/treasury-yields+TreasuryYields"
      const newOperationId = mappings[key] || operation.operationId; // Rename if mapping exists

      paths[path] = {
        ...pathObj,
        get: {
          ...operation,
          tags: ["default"], // Add default tag
          operationId: newOperationId, // Update operationId
        },
      };
    }

    // Create the cleaned spec with updated paths
    let cleanedSpec = { ...spec, paths };

    // Resolve property name conflicts before saving
    cleanedSpec = resolvePropertyNameConflicts(cleanedSpec);

    saveSpec(cleanedSpec, specFilename);
    console.log(`Spec saved to ${specFilename}`);
  } catch (error) {
    console.error(`Error: ${error.message}`);
  }
};

main();