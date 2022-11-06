package com.example.demo.controller;

import com.example.demo.dao.Person;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @RequestMapping("/person")
    @CrossOrigin
    public Person test(){
        return new Person("jie",22);
    }
}
