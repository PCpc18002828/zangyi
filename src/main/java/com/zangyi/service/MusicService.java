package com.zangyi.service;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.MusicPersonList;
import com.zangyi.common.MusicPersonMusics;

import java.util.List;

public interface MusicService {
    List<MusicPersonList> personListBoy();

    List<MusicPersonList> personListGril();

    List<MusicPersonMusics> personMusics(Integer id) throws ClientException;
}
