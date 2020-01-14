package com.example.demo.ServiceImpl;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.Pojo.User;
import com.example.demo.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/1/14 20:48
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int deleteUser(User user) {
        return userMapper.deleteByPrimaryKey(user.getId());
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User selectUser(User user) {
        return userMapper.selectByPrimaryKey(user.getId());
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}




