package org.mvnsearch;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = R2dbcAutoConfiguration.class)
public class JooqAppServer {
    public static void main(String[] args) {
        SpringApplication.run(JooqAppServer.class, args);
    }

    /**
     * jOOQ DSLContext with R2DBC
     *
     * @return DSLContext
     */
    @Bean
    public DSLContext jooQDSLContext() {
        ConnectionFactoryOptions options = ConnectionFactoryOptions.builder()
                .option(ConnectionFactoryOptions.DRIVER, "mariadb")
                .option(ConnectionFactoryOptions.PROTOCOL, "r2dbc")
                .option(ConnectionFactoryOptions.USER, "root")
                .option(ConnectionFactoryOptions.PASSWORD, "")
                .option(ConnectionFactoryOptions.HOST, "127.0.0.1")
                .option(ConnectionFactoryOptions.PORT, 3306)
                .option(ConnectionFactoryOptions.DATABASE, "jooq")
                .build();
        ConnectionFactory cf = ConnectionFactories.get(options);
        return DSL.using(cf).dsl();
    }
}
