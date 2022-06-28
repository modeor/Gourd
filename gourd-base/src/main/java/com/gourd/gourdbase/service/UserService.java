//package com.gourd.gourdbase.service;
//
//import com.baomidou.mybatisplus.extension.service.IService;
//import com.gourd.gourdbase.model.po.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
//public interface UserService extends IService<User> , UserDetailsService {
//    /**
//     * @description: 登录
//     * @author: hx
//     * @date: 10:47
//     * @param: [username, 用户名]
//     * @param: [username, 密码]
//     * @return: [java.lang.String, 操作结果]
//     **/
//    String login(String username, String password);
//
//    /**
//     * @description: 注册
//     * @author: hx
//     * @date: 10:48
//     * @param: [user, 用户信息]
//     * @return: [java.lang.String, 操作结果]
//     **/
//    String register(User user);
//
//    /**
//     * @description: 刷新密钥
//     * @author: hx
//     * @date: 10:48
//     * @param: [oldToken, 原密钥]
//     * @return: [java.lang.String, 新密钥]
//     **/
//    String refreshToken(String oldToken);
//}
