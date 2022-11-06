package com.example.demo.Mapper;

import com.example.demo.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    int insertUser(User user);


    User getOne(Integer id);


    int deleteOne(Integer id);


    int updateOne(User user);
}
