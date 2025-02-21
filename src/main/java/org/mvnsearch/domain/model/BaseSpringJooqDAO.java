package org.mvnsearch.domain.model;

import org.jooq.DSLContext;
import org.jooq.Table;
import org.jooq.UpdatableRecord;
import org.mvnsearch.infrastructure.jooq.AbstractSpringDAOImpl;

/**
 * Base Spring Jooq DAO
 *
 * @author linux_china
 */
public abstract class BaseSpringJooqDAO<R extends UpdatableRecord<R>, T> extends AbstractSpringDAOImpl<R, R, T> {
  protected DSLContext dslContext;

  protected BaseSpringJooqDAO(DSLContext dslContext, Table<R> table, Class<R> type) {
    super(table, type, dslContext.configuration());
    this.dslContext = dslContext;
  }

  @Override
  public DSLContext ctx() {
    return this.dslContext;
  }
}
