package com.wish.yuan.logic.sys.dao;

import com.wish.yuan.logic.sys.entity.Navigation;

import java.util.List;

/**
 * @author yuan
 */
public interface NavigationMapper {
    /**
     * Add a piece of data to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-14
	 * @Author yuan 
     */
    int insert(Navigation record);

    /**
     * Add data selectively to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-14
	 * @Author yuan 
     */
    int insertSelective(Navigation record);

    /**
     *  Query only one piece of data by primary key
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Navigation>
     * @author: cfy
     * @date: 2021/8/15 14:53
     * @version: 0.0.1
     */
    List<Navigation> selectByPrimaryKey(Navigation record);

    /**
     * Selectively update data through primary key
	 * @param record
	 * @return int
	 * @Date 2021-08-14
	 * @Author yuan 
     */
    int updateByPrimaryKeySelective(Navigation record);

    /**
     * 通过角色获取页面列表
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.sys.entity.Navigation>
     * @author: cfy
     * @date: 2021/8/15 15:16
     * @version: 0.0.1
     */
    List<Navigation> selectNavigationByRole(Navigation record );


}