package com.example.demo.Mapper;

import com.example.demo.Pojo.UserRoles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRolesMapper {
    int insertSelective(UserRoles record);

    List<UserRoles> findAll();

    int update(UserRoles userRoles);

    int delete(UserRoles userRoles);

    List<UserRoles> select(UserRoles record);
}