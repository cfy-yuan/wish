package com.wish.yuan.logic.user.service;

import com.wish.common.entity.ResponseEntity;
import com.wish.yuan.logic.user.entity.UserLogin;

/**
 * @Classname LoginService
 * @Description :
 * @Date 2021/7/12 14:13
 * @Author cfy
 */
public interface LoginService {
    /**
     * 用户注册
     * @param userLogin
     * @return: int
     * @author: cfy
     * @date: 2021/7/17 17:57
     * @version: 0.0.1
     */
    int insert(UserLogin userLogin);

    /**
     * 用户登录
     * @param loginName
	 * @param password
     * @return: com.wish.common.entity.ResponseEntity
     * @author: cfy
     * @date: 2021/8/4 11:08
     * @version: 0.0.1
     */
    ResponseEntity login(String loginName,String password);

    /**
     * 修改密码
     * @param userLogin
     * @return: int
     * @author: cfy
     * @date: 2021/7/21 9:14
     * @version: 0.0.1
     */
    int updatePassword(UserLogin userLogin);

    /**
     * 修改手机号
     * @param userLogin
     * @return: int
     * @author: cfy
     * @date: 2021/7/21 9:14
     * @version: 0.0.1
     */
    int updatePhone(UserLogin userLogin);
    /**
     * 更新邮箱
     * @param userLogin
     * @return: int
     * @author: cfy
     * @date: 2021/7/21 9:16
     * @version: 0.0.1
     */
    int updateMailbox(UserLogin userLogin);
    /**
     * 更新用户名
     * @param userLogin
     * @return: int
     * @author: cfy
     * @date: 2021/7/21 9:16
     * @version: 0.0.1
     */
    int updateUserName(UserLogin userLogin);

}
