package com.ggdl.myproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.ggdl")
@PropertySource("classpath:config/random.properties")
@Data
public class ConfigRandomBean {

    private String secret;
    private int number;
    private long bignumber;
    private String uuid;
    private int less_than_ten;
    private int in_range;
}