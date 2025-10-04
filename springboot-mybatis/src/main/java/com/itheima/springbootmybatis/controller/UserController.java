package com.itheima.springbootmybatis.controller;

import com.itheima.springbootmybatis.pojo.User;
import com.itheima.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Test
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Xiaoyi!";
    }

    @GetMapping("/findById")
    public User findById(@RequestParam Integer id) {
        return userService.findById(id);
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findAllNames")
    public List<String> findAllNames() {
        return userService.findAllNames();
    }

    @PostMapping("/insert")
    public int insert(@RequestBody User user) {
        return userService.insert(user);
    }

    @PutMapping("/update")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/deleteById")
    public int deleteById(@RequestParam Integer id) {
        return userService.deleteById(id);
    }

    @GetMapping("/findByNameLike")
    public List<User> findByNameLike(@RequestParam String name) {
        return userService.findByNameLike(name);
    }

}
