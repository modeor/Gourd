package com.gourd.gourdbase.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName: SpringSecurityConfig
 * @Description: SpringSecurity的配置类
 * @author: hx
 * @date: 2022-06-17 13:24
 * @Version: 1.0
 **/
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * @description: 认证
     * @author: hx
     * @date:  13:31
     * @param: [auth]
     * @return: [void,TODO]
     **/
    @Override
    public void configure(AuthenticationManagerBuilder auth ){
    }
    /**
     * @description: 授权
     * @author: hx
     * @date:  13:31
     * @param: [http]
     * @return: [void,TODO]
     **/
    @Override
    public void configure(HttpSecurity http){

    }
}
