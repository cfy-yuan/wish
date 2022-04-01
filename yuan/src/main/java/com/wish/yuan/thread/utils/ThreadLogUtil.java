package com.wish.yuan.thread.utils;

import com.wish.yuan.logic.log.entity.LogEntity;
import com.wish.yuan.logic.log.service.impl.LogServiceImpl;
import com.wish.yuan.thread.service.ThreadPoolUtil;
import org.springframework.stereotype.Component;

/**
 * @Classname ThreadUtil
 * @Description :
 * @Date 2021/3/9 13:47
 * @Author cfy
 */
@Component
public class ThreadLogUtil {

    private static LogServiceImpl logService ;

    public ThreadLogUtil(LogServiceImpl logService) {
        ThreadLogUtil.logService= logService;
    }

    public static void addThread(LogEntity logEntity){
        ThreadPoolUtil.addThread(new Runnable() {
            @Override
            public void run() {
                logService.insert(logEntity);
            }
        });



    }


}
