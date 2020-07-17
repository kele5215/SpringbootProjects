package com.ggdl.myproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.ggdl")
@PropertySource("classpath:config/test.properties")
@Data
public class ConfigTestBean {

    private String name_test;
    private String want_test;
    private String yearhope_test;
}