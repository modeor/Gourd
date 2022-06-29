package com.gourd.gourdbase.security.utils;

import com.alibaba.druid.util.StringUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.Duration;
import java.util.Date;

/**
 * @ClassName: JwtUtil
 * @Description: Jwt工具类
 * @author: hx
 * @date: 2022-06-29 15:51
 * @Version: 1.0
 **/
public final class JwtUtil {
    /**
     * 密钥
     */
    private final static String SECRET_KEY = "gourdPa";
    /**
     * 过期时间
     */
    private final static Duration EXPIRATION = Duration.ofHours(2);

    /**
     * @description: 生成JWT
     * @author: hx
     * @date: 16:05
     * @param: [username, userName]
     * @return: [java.lang.String, JWT]
     **/
    public static String generate(String userName) {
        Date expiryDate = new Date(System.currentTimeMillis() + EXPIRATION.toMillis());
        return Jwts.builder()
                .setSubject(userName)
                .setIssuedAt(new Date()).
                setExpiration(expiryDate).
                signWith(SignatureAlgorithm.HS512, SECRET_KEY).
                compact();
    }

    public static Claims parse(String token) {
        //如果是空字符串直接返回null
        if (StringUtils.isEmpty(token)) {
            return null;
        }
        Claims claims = null;
        try {
            claims = Jwts.parser()
                    .setSigningKey(SECRET_KEY)
                    .parseClaimsJws(token)
                    .getBody();
        }
        catch (JwtException e) {
            //TODO
        }
        return claims;
    }

}
