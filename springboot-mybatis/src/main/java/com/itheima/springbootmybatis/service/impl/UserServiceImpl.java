package com.itheima.springbootmybatis.service.impl;

import java.util.List;
import com.itheima.springbootmybatis.mapper.UserMapper;
import com.itheima.springbootmybatis.pojo.User;
import com.itheima.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // 注入 UserMapper 对象
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<String> findAllNames() {
        return userMapper.findAllNames();
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public List<User> findByNameLike(String name) {
        return userMapper.findByNameLike(name);
    }

}
