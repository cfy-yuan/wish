package com.wish.yuan.logic.order.web;

import com.wish.common.entity.ResponseEntity;
import com.wish.yuan.logic.order.entity.Order;
import com.wish.yuan.logic.order.service.OrderService;
import com.wish.yuan.logic.order.service.impl.OrderServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname OrderController
 * @Description :
 * @Date 2021/8/1 14:31
 * @Author cfy
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderServiceImpl orderService;
    public OrderController(OrderServiceImpl orderService){
        this.orderService = orderService;

    }

    /**
     * 创建订单
     * @param order
	 * @param request
     * @return: com.wish.common.entity.ResponseEntity
     * @author: cfy
     * @date: 2021/8/1 14:33
     * @version: 0.0.1
     */
    @RequestMapping("/createOrder")
    public ResponseEntity createOrder(@RequestBody Order order, HttpServletRequest request){
        ResponseEntity responseEntity = new ResponseEntity();
        orderService.createOrder(order);
        return responseEntity;
    }

    /**
     * 同步通知接口阿里云
     * @param request
     * @return: void
     * @author: cfy
     * @date: 2021/8/2 16:34
     * @version: 0.0.1
     */
    @RequestMapping("/syncNotificationAlipay")
    public void syncNotificationAlipay(HttpServletRequest request){


    }
    /**
     * 异步通知接口阿里云
     * @param request
     * @return: void
     * @author: cfy
     * @date: 2021/8/2 16:34
     * @version: 0.0.1
     */
    @RequestMapping("/asynchronousNotificationAlipay")
    public void asynchronousNotificationAlipay(HttpServletRequest request){


    }



}









