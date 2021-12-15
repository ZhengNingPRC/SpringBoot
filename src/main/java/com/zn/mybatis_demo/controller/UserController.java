package com.zn.mybatis_demo.controller;

import com.zn.mybatis_demo.mapper.UserMapper;
import com.zn.mybatis_demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUsers")
    public List<User> queryUsers(){
        List<User> users = userMapper.queryUsers();
        return users;
    }

    @GetMapping("/addUser/{id}")
    public String addUser(@PathVariable("id") int id){
        userMapper.addUser(new User(id,"小王11","123456"));
        return "add complete!";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id){
        userMapper.updateUser(new User(id,"小王","qwerm,./"));
        return "update complete!";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userMapper.deleteUser(id);
        return "delete complete!";
    }

}
