package com.gourd.gourdbase.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private int userId;
    private int userNo;
    private String userName;
    private String userPassword;
    private String userSex;
    private int userAge;
    private int userPhone;
}
