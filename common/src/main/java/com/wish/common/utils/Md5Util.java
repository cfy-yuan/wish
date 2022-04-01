package com.wish.common.utils;

import com.wish.common.exception.ProjectException;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Classname MD5Util
 * @Description :
 * @Date 2021/7/17 18:07
 * @Author cfy
 */
public class Md5Util {

    private static final String PROJECT_KEY ="yuan-wish";
    private static final String MD5 = "md5";

    /**
     * md5加密 使用project_key与salt
     * @param obj
	 * @param salt
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/7/17 18:19
     * @version: 0.0.1
     */
    public static String getMd5(String obj,String salt){
        try {
            MessageDigest instance = MessageDigest.getInstance(MD5);
            instance.update((PROJECT_KEY + obj + salt).getBytes(StandardCharsets.UTF_8));
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new ProjectException("md5加密失败！");
        }
    }

}
