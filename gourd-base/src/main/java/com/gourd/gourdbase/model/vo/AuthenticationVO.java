package com.gourd.gourdbase.model.vo;

/**
 * @ClassName: LoginVO
 * @Description: TODO
 * @author: hx
 * @date: 2022-06-23 11:19
 * @Version: 1.0
 **/
public class AuthenticationVO {
    private String userName;
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
