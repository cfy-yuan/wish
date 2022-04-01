package com.wish.yuan.logic.sys.dao;

import com.wish.yuan.logic.sys.entity.RoleAuthority;

import java.util.List;

/**
 * @author yuan
 */
public interface RoleAuthorityMapper {
    /**
     * Add a piece of data to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insert(RoleAuthority record);

    /**
     * Add data selectively to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insertSelective(RoleAuthority record);

    /**
     *  Query only one piece of data by primary key
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.RoleAuthority>
     * @author: cfy
     * @date: 2021/8/15 14:50
     * @version: 0.0.1
     */
    List<RoleAuthority> selectByPrimaryKey(RoleAuthority record);

    /**
     * Selectively update data through primary key
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int updateByPrimaryKeySelective(RoleAuthority record);

}