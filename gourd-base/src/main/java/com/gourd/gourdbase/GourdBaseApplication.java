package com.gourd.gourdbase;

import com.gourd.gourdbase.security.interceptor.AuthenticationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan(basePackages = "com.gourd.gourdbase.dao")
public class GourdBaseApplication implements WebMvcConfigurer {

    public static void   main(String[] args) {
        SpringApplication.run(GourdBaseApplication.class, args);
    }

    /**
     * @description: 启动拦截器
     * @author: hx
     * @date:  16:41
     * @param: [registry]
     **/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthenticationInterceptor());
    }
}
