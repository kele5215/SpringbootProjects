package com.ggdl.myproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @RequestMapping("/home")
  public String Index() {
    return "nihao  huanyin shiyong vs code";
  }
}