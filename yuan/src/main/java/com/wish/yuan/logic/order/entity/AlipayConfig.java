package com.wish.yuan.logic.order.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 支付宝配置
 * order config setting
 * @Classname OrderConfig
 * @Description :
 * @Date 2021/8/1 12:37
 * @Author cfy
 */
@Component
public class AlipayConfig {
    /**
     * 商户appid
     */

    private static String appId;
    /**
     * 私钥 pkcs8格式的
     */

    private static String rsaPrivateKey;
    /**
     * 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */

    private static String notifyUrl;
    /**
     * 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
     * */

    private static String returnUrl;
    /**
     *  请求网关地址
     */

    private static String url;
    /**
     * 编码
     */

    private static String charset;
    /**
     * 返回格式
     */

    private static String format;

    /**
     * 支付宝公钥
     */

    private static String alipayPublicKey;

    /**
     *  SIGNTYPE
     */

    private static String signType;

    public static String getAppId() {
        return appId;
    }
    @Value("${wish.order.appId}")
    public void setAppId(String appId) {
        AlipayConfig.appId = appId;
    }

    public static String getRsaPrivateKey() {
        return rsaPrivateKey;
    }
    @Value("${wish.order.rsaPrivateKey}")
    public static void setRsaPrivateKey(String rsaPrivateKey) {
        AlipayConfig.rsaPrivateKey = rsaPrivateKey;
    }



    public static String getNotifyUrl() {
        return notifyUrl;
    }
    @Value("${wish.order.notifyUrl}")
    public void setNotifyUrl(String notifyUrl) {
        AlipayConfig.notifyUrl = notifyUrl;
    }

    public static String getReturnUrl() {
        return returnUrl;
    }
    @Value("${wish.order.returnUrl}")
    public void setReturnUrl(String returnUrl) {
        AlipayConfig.returnUrl = returnUrl;
    }

    public static String getUrl() {
        return url;
    }
    @Value("${wish.order.url}")
    public static void setUrl(String url) {
        AlipayConfig.url = url;
    }

    public static String getCharset() {
        return charset;
    }
    @Value("${wish.order.charset}")
    public static void setCharset(String charset) {
        AlipayConfig.charset = charset;
    }

    public static String getFormat() {
        return format;
    }
    @Value("${wish.order.format}")
    public void setFormat(String format) {
        AlipayConfig.format = format;
    }

    public static String getAlipayPublicKey() {
        return alipayPublicKey;
    }
    @Value("${wish.order.alipayPublicKey}")
    public void setAlipayPublicKey(String alipayPublicKey) {
        AlipayConfig.alipayPublicKey = alipayPublicKey;
    }

    public static String getSignType() {
        return signType;
    }
    @Value("${wish.order.signType}")
    public void setSignType(String signType) {
        AlipayConfig.signType = signType;
    }
}
