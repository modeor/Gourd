package com.gourd.gourdbase.exception;

import lombok.Data;

/**
 * @ClassName: APIException
 * @Description: 接口异常类
 * @author: hx
 * @date: 2022-06-28 15:38
 * @Version: 1.0
 **/
@Data
public class APIException extends RuntimeException {
    private int code;
    private String msg;
    public APIException() {
        this(1001, "接口错误");
    }

    public APIException(String msg) {
        this(1001, msg);
    }

    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

}
