package com.gourd.gourdbase.config;

import com.gourd.gourdbase.exception.APIException;
import com.gourd.gourdbase.model.vo.ResultVO;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName: ExceptionControllerAdvice
 * @Description: 全局异常处理
 * @author: hx
 * @date: 2022-06-28 15:01
 * @Version: 1.0
 **/
@RestControllerAdvice
public class ExceptionControllerAdvice {

    /**
     * @description: 参数校验异常处理
     * @author: hx
     * @date:  15:04
     * @param: [e,参数异常类]
     * @return: [java.lang.String,异常信息]
     **/
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        ObjectError error = e.getBindingResult().getAllErrors().get(0);
        return ResultVO.buildValidateFailedResult(error.getDefaultMessage());
    }

    /**
     * @description: 自定义异常处理
     * @author: hx
     * @date:  10:48
     * @param: [e]
     * @return: [com.gourd.gourdbase.model.vo.ResultVO<java.lang.String>,TODO]
     **/
    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e) {
        return  ResultVO.buildFailedResult(e.getMsg());
    }
}
