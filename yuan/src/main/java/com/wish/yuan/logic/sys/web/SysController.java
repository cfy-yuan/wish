package com.wish.yuan.logic.sys.web;

import com.wish.common.code.ProjectCode;
import com.wish.common.entity.ResponseEntity;
import com.wish.common.entity.TreeNode;
import com.wish.common.utils.ObjectUtil;
import com.wish.common.utils.StringUtil;
import com.wish.yuan.logic.log.service.LogService;
import com.wish.yuan.logic.sys.entity.Config;
import com.wish.yuan.logic.sys.entity.Navigation;
import com.wish.yuan.logic.sys.entity.Office;
import com.wish.yuan.logic.sys.entity.Role;
import com.wish.yuan.logic.sys.service.SysService;
import com.wish.yuan.section.authority.Authority;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yuan
 */
@RestController
@RequestMapping("/sys")
public class SysController {
    private final LogService logService;
    private final SysService sysService;

    public SysController(LogService logService, SysService sysService) {
        this.logService = logService;
        this.sysService = sysService;
    }

    @RequestMapping(value = {"/insertOffice"}, method = RequestMethod.POST)
    @ResponseBody
    @Authority(value = {"edit"}, name = "编辑权限")
    public ResponseEntity insertOffice(@RequestBody Office office) {
        ResponseEntity responseEntity = new ResponseEntity();
        if (StringUtil.isEmpty(office.getName())) {
            responseEntity.setCode(ProjectCode.PARAMETER_ERROR.getCode());
            responseEntity.setMsg(ProjectCode.PARAMETER_ERROR.getMsg());
            return responseEntity;
        }
        int i = sysService.insertOffice(office);
        if (i == 1) {
            responseEntity.setCode(ProjectCode.OK.getCode());
            responseEntity.setMsg(ProjectCode.OK.getMsg());
            return responseEntity;
        }
        responseEntity.setCode(ProjectCode.ERROR.getCode());
        responseEntity.setMsg(ProjectCode.ERROR.getMsg());
        return responseEntity;
    }


    @RequestMapping(value = {"/getTreeOffice"}, method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity getTreeOffice(@RequestBody Office office) {
        ResponseEntity responseEntity = new ResponseEntity();
        if (ObjectUtil.isObjectBlank(office.getSuperiorId())) {
            responseEntity.setCode(ProjectCode.PARAMETER_ERROR.getCode());
            responseEntity.setMsg(ProjectCode.PARAMETER_ERROR.getMsg());
            return responseEntity;
        }

        TreeNode treeNode = new TreeNode();
        treeNode.setpId(office.getSuperiorId());
        treeNode.setpIds(String.valueOf(office.getSuperiorId()));
//        treeNode.setStatus(Office.OFFICE_STATUS_OK);
        List<TreeNode> treeOfficeList = sysService.getTreeOfficeList(treeNode);
        responseEntity.setCode(ProjectCode.OK.getCode());
        responseEntity.setMsg(ProjectCode.OK.getMsg());
        responseEntity.setData(treeOfficeList);
        return responseEntity;
    }

    /**
     * 获取用户基本配置数据，用于配置用户首页数据
     * @return: com.wish.common.entity.ResponseEntity
     * @author: cfy
     * @date: 2021/8/9 15:02
     * @version: 0.0.1
     */
    @RequestMapping("/config")
    public ResponseEntity getConfig(@RequestBody Config config) {
        ResponseEntity responseEntity = new ResponseEntity();
        config.setProject("yuan");
        Config projectConfig = sysService.getProjectConfig(config);
        responseEntity.setCode(ProjectCode.OK.getCode());
        responseEntity.setMsg(ProjectCode.OK.getMsg());
        responseEntity.setData(projectConfig);
        return responseEntity;
    }
    /**
     * 获取用到导航栏信息
     *
     * @return: com.wish.common.entity.ResponseEntity
     * @author: cfy
     * @date: 2021/8/21 13:13
     * @version: 0.0.1
     */
    @RequestMapping("/getNavigationByUser")
    public ResponseEntity getNavigationByUser(){
        ResponseEntity responseEntity = new ResponseEntity();
        List<Navigation> navigations = sysService.selectNavigationByRole();
        responseEntity.setCode(ProjectCode.OK.getCode());
        responseEntity.setMsg(ProjectCode.OK.getMsg());
        responseEntity.setData(navigations);
        return responseEntity;
    }

    /**
     * 获取用户角色信息
     *
     * @return: com.wish.common.entity.ResponseEntity
     * @author: cfy
     * @date: 2021/8/21 13:13
     * @version: 0.0.1
     */
    @RequestMapping("/getRoleByUser")
    public ResponseEntity getRoleByUser(){
        ResponseEntity responseEntity = new ResponseEntity();
        List<Role> roleByUser = sysService.getRoleByUser();
        responseEntity.setCode(ProjectCode.OK.getCode());
        responseEntity.setMsg(ProjectCode.OK.getMsg());
        responseEntity.setData(roleByUser);
        return responseEntity;
    }





}
