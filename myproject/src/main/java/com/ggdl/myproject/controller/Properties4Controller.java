package com.ggdl.myproject.controller;

import com.ggdl.myproject.config.ConfigRandomBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigRandomBean.class})
public class Properties4Controller {

    @Autowired
    ConfigRandomBean configRandomBean;

    @RequestMapping("/properties4")
    public String  disPlayPro() {
        return configRandomBean.getSecret() + "  " +
               configRandomBean.getBignumber() + "  " +
               configRandomBean.getIn_range()+ "  " +
               configRandomBean.getLess_than_ten()+ "  " +
               configRandomBean.getUuid();
    }
}