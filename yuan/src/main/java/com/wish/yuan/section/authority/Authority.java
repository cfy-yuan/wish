package com.wish.yuan.section.authority;


import java.lang.annotation.*;

/**
 * @Classname Authority
 * @Description :
 * @Date 2021/7/19 14:55
 * @Author cfy
 */
@Documented
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Authority {
    String[] value() ;
    String name() default "";
    String type() default "";
}
