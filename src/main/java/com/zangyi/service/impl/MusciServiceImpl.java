package com.zangyi.service.impl;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.*;
import com.zangyi.mapper.MusicPersonListMapper;
import com.zangyi.mapper.MusicPersonMusicsMapper;
import com.zangyi.mapper.MusicVideoMapper;
import com.zangyi.service.MusicService;
import com.zangyi.utils.VideoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusciServiceImpl implements MusicService {
    @Autowired
    MusicPersonListMapper musicPersonListMapper;
    @Autowired
    MusicPersonMusicsMapper musicPersonMusicsMapper;
    @Autowired
    MusicVideoMapper musicVideoMapper;

    @Override
    public List<MusicPersonList> personListBoy() {
        MusicPersonListExample personListExample =new MusicPersonListExample();
        personListExample.createCriteria().andSexEqualTo("男");
        return musicPersonListMapper.selectByExample(personListExample);
    }

    @Override
    public List<MusicPersonList> personListGril() {
        MusicPersonListExample personListExample =new MusicPersonListExample();
        personListExample.createCriteria().andSexEqualTo("女");
        return musicPersonListMapper.selectByExample(personListExample);
    }

    @Override
    public List<MusicPersonMusics> personMusics(Integer id) throws ClientException {
        MusicPersonMusicsExample personMusicsExample =new MusicPersonMusicsExample();
        personMusicsExample.createCriteria().andUseridEqualTo(id);
        List<MusicPersonMusics> musicPersonMusics = musicPersonMusicsMapper.selectByExample(personMusicsExample);
        for (int i = 0; i <musicPersonMusics.size() ; i++) {
            musicPersonMusics.get(i).setSongaudio(VideoConfig.getPlayInfo(musicPersonMusics.get(i).getSongaudio()));
        }
        System.out.println(musicPersonMusics);
        return musicPersonMusics;
    }

    @Override
    public List<MusicVideo> getVideos() {
        return musicVideoMapper.selectByExample(null);
    }
}
