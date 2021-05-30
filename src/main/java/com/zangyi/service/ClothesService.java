package com.zangyi.service;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.ClothesVideo;

import java.util.List;
import java.util.Map;

public interface ClothesService {
    Map<String, Object> picContent();

    List<ClothesVideo> videoList() throws ClientException;
}
