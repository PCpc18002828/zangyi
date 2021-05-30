package com.zangyi.service.impl;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.CalligraphyVideo;
import com.zangyi.mapper.CalligraphyVideoMapper;
import com.zangyi.service.CalligraphyService;
import com.zangyi.utils.VideoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalligraphyServiceImpl implements CalligraphyService {
    @Autowired
    CalligraphyVideoMapper calligraphyVideoMapper;

    @Override
    public List<CalligraphyVideo> videoList() throws ClientException {
        List<CalligraphyVideo> calligraphyVideos = calligraphyVideoMapper.selectByExample(null);
        for (int i = 0; i <calligraphyVideos.size() ; i++) {
            calligraphyVideos.get(i).setVideoUrl(VideoConfig.getPlayInfo(calligraphyVideos.get(i).getVideoUrl()));
        }
        return calligraphyVideos;
    }
}
