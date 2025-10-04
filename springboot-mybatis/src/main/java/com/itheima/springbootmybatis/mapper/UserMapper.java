package com.itheima.springbootmybatis.mapper;

import com.itheima.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    // 根据id查询用户
    @Select("select * from user where id = #{id}")
    User findById(Integer id);

    // 查询所有用户
    @Select("select name from user")
    List<User> findAll();

    // 查询所有用户的姓名
    @Select("select name from user")
    List<String> findAllNames();

    // 新增用户
    @Insert("insert into user(name, age, gender, phone) values(#{name}, #{age}, #{gender}, #{phone})")
    int insert(User user);

    // 更新用户
    @Update("update user set name=#{name}, age=#{age}, gender=#{gender}, phone=#{phone} where id=#{id}")
    int update(User user);

    // 删除用户
    @Delete("delete from user where id=#{id}")
    int deleteById(Integer id);

    // 根据姓名模糊查询
    @Select("select * from user where name like concat('%', #{name}, '%')")
    List<User> findByNameLike(String name);
}
