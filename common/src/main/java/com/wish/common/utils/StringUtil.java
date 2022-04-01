package com.wish.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * @Classname StringUtil
 * @Description :
 * @Date 2021/7/9 21:10
 * @Author cfy
 */
public class StringUtil extends StringUtils {
    /**字符串null*/
    public static final String NULL = "null";
    /** 空串 */
    public static final String EMPTY = "";
    public static final String EMPTY_OBJECT = null;
    /** 占位符 */
    public static final String PLACEHOLDER = "-";
    /** 下划线 */
    public static final String UNDERSCORE = "_";

    /**
     * 邮箱正则
     */
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
    /**
     * 手机号正则
     */
    public static final String PHONE_REGEX = "^[1](([3][0-9])|([4][0,1,4-9])|([5][0-3,5-9])|([6][2,5,6,7])|([7][0-8])|([8][0-9])|([9][0-3,5-9]))[0-9]{8}$";
    /**
     * 密码复杂度
     * 开头大写 多个
     * 中间大小写数字 多个
     * 结束符号 多个
     * 10-22个
     */
    public static final String PASSWORD_REGEX = "^[A-Z][a-zA-Z0-9]{8,20}.+$";

    /**
     * 登录名验证
     */
    public static final String LOGINNAME_REGEX = "^[A-Z][a-zA-Z0-9]{8,20}";

    /**
     * 不为空
     * @param obj
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/9 11:11
     * @version: 0.0.1
     */
    public static boolean isNotEmpty(CharSequence obj){
        if(StringUtils.isNotEmpty(obj)) {
            if(!obj.toString().trim().equals(NULL)) {
                return true;
            }
        }
        return false;
    }
    /**
     * 为空
     * @param obj
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/9 11:11
     * @version: 0.0.1
     */
    public static boolean isEmpty(CharSequence obj){
        if(!isNotEmpty(obj)) {
            return true;
        }
        return false;

    }

    /**
     * 正则验证
     *
     * @param obj
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/8 18:41
     * @version: 0.0.1
     */
    public static boolean isRegex(CharSequence obj, String regex) {
        if (StringUtils.isNotBlank(obj) && StringUtils.isNotBlank(regex)) {
            if (obj.toString().matches(regex)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 唯一id生成器
     *
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/15 14:22
     * @version: 0.0.1
     */
    public static String getUuid() {
        return UUID.randomUUID().toString().replaceAll(PLACEHOLDER ,EMPTY);
    }
}
