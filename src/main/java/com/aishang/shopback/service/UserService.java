package com.aishang.shopback.service;

import com.aishang.shopback.po.User;
import java.util.List;

public interface UserService {

    /**
     * 查询用户表里的所有用户
     * @return
     */
    public List<User> getAllUser();
}
