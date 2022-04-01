package com.wish.yuan.logic.log.service;


import com.wish.yuan.logic.log.entity.LogEntity;

import java.util.List;

/**
 * @Classname LogService
 * @Description :
 * @Date 2021/3/9 14:27
 * @Author cfy
 */
public interface LogService {
    /**
     * 日志插入
     * @param    log
     * @return: int
     * @author: cfy
     * @date: 2021/3/9 15:16
     * @version: 0.0.1
     */
    int insert(LogEntity log);
    /**
     * 获取数据列表
     * @param logEntity
     * @return: java.util.List<com.yuan.li.project.logic.log.entity.LogEntity>
     * @author: cfy
     * @date: 2021/3/16 9:27
     * @version: 0.0.1
     */
    List<LogEntity> selectByPrimary(LogEntity logEntity);
}
