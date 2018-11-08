package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    public List<User> all(){
        return this.userDao.all();
    }
}
