package com.wish.yuan.logic.user.web;

import com.wish.common.code.ProjectCode;
import com.wish.common.entity.ResponseEntity;
import com.wish.yuan.logic.user.entity.UserInfo;
import com.wish.yuan.logic.user.entity.UserLogin;
import com.wish.yuan.logic.user.service.impl.UserServiceImpl;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

/**
 * @author yuan
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService){
        this.userService = userService;

    }

    /**
     * 用户信息
     * @param userLogin
     * @return: com.wish.common.entity.ResponseEntity
     * @author: cfy
     * @date: 2021/7/14 20:09
     * @version: 0.0.1
     */
    @RequestMapping(value = {"/userInfo"} , method = RequestMethod.POST)
    public ResponseEntity getUserInfo(@RequestBody UserLogin userLogin){
        ResponseEntity responseEntity = new ResponseEntity();
        UserInfo userInfo = userService.getUserInfo(userLogin.getUserId());
        responseEntity.setCode(ProjectCode.OK.getCode());
        responseEntity.setMsg(ProjectCode.OK.getMsg());
        responseEntity.setData(userInfo);
        return responseEntity;
    }


    @SneakyThrows
    @RequestMapping(value = {"/userTest"},method = RequestMethod.POST)
    public void getBolo(HttpServletResponse response) throws Exception{

//加载文件的位置
        response.setContentType("text/json; charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin", "*");

        File file = new File("F:\\preditplus\\功夫.mp4");
        //获取文件名
        String fileName = file.getName();
        //判断浏览器的类型
        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));

        //设置response编码
        response.setCharacterEncoding("UTF-8");
        response.addHeader("Content-Length", "" + file.length());
        //设置输出文件类型
        response.setContentType("video/mpeg4");
        FileInputStream fis = null;
        OutputStream os = null;

        try {
            //获取response输出流
            os = response.getOutputStream();
            fis = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int len;
            //配置分段数据请求源
//            fis.read(buffer,0,100);
            while ((len = fis.read(buffer)) != -1) {
                // 输出文件
                os.write(buffer,0,len);
            }
        } catch (Exception e) {
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

            if (null != os) {
                try {
                    os.flush();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                os.close();
            }
        }

    }









}
