package com.ggdl.myproject.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

  /**
   * 本地访问内容地址 ：http://localhost:8080/hello
   * 
   * @param map
   * @return
   */
  @RequestMapping("/test")
  public String indexHtml(HashMap<String, Object> map) {
    map.put("hello", "欢迎进入HTML页面");
    return "/Index";
  }
}