package com.example.demo.Service;

import com.example.demo.Pojo.User;

import java.util.List;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/1/14 20:47
 * @version: 1.0
 */
public interface UserService {
    int insertUser(User user);
    int deleteUser(User user);
    int updateUser(User user);
    User selectUser(User user);
    List<User> findAll();
}




