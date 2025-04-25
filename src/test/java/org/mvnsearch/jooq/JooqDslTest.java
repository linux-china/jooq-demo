package org.mvnsearch.jooq;

import com.github.database.rider.core.api.dataset.DataSet;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.junit.jupiter.api.Test;
import org.mvnsearch.JooqBaseTest;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
import org.springframework.beans.factory.annotation.Autowired;

import static org.jooq.Records.intoMap;
import static org.mvnsearch.infrastructure.jooq.Tables.LANGUAGE;

/**
 * jooq dsl context test
 *
 * @author linux_china
 */
@DataSet({"/database/dataset/languages.xml"})
public class JooqDslTest extends JooqBaseTest {
  @Autowired
  private DSLContext jooq;

  @Test
  public void testSelect() throws Exception {
    jooq.select(LANGUAGE.CD, LANGUAGE.DESCRIPTION)
      .from(LANGUAGE)
      .where(LANGUAGE.CD.eq("zh"))
      .collect(intoMap());
    Result<LanguageRecord> records = jooq.selectFrom(LANGUAGE).fetch();
    records.forEach(languageRecord -> System.out.println(languageRecord.getCd()));
  }

  @Test
  public void testZero() {
    final Integer i = jooq.selectOne().execute();
    System.out.println(i);
  }

  @Test
  public void testUpdate() throws Exception {
    jooq.update(LANGUAGE).set(LANGUAGE.DESCRIPTION, "Chinese").where(LANGUAGE.ID.eq(1));
  }
}
