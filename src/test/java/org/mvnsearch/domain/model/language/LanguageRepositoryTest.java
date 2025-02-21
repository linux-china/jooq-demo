package org.mvnsearch.domain.model.language;

import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.jupiter.api.Test;
import org.mvnsearch.JooqBaseTest;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@DataSet({"/database/dataset/languages.xml"})
public class LanguageRepositoryTest extends JooqBaseTest {

  @Autowired
  private LanguageRepository languageRepository;

  @Test
  public void testDao() {
    final LanguageRecord language = languageRepository.findById(1);
    assertThat(language).isNotNull();
    System.out.println(language.getId());
  }
}
