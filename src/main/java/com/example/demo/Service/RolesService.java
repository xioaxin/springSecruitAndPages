package com.example.demo.Service;

import com.example.demo.Pojo.Roles;

import java.util.List;

/**
 * @Description: 角色业务逻辑层
 * @author: ZPX
 * @createDate: 2020/1/14 20:32
 * @version: 1.0
 */
public interface RolesService {
    int insertRoles(Roles roles);
    int deleteRoles(Roles roles);
    int updateRoles(Roles roles);
    Roles selectRoles(Roles roles);
    List<Roles>findAll();
}




