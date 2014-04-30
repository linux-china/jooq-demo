#!/bin/bash

##mvn dependency:resolve
M2_REPO=~/.m2/repository
java -classpath "${M2_REPO}/org/jooq/jooq/3.3.1/jooq-3.3.1.jar:${M2_REPO}/org/jooq/jooq-meta/3.3.1/jooq-meta-3.3.1.jar:${M2_REPO}/org/jooq/jooq-codegen/3.3.1/jooq-codegen-3.3.1.jar:${M2_REPO}/mysql/mysql-connector-java/5.1.30/mysql-connector-java-5.1.30.jar:." org.jooq.util.GenerationTool /jooq.xml
