package com.example.demo.Service;

import com.example.demo.Pojo.UserRoles;

import java.util.List;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/1/14 20:53
 * @version: 1.0
 */
public interface UserRolesService {
    int insertUserRoles(UserRoles userRoles);

    int deleteUserRoles(UserRoles userRoles);

    int updateRoles(UserRoles userRoles);

    List<UserRoles> selectRoles(UserRoles userRoles);

    List<UserRoles> findAll();
}




