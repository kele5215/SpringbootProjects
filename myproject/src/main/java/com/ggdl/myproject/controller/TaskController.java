package com.ggdl.myproject.controller;

import com.ggdl.myproject.repository.DBConnector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired DBConnector connector;

    @RequestMapping(value = {
        "/",""
    })
    public String hellTask(){

        connector.configure(); //最终打印testdb
        return "hello task !! myage is 545";
    }
}