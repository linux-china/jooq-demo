package org.mvnsearch.domain.model.language;

import org.junit.jupiter.api.Test;
import org.mvnsearch.JooqBaseTest;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
import org.springframework.beans.factory.annotation.Autowired;

public class LanguageRepositoryTest extends JooqBaseTest {

  @Autowired
  private LanguageRepository languageRepository;

  @Test
  public void testDao() {
    final LanguageRecord language = languageRepository.findById(1).get();
    System.out.println(language.getId());
  }
}
