package com.wish.yuan.utils.snowflake;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 雪花算法生成器
 *
 * @Classname SnowFlakeUtil
 * @Description :
 * @Date 2021/7/19 19:21
 * @Author cfy
 */
@Component
public class SnowFlakeUtil {
    /**
     * 时间起始标记点，作为基准，一般取系统的最近时间（一旦确定不能变动）
     */

    private final static long START_TIME = 1288834974657L;
    /**
     * 机器标识位数
     */
    private final static long WORKER_ID_BITS = 5L;
    /**
     * 数据中心标识位数
     */
    private final static long DATACENTER_ID_BITS = 5L;
    /**
     * 毫秒内自增位
     */
    private final static long SEQUENCE_BITS = 12L;
    /**
     * 机器ID偏左移12位
     */
    private final static long WORKER_ID_SHIFT = SEQUENCE_BITS;
    /**
     * 数据中心ID左移17位
     */
    private final static long DATACENTER_ID_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS;
    /**
     * 时间毫秒左移22位
     */
    private final static long TIMESTAMP_LEFT_SHIFT = SEQUENCE_BITS + WORKER_ID_BITS + DATACENTER_ID_BITS;
    /**
     *
     */
    private final static long SEQUENCE_MASK = -1L ^ (-1L << SEQUENCE_BITS);
    /**
     * 上次生产id时间戳
     */

    private static long lastTimestamp = -1L;
    /**
     * 0，并发控制
     */
    private static long sequence = 0L;


    private static long workerId;
    /**
     * 数据标识id部分
     */
    private static long datacenterId;


    /**
     * 获取下一个ID
     *
     * @return
     */
    public static synchronized long nextId() {
        long timestamp = timeGen();
        if (timestamp < lastTimestamp) {
            throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }
        if (lastTimestamp == timestamp) {
            // 当前毫秒内，则+1
            sequence = (sequence + 1) & SEQUENCE_MASK;
            if (sequence == 0) {
                // 当前毫秒内计数满了，则等待下一秒
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {
            sequence = 0L;
        }
        lastTimestamp = timestamp;
        // ID偏移组合生成最终的ID，并返回ID
        long nextId = ((timestamp - START_TIME) << TIMESTAMP_LEFT_SHIFT)
                | (datacenterId << DATACENTER_ID_SHIFT)
                | (workerId << WORKER_ID_SHIFT) | sequence;

        return nextId;
    }

    private static long tilNextMillis(final long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    private static long timeGen() {
        return System.currentTimeMillis();
    }

    @Value("${wish.project.worker.id}")
    public void setWorkerId(long workerId) {
        SnowFlakeUtil.workerId = workerId;
    }

    @Value("${wish.project.datacenter.id}")
    public void setDatacenterId(long datacenterId) {
        SnowFlakeUtil.datacenterId = datacenterId;
    }

}
