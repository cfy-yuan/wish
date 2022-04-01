package com.wish.yuan.logic.user.service.impl;

import com.wish.yuan.logic.user.dao.UserInfoMapper;
import com.wish.yuan.logic.user.dao.UserLoginMapper;
import com.wish.yuan.logic.user.entity.UserInfo;
import com.wish.yuan.logic.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yuan
 */
@Service
public class UserServiceImpl implements UserService {

    private UserLoginMapper userLoginMapper;
    private UserInfoMapper userInfoMapper;

    public UserServiceImpl(UserLoginMapper userLoginMapper, UserInfoMapper userInfoMapper) {
        this.userLoginMapper = userLoginMapper;
        this.userInfoMapper = userInfoMapper;
    }

    @Override
    public UserInfo getUserInfo(Long userId) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo = userInfoMapper.selectByPrimaryKey(userInfo);
        return userInfo;
    }
}












