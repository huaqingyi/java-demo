package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class TestController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "Hello Spring Boot ...";
    }

    @Resource
    private UserService userService;

    @RequestMapping(path = "user",method = RequestMethod.GET)
    @ResponseBody
    public List<User> user(){
        return this.userService.all();
    }
}
