package com.zangyi.controller;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.mapper.DanceMapper;
import com.zangyi.service.DanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/dance")
public class DanceController {
    @Autowired
    DanceService danceService;

    /**
     * key分别为：芒康锅庄、那曲锅庄、卫藏锅庄
     * value为对应对象集合
     * @return
     */
    @RequestMapping("/getDanceList")
    @ResponseBody
    public Map<String,Object> getDanceList() throws ClientException {
        return danceService.getDancelist();
    }
}
