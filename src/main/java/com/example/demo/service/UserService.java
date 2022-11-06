package com.example.demo.service;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int insertUser(User user){
        return userMapper.insertUser(user);

    }

    public User getUser(Integer id){
        User result = userMapper.getOne(id);

        return result;
    }

    public int deleteUser(Integer id){
        return userMapper.deleteOne(id);
    }

    public int updateUser(User user){
        return userMapper.updateOne(user);
    }
}
