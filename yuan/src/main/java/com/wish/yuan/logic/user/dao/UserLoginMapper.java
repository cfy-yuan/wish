package com.wish.yuan.logic.user.dao;

import com.wish.yuan.logic.user.entity.UserLogin;

/**
 * @author yuan
 */
public interface UserLoginMapper {
    /**
     * Add a piece of data to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:15
     * @version: 0.0.1
     */
    int insert(UserLogin record);

    /**
     *  Add data selectively to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:15
     * @version: 0.0.1
     */
    int insertSelective(UserLogin record);

    /**
     *  Query only one piece of data by primary key
     * @param id
     * @return: com.wish.yuan.logic.user.entity.UserLogin
     * @author: cfy
     * @date: 2021/8/4 11:15
     * @version: 0.0.1
     */
    UserLogin selectByPrimaryKey(String id);

    /**
     *  Selectively update data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:15
     * @version: 0.0.1
     */
    int updateByPrimaryKeySelective(UserLogin record);

    /**
     * 用户登录使用
     * @param userLogin
     * @return: com.yuan.logic.user.entity.UserLogin
     * @author: cfy
     * @date: 2021/7/10 11:26
     * @version: 0.0.1
     */
    UserLogin userLogin(UserLogin userLogin);
}