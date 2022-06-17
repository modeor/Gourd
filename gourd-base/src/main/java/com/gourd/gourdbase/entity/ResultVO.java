package com.gourd.gourdbase.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: ResultVO
 * @Description: 统一返回类
 * @author: hx
 * @date: 2022-06-01 14:41
 * @Version: 1.0
 **/
@Data
public class ResultVO<T> {

    private int code;
    private Object data;
    private String msg;
}
