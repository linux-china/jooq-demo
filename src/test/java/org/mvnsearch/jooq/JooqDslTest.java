package org.mvnsearch.jooq;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;

import static org.mvnsearch.jooq.db.Tables.*;

import org.junit.Test;
import org.mvnsearch.DatabaseBaseTestCase;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBean;

/**
 * jooq dsl context test
 *
 * @author linux_china
 */
@DataSet({"/database/dataset/languages.xml"})
public class JooqDslTest extends DatabaseBaseTestCase {
    @SpringBean("dsl")
    private DSLContext dsl;

    @Test
    public void testSelect() throws Exception {
        Result<Record> records = dsl.select().from(LANGUAGE).fetch();
        for (Record record : records) {
            Integer id = record.getValue(LANGUAGE.ID);
            System.out.println(id);
        }
    }
}
