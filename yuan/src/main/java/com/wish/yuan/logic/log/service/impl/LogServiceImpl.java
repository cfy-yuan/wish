package com.wish.yuan.logic.log.service.impl;

import com.wish.common.utils.DateUtil;
import com.wish.yuan.logic.log.dao.LogMapper;
import com.wish.yuan.logic.log.entity.LogEntity;
import com.wish.yuan.logic.log.service.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Classname LogServiceImpl
 * @Description :
 * @Date 2021/3/9 14:28
 * @Author cfy
 */
@Service
public class LogServiceImpl implements LogService {
    private Logger logger = LoggerFactory.getLogger(LogServiceImpl.class);
    private final LogMapper logMapper;

    public LogServiceImpl(LogMapper logMapper) {
        this.logMapper = logMapper;
    }

    @Override
    public int insert(LogEntity log) {
        for(long i=0;i<100;i++){
            LogEntity logEntity1 = new LogEntity();
            logEntity1.setLogId(i);
            logEntity1.init();
            logMapper.insert(logEntity1);
        }
        return 0;
    }

    @Override
    public List<LogEntity> selectByPrimary(LogEntity logEntity) {
        logEntity = new LogEntity();
        logEntity.setCreateTime(new Date());
        logEntity.setStartDate(DateUtil.addDefaultDateDays(-1));
        logEntity.setEndDate(DateUtil.getDate());
        logEntity.setLogId(2L);
        List<LogEntity> logEntities = logMapper.selectByPrimary(logEntity);
        System.out.println(logEntities.size());
        return null;
    }


}
