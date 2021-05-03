package com.zangyi.controller;

import com.zangyi.common.User;
import com.zangyi.common.UserExample;
import com.zangyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 作者：普尺
     */
//    插入数据：
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/insert")
    public int userInsert(){
        return userService.userInsert();
    }


}
