package com.ohgiraffers.familystory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.ohgiraffers.familystory.repository")
public class FamilyStoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(FamilyStoryApplication.class, args);
    }
}
