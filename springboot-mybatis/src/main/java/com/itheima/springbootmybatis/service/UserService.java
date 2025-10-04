package com.itheima.springbootmybatis.service;

import com.itheima.springbootmybatis.pojo.User;

import java.util.List;

public interface UserService {

    public User findById(Integer id);

    public List<User> findAll();

    public List<String> findAllNames();
}
