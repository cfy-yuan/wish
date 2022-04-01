package com.wish.yuan;

import com.wish.yuan.listener.ProjectListener;
import com.wish.yuan.utils.redis.RedisUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Classname YuanApplication
 * @Description :
 * @Date 2021/7/9 20:49
 * @Author cfy
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.wish.yuan.filter")
@MapperScan(basePackages = "com.wish.yuan.logic.*.dao")
public class YuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuanApplication.class, args);
    }
}
