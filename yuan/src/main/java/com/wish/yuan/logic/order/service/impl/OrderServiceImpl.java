package com.wish.yuan.logic.order.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.wish.common.utils.DateUtil;
import com.wish.yuan.logic.order.entity.AlipayConfig;
import com.wish.yuan.logic.order.entity.Order;
import com.wish.yuan.logic.order.service.OrderService;
import com.wish.yuan.utils.snowflake.SnowFlakeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Classname OrderServiceImpl
 * @Description :
 * @Date 2021/8/1 13:17
 * @Author cfy
 */
@Service
public class OrderServiceImpl implements OrderService {
    private Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);


    @Override
    public Order createOrder(Order order) {
        order.setOrderId(SnowFlakeUtil.nextId());
        order.setOrderTime(DateUtil.defaultFormat());
        order.init();
        // 商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = String.valueOf(order.getOrderId());
        // 订单名称，必填
        String subject = "测试";
        System.out.println(subject);
        // 付款金额，必填
        String total_amount = new String("10.1");
        // 商品描述，可空
        String body = new String("测试商品");
        // 超时时间 可空
        String timeout_express = "2m";
        // 销售产品码 必填
        String product_code = "QUICK_WAP_WAY";
        /**********************/
        // SDK 公共请求类，包含公共请求参数，以及封装了签名与验签，开发者无需关注签名与验签
        //调用RSA签名方式
        AlipayClient client = new DefaultAlipayClient(AlipayConfig.getUrl(),
                AlipayConfig.getAppId(), AlipayConfig.getRsaPrivateKey(),
                AlipayConfig.getFormat(), AlipayConfig.getCharset(),
                AlipayConfig.getAlipayPublicKey(), AlipayConfig.getSignType());
        AlipayTradeWapPayRequest alipay_request = new AlipayTradeWapPayRequest();

        // 封装请求支付信息
        AlipayTradeWapPayModel model = new AlipayTradeWapPayModel();
        model.setOutTradeNo(out_trade_no);
        model.setSubject(subject);
        model.setTotalAmount(total_amount);
        model.setBody(body);
        model.setTimeoutExpress(timeout_express);
        model.setProductCode(product_code);
        alipay_request.setBizModel(model);
        // 设置异步通知地址
        alipay_request.setNotifyUrl("http://");
        // 设置同步地址
        alipay_request.setReturnUrl("http://");

        // form表单生产
        String form = "";
        try {
            // 调用SDK生成表单
            form = client.pageExecute(alipay_request).getBody();
            logger.info("支付--", form);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

        return null;
    }
}
