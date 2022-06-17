package com.gourd.gourdbase.controller;

import com.gourd.gourdbase.entity.AuthenticationInfo;
import com.gourd.gourdbase.entity.ResultVO;
import com.gourd.gourdbase.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @ClassName: AuthenticationController
 * @Description: 身份认证
 * @author: hx
 * @date: 2022-06-01 14:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public ResultVO login(){
        ResultVO<AuthenticationInfo> resultVO = new ResultVO<>();
        try {
            AuthenticationInfo authenticationInfo=loginService.login();
            if (authenticationInfo != null) {
                resultVO.setCode(200);
                resultVO.setData(authenticationInfo);
            }else {
                resultVO.setCode(400);
                resultVO.setMsg("登录失败");
            }
        }catch (Exception e){
            resultVO.setCode(400);
            resultVO.setMsg("系统错误");
        }
        return resultVO;
    }
}
