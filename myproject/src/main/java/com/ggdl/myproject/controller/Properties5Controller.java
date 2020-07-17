package com.ggdl.myproject.controller;

import com.ggdl.myproject.config.ConfigTestNewBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigTestNewBean.class})
public class Properties5Controller {

    @Autowired
    ConfigTestNewBean configTestNewBean;

    @RequestMapping("/propertise5")
    public String  disPlayPro() {
        return configTestNewBean.getFoo() + "  " +
               configTestNewBean.getPost() + "  " +
               configTestNewBean.getPosts();
    }
}