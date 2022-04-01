package com.wish.yuan.logic.sys.service;

import com.wish.yuan.logic.sys.entity.Role;
import com.wish.yuan.logic.sys.entity.UserRole;

import java.util.List;

/**
 * @Classname RoleService
 * @Description :
 * @Date 2021/8/15 16:14
 * @Author cfy
 */
public interface RoleService {

    /**
     * 获取用户角色信息
     * @param userRole
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Role>
     * @author: cfy
     * @date: 2021/8/15 16:16
     * @version: 0.0.1
     */
    List<Role> selectUserRoleList(UserRole userRole);
}
