package com.gourd.gourdbase.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gourd.gourdbase.dao.UserDao;
import com.gourd.gourdbase.exception.APIException;
import com.gourd.gourdbase.model.po.User;
import com.gourd.gourdbase.model.vo.AuthenticationVO;
import com.gourd.gourdbase.security.utils.JwtUtil;
import com.gourd.gourdbase.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @ClassName: AuthenticationServiceImpl
 * @Description: 认证实现类
 * @author: hx
 * @date: 2022-06-23 11:21
 * @Version: 1.0
 **/
@Service
public class AuthenticationServiceImpl extends ServiceImpl<UserDao, User> implements AuthenticationService {
    private final UserDao userDao;

    @Autowired
    public AuthenticationServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public String login(AuthenticationVO userParam) {
        User user = this.lambdaQuery()
                .eq(User::getUserName, userParam.getUserName())
                .eq(User::getUserPassword, userParam.getPassword())
                .one();
        if (user == null) {
            throw new APIException("账号密码错误");
        }
        return  JwtUtil.generate(user.getUserName());
    }

}
