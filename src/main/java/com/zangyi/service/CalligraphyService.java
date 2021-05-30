package com.zangyi.service;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.CalligraphyVideo;

import java.util.List;

public interface CalligraphyService {
    List<CalligraphyVideo> videoList() throws ClientException;
}
