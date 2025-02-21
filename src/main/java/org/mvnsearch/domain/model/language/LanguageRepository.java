package org.mvnsearch.domain.model.language;

import org.jooq.DSLContext;
import org.mvnsearch.infrastructure.jooq.AbstractSpringDAOImpl;
import org.mvnsearch.infrastructure.jooq.tables.Language;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
import org.springframework.stereotype.Component;

/**
 * language repository
 *
 * @author linux_china
 */
@Component
public class LanguageRepository extends AbstractSpringDAOImpl<LanguageRecord, LanguageRecord, Integer> {
  private final DSLContext dslContext;

  public LanguageRepository(DSLContext dslContext) {
    super(Language.LANGUAGE, LanguageRecord.class, dslContext.configuration());
    this.dslContext = dslContext;
  }

  @Override
  public DSLContext ctx() {
    return this.dslContext;
  }

  @Override
  public Integer getId(LanguageRecord object) {
    return object.getId();
  }
}
