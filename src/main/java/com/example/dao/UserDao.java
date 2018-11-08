package com.example.dao;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM t_user")
    public List<User> all();
}
