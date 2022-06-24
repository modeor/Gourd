package com.gourd.gourdbase.service;

import com.gourd.gourdbase.model.vo.AuthenticationVO;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AuthenticationService
 * @Description: 认证服务接口
 * @author: hx
 * @date: 2022-06-23 11:21
 * @Version: 1.0
 **/
@Service
public interface AuthenticationService {

    String  login(AuthenticationVO param);
}
