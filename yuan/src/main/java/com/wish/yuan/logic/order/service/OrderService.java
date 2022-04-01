package com.wish.yuan.logic.order.service;

import com.wish.yuan.logic.order.entity.Order;

/**
 * @Classname OrderService
 * @Description :
 * @Date 2021/8/1 13:16
 * @Author cfy
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return: int
     * @author: cfy
     * @date: 2021/8/1 13:17
     * @version: 0.0.1
     */
    Order createOrder(Order order);
}
