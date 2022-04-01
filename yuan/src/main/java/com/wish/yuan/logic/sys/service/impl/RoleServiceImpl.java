package com.wish.yuan.logic.sys.service.impl;

import com.wish.yuan.logic.sys.dao.UserRoleMapper;
import com.wish.yuan.logic.sys.entity.Role;
import com.wish.yuan.logic.sys.entity.UserRole;
import com.wish.yuan.logic.sys.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname RoleServiceImpl
 * @Description :
 * @Date 2021/8/15 16:14
 * @Author cfy
 */
@Service
public class RoleServiceImpl implements RoleService {

    private final UserRoleMapper userRoleMapper;

    public RoleServiceImpl(UserRoleMapper userRoleMapper) {
        this.userRoleMapper = userRoleMapper;
    }

    @Override
    public List<Role> selectUserRoleList(UserRole userRole) {
        List<Role> roles = userRoleMapper.selectUserRoleList(userRole);
        return roles;
    }
}
