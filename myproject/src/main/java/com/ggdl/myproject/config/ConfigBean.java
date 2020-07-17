package com.ggdl.myproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "com.ggdl")
@Data
public class ConfigBean {

    private String name;
    private String want;
    private String yearhope;
}