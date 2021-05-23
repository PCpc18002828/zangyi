package com.zangyi.controller;




import com.zangyi.common.UserInfo;
import com.zangyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 作者：普尺
     */
//    插入数据：
    @Autowired
    UserService userService;


    @RequestMapping("/insert")
    @ResponseBody
    public void userInsert(UserInfo userInfo) {
         userService.insertUser(userInfo);
    }
//用户登录
//登陆时的请求操作(第一次登录时插入一条新的记录到数据库，)
//                map.put("token",token);
//                map.put("status",1/0);1为成功
//                map.put("userInfo",wUserInformation);
//                map.put("msg",提示信息)，提示信息：“解密成功/失败，code不能为空，用户已存在”
    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(String encryptedData, String iv, String code) {
        return userService.wxLogin(encryptedData, iv, code);
    }
}
