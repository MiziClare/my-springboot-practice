package com.itheima.springbootmybatis.service;

import com.itheima.springbootmybatis.pojo.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    List<String> findAllNames();

    int insert(User user);

    int update(User user);

    int deleteById(Integer id);

    List<User> findByNameLike(String name);
}
