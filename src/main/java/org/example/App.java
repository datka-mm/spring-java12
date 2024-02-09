package org.example;

import org.example.config.HibernateConfig;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 */
@Component
public class App {
    public static void main(String[] args) {
        HibernateConfig.getEntityManager();
        System.out.println("Hello World!");

        /**
         * <project xmlns="http://maven.apache.org/POM/4.0.0"
         *          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         *          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
         *     <modelVersion>4.0.0</modelVersion>
         *
         *     <groupId>com.example</groupId>
         *     <artifactId>spring-data-example</artifactId>
         *     <version>1.0-SNAPSHOT</version>
         *
         *     <properties>
         *         <spring.version>5.3.12</spring.version>
         *         <hibernate.version>5.6.0.Final</hibernate.version>
         *         <postgresql.version>42.2.24</postgresql.version>
         *     </properties>
         *
         *     <dependencies>
         *         <!-- Spring -->
         *         <dependency>
         *             <groupId>org.springframework</groupId>
         *             <artifactId>spring-core</artifactId>
         *             <version>${spring.version}</version>
         *         </dependency>
         *         <dependency>
         *             <groupId>org.springframework</groupId>
         *             <artifactId>spring-context</artifactId>
         *             <version>${spring.version}</version>
         *         </dependency>
         *
         *         <!-- Hibernate -->
         *         <dependency>
         *             <groupId>org.hibernate</groupId>
         *             <artifactId>hibernate-core</artifactId>
         *             <version>${hibernate.version}</version>
         *         </dependency>
         *
         *         <!-- PostgreSQL -->
         *         <dependency>
         *             <groupId>org.postgresql</groupId>
         *             <artifactId>postgresql</artifactId>
         *             <version>${postgresql.version}</version>
         *         </dependency>
         *     </dependencies>
         * </project>
         */
    }
}
