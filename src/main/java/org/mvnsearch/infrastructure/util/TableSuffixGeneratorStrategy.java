package org.mvnsearch.infrastructure.util;


import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;
import org.jooq.meta.SchemaDefinition;
import org.jooq.meta.TableDefinition;

/**
 * table suffix generator
 *
 * @author Lukas Eder
 */
public class TableSuffixGeneratorStrategy extends DefaultGeneratorStrategy {

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        String name = super.getJavaClassName(definition, mode);
        if (definition instanceof TableDefinition && !name.endsWith("Record")) {
            name = name + "Table";
        }
        if (definition instanceof SchemaDefinition) {
            name = name + "Schema";
        }
        return name;
    }
}