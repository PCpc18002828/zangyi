package com.zangyi.controller;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.ZangXiPic;
import com.zangyi.common.ZangXiVideo;
import com.zangyi.service.ZangXiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/zangXi")
public class ZangXiController {
    @Autowired
    ZangXiService zangXiService;

    /**
     * 得到藏戏图片及其内容
     * @return
     */
    @RequestMapping("/picContent")
    @ResponseBody
    public List<ZangXiPic> picContent(){
        return zangXiService.picContent();
    }

    /**
     *得到藏戏视频列表
     */
    @RequestMapping("/videoList")
    @ResponseBody
    public List<ZangXiVideo> videoList() throws ClientException {
        return zangXiService.videoList();
    }
}
