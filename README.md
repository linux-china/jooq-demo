JOOQ Demo
=============================
Spring Boot app with jOOQ

# jOOQ Concepts

A Brief Overview over the Most Common jOOQ
Types: https://blog.jooq.org/a-brief-overview-over-the-most-common-jooq-types/

### jOOQ query types

- DDL(Query): CREATE, ALTER, DROP, RENAME, and similar
- DML(Query): INSERT, UPDATE, DELETE, and MERGE, among others
- DQL(ResultQuery): SELECT queries

### Convert

- Casting
- coercing:
- collating

# jOOQ命名规范

### Java

- Class names are in PascalCase
- Member names are in camelCase
- Constants are in SNAKE_CASE

### SQL

A Guide to SQL Naming Conventions: https://blog.jooq.org/a-guide-to-sql-naming-conventions/

### 注意实现

- 列名：不要使用关键，诸如`type`, `schema`, `metadata`，这个会和Python SQLModel冲突，可以考虑为`ctype`等
- 数据库表名：不要使用`_record`后缀，和jOOQ命名有冲突。
- 如果列为json类型，那么负数则表示为array类型，典型样例为: `tags`, `labels`, `attributes`等，其他则为object类型，典型样例为
  `cmetadata`。 使用Jackson Converter时，可以转换为`List<String>`和`Map<String, Object>`类型。

# Reactive Fetching

Please refer https://www.jooq.org/doc/3.15/manual/sql-execution/fetching/reactive-fetching/ for details.

If you provide jOOQ with an `io.r2dbc.spi.Connection` or `io.r2dbc.spi.ConnectionFactory`,
then the publishers will execute queries in a non-blocking fashion on an R2DBC driver.

对于Spring Boot应用来说，你只需要添加以下依赖：

```xml

<dependencies>
  <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-r2dbc</artifactId>
  </dependency>
  <dependency>
    <groupId>org.mariadb</groupId>
    <artifactId>r2dbc-mariadb</artifactId>
    <version>1.3.0</version>
  </dependency>
</dependencies>
```

然后在application.properties中添加对应的R2DBC配置，如下：

```properties
# database r2dbc
spring.r2dbc.url=r2dbc:mariadb://127.0.0.1:3306/jooq
spring.r2dbc.username=root
spring.r2dbc.password=
spring.r2dbc.pool.enabled=true
spring.r2dbc.pool.initial-size=1
spring.r2dbc.pool.max-size=4
```

目前该该功能已经在Spring Boot 2.6.0中实现，关于Spring Boot
2.5.x的解决方法请访问 https://github.com/spring-projects/spring-boot/issues/26439

# jOOQ with Java record

```
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

```

# jOOQ with JdbcTemplate

API:
```
 jdbc.query(String sql, @Nullable Object[] args, ResultSetExtractor<T> rse)
```

Example:

```
    jdbcTemplate.query("select * from language", (ResultSetExtractor<List<LanguageRecord>>) rs -> jooq.fetch(rs).into(LANGUAGE));
```

# References

* jOOQ: https://www.jooq.org/
* Beginning jOOQ: Learn to Write Efficient and Effective Java-Based SQL Database
  Operations  https://learning.oreilly.com/library/view/beginning-jooq-learn/9781484274316/
* Spring Boot Starter
  jOOQ: https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.sql.jooq
* Spring Boot Support for jOOQ: https://www.baeldung.com/spring-boot-support-for-jooq
* jOOX: https://github.com/jOOQ/jOOX
* JOOQ Data Abstractions Without Distraction - Devnexus 2022: https://www.youtube.com/watch?v=80xV7OPtsrA
* jOOQ Masterclass: https://learning.oreilly.com/library/view/jooq-masterclass
* A Brief Overview over the Most Common jOOQ
  Types: https://blog.jooq.org/a-brief-overview-over-the-most-common-jooq-types/
* Spring Boot with jOOQ and
  PostgreSQL: https://boottechnologies-ci.medium.com/spring-boot-with-jooq-and-postgresql-4a86378a4e5e
* jooq-meta-postgres-flyway: jOOQ PostgreSQL DDL database with Flyway
  migrations - https://github.com/sabomichal/jooq-meta-postgres-flyway
* jOOQ Transactions with Kotlin Context Receivers: https://www.youtube.com/watch?v=GLYL2bkNPjM
* The Sakila Database: https://www.jooq.org/sakila
* Working with jOOQ and Flyway using
  Testcontainers: https://testcontainers.com/guides/working-with-jooq-flyway-using-testcontainers/
* jOOQ Spring Integration: https://github.com/martinellich/jooq-spring
* Fetching Data From One-to-One, One-to-Many, and Many-to-Many Relationships With
  jOOQ: https://dzone.com/articles/fetching-data-from-one-to-one-one-to-many-and-many
* jOOQ Masterclass: https://learning.oreilly.com/library/view/-/9781800566897/
* Beginning jOOQ: Learn to Write Efficient and Effective Java-Based SQL Database
  Operations: https://learning.oreilly.com/library/view/-/9781484274316/
* Commercial only features: https://www.jooq.org/doc/latest/manual/reference/commercial-only-features/
* A Brief Overview over the Most Common jOOQ
  Types: https://blog.jooq.org/a-brief-overview-over-the-most-common-jooq-types/
* jOOQ Masterclass: https://learning.oreilly.com/library/view/jooq-masterclass/9781800566897/
* testcontainers-jooq-codegen-maven-plugin: https://github.com/testcontainers/testcontainers-jooq-codegen-maven-plugin
* Fetching Data From One-to-One, One-to-Many, and Many-to-Many Relationships With
  jOOQ: https://mydeveloperplanet.com/2024/11/06/fetching-data-from-one-to-one-one-to-many-and-many-to-many-relationships-with-jooq/
* How to fetch multiple to-many relationships with jOOQ
  MULTISET: https://vladmihalcea.com/fetch-multiple-to-many-jooq-multiset/
* A Guide to SQL Naming
  Conventions: https://blog.jooq.org/a-guide-to-sql-naming-conventions/https://blog.jooq.org/a-guide-to-sql-naming-conventions/

