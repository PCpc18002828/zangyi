package com.zangyi.service.impl;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.*;
import com.zangyi.mapper.*;
import com.zangyi.service.MusicService;
import com.zangyi.utils.VideoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MusciServiceImpl implements MusicService {
    @Autowired
    MusicPersonListMapper musicPersonListMapper;
    @Autowired
    MusicPersonMusicsMapper musicPersonMusicsMapper;
    @Autowired
    MusicVideoMapper musicVideoMapper;
    @Autowired
    MusicInstrumentVideoMapper musicInstrumentVideoMapper;
    @Autowired
    MusicInstrumentPicMapper musicInstrumentPicMapper;

    @Override
    public List<MusicPersonList> personListBoy() {
        MusicPersonListExample personListExample = new MusicPersonListExample();
        personListExample.createCriteria().andSexEqualTo("男");
        return musicPersonListMapper.selectByExample(personListExample);
    }

    @Override
    public List<MusicPersonList> personListGril() {
        MusicPersonListExample personListExample = new MusicPersonListExample();
        personListExample.createCriteria().andSexEqualTo("女");
        return musicPersonListMapper.selectByExample(personListExample);
    }

    @Override
    public List<MusicPersonMusics> personMusics(Integer id) throws ClientException {
        MusicPersonMusicsExample personMusicsExample = new MusicPersonMusicsExample();
        personMusicsExample.createCriteria().andUseridEqualTo(id);
        List<MusicPersonMusics> musicPersonMusics = musicPersonMusicsMapper.selectByExample(personMusicsExample);
        for (int i = 0; i < musicPersonMusics.size(); i++) {
            musicPersonMusics.get(i).setSongaudio(VideoConfig.getPlayInfo(musicPersonMusics.get(i).getSongaudio()));
        }
        System.out.println(musicPersonMusics);
        return musicPersonMusics;
    }

    @Override
    public List<MusicVideo> getVideos() throws ClientException {
        List<MusicVideo> musicVideos = musicVideoMapper.selectByExample(null);
        for (int i = 0; i <musicVideos.size() ; i++) {
            musicVideos.get(i).setVideo(VideoConfig.getPlayInfo(musicVideos.get(i).getVideo()));
        }
        return musicVideos;
    }

    @Override
    public List<MusicInstrumentVideo> getInstrumentVideo() throws ClientException {
        List<MusicInstrumentVideo> musicInstrumentVideos = musicInstrumentVideoMapper.selectByExample(null);
        for (int i = 0; i <musicInstrumentVideos.size() ; i++) {
             musicInstrumentVideos.get(i).setVideoId(VideoConfig.getPlayInfo(musicInstrumentVideos.get(i).getVideoId()));
        }
        return musicInstrumentVideos;
    }

    @Override
    public Map<String, Object> instrumentContent() {
        Map<String,Object> map =new HashMap<String, Object>();
        String [] clazz ={"打击乐器","弹弦乐器","拉弦器乐","吹管器乐"};
        for (int i = 0; i <clazz.length ; i++) {
            MusicInstrumentPicExample musicInstrumentPicExample =new MusicInstrumentPicExample();
            musicInstrumentPicExample.createCriteria().andClassIdEqualTo(clazz[i]);
            List<MusicInstrumentPic> musicInstrumentPics = musicInstrumentPicMapper.selectByExample(musicInstrumentPicExample);
            map.put(clazz[i],musicInstrumentPics);
        }
        return map;
    }
}
