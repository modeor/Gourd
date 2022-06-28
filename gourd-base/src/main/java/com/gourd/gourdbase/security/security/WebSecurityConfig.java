//package com.gourd.gourdbase.security.security;
//
//import com.gourd.gourdbase.security.handle.EntryPointUnauthorizedHandler;
//import com.gourd.gourdbase.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.cors.CorsUtils;
//
//import javax.xml.ws.Action;
//
//
///**
// * @ClassName: WebSecurityConfig
// * @Description: 安全配置类
// * @author: hx
// * @date: 2022-06-22 10:28
// * @Version: 1.0
// **/
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    private UserService userService;
//
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.headers().frameOptions().disable();
//        http.cors();
//        http.authorizeRequests().requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
//                .antMatchers("/authentication/login", "/authentication/register").permitAll()
//                .anyRequest().authenticated()
//                .and().exceptionHandling().authenticationEntryPoint(new EntryPointUnauthorizedHandler());
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
