package com.gourd.gourdbase.security.handle;

import com.gourd.gourdbase.common.Constants;
import com.gourd.gourdbase.model.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName: EntryPointUnauthorizedHandler
 * @Description: 验证失败类
 * @author: hx
 * @date: 2022-06-22 10:25
 * @Version: 1.0
 **/
@Slf4j
@Component
public class EntryPointUnauthorizedHandler implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        log.error(authException.getMessage());
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        ResultVO<String> resultVO = new ResultVO<>(Constants.ResultCode.UNAUTHORIZED, "没有登录");
        out.write(resultVO.toString());
        out.flush();
        out.close();
    }
}
