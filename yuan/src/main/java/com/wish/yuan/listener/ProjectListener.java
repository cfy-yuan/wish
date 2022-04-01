package com.wish.yuan.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.Order;

/**
 * 监听项目启动
 * @Classname ProjectListener
 * @Description :
 * @Date 2021/7/19 15:00
 * @Author cfy
 */
@Configuration
@Order(-100)
public class ProjectListener implements ApplicationListener<ContextRefreshedEvent> {
    private Logger logger = LoggerFactory.getLogger(ProjectListener.class);
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("------------------------------------------------------");
        logger.info("----------------------项目启动-------------------------");
        logger.info("----------------------欢迎使用-------------------------");
        logger.info("------------------------------------------------------");
        logger.info("-----------------------------------------com.yuan.li--");
        logger.info("-----------------------------------------创建者--Yuan--");
        logger.info("-----------------------------邮件--1353044575@qq.com---");
    }

    /**
     * 初始化redis配置，
     *
     * @return: void
     * @author: cfy
     * @date: 2021/7/21 10:34
     * @version: 0.0.1
     */
    public void initRedisDict(){

    }




}
