package com.example.demo.ServiceImpl;

import com.example.demo.Pojo.Roles;
import com.example.demo.Pojo.User;
import com.example.demo.Pojo.UserRoles;
import com.example.demo.Service.RolesService;
import com.example.demo.Service.UserRolesService;
import com.example.demo.Service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Description: SpringSecurity业务逻辑层实现
 * @author: ZPX
 * @createDate: 2020/1/14 21:10
 * @version: 1.0
 */
@Service("userDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private UserService userService;
    @Resource
    private RolesService rolesService;
    @Resource
    private UserRolesService userRolesService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        //1.从数据中取出用户信息
        User user = new User();
        user.setId(Integer.parseInt(s));
        user = userService.selectUser(user);
        //2.判断用户是否存在
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        //3.添加权限
        UserRoles userRole = new UserRoles();
        userRole.setUid(user.getId());
        List<UserRoles> userRoles = userRolesService.selectRoles(userRole);
        for (UserRoles userRoles1 : userRoles) {
            Roles roles = new Roles();
            roles.setId(userRoles1.getUid());
            roles = rolesService.selectRoles(roles);
            authorities.add(new SimpleGrantedAuthority(roles.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), authorities);
    }
}




