package com.wish.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * @Classname BeanUtil
 * @Description :
 * @Date 2021/7/9 21:18
 * @Author cfy
 */
public class BeanUtil {
    public static Object getBean(Class clazz){

        Object o = null;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return o;
    }
}
