package com.gourd.gourdbase.service.impl;

import com.gourd.gourdbase.dao.UserDao;
import com.gourd.gourdbase.entity.AuthenticationInfo;
import com.gourd.gourdbase.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName: LoginServiceImpl
 * @Description: 登录服务
 * @author: hx
 * @date: 2022-06-01 14:14
 * @Version: 1.0
 **/
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserDao userDao;

    @Override
    public AuthenticationInfo login() {
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        List info = userDao.getInfo();
        System.out.println("test:"+info);
        return authenticationInfo;
    }




}
