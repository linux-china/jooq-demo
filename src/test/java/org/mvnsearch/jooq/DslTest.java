package org.mvnsearch.jooq;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;

import static org.mvnsearch.jooq.generated.Tables.*;

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
        Result<Record> records = dsl.select().from(USERS).fetch();
        for (Record record : records) {
            Integer id = record.getValue(USERS.ID);
            System.out.println(id);
        }
    }
}
