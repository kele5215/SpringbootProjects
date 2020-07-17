package com.ggdl.myproject.service.impl;

import com.ggdl.myproject.entity.UserEntity;
import com.ggdl.myproject.mapper.UserMapper;
import com.ggdl.myproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> listUser() {
       return userMapper.userList();
    }
}
