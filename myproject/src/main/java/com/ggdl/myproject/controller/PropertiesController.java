package com.ggdl.myproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${com.ggdl.name}")
    private String name;

    @Value("${com.ggdl.want}")
    private String want;

    @RequestMapping("/properties")
    public String  disPlayPro() {
        return name + "  " + want;
    }

}