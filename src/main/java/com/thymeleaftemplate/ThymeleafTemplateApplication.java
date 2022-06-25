package com.thymeleaftemplate;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class ThymeleafTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafTemplateApplication.class, args);
    }

}
