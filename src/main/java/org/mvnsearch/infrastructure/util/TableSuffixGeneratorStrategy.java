package org.mvnsearch.infrastructure.util;


import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;
import org.jooq.util.TableDefinition;

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
        return name;
    }
}