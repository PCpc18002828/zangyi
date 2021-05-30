package com.zangyi.controller;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.CalligraphyVideo;
import com.zangyi.service.CalligraphyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/calligraphy")
public class CalligraphyController {
    @Autowired
    CalligraphyService calligraphyService;
    @RequestMapping("/videoList")
    @ResponseBody
    public List<CalligraphyVideo> videoList() throws ClientException {
        return calligraphyService.videoList();
    }
}
