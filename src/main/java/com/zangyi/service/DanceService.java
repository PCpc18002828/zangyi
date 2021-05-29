package com.zangyi.service;

import com.aliyuncs.exceptions.ClientException;

import java.util.Map;

public interface DanceService  {
    Map<String, Object> getDancelist() throws ClientException;
}
