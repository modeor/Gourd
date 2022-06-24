package com.gourd.gourdbase.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gourd.gourdbase.model.po.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface UserDao extends BaseMapper<User> {
    List getInfo();

    User selectByUserName(String userName);
}
