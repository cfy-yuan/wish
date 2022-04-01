package com.wish.yuan.logic.user.service;

import com.wish.yuan.logic.user.entity.UserInfo;

/**
 * @author yuan
 */
public interface UserService {

    /**
     * 获取用户信息基础信息
     * @param userId
     * @return: com.wish.yuan.logic.user.entity.UserInfo
     * @author: cfy
     * @date: 2021/7/14 20:13
     * @version: 0.0.1
     */
    UserInfo getUserInfo(Long userId);
}
