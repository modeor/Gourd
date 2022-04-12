package com.gourd.gourdbase.controller;

import com.gourd.gourdbase.entity.User;
import com.gourd.gourdbase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/getInfo")
    public User getUser(){
        System.out.println("进入controller");
        User user = userService.getById(1);
        return user;
    }
}
