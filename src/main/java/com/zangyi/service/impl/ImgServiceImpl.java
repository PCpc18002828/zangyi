package com.zangyi.service.impl;

import com.zangyi.common.Img;
import com.zangyi.mapper.ImgMapper;
import com.zangyi.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgServiceImpl implements ImgService {
    @Autowired
    ImgMapper imgMapper;

    @Override
    public List<Img> imgLists() {
        return imgMapper.selectByExample(null);
    }
}
