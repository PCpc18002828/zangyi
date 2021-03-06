package com.zangyi.controller;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.ClothesVideo;
import com.zangyi.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/clothes")
public class ClothesController {
    @Autowired
    ClothesService clothesService;

    /**
     * 获取服装图片内容
     * key为："拉萨藏装","那区藏装","林芝藏装","日喀则藏装"
     * value为对应的集合
     *
     * @return
     */

    @RequestMapping("/picContent")
    @ResponseBody
    public Map<String, Object> picContent() {
        return clothesService.picContent();
    }

    @RequestMapping("/videoList")
    @ResponseBody
    public List<ClothesVideo> videoList() throws ClientException {
        return clothesService.videoList();
    }

}
