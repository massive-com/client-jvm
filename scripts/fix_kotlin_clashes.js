const fs = require('fs');
const path = require('path');

const files = [
    "DeprecatedGetHistoricStocksQuotes200ResponseAllOfResultsInner.kt",
    "GetLastStocksQuote200ResponseResults.kt",
    "GetStocksSnapshotTickers200ResponseAllOfTickersInnerLastQuote.kt",
    "StocksSnapshotLastQuote.kt",
    "StocksV2NBBO.kt"
];

const dirPath = "./src/rest/src/main/kotlin/org/openapitools/client/models";

const conflictProps = ['P', 'S', 'X'];

files.forEach(file => {
    const filePath = path.join(dirPath, file);
    try {
        let content = fs.readFileSync(filePath, 'utf8');

        const propertyPattern = /@Json\(name = "(\w+)"\)\s*val (\w+): (\w+)(\??)/g;
        const matches = [...content.matchAll(propertyPattern)];
        const propNamesLower = new Set(matches.map(match => match[2].toLowerCase()));

        const toRename = matches
            .filter(match => {
                const propName = match[2];
                return propName.toUpperCase() === propName && propName.length === 1 && propNamesLower.has(propName.toLowerCase());
            })
            .map(match => ({ jsonName: match[1], propName: match[2] }));

        toRename.forEach(({ jsonName, propName }) => {
            const newName = `capital${propName}`;
            const escapedPropName = propName.replace(/[-\/\\^$*+?.()|[\]{}]/g, '\\$&');
            const pattern = new RegExp(`(@Json\\(name = "${jsonName}"\\)\\s*val )${escapedPropName}: (\\w+)(\\??)`, 'g');
            const replacement = `$1${newName}: $2$3`;
            content = content.replace(pattern, replacement);
        });

        fs.writeFileSync(filePath, content, 'utf8');
        console.log(`Processed ${file}`);
    } catch (error) {
        if (error.code === 'ENOENT') {
            console.log(`File not found: ${filePath}`);
        } else {
            console.log(`Error processing ${file}: ${error.message}`);
        }
    }
});