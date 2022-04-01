package com.wish.yuan.logic.sys.service;

import com.wish.common.entity.TreeNode;
import com.wish.yuan.logic.sys.entity.Config;
import com.wish.yuan.logic.sys.entity.Navigation;
import com.wish.yuan.logic.sys.entity.Office;
import com.wish.yuan.logic.sys.entity.Role;

import java.util.List;

/**
 * @author yuan
 */
public interface SysService {

    /**
     * 新增机构
     * @param office
     * @return: int
     * @author: cfy
     * @date: 2021/7/22 14:37
     * @version: 0.0.1
     */
    int insertOffice(Office office);


    /**
     * 获取机构树结构
     * @param treeNode
     * @return: java.util.List<com.wish.common.entity.TreeNode>
     * @author: cfy
     * @date: 2021/7/23 10:28
     * @version: 0.0.1
     */
    List<TreeNode> getTreeOfficeList(TreeNode treeNode);

    /**
     * 获取默认项目首页配置
     * @param config
     * @return: com.wish.yuan.logic.sys.entity.Config
     * @author: cfy
     * @date: 2021/8/9 14:57
     * @version: 0.0.1
     */
    Config getProjectConfig(Config config);

    /**
     * 通过角色获取页面导航
     * @param findIds
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Navigation>
     * @author: cfy
     * @date: 2021/8/21 13:25
     * @version: 0.0.1
     */
    List<Navigation> selectNavigationByRole();

    /**
     * 通过角色获取页面导航
     * @param roleList
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Navigation>
     * @author: cfy
     * @date: 2021/8/19 11:38
     * @version: 0.0.1
     */
    List<Navigation> selectNavigationByRole(List<Long> roleList);

    /**
     * 获取用户角色
     *
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Role>
     * @author: cfy
     * @date: 2021/8/19 11:38
     * @version: 0.0.1
     */
    List<Role> getRoleByUser();
    /**
     * 获取用户角色
     *
     * @return: java.util.List<java.lang.Long>
     * @author: cfy
     * @date: 2021/8/21 13:21
     * @version: 0.0.1
     */
    List<Long> getRoleIdByUser();


}
