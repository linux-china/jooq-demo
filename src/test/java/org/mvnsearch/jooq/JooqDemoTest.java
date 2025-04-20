package org.mvnsearch.jooq;

import com.github.database.rider.core.api.dataset.DataSet;
import org.jooq.Result;
import org.jooq.impl.DefaultDSLContext;
import org.junit.jupiter.api.Test;
import org.mvnsearch.JooqBaseTest;
import org.mvnsearch.infrastructure.jooq.tables.records.LanguageRecord;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;

import java.util.List;

import static org.mvnsearch.infrastructure.jooq.Tables.LANGUAGE;

/**
 * jooq demo test
 *
 * @author linux_china
 */
@DataSet({"/database/dataset/languages.xml"})
public class JooqDemoTest extends JooqBaseTest {
  @Autowired
  private DefaultDSLContext jooq;

  @Test
  public void testSpike() throws Exception {
    Result<LanguageRecord> result = jooq.selectFrom(LANGUAGE).fetch();
    result.forEach(language -> {
      System.out.println(language.getId());
    });
  }

  @Test
  public void testReactive() {
    final List<String> titles = Flux.from(jooq.select(LANGUAGE.DESCRIPTION).from(LANGUAGE))
      .map(r -> r.get(LANGUAGE.DESCRIPTION))
      .collectList()
      .block();
    System.out.println(titles);
  }
}
