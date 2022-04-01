package com.wish.yuan.logic.user.service.impl;

import com.wish.common.code.DataCode;
import com.wish.common.code.UserCode;
import com.wish.common.code.UserStatusCode;
import com.wish.common.entity.ResponseEntity;
import com.wish.common.utils.Md5Util;
import com.wish.common.utils.ObjectUtil;
import com.wish.common.utils.StringUtil;
import com.wish.yuan.logic.sys.dao.UserRoleMapper;
import com.wish.yuan.logic.sys.entity.Role;
import com.wish.yuan.logic.sys.entity.UserRole;
import com.wish.yuan.logic.user.dao.UserLoginMapper;
import com.wish.yuan.logic.user.entity.UserLogin;
import com.wish.yuan.logic.user.service.LoginService;
import com.wish.yuan.utils.user.UserUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname LoginServiceImpl
 * @Description :
 * @Date 2021/7/12 14:13
 * @Author cfy
 */
@Service
public class LoginServiceImpl implements LoginService {
    private final UserLoginMapper userLoginMapper;
    private final UserRoleMapper userRoleMapper;
    public LoginServiceImpl(UserLoginMapper userLoginMapper,UserRoleMapper userRoleMapper){
        this.userLoginMapper = userLoginMapper;
        this.userRoleMapper = userRoleMapper;
    }
    @Override
    public int insert(UserLogin userLogin) {

        return 0;
    }

    @Override
    public ResponseEntity<Map<String,Object>> login(String loginName,String password) {
        ResponseEntity<Map<String,Object>> responseEntity = new ResponseEntity();
        UserLogin userLogin = new UserLogin();
        userLogin.setUserStatus(UserCode.OK);
        userLogin.setDelStatus(DataCode.OK);
        if(StringUtil.isRegex(loginName,StringUtil.EMAIL_REGEX)){
            userLogin.setMailbox(loginName);
        }else if(StringUtil.isRegex(loginName,StringUtil.PHONE_REGEX)){
            userLogin.setPhone(loginName);
        }else{
            userLogin.setLoginName(loginName);
        }
        UserLogin login = userLoginMapper.userLogin(userLogin);
        if(ObjectUtil.isObjectNotBlank(login)){
            String md5 = Md5Util.getMd5(password, login.getUuid());
            if(login.getPassword().equals(md5)){
                responseEntity.setCode(UserStatusCode.OK.getCode());
                responseEntity.setMsg(UserStatusCode.OK.getMsg());
                login.setPassword(StringUtil.EMPTY_OBJECT);
                login.setUuid(StringUtil.EMPTY_OBJECT);
                Map<String,Object> map = new HashMap<>(4);
                map.put("user",login);
                responseEntity.setData(map);
            }else{
                responseEntity.setCode(UserStatusCode.PASSWORD_ERROR.getCode());
                responseEntity.setMsg(UserStatusCode.PASSWORD_ERROR.getMsg());
            }
        }else{
            responseEntity.setCode(UserStatusCode.DEL.getCode());
            responseEntity.setMsg(UserStatusCode.DEL.getMsg());
        }
        return responseEntity;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public int updatePassword(UserLogin userLogin) {
        return 0;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public int updatePhone(UserLogin userLogin) {
        return 0;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public int updateMailbox(UserLogin userLogin) {
        return 0;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public int updateUserName(UserLogin userLogin) {
        return 0;
    }

    public List<Role> getUserRoleList(){
        Long userId = UserUtil.getUserId();
        UserRole userRole = new UserRole();
        userRole.setUserId(userId);
        List<UserRole> userRoles = userRoleMapper.selectByPrimaryKey(userRole);
        return null;
    }
}
