package com.wish.yuan.logic.sys.dao;

import com.wish.yuan.logic.sys.entity.NavigationRole;

import java.util.List;

/**
 * @author yuan
 */
public interface NavigationRoleMapper {
    /**
     * Add a piece of data to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insert(NavigationRole record);

    /**
     * Add data selectively to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insertSelective(NavigationRole record);

    /**
     *  Query only one piece of data by primary key
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.NavigationRole>
     * @author: cfy
     * @date: 2021/8/15 14:51
     * @version: 0.0.1
     */
    List<NavigationRole> selectByPrimaryKey(NavigationRole record);

    /**
     * Selectively update data through primary key
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int updateByPrimaryKeySelective(NavigationRole record);


}