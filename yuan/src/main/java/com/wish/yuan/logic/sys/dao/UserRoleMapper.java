package com.wish.yuan.logic.sys.dao;

import com.wish.yuan.logic.sys.entity.Role;
import com.wish.yuan.logic.sys.entity.UserRole;

import java.util.List;

/**
 * @author yuan
 */
public interface UserRoleMapper {
    /**
     * Add a piece of data to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insert(UserRole record);

    /**
     * Add data selectively to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insertSelective(UserRole record);

    /**
     * Query only one piece of data by primary key
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.UserRole>
     * @author: cfy
     * @date: 2021/8/15 16:01
     * @version: 0.0.1
     */
    List<UserRole> selectByPrimaryKey(UserRole record);

    /**
     * Selectively update data through primary key
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * 获取用户角色信息
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.UserRole>
     * @author: cfy
     * @date: 2021/8/15 16:13
     * @version: 0.0.1
     */
	List<Role> selectUserRoleList(UserRole record);

}