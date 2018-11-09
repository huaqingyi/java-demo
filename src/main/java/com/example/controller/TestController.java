package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

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
    public List<User> user(
            @ApiParam(value = "id",required = false) @RequestParam(value = "id",required = false) Integer id
    ) throws Exception{
        System.out.println(id);
        return this.userService.all();
    }
}
