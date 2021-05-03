package com.zangyi.service.impl;

import com.zangyi.common.User;
import com.zangyi.mapper.UserMapper;
import com.zangyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int userInsert() {
        User user=new User(23,"普尺","123456",20,"女");
        return userMapper.insertSelective(user);
    }
}
