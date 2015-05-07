JOOQ Demo
=============================
Demo project for JOOQ


### Tools

* use jenv to install jdk 1.8
* Docker Compose


### JOOQ maven plugin
 JOOQ codegen maven plugin设置。

                <plugin>
                    <groupId>org.jooq</groupId>
                    <artifactId>jooq-codegen-maven</artifactId>
                    <version>${jooq.version}</version>
    
                    <executions>
                        <execution>
                            <id>generate-mysql</id>
                            <phase>generate-sources</phase>
                            <goals>
                                <goal>generate</goal>
                            </goals>
                        </execution>
                    </executions>
    
                    <dependencies>
                        <dependency>
                            <groupId>mysql</groupId>
                            <artifactId>mysql-connector-java</artifactId>
                            <version>5.1.35</version>
                        </dependency>
                    </dependencies>
    
                    <configuration>
                        <jdbc>
                            <driver>com.mysql.jdbc.Driver</driver>
                            <url>jdbc:mysql://dev.mvnsearch.net:3306/jooq?useUnicode=true&amp;characterEncoding=UTF-8</url>
                            <user>root</user>
                            <password>123456</password>
                        </jdbc>
    
                        <!-- Generator parameters -->
                        <generator>
                            <name>org.jooq.util.JavaGenerator</name>
                            please add -Dorg.jooq.util.example.java-class-name-suffix=Table
                            <strategy>
                                <name>org.jooq.util.example.JVMArgsGeneratorStrategy</name>
                            </strategy>
                            <database>
                                <name>org.jooq.util.mysql.MySQLDatabase</name>
                                <includes>.*</includes>
                                <excludes>dbmaintain_scripts</excludes>
                                <inputSchema>jooq</inputSchema>
                            </database>
                            <target>
                                <packageName>org.mvnsearch.infrastructure.jooq</packageName>
                                <directory>src/main/java</directory>
                            </target>
                        </generator>
                    </configuration>
                </plugin>
