package com.wish.common.code;

/**
 * 用户状态码
 * @Classname LoginCode
 * @Description :
 * @Date 2021/3/9 11:27
 * @Author cfy
 */
public interface UserCode {
   /**
    *（2000 可用 ）
    */
    String OK = "2000";
    /**
     *（ 2001 冻结 ）
     */
    String FREEZE = "2001";
    /**
     *（2003 删除）
     */
    String DEL = "2003";

}
