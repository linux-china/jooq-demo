package org.mvnsearch.spring;

import org.jooq.DSLContext;
import org.jooq.Records;
import org.junit.jupiter.api.Test;
import org.mvnsearch.JooqBaseTest;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.util.List;

import static org.mvnsearch.infrastructure.jooq.Tables.LANGUAGE;


/**
 * jdbc template test
 *
 * @author linux_china
 */
public class JdbcTemplateTest extends JooqBaseTest {
  @Autowired
  private JdbcTemplate jdbcTemplate;
  @Autowired
  private DSLContext jooq;

  @Test
  public void testSelect() throws Exception {
    jdbcTemplate.query("select id, cd from language", (ResultSetExtractor<List<LanguageRecord>>) rs -> jooq.fetch(rs).into(LANGUAGE));
  }

  @Test
  public void testJavaRecord() throws Exception {
    List<Language> languages =
      jooq.select(LANGUAGE.ID, LANGUAGE.CD)
        .from(LANGUAGE)
        .orderBy(LANGUAGE.ID)
        .fetch(Records.mapping(Language::new));
  }

  record Language(int id, String cd) {
  }

}
