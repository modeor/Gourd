package com.gourd.gourdbase.model.vo;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @ClassName: LoginVO
 * @Description: TODO
 * @author: hx
 * @date: 2022-06-23 11:19
 * @Version: 1.0
 **/
public class AuthenticationVO {
    @NotNull(message = "用户名不能为空")
    private String userName;
    @NotNull(message = "密码不能为空")
    @Size(min = 6, max = 11, message = "密码长度必须是6-16个字符")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AuthenticationVO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
