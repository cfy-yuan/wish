package com.wish.common.utils;

import com.wish.common.exception.ProjectException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname DateUtil
 * @Description :
 * @Date 2021/7/9 21:13
 * @Author cfy
 */
public class DateUtil {
    public static final String FORMAT_YEAR = "yyyy";
    public static final Long DAYTIME = 24 * 60 * 60 * 1000L;
    public static final String FORMAT_MONTH = "yyyy";
    public static final String FORMAT_DAY = "yyyyMMdd";
    public static final String FORMAT_DEFAULT = "yyyyMMddHHmmss";
    public static final String FORMAT_MILLISECOND= "yyyyMMddHHmmssSSS";

    /**
     * 获取当前时间
     * @return: java.util.Date
     * @author: cfy
     * @date: 2021/3/9 14:04
     * @version: 0.0.1
     */
    public static Date getDate(){
        return new Date();
    }

    /**
     * 默认年时间格式
     * FORMAT_SECOND
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/9 14:09
     * @version: 0.0.1
     */
    public static String defaultYearFormat(){
        return format(FORMAT_YEAR);
    }
    /**
     * 默认月时间格式
     * FORMAT_SECOND
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/9 14:09
     * @version: 0.0.1
     */
    public static String defaultMonthFormat(){
        return format(FORMAT_YEAR);
    }
    /**
     * 默认时间格式
     * FORMAT_SECOND
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/9 14:09
     * @version: 0.0.1
     */
    public static String defaultFormat(){
        return format(FORMAT_DEFAULT);
    }

    /**
     * 指定时间格式
     * @param format
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/9 14:10
     * @version: 0.0.1
     */
    public static String format(String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(getDate());
    }
    /**
     * 时间格式化
     * @param date 时间
     * @param format 格式
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/9 14:13
     * @version: 0.0.1
     */
    public static String format(Date date ,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * 时间格式化 返回时间
     * @param date
     * @param format
     * @return: java.util.Date
     * @author: cfy
     * @date: 2021/3/9 14:16
     * @version: 0.0.1
     */
    public static Date parseDate(String date ,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new ProjectException("DateUtils parseDate ");
        }
    }

    /**
     * 时间加天
     * @param dayCount
     * @return: java.util.Date
     * @author: cfy
     * @date: 2021/3/17 10:05
     * @version: 0.0.1
     */
    public static Date addDefaultDateDays(Integer dayCount){
        return addDays(getDate(),dayCount);
    }

    /**
     * 时间加天
     * @param dayCount
     * @return: java.util.Date
     * @author: cfy
     * @date: 2021/3/17 10:05
     * @version: 0.0.1
     */
    public static Date addDays(Date date,Integer dayCount){
        long l = date.getTime() + dayCount * DAYTIME;
        return new Date(l);
    }
    /**
     * 时间加减天
     * @param date 默认格式 FORMAT_SECOND
	 * @param dayCount
     * @return: java.util.Date
     * @author: cfy
     * @date: 2021/7/9 21:26
     * @version: 0.0.1
     */
    public static Date addDays(String date,Integer dayCount){
        long l = parseDate( date , FORMAT_DEFAULT).getTime() + dayCount * DAYTIME;
        return new Date(l);
    }


}
