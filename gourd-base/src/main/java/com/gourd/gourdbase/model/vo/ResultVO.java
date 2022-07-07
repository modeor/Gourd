package com.gourd.gourdbase.model.vo;

import com.gourd.gourdbase.common.Constants;
import lombok.Data;

/**
 * @ClassName: ResultVO
 * @Description: 统一返回类
 * @author: hx
 * @date: 2022-06-01 14:41
 * @Version: 1.0
 **/
@Data
public class ResultVO<T> {

    private Integer code;
    private T data;
    private String msg;

    public  ResultVO() {
    }

    public  ResultVO(Constants.ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
    public static<T> ResultVO buildSuccessResult(T data) {
        return new ResultVO<T>(Constants.ResultCode.SUCCESS, data);
    }
    public static<T> ResultVO buildValidateFailedResult(T data) {
        return new ResultVO<T>(Constants.ResultCode.VALIDATE_FAILED, data);
    }
    public static<T> ResultVO buildFailedResult(T data) {
        return new ResultVO<T>(Constants.ResultCode.FAILED, data);
    }

}
