package org.mvnsearch.domain.model.language;

import org.jooq.DSLContext;
import org.mvnsearch.domain.model.BaseSpringJooqDAO;
import org.mvnsearch.infrastructure.jooq.tables.Language;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
import org.springframework.stereotype.Component;

/**
 * language repository
 *
 * @author linux_china
 */
@Component
public class LanguageRepository extends BaseSpringJooqDAO<LanguageRecord, Integer> {

  public LanguageRepository(DSLContext dslContext) {
    super(dslContext, Language.LANGUAGE, LanguageRecord.class);
  }

  @Override
  public Integer getId(LanguageRecord object) {
    return object.getId();
  }
}
