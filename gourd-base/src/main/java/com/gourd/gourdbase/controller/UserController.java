//package com.gourd.gourdbase.controller;
//
//import com.gourd.gourdbase.model.po.User;
//import com.gourd.gourdbase.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.naming.AuthenticationException;
//
//@CrossOrigin
//@RestController
//@RequestMapping(value = "/user", produces = "text/html;charset=UTF-8")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/login")
//    public String login(String userName, String password) throws AuthenticationException {
//        String login = userService.login(userName, password);
//        return login;
//    }
//
//    @PostMapping("/getInfo")
//    public User getUser() {
//        System.out.println("进入controller");
//        User user = userService.getById(1);
//        return user;
//    }
//}
