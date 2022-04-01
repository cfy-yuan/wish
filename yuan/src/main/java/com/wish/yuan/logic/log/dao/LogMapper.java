package com.wish.yuan.logic.log.dao;

import com.wish.yuan.logic.log.entity.LogEntity;

import java.util.List;

/**
 * @author yuan
 */
public interface LogMapper {
   /**
    * Add a piece of data to the database
    * @param record
    * @return: int
    * @author: cfy
    * @date: 2021/8/4 10:58
    * @version: 0.0.1
    */
    int insert(LogEntity record);

    /**
     * Add data selectively to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 10:58
     * @version: 0.0.1
     */
    int insertSelective(LogEntity record);

    /**
     *  Query only one piece of data by primary key
     * @param id
     * @return: com.wish.yuan.logic.log.entity.LogEntity
     * @author: cfy
     * @date: 2021/8/4 10:58
     * @version: 0.0.1
     */
    LogEntity selectByPrimaryKey(String id);

    /**
     * Selectively update data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 10:58
     * @version: 0.0.1
     */
    int updateByPrimaryKeySelective(LogEntity record);


    /**
     * Update all data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 10:58
     * @version: 0.0.1
     */
    int updateByPrimaryKey(LogEntity record);
    /**
     * 项目日志
     * @param record
     * @return: java.util.List<com.wish.yuan.logic.log.entity.LogEntity>
     * @author: cfy
     * @date: 2021/7/12 14:49
     * @version: 0.0.1
     */
    List<LogEntity> selectByPrimary(LogEntity record);

}