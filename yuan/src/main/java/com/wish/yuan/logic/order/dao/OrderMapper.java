package com.wish.yuan.logic.order.dao;

import com.wish.yuan.logic.order.entity.Order;

/**
 * @author yuan
 */
public interface OrderMapper {
    /**
     * Add a piece of data to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:12
     * @version: 0.0.1
     */
    int insert(Order record);

    /**
     * Add data selectively to the database
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:12
     * @version: 0.0.1
     */
    int insertSelective(Order record);

    /**
     * Query only one piece of data by primary key
     * @param id
     * @return: com.wish.yuan.logic.order.entity.Order
     * @author: cfy
     * @date: 2021/8/4 11:12
     * @version: 0.0.1
     */
    Order selectByPrimaryKey(String id);

    /**
     * Selectively update data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:12
     * @version: 0.0.1
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * Update all data through primary key
     * @param record
     * @return: int
     * @author: cfy
     * @date: 2021/8/4 11:13
     * @version: 0.0.1
     */
    int updateByPrimaryKey(Order record);
}