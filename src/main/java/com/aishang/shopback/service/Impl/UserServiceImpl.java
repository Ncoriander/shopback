package com.aishang.shopback.service.Impl;

import com.aishang.shopback.dao.UserMapper;
import com.aishang.shopback.po.User;
import com.aishang.shopback.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
