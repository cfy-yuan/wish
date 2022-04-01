package com.wish.common.utils;

import java.util.List;

/**
 * @Classname ObjectUtil
 * @Description :
 * @Date 2021/7/9 21:09
 * @Author cfy
 */
public class ObjectUtil {

    /**
     * 判断对象是否为空
     *
     * @param obj
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/2 9:28
     * @version: 0.0.1
     */
    public static boolean isObjectBlank(Object obj) {
        if (null == obj) {
            return true;
        }
        return false;
    }

    /**
     * 对象不为空
     *
     * @param obj
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/2 9:30
     * @version: 0.0.1
     */

    public static boolean isObjectNotBlank(Object obj) {
        if (!isObjectBlank(obj)) {
            return true;
        }
        return false;
    }

    /**
     * list is blank
     *
     * @param obj
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/8 15:18
     * @version: 0.0.1
     */
    public static boolean isListObjectNotBlank(List<Object> obj) {
        if (isObjectNotBlank(obj)) {
            return true;
        }
        return false;
    }

    /**
     * list count gt 0
     *
     * @param obj
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/8 15:19
     * @version: 0.0.1
     */
    public static boolean isListCountNotBlank(List<Object> obj) {
        if (isObjectNotBlank(obj) && obj.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * list count is 0
     *
     * @param obj
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/8 15:55
     * @version: 0.0.1
     */
    public static boolean isListCountBlank(List<Object> obj) {
        if (isObjectBlank(obj)) {
            return true;
        }
        if (!isListCountNotBlank(obj)) {
            return true;
        }
        return false;
    }

}
