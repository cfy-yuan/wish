package com.wish.yuan.logic.sys.service.impl;

import com.wish.common.entity.TreeNode;
import com.wish.yuan.logic.sys.dao.ConfigMapper;
import com.wish.yuan.logic.sys.dao.NavigationMapper;
import com.wish.yuan.logic.sys.dao.OfficeMapper;
import com.wish.yuan.logic.sys.entity.*;
import com.wish.yuan.logic.sys.service.SysService;
import com.wish.yuan.utils.redis.RedisUtil;
import com.wish.yuan.utils.snowflake.SnowFlakeUtil;
import com.wish.yuan.utils.tree.TreeUtil;
import com.wish.yuan.utils.user.UserUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan
 */
@Service
public class SysServiceImpl implements SysService {
    private final OfficeMapper officeMapper;
    private final ConfigMapper configMapper;
    private final NavigationMapper navigationMapper;
    private final RoleServiceImpl roleService;

    public SysServiceImpl(OfficeMapper officeMapper, ConfigMapper configMapper, NavigationMapper navigationMapper, RoleServiceImpl roleService) {
        this.officeMapper = officeMapper;
        this.configMapper = configMapper;
        this.navigationMapper = navigationMapper;
        this.roleService = roleService;
    }

    @Override
    public int insertOffice(Office office) {
        office.setOfficeId(SnowFlakeUtil.nextId());
        office.init();
        return 0;
    }

    @Override
    public List<TreeNode> getTreeOfficeList(TreeNode treeNode) {
        List<TreeNode> treeNodes = officeMapper.selectOfficeTreeList(treeNode);
        List<TreeNode> build = TreeUtil.build(treeNodes);
        return build;
    }

    @Override
    public Config getProjectConfig(Config config) {
        return configMapper.selectByPrimaryKey(config);
    }

    @Override
    public List<Navigation> selectNavigationByRole() {

        Navigation navigation = new Navigation();
        navigation.setRoleList(getRoleIdByUser());
        List<Navigation> navigations = navigationMapper.selectNavigationByRole(navigation);

        List<Navigation> navigationsList = TreeUtil.buildNavigation(navigations);

        return navigationsList;
    }

    @Override
    public List<Navigation> selectNavigationByRole(List<Long> roleList) {
        Navigation navigation = new Navigation();
        navigation.setRoleList(roleList);
        List<Navigation> navigations = navigationMapper.selectNavigationByRole(navigation);

        List<Navigation> navigationsList = TreeUtil.buildNavigation(navigations);

        return navigationsList;
    }

    @Override
    public List<Role> getRoleByUser() {
        Long userId = UserUtil.getUserId();
        UserRole userRole = new UserRole();
        userRole.setUserId(userId);
        List<Role> roles = roleService.selectUserRoleList(userRole);
        return roles;
    }

    @Override
    public List<Long> getRoleIdByUser() {
        Long userId = UserUtil.getUserId();
        List<String> userRole = (List<String>) RedisUtil.hashGet(String.valueOf(userId), "userRole");
        List<Long> roleList = new ArrayList<>();
        for(String role : userRole){
            roleList.add(Long.valueOf(role));
        }
        return roleList;
    }


}
