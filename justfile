jooq-stubs:
    mvn -P generate generate-sources

jbang-jooq:
    jbang -Djooq.version=3.20.3 --deps com.mysql:mysql-connector-j:9.3.0 codegen@jooq jooq-config.xml

shell:
    mysql -h 127.0.0.1 -P 13306 -u root -p jooq

setup-schema:
    mysql -h 127.0.0.1 -P 13306 -u root -p jooq < ./src/test/resources/database/schema/init.ddl
