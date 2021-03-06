package com.zangyi.controller;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.MusicInstrumentVideo;
import com.zangyi.common.MusicPersonList;
import com.zangyi.common.MusicPersonMusics;
import com.zangyi.common.MusicVideo;
import com.zangyi.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    MusicService musicService;

    /**
     * 获得男歌手列表
     *
     * @return
     */
    @RequestMapping("/personListBoy")
    @ResponseBody
    public List<MusicPersonList> personListsForBoy() {
        return musicService.personListBoy();
    }

    /**
     * 获得女歌手列表
     *
     * @return
     */
    @RequestMapping("/personListGril")
    @ResponseBody
    public List<MusicPersonList> personListsForGril() {
        return musicService.personListGril();
    }

    /**
     * 根据歌手id获得歌手的歌曲信息列表
     *
     * @return
     */
    @RequestMapping("/personMusics")
    @ResponseBody
    public List<MusicPersonMusics> personMusics(Integer id) throws ClientException {
        return musicService.personMusics(id);
    }

    /**
     * 获取歌曲视频列表
     *
     * @return
     */
    @RequestMapping("/musicVideo")
    @ResponseBody
    public List<MusicVideo> getVideos() throws ClientException {
        return musicService.getVideos();
    }
    /**
     * 获取所有乐器视频
     *
      * @return
     */
    @RequestMapping("/instrumentVideo")
    @ResponseBody
    public List<MusicInstrumentVideo> getInstrumentVideo() throws ClientException {
        return musicService.getInstrumentVideo();
    }
    /**
     * 获取各类乐器图片及其内容
      */
    @RequestMapping("/instrumentContent")
    @ResponseBody
    public Map<String,Object> instrumentContent(){
        return musicService.instrumentContent();
    }
}
