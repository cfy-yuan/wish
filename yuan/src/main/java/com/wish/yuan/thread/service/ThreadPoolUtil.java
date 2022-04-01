package com.wish.yuan.thread.service;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 线程池
 *
 * @Classname ThreadPoolUtil
 * @Description :
 * @Date 2021/3/9 13:51
 * @Author cfy
 */
public abstract class ThreadPoolUtil {
    /**
     * 线程名称
     */
    private static final String THREAD_NAME = "Thread-yuan-";
    /**
     * 最大线程数
     */
    private static final Integer MAX_SIZE = 20;
    /**
     * 最小线程数
     */
    private static final Integer MIN_SIZE = 1;
    /**
     * 存活时间
     */
    private static final Long KEEP_ALIVE_TIME = 30000L;
    /**
     * 队列数
     */
    private static final Integer WORK_QUEUE = 10;
    public static final ExecutorService EXECUTOR = new ThreadPoolExecutor(
            MIN_SIZE, MAX_SIZE, KEEP_ALIVE_TIME, TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<>(WORK_QUEUE),new ThreadFactoryBuilder()
            .setNameFormat(THREAD_NAME + "-%d").build());

    /**
     * 线程添加
     *
     * @return: void
     * @author: cfy
     * @date: 2021/3/9 14:01
     * @version: 0.0.1
     */
    public static void addThread(Runnable runnable) {
        EXECUTOR.execute(runnable);
    }


}
