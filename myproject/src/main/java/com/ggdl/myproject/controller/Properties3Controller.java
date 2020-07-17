package com.ggdl.myproject.controller;

import com.ggdl.myproject.config.ConfigTestBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigTestBean.class})
public class Properties3Controller {

    @Autowired
    ConfigTestBean configTestBean;

    @RequestMapping("/properties3")
    public String  disPlayPro() {
        return configTestBean.getName_test() +
               " Properties3 " +
               configTestBean.getWant_test() + "\n" +
               configTestBean.getYearhope_test();
    }
}