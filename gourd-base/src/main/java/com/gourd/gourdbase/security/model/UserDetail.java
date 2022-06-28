//package com.gourd.gourdbase.security.model;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//
//import java.util.Collection;
//
///**
// * @ClassName: UserDetail
// * @Description: TODO
// * @author: hx
// * @date: 2022-06-23 15:06
// * @Version: 1.0
// **/
//public class UserDetail extends User {
//    private com.gourd.gourdbase.model.po.User user;
//
//    public UserDetail(com.gourd.gourdbase.model.po.User user,
//                      Collection<? extends GrantedAuthority> authorities) {
//        // 必须调用父类的构造方法，初始化用户名、密码、权限
//        super(user.getUserName(), user.getUserPassword(), authorities);
//        this.user = user;
//    }
//
//
//}
