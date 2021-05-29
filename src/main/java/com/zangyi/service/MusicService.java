package com.zangyi.service;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.MusicInstrumentVideo;
import com.zangyi.common.MusicPersonList;
import com.zangyi.common.MusicPersonMusics;
import com.zangyi.common.MusicVideo;

import java.util.List;
import java.util.Map;

public interface MusicService {
    List<MusicPersonList> personListBoy();

    List<MusicPersonList> personListGril();

    List<MusicPersonMusics> personMusics(Integer id) throws ClientException;

    List<MusicVideo> getVideos() throws ClientException;

    List<MusicInstrumentVideo> getInstrumentVideo() throws ClientException;

    Map<String, Object> instrumentContent();
}
