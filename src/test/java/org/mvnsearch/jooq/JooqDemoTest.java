package org.mvnsearch.jooq;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Test;

import static org.mvnsearch.jooq.db.Tables.*;

import org.mvnsearch.DatabaseBaseTestCase;
import org.unitils.database.annotations.TestDataSource;
import org.unitils.dbunit.annotation.DataSet;

import javax.sql.DataSource;

/**
 * jooq demo test
 *
 * @author linux_china
 */
@DataSet({"/database/dataset/languages.xml"})
public class JooqDemoTest extends DatabaseBaseTestCase {
    @TestDataSource
    private DataSource dataSource;

    @Test
    public void testSpike() {
        DSLContext dsl = DSL.using(dataSource, SQLDialect.MYSQL);
        Result<Record> result = dsl.select().from(LANGUAGE).fetch();
        for (Record r : result) {
            Integer id = r.getValue(LANGUAGE.ID);
            System.out.println(id);
        }
    }
}
