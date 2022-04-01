package com.wish.yuan.logic.user.dao;

import com.wish.yuan.logic.user.entity.UserInfo;

/**
 * @author yuan
 */
public interface UserInfoMapper {
    /**
     * Add a piece of data to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:14
     * @version: 0.0.1
     */
    int insert(UserInfo record);

    /**
     * Add data selectively to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:14
     * @version: 0.0.1
     */
    int insertSelective(UserInfo record);

    /**
     *  Query only one piece of data by primary key
     * @param record
     * @return: com.wish.yuan.logic.user.entity.UserInfo
     * @author: cfy
     * @date: 2021/8/4 11:14
     * @version: 0.0.1
     */
    UserInfo selectByPrimaryKey(UserInfo record);

    /**
     * Selectively update data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:15
     * @version: 0.0.1
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * Update all data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:15
     * @version: 0.0.1
     */
    int updateByPrimaryKey(UserInfo record);
}