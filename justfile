jooq_stubs:
   mvn clean compile
   mvn -P generate generate-sources

shell:
   mysql -h 127.0.0.1 -P 13306 -u root -p jooq

setup-schema:
   mysql -h 127.0.0.1 -P 13306 -u root -p jooq < ./src/test/resources/database/schema/init.ddl
