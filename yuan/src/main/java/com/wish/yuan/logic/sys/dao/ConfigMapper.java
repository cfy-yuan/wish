package com.wish.yuan.logic.sys.dao;

import com.wish.yuan.logic.sys.entity.Config;

/**
 * @author yuan
 */
public interface ConfigMapper {
    /**
     * Add a piece of data to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-09
	 * @Author yuan 
     */
    int insert(Config record);

    /**
     * Add data selectively to the database
	 * @param record
	 * @return int
	 * @Date 2021-08-09
	 * @Author yuan 
     */
    int insertSelective(Config record);

    /**
     * Query only one piece of data by primary key
	 * @param record
	 * @return com.wish.yuan.logic.sys.entity.Config
	 * @Date 2021-08-09
	 * @Author yuan 
     */
    Config selectByPrimaryKey(Config record);

    /**
     * Selectively update data through primary key
	 * @param record
	 * @return int
	 * @Date 2021-08-09
	 * @Author yuan 
     */
    int updateByPrimaryKeySelective(Config record);


}