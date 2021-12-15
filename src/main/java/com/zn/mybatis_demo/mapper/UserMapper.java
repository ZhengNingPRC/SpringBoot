package com.zn.mybatis_demo.mapper;

import com.zn.mybatis_demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryUsers();

    User queryUSerById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);


}