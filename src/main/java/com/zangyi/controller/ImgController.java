package com.zangyi.controller;

import com.zangyi.common.Img;
import com.zangyi.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/img")
public class ImgController {
@Autowired
    ImgService imgService;
@RequestMapping("/imgList")
    public List<Img> imgList(){
    return  imgService.imgLists();
}
}
