package com.gourd.gourdbase.controller;

import com.gourd.gourdbase.model.AuthenticationInfo;
import com.gourd.gourdbase.model.vo.AuthenticationVO;
import com.gourd.gourdbase.model.vo.ResultVO;
import com.gourd.gourdbase.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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

    private final AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping("/login")
    public ResultVO login(@RequestBody AuthenticationVO param){
        ResultVO<AuthenticationInfo> resultVO = new ResultVO<>();
        try {
            authenticationService.login(param);
        }catch (Exception e){
            resultVO.setCode(400);
            resultVO.setMsg("系统错误");
        }
        return resultVO;
    }
}
