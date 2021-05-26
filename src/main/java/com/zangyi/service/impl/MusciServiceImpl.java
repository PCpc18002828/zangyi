package com.zangyi.service.impl;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.*;
import com.zangyi.mapper.MusicInstrumentVideoMapper;
import com.zangyi.mapper.MusicPersonListMapper;
import com.zangyi.mapper.MusicPersonMusicsMapper;
import com.zangyi.mapper.MusicVideoMapper;
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
    }

    @Override
    public List<Map<String, Object>> getInstrumentVideo() throws ClientException {
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
        for (int i = 1; i <= 5; i++) {
            MusicInstrumentVideoExample musicInstrumentVideoExample = new MusicInstrumentVideoExample();
            musicInstrumentVideoExample.createCriteria().andClassidEqualTo(i);
            List<MusicInstrumentVideo> musicInstrumentVideos = musicInstrumentVideoMapper.selectByExample(musicInstrumentVideoExample);
            Map <String,Object> map =new HashMap<>();
            map.put("classId",i);
            map.put("musicInstrument",musicInstrumentVideos.get(0).getMusicalinstrument());
            String [] videoNames = new  String [musicInstrumentVideos.size()];
            String [] urls = new  String [musicInstrumentVideos.size()];
            for (int j = 0; j <videoNames.length ; j++) {
                videoNames[j]=musicInstrumentVideos.get(j).getName();
                urls[j]=VideoConfig.getPlayInfo(musicInstrumentVideos.get(j).getUrlid());
            }
            map.put("videoNames",videoNames);
            map.put("urls",urls);
            list.add(map);
        }
        return list;
    }
}
