package com.ggdl.myproject.controller;

import com.ggdl.myproject.entity.UserEntity;
import com.ggdl.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserMybatisController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/listUser",method = RequestMethod.GET)
    public List<UserEntity> listUser(){
        List<UserEntity> list = userService.listUser();
        return list;
    }
}
