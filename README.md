JOOQ Demo
=============================
Spring Boot app with jOOQ


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
        <version>1.0.1</version>
    </dependency>
</dependencies>
```

然后在application.properties中添加对应的R2DBC配置，如下：

```
# database r2dbc
spring.r2dbc.url=r2dbc:mariadb://127.0.0.1:3306/jooq
spring.r2dbc.username=root
spring.r2dbc.password=
spring.r2dbc.pool.enabled=true
spring.r2dbc.pool.initial-size=1
spring.r2dbc.pool.max-size=4
```

目前该该功能还未完全实现，请关注： https://github.com/spring-projects/spring-boot/issues/26439

# References

* jOOQ: https://www.jooq.org/
* Spring Boot Starter jOOQ: https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/html/spring-boot-features.html#boot-features-jooq
* Spring Boot Support for jOOQ: https://www.baeldung.com/spring-boot-support-for-jooq
* jOOX: https://github.com/jOOQ/jOOX

