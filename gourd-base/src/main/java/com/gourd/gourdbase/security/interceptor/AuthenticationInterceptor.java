package com.gourd.gourdbase.security.interceptor;

import com.gourd.gourdbase.security.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @ClassName: AuthenticationInterceptor
 * @Description: 身份认证拦截器
 * @author: hx
 * @date: 2022-06-29 16:27
 * @Version: 1.0
 **/
public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        //接口白名单
        String requestURI = request.getRequestURI();
        if ("/authentication/login".equals(request.getRequestURI())) {
            return true;
        }
//        //从请求头中获取token
//        Claims claims = JwtUtil.parse(request.getHeader("Authorization"));
//        //TODO 目前存在就视为登录，后续要修改为token校验后才视为登录
//        if (claims != null) {
//            return true;
//        }
//        response.setContentType("application/json;charset=utf-8");
//        PrintWriter out = response.getWriter();
//        out.write("请先登录");
//        out.flush();
//        out.close();
//        return false;
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
