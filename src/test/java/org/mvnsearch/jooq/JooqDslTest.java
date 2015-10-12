package org.mvnsearch.jooq;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;

import static org.mvnsearch.infrastructure.jooq.Tables.*;

import org.junit.Test;
import org.mvnsearch.DatabaseBaseTestCase;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
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
        Result<LanguageRecord> records = dsl.selectFrom(LANGUAGE).fetch();
        for (LanguageRecord record : records) {
            System.out.println(record.getId());
        }
    }

    @Test
    public void testUpdate() throws Exception {
        dsl.update(LANGUAGE).set(LANGUAGE.DESCRIPTION, "Chinese").where(LANGUAGE.ID.eq(1));
    }
}
