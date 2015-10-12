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
    @SpringBean("jooq")
    private DSLContext jooq;

    @Test
    public void testSelect() throws Exception {
        Result<LanguageRecord> records = jooq.selectFrom(LANGUAGE).fetch();
        records.stream().forEach(languageRecord -> System.out.println(languageRecord.getId()));
    }

    @Test
    public void testUpdate() throws Exception {
        jooq.update(LANGUAGE).set(LANGUAGE.DESCRIPTION, "Chinese").where(LANGUAGE.ID.eq(1));
    }
}
