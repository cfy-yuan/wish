package com.wish.yuan.logic.user.web;

import com.wish.common.code.ProjectCode;
import com.wish.common.code.UserStatusCode;
import com.wish.common.entity.ResponseEntity;
import com.wish.common.utils.StringUtil;
import com.wish.common.utils.TokenUtil;
import com.wish.yuan.logic.sys.entity.Navigation;
import com.wish.yuan.logic.sys.entity.Role;
import com.wish.yuan.logic.sys.entity.UserRole;
import com.wish.yuan.logic.sys.service.impl.RoleServiceImpl;
import com.wish.yuan.logic.sys.service.impl.SysServiceImpl;
import com.wish.yuan.logic.user.entity.UserInfo;
import com.wish.yuan.logic.user.entity.UserLogin;
import com.wish.yuan.logic.user.service.impl.LoginServiceImpl;
import com.wish.yuan.logic.user.service.impl.UserServiceImpl;
import com.wish.yuan.utils.redis.RedisUtil;
import com.wish.yuan.utils.user.UserUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Classname LoginController
 * @Description :
 * @Date 2021/7/15 10:03
 * @Author cfy
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    private final LoginServiceImpl loginService;
    private final RoleServiceImpl roleService;
    private final SysServiceImpl sysService;
    private final UserServiceImpl userService;
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    public LoginController(LoginServiceImpl loginService, RoleServiceImpl roleService, SysServiceImpl sysService, UserServiceImpl userService) {
        this.loginService = loginService;
        this.roleService = roleService;
        this.sysService = sysService;
        this.userService = userService;
    }

    /**
     * 用户登录
     * @param userLogin
	 * @param response
     * @return: com.wish.common.entity.ResponseEntity
     * @author: cfy
     * @date: 2021/9/24 10:58
     * @version: 0.0.1
     */
    @RequestMapping(value = {"/toLogin"}, method = RequestMethod.POST)
    public ResponseEntity toLogin(@RequestBody UserLogin userLogin, HttpServletResponse response) {

        ResponseEntity<Map<String, Object>> login = loginService.login(userLogin.getLoginName(), userLogin.getPassword());
        String token = StringUtil.EMPTY;
        if (UserStatusCode.OK.getCode().equals(login.getCode())) {
            UserLogin data = (UserLogin) login.getData().get("user");
            token = TokenUtil.createToken(String.valueOf(data.getUserId()), data.getLoginName(), StringUtil.getUuid());
            UserRole userRole = new UserRole();
            userRole.setUserId(data.getUserId());
            List<Role> roles = roleService.selectUserRoleList(userRole);
            List<String> roleId = new ArrayList<>();
            List<Long> roleIds = new ArrayList<>();
            List<String> roleType = new ArrayList<>();
            for (Role role : roles) {
                roleId.add(String.valueOf(role.getRoleId()));
                roleIds.add(role.getRoleId());
                roleType.add(role.getRoleType());

            }
            RedisUtil.del(String.valueOf(data.getUserId()));
            RedisUtil.hashSet(String.valueOf(data.getUserId()), "userRole", roleId, TokenUtil.DEFAULT_TIME_REDIS);
            RedisUtil.hashSet(String.valueOf(data.getUserId()), TokenUtil.TOKEN, token, TokenUtil.DEFAULT_TIME_REDIS);
//               RedisUtil.hashSet(String.valueOf(data.getUserId()),"userAuthority",null);
//                RedisUtil.hashSet(String.valueOf(data.getUserId()),"userInfo",null);
//                RedisUtil.hashSet(String.valueOf(data.getUserId()),"userOffice",null);

            List<Navigation> navigations = sysService.selectNavigationByRole(roleIds);
            login.getData().put("navigations",navigations);
            login.getData().put("role",roleType);
            UserInfo userInfo = userService.getUserInfo(data.getUserId());
            login.getData().put("userInfo",userInfo);

        }
        response.setHeader(TokenUtil.TOKEN, token);

        return login;
    }
    @RequestMapping(value = {"/exit"}, method = RequestMethod.POST)
    public ResponseEntity exit(){
        Long userId = UserUtil.getUserId();
        RedisUtil.del(String.valueOf(userId));
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(ProjectCode.OK.getCode());
        responseEntity.setMsg(ProjectCode.OK.getMsg());
        return responseEntity;
    }


}
