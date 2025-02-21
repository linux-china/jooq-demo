package org.mvnsearch.domain.model.language;

import ch.martinelli.oss.jooqspring.JooqDAO;
import org.jooq.DSLContext;
import org.mvnsearch.infrastructure.jooq.tables.Language;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
import org.springframework.stereotype.Component;

/**
 * language repository
 *
 * @author linux_china
 */
@Component
public class LanguageRepository extends JooqDAO<Language, LanguageRecord, Integer> {
  public LanguageRepository(DSLContext dslContext) {
    super(dslContext, Language.LANGUAGE);
  }
}
