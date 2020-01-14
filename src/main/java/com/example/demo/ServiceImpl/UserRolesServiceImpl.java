package com.example.demo.ServiceImpl;

import com.example.demo.Mapper.UserRolesMapper;
import com.example.demo.Pojo.UserRoles;
import com.example.demo.Service.UserRolesService;
import com.example.demo.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/1/14 21:02
 * @version: 1.0
 */
@Service
public class UserRolesServiceImpl implements UserRolesService {
    @Resource
    private UserRolesMapper userRolesMapper;

    @Override
    public int insertUserRoles(UserRoles userRoles) {
        return userRolesMapper.insertSelective(userRoles);
    }

    @Override
    public int deleteUserRoles(UserRoles userRoles) {
        return userRolesMapper.delete(userRoles);
    }

    @Override
    public int updateRoles(UserRoles userRoles) {
        return userRolesMapper.update(userRoles);
    }

    @Override
    public List<UserRoles> selectRoles(UserRoles userRoles) {
        return userRolesMapper.select(userRoles);
    }

    @Override
    public List<UserRoles> findAll() {
        return userRolesMapper.findAll();
    }
}




