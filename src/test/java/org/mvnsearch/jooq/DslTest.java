package org.mvnsearch.jooq;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;

import static org.mvnsearch.jooq.db.Tables.*;

import org.junit.Test;
import org.unitils.spring.annotation.SpringBean;

/**
 * dsl context test
 *
 * @author linux_china
 */
public class DslTest extends JooqBaseTestCase {
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
