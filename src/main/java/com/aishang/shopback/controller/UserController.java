package com.aishang.shopback.controller;

import com.aishang.shopback.po.User;
import com.aishang.shopback.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Resource
    private UserService userService;
    
    @RequestMapping("demo")
    public List<User> demo(){

        return userService.getAllUser();
    }
}
