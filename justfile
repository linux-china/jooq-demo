jooq_stubs:
   mvn clean compile
   mvn -P generate generate-sources

db_schema:
   mysql -u root -p jooq < ./src/test/resources/database/schema/init.ddl