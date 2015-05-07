#!/bin/bash

JOOQ_VERSION="3.6.1"
##mvn dependency:resolve
M2_REPO=~/.m2/repository
java -Dorg.jooq.util.example.java-class-name-suffix=Table -classpath "${M2_REPO}/org/jooq/jooq/${JOOQ_VERSION}/jooq-${JOOQ_VERSION}.jar:${M2_REPO}/org/jooq/jooq-meta/${JOOQ_VERSION}/jooq-meta-${JOOQ_VERSION}.jar:${M2_REPO}/org/jooq/jooq-codegen/${JOOQ_VERSION}/jooq-codegen-${JOOQ_VERSION}.jar:${M2_REPO}/mysql/mysql-connector-java/5.1.30/mysql-connector-java-5.1.30.jar:." org.jooq.util.GenerationTool /jooq.xml
