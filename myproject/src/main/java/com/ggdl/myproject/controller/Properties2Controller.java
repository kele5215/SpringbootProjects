package com.ggdl.myproject.controller;

import com.ggdl.myproject.config.ConfigBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class Properties2Controller {

    @Autowired
    ConfigBean configBean;

    @RequestMapping("/properties2")
    public String  disPlayPro() {
        return configBean.getName() + " Properties2 " + configBean.getWant() + "\n" + configBean.getYearhope();
    }
}