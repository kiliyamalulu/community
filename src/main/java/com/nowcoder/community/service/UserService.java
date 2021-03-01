package com.nowcoder.community.service;
/*
* 查询用户名
*/
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        //仅查询一个
        return userMapper.selectById(id);
    }

}
