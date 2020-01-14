package com.example.demo.ServiceImpl;

import com.example.demo.Mapper.RolesMapper;
import com.example.demo.Pojo.Roles;
import com.example.demo.Service.RolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @author: ZPX
 * @createDate: 2020/1/14 20:34
 * @version: 1.0
 */
@Service
public class RolesServiceImpl implements RolesService {
    @Resource
    private RolesMapper rolesMapper;

    @Override
    public int insertRoles(Roles roles) {
        return rolesMapper.insertSelective(roles);
    }

    @Override
    public int deleteRoles(Roles roles) {
        if (roles != null) {
            return rolesMapper.deleteByPrimaryKey(roles.getId());
        } else {
            return -1;
        }
    }

    @Override
    public int updateRoles(Roles roles) {
        return rolesMapper.updateByPrimaryKeySelective(roles);
    }

    @Override
    public Roles selectRoles(Roles roles) {
        return rolesMapper.selectByPrimaryKey(roles.getId());
    }

    @Override
    public List<Roles> findAll() {
        return null;
    }
}




