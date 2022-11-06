package com.example.demo.controller;

import com.example.demo.dao.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value="/insertUser", method = RequestMethod.GET)
    public String insertUser(String name){
        User user = new User();
        user.setId(1);
        user.setUsername(name);
        user.setPassword("123");
        user.setAge(24);
        user.setSex("女");
        user.setEmail("1234@qq.com");


        userService.insertUser(user);

        return "success";
    }

    @ResponseBody
    @RequestMapping(value="/getUser", method = RequestMethod.GET)
    public User getUser(int id){


        User user = userService.getUser(id);

        return user;
    }

    @ResponseBody
    @RequestMapping(value="/deleteUser", method = RequestMethod.GET)
    public String deleteUser(int id){


        userService.deleteUser(id);

        return "success";
    }

    @ResponseBody
    @RequestMapping(value="/updateUser", method = RequestMethod.GET)
    public User updateUser(int id){
        User user = new User();
        user.setId(id);
        user.setUsername("drt");
        user.setPassword("123");
        user.setAge(23);
        user.setEmail("187387@163.com");

        userService.updateUser(user);

        User result = userService.getUser(user.getId());

        return result;
    }

    @ResponseBody
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestBody User user){
        User user2 = userService.getUser(user.getId());

        if(user2.getPassword().equals(user.getPassword()))
            return "success!";
        else return "fail";
    }

    @ResponseBody
    @RequestMapping(value="/regist", method=RequestMethod.POST)
    public Boolean registUser(@RequestBody User user){
        userService.insertUser(user);
        return true;
    }
}
