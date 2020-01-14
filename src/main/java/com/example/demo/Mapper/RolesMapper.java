package com.example.demo.Mapper;

import com.example.demo.Pojo.Roles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
/**
 * @Description: 角色表操作Mapper层
 * @author: ZPX
 * @createDate: 2020/1/14 20:08
 * @version: 1.0
 */
public interface RolesMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roles record);

    List<Roles> findAll();
}