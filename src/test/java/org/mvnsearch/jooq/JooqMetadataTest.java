package org.mvnsearch.jooq;

import org.jetbrains.annotations.NotNull;
import org.jooq.*;
import org.jooq.impl.DefaultDSLContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Connection;
import java.sql.DriverManager;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JooqMetadataTest {

  private Connection connection;

  @BeforeAll
  public void setUp() throws Exception {
    connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", null);
  }

  @Test
  public void testParseDbSchema() throws Exception {
    DSLContext dslContext = new DefaultDSLContext(connection, SQLDialect.POSTGRES);
    final Meta meta = dslContext.meta();
    final Schema schema = meta.getSchemas("public").get(0);
    final Table<?> authorsTable = schema.getTable("authors");
    final @NotNull Field<?>[] fields = authorsTable.fields();
    for (Field<?> field : fields) {
      System.out.println(field.getName());
    }
  }

}
