package com.gourd.gourdbase.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gourd.gourdbase.dao.UserDao;
import com.gourd.gourdbase.model.po.User;
import com.gourd.gourdbase.model.vo.AuthenticationVO;
import com.gourd.gourdbase.security.model.UserDetail;
import com.gourd.gourdbase.service.AuthenticationService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.Collections;

/**
 * @ClassName: AuthenticationServiceImpl
 * @Description: 认证实现类
 * @author: hx
 * @date: 2022-06-23 11:21
 * @Version: 1.0
 **/
public class AuthenticationServiceImpl extends ServiceImpl<UserDao, User> implements AuthenticationService,
        UserDetailsService {
    private final UserDao userDao;

    public AuthenticationServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public String login(AuthenticationVO param) {

        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.selectByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException("未找到该用户");
        }
        return new UserDetail(user, Collections.emptyList());
    }
}
