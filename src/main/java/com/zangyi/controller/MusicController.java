package com.zangyi.controller;

import com.aliyuncs.exceptions.ClientException;
import com.zangyi.common.MusicPersonList;
import com.zangyi.common.MusicPersonMusics;
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
     * @return
     */
    @RequestMapping("/personListBoy")
    @ResponseBody
    public List<MusicPersonList> personListsForBoy() {
        return musicService.personListBoy();
    }
    /**
     * 获得女歌手列表
     * @return
     */
    @RequestMapping("/personListGril")
    @ResponseBody
    public List<MusicPersonList> personListsForGril() {
        return musicService.personListGril();
    }
    /**
     * 根据歌手id获得歌手的歌曲信息列表
     * @return
     */
    @RequestMapping("/personMusics")
    @ResponseBody
    public List<MusicPersonMusics> personMusics(Integer id) throws ClientException {
        return musicService.personMusics(id);
    }

}
