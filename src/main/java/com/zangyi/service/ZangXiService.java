package com.zangyi.service;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.ZangXiPic;
import com.zangyi.common.ZangXiVideo;

import java.util.List;

public interface ZangXiService {
    List<ZangXiVideo> videoList() throws ClientException;

    List<ZangXiPic> picContent();
}
