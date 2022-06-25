package com.thymeleaftemplate.batch;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TutorialConfig {

    private final JobBuilderFactory jobBuilderFactory;      // Job 빌더 생성용
    private final StepBuilderFactory stepBuilderFactory;    // Step 폴더 생성용

    @Bean
    public Job toturialJob() {
        return jobBuilderFactory.get("tutorialJob")
                .start(tutorialStep())
                .build();
    }

    @Bean
    public Step tutorialStep() {
        return stepBuilderFactory.get("tutorialStep")
                .tasklet(new TutorialTasklet())
                .build();
    }



 }
