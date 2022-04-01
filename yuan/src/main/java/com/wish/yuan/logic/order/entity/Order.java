package com.wish.yuan.logic.order.entity;

import com.wish.yuan.entity.BaseEntity;

/**
 * @author yuan
 * @Date 2021-08-01
 */
public class Order extends BaseEntity {


    /**
     * 原始订单号
     */
    private Long originalOrderId;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商品id
     */
    private Long commodityId;

    /**
     * 支付流水号
     */
    private Long serialOrderId;

    /**
     * 订单金额
     */
    private String orderAmount;

    /**
     * 实际金额
     */
    private String amount;

    /**
     * 支付人id
     */
    private String thePayerId;

    /**
     * 支付方式（支付宝微信）
     */
    private String paymentMethod;

    /**
     * 优惠卷id
     */
    private Long couponId;

    /**
     * 订单状态（0初始化，1 待支付，2支付中，3 支付完成）
     */
    private String orderStatus;

    /**
     * 订单时间
     */
    private String orderTime;

    /**
     * 原始订单号
     * @return original_order_id
     */
    public Long getOriginalOrderId() {
        return originalOrderId;
    }

    public void setOriginalOrderId(Long originalOrderId) {
        this.originalOrderId = originalOrderId;
    }

    /**
     * 订单id
     * @return order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 用户id
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 商品id
     * @return commodity_id
     */
    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 支付流水号
     * @return serial_order_id
     */
    public Long getSerialOrderId() {
        return serialOrderId;
    }

    public void setSerialOrderId(Long serialOrderId) {
        this.serialOrderId = serialOrderId;
    }

    /**
     * 订单金额
     * @return order_amount
     */
    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 实际金额
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 支付人id
     * @return the_payer_id
     */
    public String getThePayerId() {
        return thePayerId;
    }

    public void setThePayerId(String thePayerId) {
        this.thePayerId = thePayerId;
    }

    /**
     * 支付方式（支付宝微信）
     * @return payment_method
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 优惠卷id
     * @return coupon_id
     */
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 订单状态（0初始化，1 待支付，2支付中，3 支付完成）
     * @return order_status
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 订单时间
     * @return order_time
     */
    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
}