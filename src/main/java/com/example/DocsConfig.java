package com.example;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocsConfig
{
    @Bean
    public GroupedOpenApi api()
    {
        return GroupedOpenApi.builder()
                .group("com.example")
                .packagesToScan("OpenApiDemoController")
                .build();
    }
}