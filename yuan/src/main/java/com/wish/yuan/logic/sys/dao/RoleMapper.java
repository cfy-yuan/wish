package com.wish.yuan.logic.sys.dao;

import com.wish.yuan.logic.sys.entity.Role;

import java.util.List;

/**
 * @author yuan
 */
public interface RoleMapper {
    /**
     * Add a piece of data to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insert(Role record);

    /**
     * Add data selectively to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insertSelective(Role record);

    /**
     * Query only one piece of data by primary key
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Role>
     * @author: cfy
     * @date: 2021/8/15 14:46
     * @version: 0.0.1
     */
    List<Role> selectByPrimaryKey(Role record);

    /**
     * Selectively update data through primary key
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int updateByPrimaryKeySelective(Role record);


}