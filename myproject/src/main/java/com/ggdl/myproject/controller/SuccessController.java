package com.ggdl.myproject.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import java.util.Map;

// import java.util.HashMap;

@Controller
public class SuccessController {
    @RequestMapping("/helloAction")
    public String sucTest(Map<String,Object> map){
        map.put("hello","终于能出来了！！");
        return "admin/hello";
    }
}