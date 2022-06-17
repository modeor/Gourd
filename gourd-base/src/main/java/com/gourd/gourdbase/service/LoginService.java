package com.gourd.gourdbase.service;

import com.gourd.gourdbase.entity.AuthenticationInfo;

import java.util.List;

/**
 * @ClassName: LoginService
 * @Description: 登录服务
 * @author: hx
 * @date: 2022-06-01 14:13
 * @Version: 1.0
 **/
public interface LoginService {

    AuthenticationInfo login();
}
