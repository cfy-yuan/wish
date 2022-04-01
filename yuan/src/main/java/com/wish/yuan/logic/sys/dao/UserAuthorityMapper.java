package com.wish.yuan.logic.sys.dao;

import com.wish.yuan.logic.sys.entity.UserAuthority;

import java.util.List;

/**
 * @author yuan
 */
public interface UserAuthorityMapper {
    /**
     * Add a piece of data to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insert(UserAuthority record);

    /**
     * Add data selectively to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int insertSelective(UserAuthority record);

    /**
     * Query only one piece of data by primary key
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.UserAuthority>
     * @author: cfy
     * @date: 2021/8/15 14:47
     * @version: 0.0.1
     */
    List<UserAuthority> selectByPrimaryKey(UserAuthority record);

    /**
     * Selectively update data through primary key
	 * @param record
	 * @return int
	 * @Date 2021-08-15
	 * @Author yuan 
     */
    int updateByPrimaryKeySelective(UserAuthority record);


}