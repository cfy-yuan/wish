package com.wish.yuan.thread.service;


import com.wish.common.utils.BeanUtil;
import com.wish.yuan.logic.log.entity.LogEntity;
import com.wish.yuan.logic.log.service.LogService;
import com.wish.yuan.logic.log.service.impl.LogServiceImpl;

/**
 * 日志添加线程
 * @Classname ThreadLogService
 * @Description :
 * @Date 2021/3/9 14:25
 * @Author cfy
 */
public class ThreadLogService implements Runnable{
    private LogEntity logEntity;
    private LogServiceImpl logService ;

    public ThreadLogService(LogEntity logEntity) {
        this.logEntity = logEntity;
        this.logService= (LogServiceImpl) BeanUtil.getBean(LogServiceImpl.class);
    }

    @Override
    public void run() {
        logService.insert(logEntity);
    }
}
